package com.example.springboot.controller;

import com.example.springboot.mapper.CategoryMapper;
import com.example.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping("/listCategory")
    public String listCategory(Model m){


        List<Category> categorys = categoryMapper.findAll();
        m.addAttribute("cs", categorys);

        return "listCategory";
    }
}
