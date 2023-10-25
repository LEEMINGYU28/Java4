package c231025.test.java.com.classjava.proxyEx;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import c231025.main.java.com.classjava.proxyEx.SimpleStirngImpl;
import c231025.main.java.com.classjava.proxyEx.SimpleString;
import c231025.main.java.com.classjava.proxyEx.ToUpperCaseHandler;

public class ReflectionTest {

	@Test
	public void test() throws Exception {
		String name = "박정완";
		assertThat(name.length(), is(3));
		Method method = String.class.getMethod("length");
		assertThat(method.invoke(name), is(3));

		assertThat(name.indexOf("정"), is(1));
		method = String.class.getMethod("indexOf", String.class);
		assertThat(method.invoke(name, "정"), is(1));
	}

	@Test
	public void handlerTest() {
		SimpleString ssProxied = (SimpleString) Proxy.newProxyInstance(
				getClass().getClassLoader(),
				new Class[] { SimpleString.class },
				new ToUpperCaseHandler(new SimpleStirngImpl()));
		
		assertThat(ssProxied.hello("한상윤"), is("HELLO한상윤"));
		assertThat(ssProxied.intro("한상윤"), is("MY NAME IS 한상윤"));
		assertThat(ssProxied.bye("한상윤"), is("BYE한상윤"));
	}

}
