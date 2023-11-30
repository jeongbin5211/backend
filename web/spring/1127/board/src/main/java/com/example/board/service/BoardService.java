package com.example.board.service;

import com.example.board.dto.BoardDto;
import com.example.board.dto.PageDto;
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
    public List<BoardDto> getSearch(int page, String searchType, String words) {

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

        // 페이지dto 불러오기
        PageDto pageDto = new PageDto();
        // limit 시작, 개수

        // limit 0, 3
        // limit 3, 3
        // limit 6, 3
        int startNum = (page - 1) * pageDto.getPageCount();

        map.put("searchQuery", searchQuery);
        map.put("startNum", startNum);
        map.put("offset", pageDto.getPageCount());

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

            if (removeFile != null) {
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

    /* 페이지 알고리즘 구현 */
    public PageDto BoardPageCalc(int page) {
        PageDto pageDto = new PageDto();

        int totalCount = boardMapper.totalCount();
        int totalPage = (int)Math.ceil((double) totalCount / pageDto.getPageCount());
        int startPage
                = ((int) (Math.ceil((double) page / pageDto.getBlockCount())) - 1) * pageDto.getPage() + 1;

        int endPage = startPage + pageDto.getBlockCount() - 1;

        if( endPage > totalPage ) {
            endPage = totalPage;
        }

        pageDto.setPage(page);
        pageDto.setStartPage(startPage);
        pageDto.setEndPage(endPage);
        pageDto.setTotalPage(totalPage);

        return pageDto;
    }

    /* 계산한 페이지 값을 select 보내서 limit */

}
