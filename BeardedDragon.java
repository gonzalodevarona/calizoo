/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 1 MARCH 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;

public class BeardedDragon
{
	
//CONSTANTS
public final static String MALE = "Male";
public final static String FEMALE = "Female";


//Attributes
	private String name;
	private double weight; 
	private double height;
	private String gender;
	private String bloodType;
	private double bmi;

//Relationships
	private BDate birthDateD;


	//Methods

	public BeardedDragon (String name, double weight, double height, String gender, String bloodType, BDate birthDateD) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodType = bloodType;
		this.birthDateD = birthDateD;
		this.bmi = calculateBmi();
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



	public  BDate getBirthDateD() {
	return birthDateD;
	}

	public void setBirthDateD(BDate birthDateD) {
		this.birthDateD = birthDateD;
	}

	public double calculateBmi() {

		bmi = getWeight() / (getHeight() * getHeight());	
		return bmi;
	}


		public String showDragonsInfo() {
		
		String dragonInfo ="\n";

		 dragonInfo += ("\n");
		 dragonInfo += ("*****************************************************\n");
		 dragonInfo += ("* My name is: "+name+".\n");
		 dragonInfo += ("* I weight: "+weight+" Kg.\n");
		 dragonInfo += ("* I am "+height+" m long.\n");
		 dragonInfo += ("* I am a "+gender+".\n");
		 dragonInfo += ("* My blood type is: "+bloodType+".\n");
		 dragonInfo += ("* I was born on "+birthDateD.convertDateToString()+".\n");
		 dragonInfo += ("* My bmi is: "+bmi+"\n");
		 dragonInfo += ("*****************************************************\n");
		 dragonInfo += ("\n");
		 dragonInfo += ("\n");

		 return dragonInfo;
		

	}


		public String listDVowel (){
		String dragonVowel = "\n";

		int longN = name.length();
		longN -= 1;

		if ((name.charAt(0) == 'A' || name.charAt(0) == 'E' || name.charAt(0) == 'I' || name.charAt(0) == 'O' || name.charAt(0) == 'U' || 
			name.charAt(0) == 'a' || name.charAt(0) == 'e' || name.charAt(0) == 'i' || name.charAt(0) == 'o' || name.charAt(0) == 'u') && 
			(name.charAt(longN) == 'A' || name.charAt(longN) == 'E' || name.charAt(longN) == 'I' || name.charAt(longN) == 'O' || name.charAt(longN) == 'U' || 
			name.charAt(longN) == 'a' || name.charAt(longN) == 'e' || name.charAt(longN) == 'i' || name.charAt(longN) == 'o' || name.charAt(longN) == 'u') ){
			dragonVowel += name+" the bearded dragon. \n";
		}

		return dragonVowel;

	}




}
