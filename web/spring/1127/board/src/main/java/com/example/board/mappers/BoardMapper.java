package com.example.board.mappers;

import com.example.board.dto.BoardDto;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {

    @Insert("insert into board values(null, #{subject}, #{writer}, #{content}, 0, now(), #{originalName}, #{savedFileName}, #{savedFilePathName}, #{savedFileSize}, #{folderName}, #{ext}, #{grp}, #{seq}, ${depth})")
    void setWrite(BoardDto boardDto);

    @Select("select ifnull(max(grp) + 1, 1) as maxGrp from board")
    int getMaxGrp();

    @Select("select * from board ${searchQuery} order by grp desc, seq asc")
    List<BoardDto> getList(Map<String, Object> map);

    @Select("select count(*) from board ${searchQuery}")
    int getListCount(Map<String, Object> map);

    @Select("select * from board where id=#{id}")
    BoardDto getView(int id);

    @Update("update board set visit = visit + 1 where id = #{id}")
    void updateVisit(int id);

    @Delete("delete from board where id = #{id}")
    void getDelete(int id);

    @Insert("insert into board values(null, #{subject}, #{writer}, #{content}, 0, now(), #{originalName}, #{savedFileName}, #{savedFilePathName}, #{savedFileSize}, #{folderName}, #{ext}, #{grp}, ${seq}, ${depth})")
    void setReply(BoardDto boardDto);
}
