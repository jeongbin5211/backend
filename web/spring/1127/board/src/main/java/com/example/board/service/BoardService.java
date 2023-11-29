package com.example.board.service;

import com.example.board.dto.BoardDto;
import com.example.board.mappers.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    // 검색 메소드
    public List<BoardDto> getSearch(String searchType, String words) {

        Map<String, Object> map = new HashMap<>();

        String searchQuery = "";

        //if -> subject, writer, content

        // searchType
        // subject, writer => where =
        // content where like
        if (searchType.equals("subject") || searchType.equals("writer")) {
            searchQuery = "where " + searchType + " = " + "'" + words + "'";
        }else if (searchType.equals("content")) {
            searchQuery = "where " + searchType + " like " + "'%" + words + "%'";
        }else {
            searchQuery = "";
        }

        System.out.println(searchQuery);

        map.put("searchQuery", searchQuery);

        return boardMapper.getList(map);
    }

    public int getSearchCnt(String searchType, String words) {

        Map<String, Object> map = new HashMap<>();

        String searchQuery = "";

        //if -> subject, writer, content

        // searchType
        // subject, writer => where =
        // content where like
        if (searchType.equals("subject") || searchType.equals("writer")) {
            searchQuery = "where " + searchType + " = " + "'" + words + "'";
        }else if (searchType.equals("content")) {
            searchQuery = "where " + searchType + " like " + "'%" + words + "%'";
        }else {
            searchQuery = "";
        }

        System.out.println(searchQuery);

        map.put("searchQuery", searchQuery);

        return boardMapper.getListCount(map);
    }

    public void getDelete(int id) {
        System.out.println("Service" + id);
        // db 삭제
//        boardMapper.getDelete(id);
        
        // file 삭제
//        BoardDto b = boardMapper.getView(id);
//        System.out.println(b.getFolderName());
//        System.out.println(b.getSavedFileName());

        if (id > 0) {
            // file 삭제
            BoardDto boardDto = boardMapper.getView(id);
            System.out.println(boardDto.getFolderName());
            System.out.println(boardDto.getSavedFileName());

//            File f = new File(경로+파일이름);

//            String removeFile = b.getFolderName() + "/" + b.getSavedFileName(); 상대경로
            String removeFile = boardDto.getSavedFilePathName();
            System.out.println(removeFile);

            // db 삭제
            boardMapper.getDelete(id);

            // File객체는 생성 또는 삭제할 준비
            File f = new File(removeFile);

            if (f.exists()) {
                boolean result = f.delete();
                
                if (result) {
                    System.out.println("파일 삭제 완료");
                }else {
                    System.out.println("파일이 존재하지 않습니다.");
                }
            }

        }
    }
}
