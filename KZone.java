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

					case 1: environmentA.setKangarooA(null);
						environmentA.updateEnvironment();
						System.out.println("Deleated Kangaroo.");
						
						break;

					case 2: environmentA.setKangarooB(null);
						environmentA.updateEnvironment();
						System.out.println("Deleated Kangaroo.");

						break;

					case 3: environmentA.setKangarooC(null);
						environmentA.updateEnvironment();
						System.out.println("Deleated Kangaroo.");

						break;

					case 4: environmentB.setKangarooA(null);
						environmentB.updateEnvironment();
						System.out.println("Deleated Kangaroo.");
								
							break;

					case 5: environmentB.setKangarooB(null);
						environmentB.updateEnvironment();
						System.out.println("Deleated Kangaroo.");

							break;

					case 6: environmentB.setKangarooC(null);
						environmentB.updateEnvironment();
						System.out.println("Deleated Kangaroo.");

							break;

					case 7: environmentC.setKangarooA(null);
						environmentC.updateEnvironment();
						System.out.println("Deleated Kangaroo.");

							break;

					case 8: environmentC.setKangarooB(null);
						environmentC.updateEnvironment();
						System.out.println("Deleated Kangaroo.");

							break;

					case 9: environmentC.setKangarooC(null);
						environmentC.updateEnvironment();
						System.out.println("Deleated Kangaroo.");

					
							break;


				}
			}

	} 



