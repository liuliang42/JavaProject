package DotComBust;

import java.util.*;

public class DotCom {
	
	private ArrayList<String> locationCells;
	
	private String name;
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String UserInput) {
		String result = "miss";
		int index = locationCells.indexOf(UserInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! You sunk"+name+" :(");
			}else {
				result = "hit";
				
			}
		}
		return result;
	}
}
