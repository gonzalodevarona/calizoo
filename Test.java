/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 28 FEBRUARY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package ui;



import model.*;
import java.util.*;

public class  Test
{

	//ATTRIBUTES
	private Scanner reader;

	//RELATIONSHIPS
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
		BDate dateRoger = new BDate(12, 7, 2010);
		BDate dateBenji = new BDate(27, 3, 2013);
		BDate dateDaisy = new BDate(16, 10, 2014);
		BDate dateBrandon = new BDate(25, 2, 2017);
		BDate datePage = new BDate(6, 6, 2018);
		BDate dateHelena = new BDate(10, 9, 2016);
		Kangaroo roger = new Kangaroo("Roger", 80.0, 1.95, Kangaroo.MALE, "O",  dateRoger );

		Kangaroo daisy = new Kangaroo("Daisy", 40.0, 1.50, Kangaroo.FEMALE, "A", dateDaisy);

		Kangaroo benji = new Kangaroo("Benji", 73.0, 1.83, Kangaroo.MALE, "AB", dateBenji);

		Kangaroo helena = new Kangaroo("Helena", 45.0, 1.54, Kangaroo.FEMALE, "A", dateHelena);

		Kangaroo brandon = new Kangaroo("Brandon", 72.0, 1.85, Kangaroo.MALE, "B", dateBrandon);

		Kangaroo page = new Kangaroo("Page", 50.0, 1.60, Kangaroo.FEMALE, "O", datePage);

		KEnvironment firstEnvironment = new KEnvironment(roger, daisy , null);

		KEnvironment secondEnvironment = new KEnvironment( benji, helena, null);

		KEnvironment thirdEnvironment = new KEnvironment( brandon, page, null);

		KZone kangarooZone = new KZone(firstEnvironment, secondEnvironment, thirdEnvironment);
		BDate dateEsperanza = new BDate(18, 07, 2016);
		BDate dateJustin = new BDate(23, 11, 2015);
		BeardedDragon esperanza = new BeardedDragon("Esperanza", 0.45, 0.4, BeardedDragon.FEMALE, "O", dateEsperanza);
		BeardedDragon justin = new BeardedDragon("Justin", 0.45, 0.5, BeardedDragon.MALE, "A", dateJustin);
		DZone dragonZone = new DZone(36.3, 6.0, esperanza, justin);
		startThisThing = new Exhibition("Australia, donde el agua es oro", 1500, kangarooZone, dragonZone);
	}

	

	//************************ METHODS ************************







	




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

		while (userInput != 6){

					System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			userInput = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");

			switch (userInput) {

				//ADD KANGAROOS
				case 1: System.out.println("");
						System.out.println("Please select the environment for the kangaroo to be placed:");
						System.out.println("");
						System.out.println("1. Environment A");
						System.out.println("2. Environment B");
						System.out.println("3. Environment C");
						System.out.println("4. BACK");
						System.out.println("");
						typeSelectionMssg();
						userInput = reader.nextInt();
						reader.nextLine();
						plainLine();

						KEnvironment availableEnvironment = null;
						availableEnvironment = pickEnvironmentToAddK();

						if (availableEnvironment != null) { /*createKangaroo(availableEnvironment);*/}
							
						else if (availableEnvironment == null) {menu();}
						
				break;

				//DELETE KANGAROOS
				case 2: startThisThing.kangarooList();
						System.out.println("");
						typeSelectionMssg();
						
						userInput = reader.nextInt();
						reader.nextLine();

						plainLine();

						switch (userInput) {
							case 0: menu();
								break;
							case 1: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 2: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 3: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 4: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 5: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 6: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 7: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 8: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							case 9: startThisThing.getZooKangaroos().deleteKangaroo(userInput);
								break;
							default: menu();
								break;
						 	
						 } 

						 menu();

					


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

	public void typeSelectionMssg() {	
		System.out.println("--------------------------------------");
		System.out.print("| Type the number of your selection: ");	
	} 


	public void plainLine(){
		System.out.println("--------------------------------------");
	}

		



	public KEnvironment pickEnvironmentToAddK(){
		
		KEnvironment kEnvironment = null;
		int userInput = 0;
		userInput = reader.nextInt();
		reader.nextLine();

		switch (userInput) {

			case 1: if (startThisThing.getZooKangaroos().getEnvironmentA().checkIfEnvironmentIsFull() == true) {
				System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
			} else { kEnvironment = startThisThing.getZooKangaroos().getEnvironmentA();}
			break;
			case 2: if (startThisThing.getZooKangaroos().getEnvironmentB().checkIfEnvironmentIsFull() == true) {
				System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
			} else { kEnvironment = startThisThing.getZooKangaroos().getEnvironmentB();}
			break;
			case 3: if (startThisThing.getZooKangaroos().getEnvironmentC().checkIfEnvironmentIsFull() == true) {
				System.out.println("This environment is full, try with another one or delete kangaroos from this environment");
			} else { kEnvironment = startThisThing.getZooKangaroos().getEnvironmentC();}
			break;
			case 4: menu();
			break;
		}
	return kEnvironment;
	}





}
