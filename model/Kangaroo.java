/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 3 MARCH 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;
import java.util.*;


public class Kangaroo
{
	
//Constants

//Domain for heartLevel
public final static String LOW = "Low risk";
public final static String MODERATED = "Moderated risk";
public final static String HIGH = "High risk";

//Domain for gender
public final static String MALE = "Male";
public final static String FEMALE = "Female";


//Attributes
	private String name;
	private double weight;
	private double height;
	private String gender;
	private String bloodType;
	private double bmi;
	private String heartLevel;
	private boolean needsShot;
	private double food;
	private double area;
	private double water;
	
		

//Relationships
	private BDate birthDateK;


//Methods
	
	public Kangaroo (String name, double weight, double height, String gender, String bloodType, BDate birthDateK) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodType = bloodType;
		this.birthDateK = birthDateK;
		bmi = calculateBmi();
		this.needsShot = determinateNeedsShot();
		this.heartLevel = calculateHeartLevel();	
		this.food = calculateFoodPerKangaroo();
		this.area = calculateArea();
		this.water = calculateWater();
	}



	public  String getName() {
	return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public  double getWeight() {
	return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}



	public  double getHeight() {
	return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}



	public  String getGender() {
	return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public  String getBloodType() {
	return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}



	public  double getBmi() {
	return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}



	public  String getHeartLevel() {
	return heartLevel;
	}

	public void setHeartLevel(String heartLevel) {
		this.heartLevel = heartLevel;
	}


	public  BDate getBirthDateK() {
	return birthDateK;
	}

	public void setBirthDateK(BDate birthDateK) {
		this.birthDateK = birthDateK;
	}



	public  boolean getNeedsShot() {
	return needsShot;
	}

	public void setNeedsShot(boolean needsShot) {
		this.needsShot = needsShot;
	}



	public  double getFood() {
	return food;
	}

	public void setFood(double food) {
		this.food = food; 
	}



	public  double getArea() {
	return area;
	}

	public void setArea(double area) {
		this.area = area; 
	}



	public  double getWater() {
	return water;
	}

	public void setWater(double water) {
		this.water = water; 
	}



	public double calculateFoodPerKangaroo() {

		if (weight < 30) {
		food = weight * 0.80;

		} else if (weight >= 30 && weight <= 48 ) { 		      
			    food = weight * 1.1;
			    
			} else {
				food = 0.4 * (weight-48) + 40;}

		return food;
	}

	public double calculateBmi () {

		bmi = weight / (height * height);

		return bmi;
		
	}


	public String calculateHeartLevel() {
		heartLevel = "no risk";
	if (needsShot == false) {
		if (getBmi() < 18.0) {

			switch (bloodType) {
				case "A": heartLevel = LOW;
				break;
				case "AB": heartLevel = LOW;
				break;
				default : heartLevel = MODERATED;
				break;
			}

		} else if (getBmi() >= 18.0 && getBmi() <= 25.0) {
			heartLevel = MODERATED;

		} else {
			if (getBloodType() == "A" || getBloodType() == "B" || getBloodType() == "O") {
				heartLevel = HIGH;
			} else { heartLevel = MODERATED;}
		}
	}

	return heartLevel;

	}

	public boolean determinateNeedsShot() {
			Calendar today = new GregorianCalendar();
			int month = today.get(Calendar.MONTH) + 1;
			int day = today.get(Calendar.DATE);
			int year = today.get(Calendar.YEAR);

			boolean needsShot = false;


			

			day -= getBirthDateK().getDay();
			

			month = (month - getBirthDateK().getMonth()) * 30;
			

			year = (year - getBirthDateK().getYear()) * 360;
		
			int daysDifference = (day + month + year);


			if (daysDifference < 360){
				needsShot = true;
			} else { needsShot = false; }

			return needsShot;

		

		
	}

	public double calculateArea(){

		area = height * 8.0;

		return area;

	}

	public double calculateWater(){
		water = bmi * 1.5;
		return water;
	}



	public String showKangaroosInfo() {
		
		String kangarooInfo ="\n";

		 kangarooInfo += ("\n");
		 kangarooInfo += ("*****************************************************\n");
		 kangarooInfo += ("* My name is "+name+".\n");
		 kangarooInfo += ("* I weight "+weight+" Kg.\n");
		 kangarooInfo += ("* I am "+height+" m tall.\n");
		 kangarooInfo += ("* I am a "+gender+".\n");
		 kangarooInfo += ("* My blood type is: "+bloodType+".\n");
		 kangarooInfo += ("* I was born on "+birthDateK.convertDateToString()+".\n");
		 kangarooInfo += ("* My bmi is: "+bmi+"\n");
		 kangarooInfo += ("* I have a "+heartLevel+" from heart diseases.\n");
		 kangarooInfo += ("*****************************************************\n");
		 kangarooInfo += ("\n");
		 kangarooInfo += ("\n");

		 return kangarooInfo;
		

	}

	public String listFalse(){
		String kangarooFalse ="\n";
		if(needsShot == false){

			kangarooFalse += (name+" "+birthDateK.dateOfShot()+"\n");

		}

		return kangarooFalse;

	}

	public String listKVowel (){
		String kangarooVowel = "\n";

		int longN = name.length();
		longN -= 1;

		if ((name.charAt(0) == 'A' || name.charAt(0) == 'E' || name.charAt(0) == 'I' || name.charAt(0) == 'O' || name.charAt(0) == 'U' || 
			name.charAt(0) == 'a' || name.charAt(0) == 'e' || name.charAt(0) == 'i' || name.charAt(0) == 'o' || name.charAt(0) == 'u') && 
			(name.charAt(longN) == 'A' || name.charAt(longN) == 'E' || name.charAt(longN) == 'I' || name.charAt(longN) == 'O' || name.charAt(longN) == 'U' || 
			name.charAt(longN) == 'a' || name.charAt(longN) == 'e' || name.charAt(longN) == 'i' || name.charAt(longN) == 'o' || name.charAt(longN) == 'u') ){
			kangarooVowel += name+" the kangaroo. \n";
		}

		return kangarooVowel;

	}
	







}
	
