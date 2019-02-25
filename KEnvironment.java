/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 24 FEBRUARY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;

public class KEnvironment
{

//Attributes
	private double area;
	private double food;
	private double water;

//Relationships
	private Kangaroo kangarooA;
	private Kangaroo kangarooB;
	private Kangaroo kangarooC;

	//Methods

	public KEnvironment(double area, double food, double water, Kangaroo kangarooA, Kangaroo kangarooB, Kangaroo kangarooC){
	this.area = area;
	this.food = food;
	this.water = water;
	this.kangarooA = kangarooA;
	this.kangarooB = kangarooB;
	this.kangarooC = kangarooC;
	}



	public  double getArea() {
	return area;
	}

	public void setArea(double area) {
		this.area = area;
	}



	public  double getFood() {
	return food;
	}

	public void setFood(double food) {
		this.food = food; 
	}



	public  double getWater() {
	return water;
	}

	public void setWater(double water) {
		this.water = water;
	}



	public  Kangaroo getKangarooA() {
	return kangarooA;
	}

	public void setKangarooA(Kangaroo kangarooA) {
		this.kangarooA = kangarooA;
	}



	public  Kangaroo getKangarooB() {
	return kangarooB;
	}

	public void setKangarooB(Kangaroo kangarooB) {
		this.kangarooB = kangarooB;
	}


	public  Kangaroo getKangarooC() {
	return kangarooC;
	}

	public void setKangarooC(Kangaroo kangarooC) {
		this.kangarooC = kangarooC;
	}

	public  double calculateTotalFood() {
		food = kangarooA.getFood() + kangarooB.getFood() + kangarooC.getFood();
		return food;
	}

	public  double calculateWater(){

		water = (kangarooA.getBmi() + kangarooB.getBmi() + kangarooC.getBmi()) * 1.5;
		return water;
	}


	public double calculateArea(){

		area = (kangarooA.getHeight() + kangarooB.getHeight() + kangarooC.getHeight()) * 8.0;
		return area; 
	}


	/*public void keepMalesSafe(){
		if(kangarooA.getGender() == Kangaroo.MALE){
			if (kangarooB  == Kangaroo.MALE){
				kangarooB.setGender(null);
				System.out.println("No pueden haber dos canguros machos en un ambiente, digite de nuevo el sexo");
			}
		}

	} */


}
