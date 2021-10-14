package FunctionaInterface;


public interface FunalInterface {

	//one abstract method
	void m1();

	
	//1st default method
	default void m2() {
		System.out.println("Default Method 1");
	}
	//2nd default method
	default void m3() {
		System.out.println("Defult method 2");
	}
	
	//static method
	static void m4() {
		System.out.println("static method -1");
	}
}
