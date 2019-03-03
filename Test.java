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

		Kangaroo helena = new Kangaroo("Elena", 45.0, 1.54, Kangaroo.FEMALE, "A", dateHelena);

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


//ADDED METHODS TO MAIN INTERFACE
	public void showMenuOptions(){
		System.out.println("1. Register a new kangaroo.");
		System.out.println("2. Delete a kangaroo.");
		System.out.println("3. Replace kangaroo.");
		System.out.println("4. Show exhibition animals whose name start and end with a vowel.");
		System.out.println("5. Show kangaroos vaccination date");
		System.out.println("6. Show kangaroos information.");
		System.out.println("7. Show bearded dragons information.");
		System.out.println("8. QUIT PROGRAM");
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

		

		while (userInput != 8){

			showMenuOptions();

					System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			userInput = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");

			switch (userInput) {

				//ADD KANGAROOS
				case 1: System.out.println("");
						System.out.print("Please type the  name  of the new kangaroo:");

						String name = reader.nextLine();

						System.out.println("");



						System.out.print("Please type the  weight  of the new kangaroo (in Kg):");

						double weight = reader.nextDouble();
						reader.nextLine();

						System.out.println("");



						System.out.print("Please type the  height  of the new kangaroo (in m): ");
						double height = reader.nextDouble();
						reader.nextLine();
						System.out.println("");

						System.out.println("");
						System.out.println("Please select the gender for the new kangaroo: \n 1. Male \n 2.Female");
						System.out.println("");
						typeSelectionMssg();
						userInput = reader.nextInt();
						reader.nextLine();
						plainLine();

						String gender = (userInput == 1? Kangaroo.MALE : Kangaroo.FEMALE);
						System.out.println("");

						System.out.println("Please select the blood type of the new kangaroo: ");
						System.out.println("1. O");
						System.out.println("2. A");
						System.out.println("3. AB");
						System.out.println("4. B");
						System.out.println("");
						typeSelectionMssg();
						userInput = reader.nextInt();
						reader.nextLine();
						plainLine();

						String bloodType = startThisThing.convertBloodType(userInput);
						System.out.println("");


						System.out.print("Please type the day of birth of the new kangaroo: ");
						int day = reader.nextInt();
						reader.nextLine();
						System.out.println("");


						System.out.print("Please type the month of birth of the new kangaroo: ");
						int month = reader.nextInt();
						reader.nextLine();
						System.out.println("");


						System.out.print("Please type the year of birth of the new kangaroo: ");
						int year = reader.nextInt();
						reader.nextLine();
						System.out.println("");

						BDate newDate = new BDate(day, month, year);

						Kangaroo theNew = new Kangaroo(name, weight, height, gender, bloodType, newDate);

						System.out.println("Please select the environment for the new kangaroo: ");
						System.out.println("1. First environment.");
						System.out.println("2. Second environment");
						System.out.println("3. Third environment");
						System.out.println("");
						typeSelectionMssg();
						userInput = reader.nextInt();
						reader.nextLine();
						plainLine();

						int environment = userInput;

						startThisThing.executeCreate(theNew, environment);
						System.out.println("");
						System.out.println("");


						
				break;

				//DELETE KANGAROOS
				case 2: System.out.println("");
						System.out.println("Please select which kangaroo will be erased:");
						System.out.println("");
						startThisThing.kangarooList();
						System.out.println("");
						typeSelectionMssg();
						
						userInput = reader.nextInt();
						reader.nextLine();

						plainLine();

						switch (userInput) {
							case 0: 
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
							default: 
								break;
						 	
						 } 

				break; 

				case 3: /*
				System.out.println("");
				System.out.println("Please select the kangaroo that you want to change its environment:");
				startThisThing.kangarooListWE();
				System.out.println("");
				typeSelectionMssg();
				
				userInput = reader.nextInt();
				reader.nextLine();

				plainLine();

					switch (userInput) {
						case 0: 
							break;



						case 1: int kangarooSw = 1;
								if(startThisThing.getZooKangaroos().getEnvironmentA().getKangarooA() != null){
								startThisThing.environmentPosibilities4A();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooA(userInput, kangarooSw);
							} else {System.out.println("ERROR: Invalid kangaroo selection")}



							break;



						case 2: int kangarooSw = 2;
								startThisThing.environmentPosibilities4A();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooA(userInput, kangarooSw);



							break;



						case 3: int kangarooSw = 3;
								startThisThing.environmentPosibilities4A();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooA(userInput, kangarooSw);



							break;



						case 4: int kangarooSw = 4;
								startThisThing.environmentPosibilities4B();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooB(userInput, kangarooSw);



							break;



						case 5: int kangarooSw = 5;
								startThisThing.environmentPosibilities4B();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooB(userInput, kangarooSw);



							break;



						case 6: int kangarooSw = 6;
								startThisThing.environmentPosibilities4B();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooB(userInput, kangarooSw);



							break;



						case 7: int kangarooSw = 7;
								startThisThing.environmentPosibilities4C();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooC(userInput, kangarooSw);



							break;



						case 8: int kangarooSw = 8;	
								startThisThing.environmentPosibilities4C();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooC(userInput, kangarooSw);



							break;



						case 9: int kangarooSw = 9;
								startThisThing.environmentPosibilities4C();
								typeSelectionMssg();
								userInput = reader.nextInt();
								reader.nextLine();
								plainLine();
								startThisThing.getZooKangaroos().switchKangarooC(userInput, kangarooSw);


							break;
						default: 
							break; }

				 	 */
				break;
				//SHOW EXHIBITION ANIMALS WHOSE NAME START AND END WITH A VOWEL
				case 4: System.out.println( startThisThing.vowelFinalList());

				break; 

				//SHOW KANGAROOS VACCINATION DATE
				case 5: System.out.println( startThisThing.getZooKangaroos().fullListShots());

				break; 

				//SHOW KANGAROOS INFO
				case 6: System.out.println( startThisThing.getZooKangaroos().infoFromKZone());


				break;

				//SHOW BEARDED DRAGONS INFO
				case 7: System.out.println( startThisThing.getZooDragons().infoFromDZone());


				break;

				//QUIT PTOGRAM
				case 8: System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
						System.out.println("");
						System.out.println("THANK YOU FOR USING THE OUTBACK");
						System.out.println("");

				break;

				default:

				break;
			
				

				
				
				
			}

			}
		

		
		


 	

		



	





	}












} //final
