package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class get_recipes_RecipeBookTest {

	@Test
	public void testGetRecipes() throws RecipeException,NumberFormatException{
		RecipeBook book = new RecipeBook();
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("8");
		recipe.setAmtCoffee("5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("2");
		recipe.setName("Milkshake");
		recipe.setPrice("30");
			
		book.addRecipe(recipe);
		Recipe recipe2 = new Recipe();
		recipe2.setAmtChocolate("3");
		recipe2.setAmtCoffee("5");
		recipe2.setAmtMilk("2");
		recipe2.setAmtSugar("2");
		recipe2.setName("Milkshake_vanila");
		recipe2.setPrice("30");
		book.addRecipe(recipe2);
		
		Recipe recipe3 = new Recipe();
		recipe3.setAmtChocolate("3");
		recipe3.setAmtCoffee("5");
		recipe3.setAmtMilk("2");
		recipe3.setAmtSugar("2");
		recipe3.setName("Milkshake_chocolate");
		recipe3.setPrice("30");
		book.addRecipe(recipe3);
		
		Recipe recipe4 = new Recipe();
		recipe4.setAmtChocolate("3");
		recipe4.setAmtCoffee("5");
		recipe4.setAmtMilk("2");
		recipe4.setAmtSugar("2");
		recipe4.setName("mocha");
		recipe4.setPrice("30");
		book.addRecipe(recipe4);
		
		int expected = 4;
		
		Recipe [] recipearray = book.getRecipes();
		int actual = recipearray.length;
		
		assertTrue(expected == actual);
	}

}
