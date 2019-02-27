/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 26 FEBRUARY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package ui;

import model.*;
import java.util.*;

public class  Test
{

	//ATTRIBUTES
	private Scanner reader;
	private Exhibition startThisThing;

	//EMPTY CONSTRUCTOR
	public Test (){

		init ();
		reader = new Scanner(System.in);
	}
	
	
//MAIN METHOD ****
	public static void main(String[] args){

		Test execute = new Test();


		execute.menu();
		
	}
	

	public void init(){
		BDate dateRoger = new BDate(12, 07, 2010);
		BDate dateBenji = new BDate(27, 03, 2013);
		BDate dateDaisy = new BDate(16, 10, 2014);
		Kangaroo roger = new Kangaroo("Roger", 80.0, 1.95, setKangarooGender(), "O", 21.0387, "Low", dateRoger, false ,
		 startThisThing.getZooKangaroos().getEnvironmentA().getKangarooA().calculateFoodPerKangaroo());

		Kangaroo benji = new Kangaroo("Benji", 73.0, 1.83, setKangarooGender(), "AB", 21.798, "Low", dateBenji, false,
		  startThisThing.getZooKangaroos().getEnvironmentB().getKangarooA().calculateFoodPerKangaroo());

		Kangaroo daisy = new Kangaroo("Daisy", 40.0, 1.50, setKangarooGender(), "A", 17.77, "Low", dateDaisy, false,
		  startThisThing.getZooKangaroos().getEnvironmentC().getKangarooA().calculateFoodPerKangaroo());

		KEnvironment firstEnvironment = new KEnvironment(startThisThing.getZooKangaroos().getEnvironmentA().calculateArea(),  startThisThing.getZooKangaroos().getEnvironmentA().calculateTotalFood(),
			 startThisThing.getZooKangaroos().getEnvironmentA().calculateWater(), roger, null, null);

		KEnvironment secondEnvironment = new KEnvironment(startThisThing.getZooKangaroos().getEnvironmentB().calculateArea(),  startThisThing.getZooKangaroos().getEnvironmentB().calculateTotalFood(),
			 startThisThing.getZooKangaroos().getEnvironmentB().calculateWater(), benji, null, null);

		KEnvironment thirdEnvironment = new KEnvironment(startThisThing.getZooKangaroos().getEnvironmentC().calculateArea(),  startThisThing.getZooKangaroos().getEnvironmentC().calculateTotalFood(),
			 startThisThing.getZooKangaroos().getEnvironmentC().calculateWater(), daisy, null, null);

		KZone kangarooZone = new KZone(400.0, firstEnvironment, secondEnvironment, thirdEnvironment);
		BDate dateEsperanza = new BDate(18, 07, 2016);
		BDate dateJustin = new BDate(23, 11, 2015);
		BeardedDragon esperanza = new BeardedDragon("Esperanza", 0.45, 0.4, "Female", "O", startThisThing.getZooDragons().getDragonA().calculateBmi() , dateEsperanza);
		BeardedDragon justin = new BeardedDragon("Justin", 0.45, 0.5, "Male", "A", startThisThing.getZooDragons().getDragonB().calculateBmi(), dateJustin);
		DZone dragonZone = new DZone(36.3, 6.0, startThisThing.getZooDragons().calculateWater(), esperanza, justin);
		 startThisThing = new Exhibition("Australia, donde el agua es oro", 1500, kangarooZone, dragonZone);
	}

	

	//************************ METHODS ************************

public Kangaroo createKangaroo(KEnvironment kEnvironmentA, KEnvironment kEnvironmentB, KEnvironment kEnvironmentC,){

System.out.print("Name: ");
		reader.nextLine()+,;
System.out.print("Weight (in Kg): ");
		reader.nextDouble()+,;
		reader.nextLine();
System.out.print("Height (in M): ");
		reader.nextDouble()+,;
		reader.nextLine();
setKangarooGender(),;
System.out.print("Blood type: ");
		reader.nextLine()+,;
startThisThing.getZooKangaroos().getEnvironmentA().getKangarooA().
}


public void determinateNeedsShot(int currentDay, int currentMonth, int currentYear){ //hay que hacerlo a cada canguro?
		int userInput = 0;
		int todayInDays = 0;

		System.out.println ("What date is today? \n");

		System.out.print ("Day: ");
		userInput = reader.nextInt();
		reader.nextLine();

		todayInDays = userInput;

		System.out.print ("Month: ");
		userInput = reader.nextInt();
		reader.nextLine();

		userInput *= 30;
		todayInDays += userInput;

		System.out.print ("Year: ");
		userInput = reader.nextInt();
		reader.nextLine();

		userInput -= startThisThing.getZooKangaroos().getEnvironmentA().getKangarooA().getBirthDateK().getYear();
		userInput *= 360;

		todayInDays += (5 + userInput);

		if (todayInDays < 365){
			startThisThing.getZooKangaroos().getEnvironmentA().getKangarooA().setNeedsShot(true);
		} else { startThisThing.getZooKangaroos().getEnvironmentA().getKangarooA().setNeedsShot(true); }

		startThisThing.getZooKangaroos().getEnvironmentA().getKangarooA().calculateHeartLevel();

		


	}


