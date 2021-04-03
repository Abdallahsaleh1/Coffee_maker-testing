package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class equals_RecipeTest {

	@Test
	public void testEqualsObject() {
		Recipe obj = new Recipe();
		boolean expected= true;
		boolean actual = obj.equals(obj);
		
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testEqualsObject_false() {
		Object obj = new Object();
		Recipe recipe = new Recipe();
		boolean expected= false;
		boolean actual = recipe.equals(obj);
		
		assertTrue(expected == actual);
		
	}

}
