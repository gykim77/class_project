import java.util.ArrayList;

public class BS {
	private ArrayList<String> locationCells;
	private String name;

	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if(index >= 0) {
			locationCells.remove(index);
			if(locationCells.isEmpty()) {
				result = "kill";
				System.out.println("you sunk " + name + "!");
			}else {
				result = "hit";
			}
		}
		return result;
		
	}
	
}
