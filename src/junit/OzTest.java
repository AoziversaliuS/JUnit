package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import test.Oz;

public class OzTest {

	@Test
	public void testCharToBig() {
		char X = new Oz().charToBig('a');
		assertEquals('A', X);
	}

}
