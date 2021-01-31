package com.ferrtama.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ferrtama.recipeapp.entities.Recipes

@Dao
interface RecipeDao {
    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val allRecipies: List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies: Recipes)
}