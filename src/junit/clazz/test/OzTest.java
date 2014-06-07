package junit.clazz.test;

import static org.junit.Assert.assertThat;
import junit.clazz.Oz;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
public class OzTest {

	@Test
	public void testCharToBig() {
		char X = new Oz().charToBig('b');
//		assertEquals('A', X);
//		assertEquals("不相等", 'A','a');//添加错误提示
		
		//大于A小于C
		assertThat(X, allOf(greaterThan('A'),lessThan('C')));
		
		//满足其中某个条件
		assertThat( X, anyOf(greaterThan('A'),lessThan('B')));
		
		//等于任何值亦可，null也行
		assertThat(null, anything());
		
		//不等于某个值
		assertThat(X, not('C'));
		
	   //。。。
	}
	
	//expected 告诉JUnit此测试抛出这个异常是正常的。不抛出这个异常是错误的。。
	//timeout 是指要在多少毫秒内运行成功？
	@Test(expected=java.lang.ArithmeticException.class)
	public void testCharToSmall(){
		char x = new Oz().charToSmall('A');
		assertThat("出错啦", x, is('a'));
		
		//以某个字符串开头
		assertThat("ozispowerful", startsWith("oz"));
	}

}
