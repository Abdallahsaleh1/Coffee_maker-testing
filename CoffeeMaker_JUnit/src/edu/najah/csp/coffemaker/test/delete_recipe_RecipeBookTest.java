package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class delete_recipe_RecipeBookTest {

	@Test
	public void testDeleteRecipe_deleted() throws RecipeException,NumberFormatException {
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("8");
		recipe.setAmtCoffee("5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("2");
		recipe.setName("Milkshake");
		recipe.setPrice("30");
		
		RecipeBook book = new RecipeBook();
		book.addRecipe(recipe);
		
		String expected = "Milkshake";
		String actual = book.deleteRecipe(0);
		
		assertTrue(expected == actual);
	}
	@Test
	public void testDeleteRecipe_null() throws RecipeException,NumberFormatException {
		
		RecipeBook book = new RecipeBook();
		
		String expected = null;
		String actual = book.deleteRecipe(0);
		
		assertTrue(expected == actual);
	}

}
