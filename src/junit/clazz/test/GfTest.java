package junit.clazz.test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import junit.clazz.Gf;

import org.junit.Test;

public class GfTest {

	@Test
	public void testGetGfName() {
		assertThat("Ãû×Ö´íÎó", new Gf().getGfName(), endsWith("by"));
	}

}
