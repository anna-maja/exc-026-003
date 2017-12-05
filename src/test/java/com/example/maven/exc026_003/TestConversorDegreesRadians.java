package com.example.maven.exc026_003;

import static org.junit.Assert.assertEquals;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;


public class TestConversorDegreesRadians {

	ConversorDegreesRadians cdr = new ConversorDegreesRadians();
	Random random = new Random();
	private static final Logger LOG = Logger.getLogger(ConversorDegreesRadians.class.getName());

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
		double randomValue = 0.0; 
		
		for (int i = 0; i < 100000000; i++) {
			randomValue = random.nextDouble()*100; 
			LOG.info("Testing the method degreesToRadians with " + randomValue);
			assertEquals(toRadians(randomValue), cdr.convertDegreesToRadians(randomValue), 0.1);
		}
	}
	
	
	@Test
	public void testToDegrees() {
		double randomValue = 0.0; 
		
		for (int i = 0; i < 10; i++) {
			randomValue = random.nextDouble()*100; 
			LOG.info("Testing the method radiansToDegrees with " + randomValue);
			assertEquals(toDegrees(randomValue), cdr.convertRadiansToDegrees(randomValue), 0.1);
		}
	}
}
