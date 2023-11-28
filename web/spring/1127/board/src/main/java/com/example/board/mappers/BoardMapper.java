package com.example.board.mappers;

import com.example.board.dto.BoardDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Insert("insert into board values(null, #{subject}, #{writer}, #{content}, 0, now(), #{originalName}, #{savedFileName}, #{savedFilePathName}, #{savedFileSize}, #{folderName}, #{ext}, #{grp}, 1, 1)")
    void setWrite(BoardDto boardDto);

    @Select("select ifnull(max(grp) + 1, 1) as maxGrp from board")
    int getMaxGrp();

    @Select("select * from board order by id desc")
    List<BoardDto> getList();

    @Select("select count(*) from board")
    int getListCount();

    @Select("select * from board where id=#{id}")
    BoardDto getView(int id);

    @Update("update board set visit = visit + 1 where id = #{id}")
    void updateVisit(int id);
}
