package c231026.main.java.com.classjava.board.service;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.util.PatternMatchUtils;

public class TransactionPointcut extends NameMatchMethodPointcut {

	public void setMappedClassName(String mappedClassName) {
		this.setClassFilter(new SimpleClassFilter(mappedClassName));
	}

	public static class SimpleClassFilter implements ClassFilter {
		private String mappedCalssName;

		public SimpleClassFilter(String mappedClassName) {
			this.mappedCalssName = mappedClassName;
		}

		@Override
		public boolean matches(Class<?> targetClass) {
			// TODO Auto-generated method stub
			return PatternMatchUtils.simpleMatch(mappedCalssName, targetClass.getSimpleName());
		}

	}

}
