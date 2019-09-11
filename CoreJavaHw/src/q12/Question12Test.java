package q12;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question12Test {

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
	void testEvenNums() {
		ArrayList<Integer> list1 = Question12.evenNums(0,10);
		int[] desiredResult = {0,2,4,6,8,10};
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for(int i = 0; i < desiredResult.length;i++) {
			list2.add(desiredResult[i]);
		}

		assertEquals(list1,list2);
	}

}
