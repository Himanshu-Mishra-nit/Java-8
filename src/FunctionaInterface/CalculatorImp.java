package FunctionaInterface;

interface Calculator{
	void swithOn();
}

public class CalculatorImp {

	

	// ()  ->    {body};
	
	public static void main(String[] args) {
		Calculator calculator = ()-> {
			System.out.println("Swith on");
		};
		calculator.swithOn();
	}
}

