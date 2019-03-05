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

	public  double calculateTotalFood() {
		food = 0.0;
		
		if (kangarooA != null){
			food += kangarooA.getFood();
		} else if (kangarooB != null){
			food += kangarooB.getFood();
		} else if (kangarooC != null){
			food += kangarooC.getFood();
		}

		return food;
	}

	public  double calculateWater(){

		water = 0.0;
		
		if (kangarooA != null){
			water += kangarooA.getWater();
		} else if (kangarooB != null){
			water += kangarooB.getWater();
		} else if (kangarooC != null){
			water += kangarooC.getWater();
		}

		return water;
	}	
	

	public double calculateArea() {
		area = 0.0;
		
		if (kangarooA != null){
			area += kangarooA.getArea();
		} else if (kangarooB != null){
			area += kangarooB.getArea();
		} else if (kangarooC != null){
			area += kangarooC.getArea();
		}

		return area;
	}	



	

		public  void updateEnvironment(){
			calculateArea();
			calculateTotalFood();
			calculateWater();


		}



	
	public String infoFromEnvironment(){
		String environmentInfo = "";


			if (kangarooA != null ){
				 environmentInfo += kangarooA.showKangaroosInfo();
			} 

			if (kangarooB != null ){
				 environmentInfo += kangarooB.showKangaroosInfo();
			} 

			if (kangarooC != null ){
				 environmentInfo += kangarooC.showKangaroosInfo();
			}

			return environmentInfo;
	}

	public String listKangaroosShot(){
		String kangaroosShot = "";


			if (kangarooA != null ){
				 kangaroosShot += kangarooA.listFalse();
			} 

			if (kangarooB != null ){
				 kangaroosShot += kangarooB.listFalse();
			} 

			if (kangarooC != null ){
				 kangaroosShot += kangarooC.listFalse();
			}

			return kangaroosShot;
	}



	public String listKangaroosVowel(){
		String kangaroosVowel = "";


			if (kangarooA != null ){
				 kangaroosVowel += kangarooA.listKVowel();
			} 

			if (kangarooB != null ){
				 kangaroosVowel += kangarooB.listKVowel();
			} 

			if (kangarooC != null ){
				 kangaroosVowel += kangarooC.listKVowel();
			}

			return kangaroosVowel;
	}



		

	
		

	public String createKangaroo(Kangaroo theNew) {
		String reply = "";
		
		if (kangarooA == null || kangarooB == null || kangarooC == null) {
			
			if(theNew.getGender().equals(Kangaroo.MALE)) {
				
				if (oneMaleKangaroo()) {
					reply += "ERROR: There is already one male kangaroo, for kangaroos safety there can not be 2 males in the same environment.";
				}		
			} else  if(kangarooA == null) {
				kangarooA = theNew;
				updateEnvironment();
				reply += "Kangaroo successfully added";
			}else if (kangarooB == null) {
				kangarooB = theNew;
				updateEnvironment();
				reply += "Kangaroo successfully added";

			}else if (kangarooC == null) {
				kangarooC = theNew;
				updateEnvironment();
				reply += "Kangaroo successfully added";

			} 
		
			
			
			
		}else {
			reply += "This kangaroo can not be added to this environment because it is full.";
		}
		
		return reply;
	}


	public boolean oneMaleKangaroo(){
		boolean oneMaleKangaroo = true;

		if ((kangarooA != null && kangarooA.getGender()  == Kangaroo.MALE) || (kangarooB != null && kangarooB.getGender()  == Kangaroo.MALE) ||
			(kangarooC != null && kangarooC.getGender() == Kangaroo.MALE)){
			 } else {oneMaleKangaroo = false;}

		return oneMaleKangaroo;
		}






	public boolean theChange(Kangaroo kChange){
		String reply =  "";
		boolean workDone = false;

		if (kangarooA == null || kangarooB == null || kangarooC == null) {
			
			if(kChange.getGender().equals(Kangaroo.MALE)) {
				
				if (oneMaleKangaroo()) {
					reply += "ERROR: There is already one male kangaroo, for kangaroos safety there can not be 2 males in the same environment.";
				} 
			}	


		  	else if(kangarooA == null) {
		  		workDone = true;
				kangarooA = kChange;
				updateEnvironment();
				reply += "Kangaroo successfully changed from original environment";
			}else if (kangarooB == null) {
				workDone = true;
				kangarooB = kChange;
				updateEnvironment();
				reply += "Kangaroo successfully changed from original environment";

			}else if (kangarooC == null) {
				workDone = true;
				kangarooC = kChange;
				updateEnvironment();
				reply += "Kangaroo successfully changed from original environment";
			}

		} else {
			reply += "This kangaroo can not be added to this environment because it is full.";
		  }
		
		
		  	System.out.println("");
			System.out.println(reply);
			System.out.println("");

			return workDone;

 	}













} 
	
	


