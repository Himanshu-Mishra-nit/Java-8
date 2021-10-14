package FunctionaInterface;

interface Calculator{
	//void swithOn();
	
	//void sum(int input);
	
	int subtract(int i1,int i2);
}

public class CalculatorImp {

	

	// ()  ->    {body};
	
	public static void main(String[] args) {
	/**	Calculator calculator = ()-> {
			System.out.println("Swith on");
		};
		calculator.swithOn();*/
		
		/*Calculator calculator=(input) -> {
			System.out.println("sum :"+input);
		};
		
		calculator.sum(8);*/
		
		Calculator calculator=( i1, i2)->{
			return i2-i1;
		};
		Calculator calculator1=( i1, i2)-> i2-i1;
		System.out.println(calculator.subtract(8, 20));
		System.out.println(calculator1.subtract(8, 20));
		
	}
}

