//package csen1002.main.task1;
import java.util.ArrayList;

/**
 * Write your info here
 * 
 * @Elhossin Rihan
 * @id 46-8761
 * @labNumber 08
 */
public class DFA {
	/**
	 * DFA constructor
	 * 
	 * @param description is the string describing a DFA
	 */

	
		public String[] states;
		public String[] intermediate;
		public ArrayList<Character> acceptstates;

	public DFA(String description) {

		// Storing the states in an array. 
		this.states = description.split(";");

		//Storing the value of the accept states 	
		this.intermediate = states[states.length - 1].split("#");
		this.acceptstates = new ArrayList<Character>();
		//Loop through the intermediate accept states and add them into the accept states in the accept states arraylist
		for(int i = 0; i< intermediate[1].length(); i++){
		//add anything in that string other than , ( as we aren't concerned with wrong input formats)	
		if(intermediate[1].charAt(i) != ','){
			acceptstates.add(intermediate[1].charAt(i));
		}
		//After the loop is finished I should have my accept states and my dfa states ready to roll
		}
	}

	/**
	 * Returns true if the string is accepted by the DFA and false otherwise.
	 * 
	 * @param input is the string to check by the DFA.
	 * @return if the string is accepted or not.
	 */
	public boolean run(String input) {

		//Loop through the input and make sure that it is indeed of the language recognized by the dfa
		for(int i = 0 ; i < input.length ; i++){

		}	
		return false;
	}
}
