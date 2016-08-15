package Calculator;

public class Calculate {

	public static String cal(int n1, int n2, String op) {

		String resultStr = "";
		String format = "" + n1 + op + n2 + "=";
		int resultInt;
		double resultDouble;

		switch (op) {
		case "+":
			resultInt = n1 + n2;
			resultStr = format + String.valueOf(resultInt);
			break;

		case "-":
			resultInt = n1 - n2;
			resultStr = format + String.valueOf(resultInt);
			break;

		case "*":
			resultInt = n1 * n2;
			resultStr = format + String.valueOf(resultInt);
			break;

		case "/":
			
			if( n2 == 0 ) {
				resultStr = "错误，除数不能为0";
			}
			else {
				double d1 = (double)n1;
				double d2 = (double)n2;
				resultDouble = d1/d2;
				resultStr = format + String.valueOf(resultDouble);
			}
			
			
			break;

		default:
			resultStr = "Unknown Error";
			break;
		}

		return resultStr;
	}

}
