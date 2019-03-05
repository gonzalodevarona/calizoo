	/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 4 MARCH 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;

public class DZone
{
	
//Attributes
	private double temperature;
	private double food;
	private double water;

//Relationships
	private BeardedDragon dragonA;
	private BeardedDragon dragonB;


//Methods

	public DZone(double temperature, double food, BeardedDragon dragonA, BeardedDragon dragonB){
	this.temperature = temperature;
	this.food = food;
	this.dragonA = dragonA;
	this.dragonB = dragonB;
	this.water = calculateWater();
	}



	public double getTemperature() {
		return temperature;
	}

	public void setTemperature() {
		this.temperature = temperature;
	}



	public double getFood() {
		return food;
	}

	public void setFood() {
		this.food = food;
	}



	public double getWater() {
		return water;
	}

	public void setWater() {
		this.water = water;
	}



	public BeardedDragon getDragonA() {
		return dragonA;
	}

	public void setDragonA() {
		this.dragonA = dragonA;
	}



	public BeardedDragon getDragonB() {
		return dragonB;
	}

	public void setDragonB() {
		this.dragonB = dragonB;
	}


	public  double calculateWater(){

		water = (dragonA.getBmi() + dragonB.getBmi()) * 0.75;
		return water;
	}


	public void notifyDragonsFood(){

		if (food < 5.0)
			System.out.println ("Bearded dragons have less than 5 Kg of food");
	}


	public void notifyDragonsTemperature(){

		if (!(temperature >= 35.0 && temperature <= 40.0))
			System.out.println ("Bearded dragon's zone is not between 35 and 40 celsius degrees");
	}


	public String infoFromDZone(){
		String finalZhow = "Those are the two bearded dragons from the zoo:";
		finalZhow += dragonA.showDragonsInfo();
		finalZhow += dragonB.showDragonsInfo();
		return finalZhow;

	}


		public String dListVowel (){
		String theList = "Those are the bearded dragons whose name start and end with a vowel\n";
		theList += dragonA.listDVowel();
		theList += dragonB.listDVowel();
		
		return theList;

	}


}
