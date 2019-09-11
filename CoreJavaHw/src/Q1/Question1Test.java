package Q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question1Test {

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
	void testBubblesort() {
		int[] arr = {1,0,5,6,3,2,3,7,9,8,4};
		int[] answer = {0,1,2,3,3,4,5,6,7,8,9};
		
		arr = Question1.bubblesort(arr);
		
		assertArrayEquals(arr, answer);
	}

}
