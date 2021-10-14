package FunctionaInterface;

interface Calculator{
	//void swithOn();
	
	void sum(int input);
}

public class CalculatorImp {

	

	// ()  ->    {body};
	
	public static void main(String[] args) {
	/**	Calculator calculator = ()-> {
			System.out.println("Swith on");
		};
		calculator.swithOn();*/
		
		Calculator calculator=(input) -> {
			System.out.println("sum :"+input);
		};
		
		calculator.sum(8);
	}
}

