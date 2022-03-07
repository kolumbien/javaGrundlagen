package reflection;

import java.lang.reflect.Field;

public class FieldVariableExample {	
	
	public static void main(String[] args) {
	
		Class<Person> personClass = Person.class;

		//print only the public fields
		Field[] fields = personClass.getFields();
		//print all fields
		//Field[] fields = personClass.getDeclaredFields();
		
		for(Field f : fields) {
			f.setAccessible(true);
			System.out.println(f.getName());
		}
			
			
	}
}




