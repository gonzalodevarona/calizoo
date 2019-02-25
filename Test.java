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

package ui;

import model.*;
import java.util.*;

public class  Test
{
	private Scanner reader;
	private Exhibition startThisThing;

	public Test (){

		init ();
		reader = new Scanner(System.in);
	}
	
	

	public static void main(String[] args){

		Test execute = new Test();


		execute.menu();
		
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

	public void menu(){
		int userInput = 0;

		System.out.println("");
		System.out.println("");
		System.out.println("*************************************************************************************************************************************************************************************"); 	
		System.out.println("*************************************************************************************************************************************************************************************"); 	
		System.out.println("***********************************************                                                                                       ***********************************************"); 	
		System.out.println("*********************************************** WELCOME TO THE OUTBACK, WHERE MANAGING KANGAROOS AND BEARDED DRAGONS IS NOT A PROBLEM ***********************************************"); 
		System.out.println("***********************************************                                                                                       ***********************************************"); 		
		System.out.println("*************************************************************************************************************************************************************************************"); 
		System.out.println("*************************************************************************************************************************************************************************************");
		System.out.println("");
		System.out.println("");

		showMenuOptions();

		while (userInput != 2){
			System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			userInput = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");

			switch (userInput) {
				case 1: System.out.println("");
						System.out.println("Please select one species from below:");
						System.out.println("");
						System.out.println("1. Kangaroo");
						System.out.println("2. Bearded Dragon");
				break;

				case 2: System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
						System.out.println("");
						System.out.println("THANK YOU FOR USING THE OUTBACK");
						System.out.println("");

				break;

				default:  	System.out.println("");
							System.out.println("Please enter a valid selection");
							System.out.println("");

				

				
				
				
			}

			}
		

		
	}

	public void showMenuOptions(){
		System.out.println("1. Register a new animal.");
		System.out.println("2. QUIT PROGRAM");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
	}

		
}
