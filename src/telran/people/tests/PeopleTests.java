package telran.people.tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import telran.people.*;

public class PeopleTests {
@Test
void employeeTest() {
	Employee walter = new Employee(123, 1975, "walterwhite@gmail.com", 8000);
	assertEquals(walter.computePay(), 8000);
	assertEquals(walter.getEmail(), "walterwhite@gmail.com");
}

@Test
void salesPersonTest() {
	SalesPerson skyler = new SalesPerson(125, 1980, "skylerwhite@gmail.com", 10000, 20000, 10);
	assertEquals(skyler.computePay(), 12000);
}


 @Test
 void wrongBirthYear() {
	 boolean flException = false;
	try {
		new SalesPerson(123,2018,"sp@gmail.com",1000,100,10);
		
	} catch (IllegalArgumentException e) {
		flException = true;
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
	assertTrue(flException);
	try {
		new Employee(124, 1940,"email@gmail.com",1000);
	} catch(IllegalArgumentException e) {
		flException = true;
		System.out.println(e.getMessage());
	}
 }
 @Test
 void setEmailTest() {
	 boolean flException = false;
		try {
			new Person(123,1990, "tel-ran@gmail.com");
			
		} catch (IllegalArgumentException e) {
			flException = true;
		}
		assertFalse(flException);
	
		try {
			new Person(123,1990, null);
			
		} catch (IllegalArgumentException e) {
			flException = true;
		}
		assertFalse(flException);
	
		try {
			new Person(124,1990, "_bsh.com");
		} 
		catch(IllegalArgumentException e) {
			flException = true;
			System.out.println(e.getMessage());
		}
 }
 
		@Test
		void minBasicSalaryTest() {
			 boolean flException = false;
			try {
				new Employee(124,1990, "_email@gmail.com",99);
			} 
			catch(IllegalArgumentException e) {
				flException = true;
				System.out.println(e.getMessage());
			}
			assertTrue(flException);
		}
		@Test
		void percentPayTest() {
			 boolean flException = false;
			try {
				new SalesPerson(124,1990, "email@gmail.com",1000,2000,-2);
			} 
			catch(IllegalArgumentException e) {
				flException = true;
				System.out.println(e.getMessage());
			}
			assertTrue(flException);
		}
}