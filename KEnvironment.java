/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 27 FEBRUARY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;

public class KEnvironment{


//Attributes
	private double area;
	private double food;
	private double water;

//Relationships
	private Kangaroo kangarooA;
	private Kangaroo kangarooB;
	private Kangaroo kangarooC;

	//Methods

	public KEnvironment(Kangaroo kangarooA, Kangaroo kangarooB, Kangaroo kangarooC){
	this.kangarooA = kangarooA;
	this.kangarooB = kangarooB;
	this.kangarooC = kangarooC;
	this.area = calculateArea();
	this.food = calculateTotalFood();
	this.water = calculateWater();
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

	public  void calculateTotalFood() {
		food = kangarooA.getFood() + kangarooB.getFood() + kangarooC.getFood();
		
	}

	public  void calculateWater(){
		if (kangarooA != null){
			water = (kangarooA.getBmi() + kangarooB.getBmi() + kangarooC.getBmi()) * 1.5;
		} else {water = (kangarooC.getBmi() + kangarooB.getBmi()) * 1.5; }

		if (kangarooB != null){
		water = (kangarooA.getBmi() + kangarooB.getBmi() + kangarooC.getBmi()) * 1.5;
		} else {water = (kangarooA.getBmi() + kangarooC.getBmi()) * 1.5; }

		if (kangarooC != null){
		water = (kangarooA.getBmi() + kangarooB.getBmi() + kangarooC.getBmi()) * 1.5;
		} else {water = (kangarooA.getBmi() + kangarooB.getBmi()) * 1.5; }

		
	}	
	

	public void calculateArea() {
		if (kangarooA != null){
			area = (kangarooA.getHeight() + kangarooB.getHeight() + kangarooC.getHeight()) * 8.0;
		} else {area = (kangarooC.getHeight() + kangarooB.getHeight()) * 8.0; }

		if (kangarooB != null){
		water = (kangarooA.getHeight() + kangarooB.getHeight() + kangarooC.getHeight()) * 8.0;
		} else {area = (kangarooA.getHeight() + kangarooC.getHeight()) * 8.0; }

		if (kangarooC != null){
		water = (kangarooA.getHeight() + kangarooB.getHeight() + kangarooC.getHeight()) * 8.0;
		} else {area = (kangarooA.getHeight() + kangarooB.getHeight()) * 8.0; }

		
	}	



	

		public void deleteKangaroo(boolean choise){
			
			int pickKangaroo = 0;
			if (choise == true){
			
				switch (pickKangaroo){

					case 1: setKangarooA(null);
						updateEnvironment();
						System.out.println("Deleated Kangaroo #1 from the environment."  );
						
						break;

					case 2: setKangarooB(null);
						updateEnvironment();
						System.out.println("Deleated Kangaroo #2 from the environment."  );

						break;

					case 3: setKangarooC(null);
						updateEnvironment();
						System.out.println("Deleated Kangaroo #3 from the environment." );

						break;

					default: System.out.println("Pick a valid kangaroo");
						break;


				}
			}

	} 

	

	public boolean oneMaleKangaroo(){
		boolean oneMaleKangaroo = false;

		if ((kangarooA.getGender()  == Kangaroo.MACHO) || (kangarooB.getGender()  == Kangaroo.MACHO)){
			oneMaleKangaroo = true; }
			
			else if (kangarooC != null && kangarooA.getGender() == Kangaroo.MACHO){
				oneMaleKangaroo = true;
				}

		return oneMaleKangaroo;
		}
		
	public boolean checkIfEnvironmentIsFull() {

		boolean full = false;
		if (kangarooA != null && kangarooB != null && kangarooC != null){
			full = true;
		}

		return full;
	}

	
	




} 
	
	


