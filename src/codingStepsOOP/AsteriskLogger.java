package codingStepsOOP;

//Q3 Creating a class that will implement the logger 
//interface taking a String as a argument  

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***"); //Q4 Prints the log it receives 
		
	}

	//Q5 Error method printing the String it receives
	@Override
	public void error(String log) {
		String messageError = "***Error:" + log  + "***"; //creating a String variable
		String lineOfAsterisks = "*".repeat(messageError.length());
		
		System.out.println(lineOfAsterisks);
		System.out.println(messageError);
		System.out.println(lineOfAsterisks);
		
	}

}
