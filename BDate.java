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

public class BDate
{
	
//Attributes
	private int day;
	private int month;
	private int year;

	//Methods

	public BDate(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
	}



	public  int getDay() {
	return day;
	}

	public void setDay(int day) {
		this.day = day;
	}



	public  int getMonth() {
	return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}



	public  int getYear() {
	return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String convertDateToString(){
	String bornDate = "";
	 bornDate += Integer.toString(day);
	 bornDate += "/";
	 bornDate += Integer.toString(month);
	 bornDate += "/";
	 bornDate += Integer.toString(year);

	 return bornDate;
	}

	public String dateOfShot(){
		String dateOfShot = "";
		int yearPlus = year + 1;
	 dateOfShot += Integer.toString(day);
	 dateOfShot += "/";
	 dateOfShot += Integer.toString(month);
	 dateOfShot += "/";
	 dateOfShot += Integer.toString(yearPlus);

	 return dateOfShot;

	}


	

}
