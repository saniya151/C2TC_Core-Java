package day1;

//Creating an interface
interface Language{
	void getName(String name);
}

//Class implements interface
class ProgrammingLanguage implements Language{
	public void getName(String name) {
		System.out.println("Programming Language :" +name);
		}
}


public class InterfaceExample {

	public static void main(String[] args) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");

	}

}