	public String setKangarooGender(){
		int userInput = 0;
		String gender = "";

		System.out.println("1. Male");
		System.out.println("2. Female");
		System.out.println("--------------------------------------");
		System.out.print("| Type the number of your selection: ");
		userInput = reader.nextInt();
		reader.nextLine();

			switch (userInput) {

				/*case 1: if (kangaroo == getEnvironmentA()){
							if (startThisThing.getZooKangaroos().getEnvironmentA().oneMaleKangaroo() == true){
							while (userInput != 2)
							System.out.println("For kangaroo's safety, an environment can not have more than one male kangaroo ");
							System.out.print("Please enter a valid selection: ");
							userInput = reader.nextInt();
							reader.nextLine();
							
							} else{ gender = Kangaroo.MACHO; } 
						}

				else if (kangaroo == getEnvironmentB()){
							if (startThisThing.getZooKangaroos().getEnvironmentB().oneMaleKangaroo() == true){
							while (userInput != 2)
							System.out.println("For kangaroo's safety, an environment can not have more than one male kangaroo ");
							System.out.print("Please enter a valid selection: ");
							userInput = reader.nextInt();
							reader.nextLine();
							
							} else{ gender = Kangaroo.MACHO; } 
						
				}
				else if (kangaroo == getEnvironmentC()){
							if (startThisThing.getZooKangaroos().getEnvironmentC().oneMaleKangaroo() == true){
							while (userInput != 2)
							System.out.println("For kangaroo's safety, an environment can not have more than one male kangaroo ");
							System.out.print("Please enter a valid selection: ");
							userInput = reader.nextInt();
							reader.nextLine();
							
							} else{ gender = Kangaroo.MACHO; } 
						
				}

			break; */
			
			case 2: gender = Kangaroo.HEMBRA;
			
			break;

			default: while (userInput != 1 || userInput != 2)
			System.out.print("Please enter a valid selection: ");
			userInput = reader.nextInt();
			reader.nextLine();


			break;
				
			}
		return gender;
	} 

	




	//************************ MAIN INTERFACE ************************
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

		while (userInput != 7){

			userInput = typeNumberSelection(userInput);

			switch (userInput) {
				case 1: System.out.println("");
						System.out.println("Please select the environment in where kangaroo will be placed:");
						System.out.println("");
						System.out.println("1. Environment A");
						System.out.println("2. Environment B");
						System.out.println("3. Environment C");
						System.out.println("4. BACK");

						pickEnvironmentToAddK();
						userInput = reader.nextInt();
						reader.nextLine();

						switch (userInput) {

							case 1: if (startThisThing.getZooKangaroos().getEnvironmentA().checkIfEnvironmentIsFull() == true) {
								System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
							} else { createKangaroo()}
							break;
							case 2: if (startThisThing.getZooKangaroos().getEnvironmentB().checkIfEnvironmentIsFull() == true) {
								System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
							} else { createKangaroo()}
							break;
							case 3: if (startThisThing.getZooKangaroos().getEnvironmentC().checkIfEnvironmentIsFull() == true) {
								System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
							} else { createKangaroo()}
							break;
							case 4: menu();
							break;

							
						}

					


				break;
				case 2: System.out.println("");
						System.out.println("Please select one species from below:");
						userInput = reader.nextInt();
						reader.nextLine();

					


				break;

				case 6: System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
						System.out.println("");
						System.out.println("THANK YOU FOR USING THE OUTBACK");
						System.out.println("");

				break;
			
				

				
				
				
			}

			}
		

		
	}


 	//ADDED METHODS TO MAIN INTERFACE
	public void showMenuOptions(){
		System.out.println("1. Register a new kangaroo.");
		System.out.println("2. Erase a kangaroo.");
		System.out.println("3. Replace kangaroo.");
		System.out.println("4. Find zoo animals which its name start and end with a vowel.");
		System.out.println("5. Display kangaroos vaccination date");
		System.out.println("6. QUIT PROGRAM");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
	}

	public int typeNumberSelection(int userInput) {
		
		System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			userInput = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");
		return userInput;
	}

		
}


public pickEnvironmentToAddK();
						userInput = reader.nextInt();
						reader.nextLine();

						switch (userInput) {

							case 1: if (startThisThing.getZooKangaroos().getEnvironmentA().checkIfEnvironmentIsFull() == true) {
								System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
							} else { createKangaroo()}
							break;
							case 2: if (startThisThing.getZooKangaroos().getEnvironmentB().checkIfEnvironmentIsFull() == true) {
								System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
							} else { createKangaroo()}
							break;
							case 3: if (startThisThing.getZooKangaroos().getEnvironmentC().checkIfEnvironmentIsFull() == true) {
								System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
							} else { createKangaroo()}
							break;
							case 4: menu();
							break;
}
