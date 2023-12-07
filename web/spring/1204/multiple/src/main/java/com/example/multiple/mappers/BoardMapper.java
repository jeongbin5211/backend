package com.example.multiple.mappers;

import com.example.multiple.dto.BoardDto;
import com.example.multiple.dto.FileDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.io.File;

@Mapper
public interface BoardMapper {

    // ifnull( (), 1 ) => 만약 null이라면 1, 아니라면 max(grp) 가져오기
    @Select("select ifnull((MAX(grp) + 1), 1) from board_${configCode}")
    public int getGrpMaxCnt(String configCode);

    @Insert("insert into board_${configCode} values(null, #{subject}, #{writer}, #{content}, 0, now(), #{grp}, 1, 1)")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void setBoard(BoardDto boardDto);

    @Insert("INSERT INTO files_${configCode} VALUES(#{id}, #{orgName}, #{savedFileName}, #{savedPathName}, #{savedFileSize}, #{folderName}, '')")
    public void setFiles(FileDto fileDto);
}
