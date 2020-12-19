package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long IngredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand command);
    void deleteByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
