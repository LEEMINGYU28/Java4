package Calculator;

public interface MinusInterface {
	   default int minus(int num1, int num2) {
	      return num1 - num2;
	   }

	}