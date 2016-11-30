package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private String name;
	private int Cp;
	
	public Pokemon(String name, int CP){
		this.name = name;
		this.Cp = CP;
	}
	public String getName(){
		return this.name;
	}
	public int getCp(){
		return this.Cp;
	}
	public void SetCp(int CP){
		this.Cp = CP;
	}
}
