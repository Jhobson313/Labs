package Lab12;

import java.util.Scanner;

public abstract class Player {
	private String name;
	
	public Player (String  name){
		this.name = name;
	}

	public abstract Roshambo generateRoshambo() ;
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean yesOrNo(Scanner scanner, String string) {
		
		return false;
	}
}
