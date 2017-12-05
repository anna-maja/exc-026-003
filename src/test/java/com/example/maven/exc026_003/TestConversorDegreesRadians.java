package com.example.maven.exc026_003;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TestConversorDegreesRadians {

	ConversorDegreesRadians cdr = new ConversorDegreesRadians();
	Random random = new Random();

	// hjälpmetod!!!
	public double toRadians(double valueDegrees) {

		double radians = valueDegrees * (Math.PI / 180);
		return radians;
	}

	// hjälpmetod!!!
	public double toDegrees(double valueRadians) {
		
		double degrees = valueRadians * (180/Math.PI);
		return degrees; 

	}
	
	//  testmetoder
	// jag anropar hjälpmetod och klassmetod med samma värde för att se så jag får samma resultat. 
	// att lägga hjälpmetoder utanför är bara ett sätt att renodla och strukturera koden.
	
	@Test
	public void testToRadians() {
		assertEquals(toRadians(3.8), cdr.convertDegreesToRadians(3.8), 0.1);
		
	}
	
	@Test
	public void testToDegrees() {
		assertEquals(toDegrees(3.8), cdr.convertRadiansToDegrees(3.8), 0.1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
