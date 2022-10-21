
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
public class TestClassHouse {
	@Test 
	 void testAddHouse_testCase1() { 
	  //Test Case 1: Check the function with valid inputs 
	  //Test Case 1_Test Data 1 
	  House housetestCase1Data1 = new House ("ABC1234567", "Melbourne", "Apartment", 100001, 2, 2, 1, 60, "It is a very good house"); 
	  //assertEquals ("The House information can be added", housetestCase1Data1.AddHouse()); 
	  //Test Case 1_Test Data 2 
	  House housetestCase1Data2 = new House ("DEF1234567", "Melbourne", "TownHouse", 100001, 2, 2, 1, 60, "It is a very good house"); 
	  assertAll ("", ()->assertEquals("The House information can be added", housetestCase1Data1.AddHouse()),()->assertEquals ("The House information can be added", housetestCase1Data2.AddHouse())); 
	  }
	
	
	@Test 
	 void testAddHouse_testCase2() { 
	  //Test Case 2: Check the function with invalid ID
	  //Test Case 2_Test Data 1 
	  House housetestCase2Data1 = new House ("abc1234567", "Melbourne", "Apartment", 100001, 2, 2, 1, 60, "It is a very good house"); 
	  //assertEquals ("The House information can be added", testAddHouse_testCase2.AddHouse()); 
	  //Test Case 2_Test Data 2 
	  House housetestCase2Data2 = new House ("abcd123456", "Melbourne", "Apartment", 100001, 2, 2, 1, 60, "It is a very good house"); 
	  assertAll ("", ()->assertEquals("The House information cannot be added", housetestCase2Data1.AddHouse()),()->assertEquals("The House information cannot be added", housetestCase2Data2.AddHouse())); 
	  }
	
	
	@Test 
	 void testAddHouse_testCase3() { 
	  //Test Case 3: Check the function with invalid Description
      //Test Case 3_Test Data 1 
	  House housetestCase3Data1 = new House ("ABC1234567", "Melbourne", "Apartment", 100001, 2, 2, 1, 60, "Good house");
	  //assertEquals ("The House information can be added", testAddHouse_testCase3.AddHouse()); 
	  //Test Case 3_Test Data 2 
	  House housetestCase3Data2 = new House ("ABC1234567", "Melbourne", "Apartment", 100001, 2, 2, 1, 60, " It is a very good house with a lot of very good features");
	  assertAll ("", ()->assertEquals("The House information cannot be added", housetestCase3Data1.AddHouse()), ()->assertEquals("The House information cannot be added", housetestCase3Data2.AddHouse())); 
	  }
	
	
	@Test 
	 void testAddHouse_testCase4() { 
	  //Test Case 4: Check the function with invalid Price
	  //Test Case 4_Test Data 1 
	  House housetestCase4Data1 = new House ("ABC1234567", "Melbourne", "Apartment", 50000, 2, 2, 1, 60, "It is a very good house");
	  //assertEquals ("The House information can be added", housetestCase1Data1.AddHouse()); 
	  //Test Case 4_Test Data 2 
	  House housetestCase4Data2 = new House ("ABC1234567", "Melbourne", "Apartment", 2500000, 2, 2, 1, 60, "Good house");
	  assertAll ("", ()->assertEquals("The House information cannot be added", housetestCase4Data1.AddHouse()), ()->assertEquals("The House information cannot be added", housetestCase4Data2.AddHouse())); 
	  }
	
	@Test 
	 void testAddHouse_testCase5() { 
	  //Test Case 5: Check the function with invalid Number of Bedrooms and Bathrooms
      //Test Case 5_Test Data 1 
	  House housetestCase5Data1 = new House ("ABC1234567", "Melbourne", "Apartment", 100001, 5, 2, 1, 60, "It is a very good house");
	  //assertEquals ("The House information can be added", housetestCase1Data1.AddHouse()); 
	  //Test Case 5_Test Data 2 
	  House housetestCase5Data2 = new House ("ABC1234567", "Melbourne", "Apartment", 100001, 6, 1, 1, 60, "It is a very good house");
	  assertAll ("", ()->assertEquals("The House information cannot be added", housetestCase5Data1.AddHouse()), ()->assertEquals("The House information cannot be added", housetestCase5Data2.AddHouse())); 
	  }
	
	@Test 
	 void testAddHouse_testCase6() { 
	  //Test Case 6:Check for all types of houses, except for “Townhouse”, it should not be possible to change the address.
      //Test Case 6_Test Data 1 
	  House housetestCase6Data1 = new House ("ABC1234567", "Melbourne", "TownHouse", 100001, 2, 2, 1, 60, "It is a very good house");
	  //assertEquals ("The House information can be added", housetestCase1Data1.AddHouse()); 
	  //Test Case 6_Test Data 2 
	  House housetestCase6Data2 = new House ("ABC1234567", "Sydney", "TownHouse", 100001, 2, 2, 0, 60, "It is a very good house");
	  assertAll ("", ()->assertEquals("The House information can be added", housetestCase6Data1.AddHouse()), ()->assertEquals("The House information cannot be added", housetestCase6Data2.AddHouse())); 
	  }
}
