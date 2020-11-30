package com.springframework.spring5recipeapp.controllers;

import com.springframework.spring5recipeapp.domain.Category;
import com.springframework.spring5recipeapp.domain.UnitOfMeasure;
import com.springframework.spring5recipeapp.repositories.CategoryRepository;
import com.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRespository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRespository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRespository = categoryRespository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRespository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is:" + categoryOptional.get().getId());
        System.out.println("UOM Id is:" + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
