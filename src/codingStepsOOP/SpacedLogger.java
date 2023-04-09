package codingStepsOOP;

public class SpacedLogger implements Logger{

	@Override
	/*Q6 Using SpaceLogger to add spaces between each character of
	 * the string argument passed into the string. 
	 * ie "Hello" = "H e l l o"
	 * */
	public void log(String log) {
		
		StringBuilder spacingWord = new StringBuilder(); //instantiating the spacingWord to the new Stringbuilder
		
		for (int i = 0; i < log.length(); i++) {
		spacingWord.append(log.charAt(i)).append(" "); //appends each char in log string to SB 
													   //object spacingWord followed by a space character	
		}
		System.out.println(spacingWord.toString()); //Printing  Q7
	}

	@Override
	/*Q8 Using the spaceLogger to add spaces between each character 
	 * */
	public void error(String log) {
		
		StringBuilder spacingWord = new StringBuilder ("ERROR: ");
		
		for (int i = 0; i < log.length(); i++) {
			spacingWord.append(log.charAt(i)).append(" ");
			
		}
		System.out.println(spacingWord.toString());
	}

}
