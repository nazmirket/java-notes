package LambdaExpressions;

public class LambdaExpressions {
	
	// TEXT TUTORIAL = < Lambda Expressions > (select and press ctrl+shift+r)

	
		public static void main(String[] args) {	
			
		// EXAMPLE 1 - VOID METHOD
			
			voidMethod  method1 = () -> System.out.println("This is void method created by using a lambda");
			method1.apply();
			
			
			
		// EXAMPLE 2 - METHOD WITH PARAMETERS
			
			methodWithParameters production = (a,b)-> System.out.println(a + " x " + b + " = " + (a*b));
			production.aplly(5, 6);
			
			
			
		// 	EXAMPLE 3 - NUMERICAL METHOD
			
			numericalMethod getPow = (a,b)-> Math.pow(a, b);
			
			System.out.print("2 ^ 3 = "+ getPow.aplly(2, 3));
			
			
			
			
		}
}
