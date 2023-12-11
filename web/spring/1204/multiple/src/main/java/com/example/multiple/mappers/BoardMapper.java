package com.example.multiple.mappers;

import com.example.multiple.dto.BoardDto;
import com.example.multiple.dto.FileDto;
import org.apache.ibatis.annotations.*;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface BoardMapper {

    // ifnull( (), 1 ) => 만약 null이라면 1, 아니라면 max(grp) 가져오기
    @Select("select ifnull((MAX(grp) + 1), 1) from board_${configCode}")
    public int getGrpMaxCnt(String configCode);

    @Insert("insert into board_${configCode} values(null, #{subject}, #{writer}, #{content}, 0, now(), #{grp}, 1, 1, #{isFiles})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void setBoard(BoardDto boardDto);

    @Insert("INSERT INTO files_${configCode} VALUES(#{id}, #{orgName}, #{savedFileName}, #{savedPathName}, #{savedFileSize}, #{folderName}, #{ext})")
    public void setFiles(FileDto fileDto);

    @Select("select * from board_${configCode} order by id desc limit #{startNum}, #{offset};")
    public List<BoardDto> getBiardList(Map<String, Object> map);

    @Select("select * from board_${configCode} where id = #{id}")
    BoardDto getBoard(String configCode, int id);

    @Select("select * from files_${configCode} where id = #{id}")
    List<FileDto> getFiles(String configCode, int id);

    @Delete("delete from board_${configCode} where id = #{id}")
    public void getBoardDelete(BoardDto boardDto);

    @Delete("delete from files_${configCode} where id = #{id}")
    public void setFilesDelete(BoardDto boardDto);

    @Select("select count(*) from board ${configCode}")
    public int getBoardCount(String configCode);
}
