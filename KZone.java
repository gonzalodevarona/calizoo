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
	

	public void deleteKangaroo(int userInput){
			
			
			
				switch (userInput){

					case 1: if(environmentA.getKangarooA() != null)
						{environmentA.setKangarooA(null);
						environmentA.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}
						
						
						break;

					case 2: if(environmentA.getKangarooB() != null)
						{environmentA.setKangarooB(null);
						environmentA.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}


						break;

					case 3: if(environmentA.getKangarooC() != null)
						{environmentA.setKangarooC(null);
						environmentA.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}

						break;

					case 4: if(environmentB.getKangarooA() != null)
						{environmentB.setKangarooA(null);
						environmentB.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}
								
							break;

					case 5: if(environmentB.getKangarooB() != null)
						{environmentB.setKangarooB(null);
						environmentB.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}

							break;

					case 6: if(environmentB.getKangarooC() != null)
						{environmentB.setKangarooC(null);
						environmentB.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}

							break;

					case 7: if(environmentC.getKangarooA() != null)
						{environmentC.setKangarooA(null);
						environmentC.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}

							break;

					case 8: if(environmentC.getKangarooB() != null)
						{environmentC.setKangarooB(null);
						environmentC.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}

							break;

					case 9: if(environmentC.getKangarooC() != null)
						{environmentC.setKangarooC(null);
						environmentC.updateEnvironment();
						System.out.println("Deleated Kangaroo.");}

					
							break;


				}
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


	



	 public void createKangaroo(Kangaroo theNew , int environment) {
		   
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
		  
		   System.out.println(reply);
		   
		  
	   }


	
	 








} //final



