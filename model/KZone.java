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

package model;

public class KZone
{

//Attributes
	private double totalArea;

//Relationships
	private KEnvironment environmentA;
	private KEnvironment environmentB;
	private KEnvironment environmentC;


//Methods

	public KZone(KEnvironment environmentA, KEnvironment environmentB, KEnvironment environmentC){
	this.environmentA = environmentA;
	this.environmentB = environmentB;
	this.environmentC = environmentC;
	this.totalArea = calculateTotalArea();
	}



	public  double getTotalArea() {
	return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;


	}



	public  KEnvironment getEnvironmentA() {
	return environmentA;
	}

	public void setEnvironmentA(KEnvironment environmentA) {
		this.environmentA = environmentA;
	}



	public  KEnvironment getEnvironmentB() {
	return environmentB;
	}

	public void setEnvironmentB(KEnvironment environmentB) {
		this.environmentB = environmentB;
	}


	public  KEnvironment getEnvironmentC() {
	return environmentC;
	}

	public void setEnvironmentC(KEnvironment environmentC) {
		this.environmentC = environmentC;
	}

	public double calculateTotalArea(){
		totalArea = (	getEnvironmentA().getArea() + getEnvironmentB().getArea() + getEnvironmentC().getArea());
		
		return totalArea;
	}
	

	public String deleteKangaroo(int userInput){
			String reply = "";
			
			
				switch (userInput){

					case 1: if(environmentA.getKangarooA() != null)
						{environmentA.setKangarooA(null);
						environmentA.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}
						
						
						break;

					case 2: if(environmentA.getKangarooB() != null)
						{environmentA.setKangarooB(null);
						environmentA.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}


						break;

					case 3: if(environmentA.getKangarooC() != null)
						{environmentA.setKangarooC(null);
						environmentA.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}

						break;

					case 4: if(environmentB.getKangarooA() != null)
						{environmentB.setKangarooA(null);
						environmentB.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}
								
							break;

					case 5: if(environmentB.getKangarooB() != null)
						{environmentB.setKangarooB(null);
						environmentB.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}

							break;

					case 6: if(environmentB.getKangarooC() != null)
						{environmentB.setKangarooC(null);
						environmentB.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}

							break;

					case 7: if(environmentC.getKangarooA() != null)
						{environmentC.setKangarooA(null);
						environmentC.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}

							break;

					case 8: if(environmentC.getKangarooB() != null)
						{environmentC.setKangarooB(null);
						environmentC.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}

							break;

					case 9: if(environmentC.getKangarooC() != null)
						{environmentC.setKangarooC(null);
						environmentC.updateEnvironment();
						reply += ("\nDeleated Kangaroo from original environment.\n");}
						else {reply += ("\nERROR: Invalid selection.\n");}

					
							break;


				}

				return reply;
			}

	public String infoFromKZone(){

		String finalShow = "Those are the kangaroos from the first environment:";
		  finalShow += environmentA.infoFromEnvironment();
		  finalShow += "\n";
		  finalShow += "\n";

		  finalShow += "Those are the kangaroos from the second environment:";
		  finalShow += environmentB.infoFromEnvironment();
		  finalShow += "\n";
		  finalShow += "\n";

		  finalShow += "Those are the kangaroos from the third environment:";
		  finalShow += environmentC.infoFromEnvironment();

			return finalShow;


	}


	public String fullListShots (){
		String theList = "Those are the kangaroos who already got vaccinated and the date they got it\n";
		theList += environmentA.listKangaroosShot();
		theList += environmentB.listKangaroosShot();
		theList += environmentC.listKangaroosShot();
		return theList;

	}



	public String kListVowel (){
		String theList = "Those are the kangaroos whose name start and end with a vowel\n";
		theList += environmentA.listKangaroosVowel();
		theList += environmentB.listKangaroosVowel();
		theList += environmentC.listKangaroosVowel();
		return theList;

	}


	



