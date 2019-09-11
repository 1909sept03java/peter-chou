package q21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question21Test {

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
	void testRemoveRepeatCharacters() {
		String s = "aaabbccccd";
		assertEquals("abcd",Question21.removeRepeatCharacters(s));
		
		String s2 = "car";
		assertEquals("car",Question21.removeRepeatCharacters(s2));

	}

}
