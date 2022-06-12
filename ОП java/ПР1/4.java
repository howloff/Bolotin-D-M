
public class LogPass {
	public static void main (String[] args) {

		String login = new String("Danila");
		String password = new String("1111");
		
		if ( args[0].equals(login) && args[1].equals(password)) {

			System.out.print("You have been recognized. Welcome");
			
		} else {
			
			System.out.print("Username and(or) password not recognized. Access is denied.");

		}
	}
}
