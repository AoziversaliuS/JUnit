package junit;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import test.Oz;
import static org.hamcrest.Matchers.*;
public class OzTest {

	@Test
	public void testCharToBig() {
		char X = new Oz().charToBig('b');
//		assertEquals('A', X);
//		assertEquals("不相等", 'A','a');//添加错误提示
		
		//大于A小于C
		assertThat(X, allOf(greaterThan('A'),lessThan('C')));
		
		//满足其中一个条件
		assertThat( X, anyOf(greaterThan('A'),lessThan('B')));
		
		//等于任何值亦可，null也行
		assertThat(null, anything());
		
		//不等于某个值
		assertThat(X, not('C'));
		
	   //。。。
	}

}
