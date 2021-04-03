package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class addrecipe_RecipeBookTest {

	@Test
	public void testAddRecipe_notexistandadded() throws RecipeException,NumberFormatException {
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("8");
		recipe.setAmtCoffee("5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("2");
		recipe.setName("Milkshake");
		recipe.setPrice("30");
		
		boolean expected = true;
		boolean actual = false;
		
		RecipeBook book = new RecipeBook();
		actual = book.addRecipe(recipe);
		
		assertTrue(actual == expected);
		
	}
	@Test
	public void testAddRecipe_existandnotadded() throws RecipeException,NumberFormatException {
		RecipeBook book = new RecipeBook();
		
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("8");
		recipe.setAmtCoffee("5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("2");
		recipe.setName("Milkshake");
		recipe.setPrice("30");
		boolean check = book.addRecipe(recipe);
		
		Recipe recipe2 = new Recipe();
		recipe2.setAmtChocolate("8");
		recipe2.setAmtCoffee("5");
		recipe2.setAmtMilk("2");
		recipe2.setAmtSugar("2");
		recipe2.setName("Milkshake");
		recipe2.setPrice("30");
		boolean expected = false;
		boolean actual = true;
		
		actual = book.addRecipe(recipe2);
		
		assertTrue(actual == expected);
		
	}
	@Test
	public void testAddRecipe_notadded_exceed_size() throws RecipeException,NumberFormatException {
		RecipeBook book = new RecipeBook();
		boolean expected = false;
		boolean actual = true;
		
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("8");
		recipe.setAmtCoffee("5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("2");
		recipe.setName("Milkshake");
		recipe.setPrice("30");
		boolean check = book.addRecipe(recipe);
		
		Recipe recipe2 = new Recipe();
		recipe2.setAmtChocolate("3");
		recipe2.setAmtCoffee("5");
		recipe2.setAmtMilk("2");
		recipe2.setAmtSugar("2");
		recipe2.setName("Milkshake_vanila");
		recipe2.setPrice("30");
		check = book.addRecipe(recipe2);
		
		Recipe recipe3 = new Recipe();
		recipe3.setAmtChocolate("3");
		recipe3.setAmtCoffee("5");
		recipe3.setAmtMilk("2");
		recipe3.setAmtSugar("2");
		recipe3.setName("Milkshake_chocolate");
		recipe3.setPrice("30");
		check = book.addRecipe(recipe3);
		
		Recipe recipe4 = new Recipe();
		recipe4.setAmtChocolate("3");
		recipe4.setAmtCoffee("5");
		recipe4.setAmtMilk("2");
		recipe4.setAmtSugar("2");
		recipe4.setName("mocha");
		recipe4.setPrice("30");
		check = book.addRecipe(recipe4);
	
		Recipe recipe5 = new Recipe();
		recipe5.setAmtChocolate("3");
		recipe5.setAmtCoffee("5");
		recipe5.setAmtMilk("2");
		recipe5.setAmtSugar("2");
		recipe5.setName("turkish-coffe");
		recipe5.setPrice("30");
		actual = book.addRecipe(recipe5);
		
		
		
		assertTrue(actual == expected);
		
	}
	
	
	

}
