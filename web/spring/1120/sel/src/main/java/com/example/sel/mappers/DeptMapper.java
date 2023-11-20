package com.example.sel.mappers;

import com.example.sel.dto.DeptDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept order by dept_code asc;")
    public List<DeptDto> getDeptAll();
    // where 없으면 getDeptAll() 에 파라미터 필요없음

    @Insert("insert into dept values(#{deptCode}, #{deptName});")
    void addDept(DeptDto deptDto);
//    받을때는 타입도 입력
}