	 public String createKangaroo(Kangaroo theNew , int environment) {
		   
		   String reply = "";


		   switch (environment) {
		   		case 1: reply += environmentA.createKangaroo(theNew);
		   		break;
		   		case 2: reply += environmentB.createKangaroo(theNew);
		   		break;
		   		case 3: reply += environmentC.createKangaroo(theNew);
		   		break;
		   		default: reply += "ERROR: Invalid selection";
		   		break;
		   }
		  
		   return reply;
		   
		  
	   }



	



	public String checkForChange(int kangarooSw){
		String goK = "";
		switch (kangarooSw) {
			case 1: if(environmentA.getKangarooA() != null){
							goK += environmentPosibilities4A();			
					}  
			break;
			case 2: if(environmentA.getKangarooB() != null){
							goK += environmentPosibilities4A();
					} 
			break;
			case 3: if(environmentA.getKangarooC() != null){
							goK += environmentPosibilities4A();
					}  
			break;
			case 4: if(environmentB.getKangarooA() != null){
							goK += environmentPosibilities4B();
					}  
			break;
			case 5: if(environmentB.getKangarooB() != null){
							goK += environmentPosibilities4B();

					}  
			break;
			case 6: if(environmentB.getKangarooC() != null){
							goK += environmentPosibilities4B();
					}  
			break;
			case 7: if(environmentC.getKangarooA() != null){
							goK += environmentPosibilities4C();
					} 
			break;
			case 8: if(environmentC.getKangarooB() != null){
							goK += environmentPosibilities4C();
					}  
			break;
			case 9: if(environmentC.getKangarooC() != null){
							goK += environmentPosibilities4C();

					}  
			break;	
		}
		return goK;
		
	}



	public String environmentPosibilities4A(){
	String reply = "";
	reply += "\nWhere do you wanna change it to?\n";
	reply += "1. Second environment\n";
	reply += "2. Third environment\n";
	return reply;


	}


	public String environmentPosibilities4B(){
	String reply = "";
	reply += "\nWhere do you wanna change it to?\n";
	reply += "1. First environment\n";
	reply += "2. Third environment\n";
	return reply;


	}


	public String environmentPosibilities4C(){
		String reply = "";
	
	reply += "\nWhere do you wanna change it to?\n";
	reply += "1. First environment\n";
	reply += "2. Second environment\n";
	

	return reply;


	}


	public String changeKangaroo(int userInput, int kangarooSw){
		String reply = "";
		Kangaroo kChange = null;

		switch (kangarooSw) {

			case 1: kChange = environmentA.getKangarooA();

					switch (userInput) {
						case 1: reply += environmentB.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}

							break;
						case 2: reply += environmentC.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}


			break;
			case 2: kChange = environmentA.getKangarooB();

					switch (userInput) {
						case 1: reply += environmentB.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentC.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}


			break;
			case 3: kChange = environmentA.getKangarooC();

					switch (userInput) {
						case 1: reply += environmentB.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentC.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}


			break;
			case 4: kChange = environmentB.getKangarooA();

					switch (userInput) {
						case 1: 
						reply += environmentA.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentC.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}

			break;
			case 5: kChange = environmentB.getKangarooB();

					switch (userInput) {
						case 1: reply += environmentA.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentC.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}

			break;
			case 6: kChange = environmentB.getKangarooC();

					switch (userInput) {
						case 1: reply += environmentA.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentC.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}

			break;
			case 7: kChange = environmentC.getKangarooA();

					switch (userInput) {
						case 1: reply += environmentA.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentB.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}

			break;
			case 8: kChange = environmentC.getKangarooB();

					switch (userInput) {
						case 1: reply += environmentA.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentB.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}

			break;
			case 9: kChange = environmentC.getKangarooC();

					switch (userInput) {
						case 1: reply += environmentA.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
						case 2: reply += environmentB.theChange(kChange);
						if (reply.equals("Kangaroo successfully changed from original environment")){
						userInput = kangarooSw;
						deleteKangaroo(userInput);}
							break;
					}

			break;
				
			
		}

		return reply;


	}








	 








} //final



