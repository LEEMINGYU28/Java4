package c231025.main.java.com.classjava.proxyEx;

public class SimpleStirngImpl implements SimpleString {

	public String hello(String name) {
		return "Hello" + name;
	}

	public String intro(String name) {
		return "My name is " + name;
	}

	public String bye(String name) {
		return "bye" + name;
	}
}
