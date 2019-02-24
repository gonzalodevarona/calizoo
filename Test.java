/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @DATE: 23 FEBRUARY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package ui;

import model.*;
import java.util.*;

public class  Test
{

	private Exhibition startThisThing;

	public Test (){

		init ();
	}
	
	

	public static void main(String[] args){

		Test execute = new Test();


		execute.imprimir();
		
	}

	public void init(){
		BDate dateRoger = new BDate(12, 07, 2010);
		BDate dateBenji = new BDate(27, 03, 2013);
		BDate dateDaisy = new BDate(16, 10, 2014);
		Kangaroo roger = new Kangaroo("Roger", 80.0, 1.95, "Male", "O-", 21.0387, "Low", dateRoger, false, 52.8);
		Kangaroo benji = new Kangaroo("Benji", 73.0, 1.83, "Male", "AB+", 21.798, "Low", dateBenji, false, 50.0);
		Kangaroo daisy = new Kangaroo("Daisy", 40.0, 1.50, "Female", "A-", 17.77, "Low", dateDaisy, false, 44.0);
		KEnvironment firstEnvironment = new KEnvironment(15.6, 52.8, 31.55805, roger, null, null);
		KEnvironment secondEnvironment = new KEnvironment(14.64, 50, 32.697, benji, null, null);
		KEnvironment thirdEnvironment = new KEnvironment(12, 44, 26.655, daisy, null, null);
		KZone kangarooZone = new KZone(400.0, firstEnvironment, secondEnvironment, thirdEnvironment);
		BDate dateEsperanza = new BDate(18, 07, 2016);
		BDate dateJustin = new BDate(23, 11, 2015);
		BeardedDragon esperanza = new BeardedDragon("Esperanza", 0.45, 0.4, "Female", "O+", 2.8125, dateEsperanza);
		BeardedDragon justin = new BeardedDragon("Justin", 0.45, 0.5, "Male", "A+", 1.8, dateJustin);
		DZone dragonZone = new DZone(36.3, 6.0, 3.961, esperanza, justin);
		 startThisThing = new Exhibition("Australia, donde el agua es oro", 1500, kangarooZone, dragonZone);
	}

	public void imprimir(){
		System.out.print("Hola Joe/Lord  Barrios, soy "); 	
		System.out.print (startThisThing.getZooKangaroos().getEnvironmentB().getKangarooA().getName())	;
		System.out.println(", el gato de mr gonza. Por favor pongale 5 a mi dueño, MIAU.");
	}

		
}