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

public class Kangaroo
{
	
//Constants

//Domain for heartLevel
public final static String BAJO = "Riesgo bajo";
public final static String MODERADO = "Riesgo moderado";
public final static String ALTO = "Riesgo alto";

//Domain for gender
public final static String MACHO = "Male";
public final static String HEMBRA = "Female";


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

//Relationships
	private BDate birthDateK;


//Methods
	
	public Kangaroo (String name, double weight, double height, String gender, String bloodType, double bmi, String heartLevel, BDate birthDateK, boolean needsShot, double food) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodType = bloodType;
		this.bmi = bmi;
		this.heartLevel = heartLevel;
		this.birthDateK = birthDateK;	
		this.needsShot = needsShot;
		this.food = food;
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



	public double calculateFoodPerKangaroo() {

		if (getWeight() < 30) {
		food = getWeight() * 0.80;

		} else if (getWeight() >= 30 && getWeight() <= 48 ) { 		      
			    food = getWeight() * 1.1;
			    
			} else {
				food = 0.4 * (getWeight()-48) + 40;

			}

		return food; }

	public double calculateBmi () {

		bmi = getWeight() / (getHeight() * getHeight());
		return bmi;
	}


	public String calculateHeartLevel() {

	if (needsShot == false) {
		if (getBmi() < 18.0) {

			switch (bloodType) {
				case "A": heartLevel = BAJO;
				break;
				case "AB": heartLevel = BAJO;
				break;
				default : heartLevel = MODERADO;
			}

		} else if (getBmi() >= 18.0 && getBmi() <= 25.0) {
			heartLevel = MODERADO;

		} else {
			if (getBloodType() == "A" || getBloodType() == "B" || getBloodType() == "O") {
				heartLevel = ALTO;
			} else { heartLevel = MODERADO;}
		}
	}

		return heartLevel;
		}


}
	
