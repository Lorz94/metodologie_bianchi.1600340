import java.util.Random;

public class SalutoCasuale {
	
	public void sayHello() {
	
		String hello = null;
		
		switch(new Random().nextInt(6)) {
			case 0: hello = "ciao"; break;
			case 1: hello = "hello"; break;
			case 2: hello = "bella"; break;
			case 3: hello = "salve"; break;
			default: hello = "buongiorno"; break;
		}
		
		System.out.println(hello);
	}
}
