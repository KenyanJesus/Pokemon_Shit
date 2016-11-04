import java.util.*;

public class POKEMON {

	//static tables holding types and value modifiers
	
	static String[] pokeType = {
	 "Normal",   "Fire",   "Water",  "Electric", "Grass",   "Ice",
	 "Fighting", "Poison", "Ground", "Flying",   "Psychic", "Bug",
	 "Rock",     "Ghost",  "Dragon", "Dark",     "Steel",   "Fairy"
	};
	
	public static double [][] pokeValues = {
			{ 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 0.0, 1.0, 1.0, 0.5, 1.0 },
	        { 1.0, 0.5, 0.5, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 1.0, 2.0, 1.0 },
	        { 1.0, 2.0, 0.5, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0, 1.0 },
	        { 1.0, 1.0, 2.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.0, 2.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0 },
	        { 1.0, 0.5, 2.0, 1.0, 0.5, 1.0, 1.0, 0.5, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 0.5, 1.0, 0.5, 1.0 },
	        { 1.0, 0.5, 0.5, 1.0, 2.0, 0.5, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0 },
	        { 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 0.5, 0.5, 0.5, 2.0, 0.0, 1.0, 2.0, 2.0, 0.5 },
	        { 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.5, 0.5, 1.0, 1.0, 0.0, 2.0 },
	        { 1.0, 2.0, 1.0, 2.0, 0.5, 1.0, 1.0, 2.0, 1.0, 0.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0 },
	        { 1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 0.5, 1.0 },
	        { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 0.0, 0.5, 1.0 },
	        { 1.0, 0.5, 1.0, 1.0, 2.0, 1.0, 0.5, 0.5, 1.0, 0.5, 2.0, 1.0, 1.0, 0.5, 1.0, 2.0, 0.5, 0.5 },
	        { 1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0 },
	        { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0 },
	        { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 0.0 },
	        { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 0.5 },
	        { 1.0, 0.5, 0.5, 0.5, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 2.0 },
	        { 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 0.5, 1.0 }
	        };

	
	public static void main(String[] args) {
		POKEMON poke = new POKEMON();
		poke.start();
	}
	
	String getInput(Scanner sc){
		String input;
		input = sc.nextLine();
		return input;
	}
	
	public void start(){
		String input = null;
		String[] splitInput = null;
		String partOne = null;
		String partTwo = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the conversion in this way, or else shit breaks: ");
		System.out.println("(Attacking pokemon) Fire -> Grass (Defending Pokemon)");
		System.out.println("The type has to start with a capital letter!");
		System.out.println("Close the program by typing: 'end'");
		
		while(input != "end"){
			input = this.getInput(sc);
			if (input.equals("end")){
				return;
			}
			try{
				splitInput = input.split(" -> ");
				if(splitInput.length == 1){
					Exception e = new Exception();
					throw(e);
				}
				partOne = splitInput[0];
				partTwo = splitInput[1];
				this.getConversion(partOne, partTwo);
			}catch(Exception e){
				System.out.println("Stop typing shit that doesn't work");
			
			}
		}
	}
		//converts the type on the left to the type on the right
		public void getConversion(String first, String second){
		ArrayList<Integer> indexFirst = new ArrayList<Integer>();
		ArrayList<Integer> indexSecond = new ArrayList<Integer>();
		String[] firstSplit;
		String[] secondSplit;
		double modifier = 1;
		
		firstSplit = first.split(" ");
		secondSplit = second.split(" ");
		
		for(int i = 0; i<firstSplit.length; i++){
			for(int j = 0; j<pokeType.length; j++){
				if(pokeType[j].equals(firstSplit[i])){
					indexFirst.add(j);
				}
			}
		}

		for(int i = 0; i<secondSplit.length; i++){
			for(int j = 0; j<pokeType.length; j++){
				if (pokeType[j].equals(secondSplit[i])){
					indexSecond.add(j);
				}
			}
		}
		if (indexFirst.size() == 0 && indexSecond.size() == 0){
			System.out.println(String.format("%s, %s, are not a valid pokeTypes", first, second));
			return;
		}
		
		if (indexFirst.size() == 0){
			System.out.println(String.format("%s, is not a valid pokeType", first));
			return;
		}
		
		if (indexSecond.size() == 0){
			System.out.println(String.format("%s, is not a valid pokeType", second));
			return;
		}
		
	    for(Integer e : indexFirst){
	        for(Integer d : indexSecond){
	            modifier = modifier * pokeValues[e][d];
	        }
	    }
		
		System.out.println(modifier + "X");
		
	}			
}