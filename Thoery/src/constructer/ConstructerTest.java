package constructer;

public class ConstructerTest {

	String name;
	int age;
	String phone;
	
	
	
	
	public ConstructerTest(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructerTest person = new ConstructerTest("Jimin", 12, "01072278995");

		System.out.print(person.name);
	}

}
