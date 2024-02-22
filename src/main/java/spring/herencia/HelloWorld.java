package spring.herencia;

public class HelloWorld {

	private String message1, message2;
	
	public HelloWorld(){
		
	}

	public void getMessage1() {
		System.out.println("Father message1: "+message1);
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void getMessage2() {
		System.out.println("Father message2: "+message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
	public void holaHolita() {
		System.out.println("holaHolita Metodito");
	}
}
