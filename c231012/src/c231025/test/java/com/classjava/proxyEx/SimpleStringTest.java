package c231025.test.java.com.classjava.proxyEx;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import c231025.main.java.com.classjava.proxyEx.SimpleStirngImpl;
import c231025.main.java.com.classjava.proxyEx.SimpleString;
import c231025.main.java.com.classjava.proxyEx.SimpleStringUpper;

public class SimpleStringTest {

	@Test
	public void DecoTest() {
		SimpleString simpleStringImle = new SimpleStirngImpl();
		SimpleString simpleString = new SimpleStringUpper();
		((SimpleStringUpper)simpleString).setSimpString(simpleStringImle);
		assertThat(simpleString.hello("한상윤"), is("HELLO한상윤"));
		assertThat(simpleString.intro("한상윤"), is("MY NAME IS 한상윤"));
		assertThat(simpleString.bye("한상윤"), is("BYE한상윤"));
	}
}
