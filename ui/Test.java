/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 5 MARCH 2019
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
		System.out.println("8. Show environments information.");
		System.out.println("9. Show bearded dragons zone information.");
		System.out.println("10. QUIT PROGRAM");
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

		

		while (userInput != 10){

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

						System.out.println(startThisThing.executeCreate(theNew, environment));
						System.out.println("");
						System.out.println("");


						
				break;

				//DELETE KANGAROOS
				case 2: System.out.println("");
						System.out.println("Please select which kangaroo will be erased:");
						System.out.println("");
						System.out.println(startThisThing.kangarooList());
						System.out.println("");
						typeSelectionMssg();
						
						userInput = reader.nextInt();
						reader.nextLine();

						plainLine();

						System.out.println(startThisThing.getZooKangaroos().deleteKangaroo(userInput));
							

				break; 

				case 3: 
				System.out.println("");
				System.out.println("Please select the kangaroo that you want to change its environment:");

				System.out.println(startThisThing.kangarooListWE());

				System.out.println("");
				typeSelectionMssg();
				userInput = reader.nextInt();
				reader.nextLine();
				plainLine();
				int kangarooSw = userInput; //KANGAROO 4 CHANGE

				String trial = startThisThing.executeCheck4Change(kangarooSw);
				if (trial.equals("")){
					if(userInput != 0){
					System.out.println("");
					System.out.println("ERROR: Invalid kangaroo selection or change can not be done for kangaroos safety. ");
					System.out.println("");}
				

				}
				else{
				System.out.println("");
				System.out.println (trial);
				System.out.println("");
				typeSelectionMssg();
				userInput = reader.nextInt(); //ENVIRONMENT 4 CHANGE
				reader.nextLine();
				plainLine();
				System.out.println("");
				System.out.println (startThisThing.executeChange(userInput, kangarooSw));
				System.out.println("");
				}
				



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

				//SHOW ENVIRONMENTS INFO
				case 8: System.out.println(startThisThing.getZooKangaroos().showEnvironmentsInfo());

				break;

				//SHOW DRAGON ZONE INFO
				case 9: System.out.println(startThisThing.getZooDragons().showDZoneInfo());

				break;

				//QUIT PTOGRAM
				case 10: System.out.print("\033[H\033[2J");  
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
