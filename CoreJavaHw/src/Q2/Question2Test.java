package Q2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question2Test {

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
	void testFibonacci() {
		int[] fib = {0, 1, 1, 2, 3, 5, 8,
				13, 21, 34, 55, 89, 144, 233,
				377, 610, 987, 1597, 2584, 4181,
				6765, 10946, 17711, 28657, 46368};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0;i < fib.length;i++) {
			list.add(fib[i]);
		}
		assertEquals(list, Question2.fibonacci());

	}

}
