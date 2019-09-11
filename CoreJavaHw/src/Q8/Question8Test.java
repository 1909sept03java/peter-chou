package Q8;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question8Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		String[] stringList = {"karan", "madam", "tom",
								"civic", "radar", "sexes",
								"jimmy", "kayak", "john",
								"refer", "billy", "did"};
		
		String[] palindromeList = {"madam","civic","radar",
									"sexes","kayak","refer","did"};
		
		Question8.storingPalindrome(stringList, list1, list2);
		
		ArrayList<String> array1 = new ArrayList<String>(list1);
		ArrayList<String> array2 = new ArrayList<String>(list2);
		
		assertEquals(array1,list1);
		assertEquals(array2,list2);
		

	}

}
