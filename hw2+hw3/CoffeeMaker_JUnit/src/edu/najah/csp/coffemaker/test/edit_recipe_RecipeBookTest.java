package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class edit_recipe_RecipeBookTest {

	@Test
	public void testEditRecipe_edited() throws RecipeException,NumberFormatException{
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("8");
		recipe.setAmtCoffee("5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("2");
		recipe.setName("Milkshake");
		recipe.setPrice("30");
		
		Recipe recipe2 = new Recipe();
		recipe2.setAmtChocolate("8");
		recipe2.setAmtCoffee("5");
		recipe2.setAmtMilk("4");
		recipe2.setAmtSugar("5");
		recipe2.setName("Milkshake");
		recipe2.setPrice("38");
		
		RecipeBook book = new RecipeBook();
		book.addRecipe(recipe);
		
		
		
		String expected = "Milkshake";
		String actual = book.editRecipe(0, recipe2);
		assertTrue(expected == actual);
	}
	
	@Test
	public void testEditRecipe_null() throws RecipeException,NumberFormatException{

		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("8");
		recipe.setAmtCoffee("5");
		recipe.setAmtMilk("4");
		recipe.setAmtSugar("5");
		recipe.setName("Milkshake");
		recipe.setPrice("38");
		
		RecipeBook book = new RecipeBook();		
		String expected = null;
		String actual = book.editRecipe(0, recipe);
		assertTrue(expected == actual);
	}

}
