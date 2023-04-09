package codingStepsOOP;

public interface Logger {
	
	/*
	 * Q1 Creating an interface called logger 
	 * 
	 * Q2 We will add two void methods that will take String as arguments 
	 *    This are the signature of the methods that a class should
	 *    have to implement this interface 
	 */

	public void log (String log);
	public void error (String error);
	
}
