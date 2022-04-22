package com.example.springboot.mapper;

import com.example.springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

//    @Select("select * from testdb.category_")
    List<Category> findAll();
}
