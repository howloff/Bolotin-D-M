
public class count {
	public static void main (String[] args) {

		
		if (args.length == 2) {
			
					int a = Integer.parseInt(args[0]);
					int b = Integer.parseInt(args[1]);
					int c = a + b;

					System.out.println(args[0] + " + " + args[1] + " = " + c);
			
		} else {

			System.out.println("Wrong number of parameters");
		}

	}
}
