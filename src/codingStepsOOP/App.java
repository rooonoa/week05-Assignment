package codingStepsOOP;

public class App {

	public static void main(String[] args) {
		Logger Astlogger = new AsteriskLogger ();
		Logger Spacelogger = new  SpacedLogger();
		
		Astlogger.log("Hello");
		Astlogger.error("Something is Wrong");
		Spacelogger.log("Hello");
		Spacelogger.error("Check Coding");

	}

}
