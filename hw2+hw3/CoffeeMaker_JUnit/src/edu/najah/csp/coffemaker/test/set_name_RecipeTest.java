package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class set_name_RecipeTest {

	
	@Test
	public void testGetName() {
		String expected= "";
		String actual="";
		Recipe recipe = new Recipe();
		
		actual = recipe.getName();
		assertTrue(expected == actual);
	}

	@Test
	public void testSetName_string() {
		String expected= "abdallah";
		String actual="abdallah";
		String newname="abdallah";
		Recipe recipe = new Recipe();
		
		recipe.setName(newname);
		actual = recipe.getName();
		assertTrue(actual == expected);
	}
	
	@Test
	public void testSetName_null() {
		String expected= "";
		String actual="";
		String newname= null;
		Recipe recipe = new Recipe();
		
		recipe.setName(newname);
		actual = recipe.getName();
		assertTrue(actual == expected);
	}

}
