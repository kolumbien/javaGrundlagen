package reflection;

import java.lang.reflect.Constructor;

public class ConstructorExample {	
	
	public static void main(String[] args) throws Exception {
	
		Constructor<Test> constructor = Test.class.getDeclaredConstructor();
		
		// WE CAN INSTANTIATE A CLASS WITH REFLECTION 
		// DESPITE THE FACT THAT IT HAS PRIVATE CONSTRUCTOR !!!
		
		// we can instantiate a new class even if the constructor is private!!
		constructor.setAccessible(true);
		Test test = constructor.newInstance();	
		System.out.println(test);
			
	}
}




