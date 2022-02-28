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
		public ArrayList<Integer> acceptstates;

	public DFA(String description) {

		// Storing the states in an array. 
		this.states = description.split(";");

		//Storing the value of the accept states 	
		this.intermediate = states[states.length - 1].split("#");
		this.acceptstates = new ArrayList<Integer>();
		//Loop through the intermediate accept states and add them into the accept states in the accept states arraylist
		for(int i = 0; i< intermediate[1].length(); i++){
		//add anything in that string other than , ( as we aren't concerned with wrong input formats)	
		if(intermediate[1].charAt(i) != ','){
			acceptstates.add(Character.getNumericValue(intermediate[1].charAt(i)));
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

		int strt_indx = 0;
		//Loop through the input and make sure that it is indeed of the language recognized by the dfa
		for(int i = 0 ; i < input.length() ; i++){
			//if 0 then transition to the 0s transition of the current state
			if(input.charAt(i) == '0'){
				strt_indx = Character.getNumericValue(this.states[strt_indx].charAt(2));
			}
			//if 1 then transition to the 1s transition of the current state
			if(input.charAt(i) == '1'){
				strt_indx = Character.getNumericValue(this.states[strt_indx].charAt(4));
			}
		}
		if(acceptstates.contains(strt_indx)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args){

		DFA dfa1 = new DFA("0,0,1;1,2,1;2,0,3;3,3,3#1,3");
		System.out.println(dfa1.run("11"));
	}
}
