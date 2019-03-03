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

public class Exhibition
{



	//Attributes
	private String exhibitionName;
	private int exhibitionArea;

	//Relationships
	private KZone zooKangaroos;
	private DZone zooDragons;

	//Methods
	public Exhibition(String exhibitionName, int exhibitionArea, KZone zooKangaroos, DZone zooDragons){
		this.exhibitionName = "Australia, donde el agua es oro";
		exhibitionArea = 1500;
		this.zooKangaroos = zooKangaroos;
		this.zooDragons = zooDragons;
	}

	public String getExhibitionName() {
	return exhibitionName;
	}

	public void setExhibitionName(String exhibitionName) {
		this.exhibitionName = exhibitionName;
	}



	public int getExhibitionArea() {
	return exhibitionArea;
	}

	public void setExhibitionArea(int exhibitionArea) {
		this.exhibitionArea = exhibitionArea;
	}



	public KZone getZooKangaroos() {
	return zooKangaroos;
	}

	public void setZooKangaroos(KZone zooKangaroos) {
		this.zooKangaroos = zooKangaroos;
	}



	public DZone getZooDragons() {
	return zooDragons;
	}

	public void setZooDragons(DZone zooDragons) {
		this.zooDragons = zooDragons;
	}

	


	public void kangarooList(){


						
						if(zooKangaroos.getEnvironmentA().getKangarooA() != null){
						System.out.println("1. " +zooKangaroos.getEnvironmentA().getKangarooA().getName());	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooB() != null){
						System.out.println("2. "+zooKangaroos.getEnvironmentA().getKangarooB().getName());	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooC() != null){
						System.out.println("3. "+zooKangaroos.getEnvironmentA().getKangarooC().getName());	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooA() != null){
						System.out.println("4. "+zooKangaroos.getEnvironmentB().getKangarooA().getName());	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooB() != null){
						System.out.println("5. "+zooKangaroos.getEnvironmentB().getKangarooB().getName());	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooC() != null){
						System.out.println("6. "+zooKangaroos.getEnvironmentB().getKangarooC().getName());	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooA() != null){
						System.out.println("7. "+zooKangaroos.getEnvironmentC().getKangarooA().getName());	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooB() != null){
						System.out.println("8. "+zooKangaroos.getEnvironmentC().getKangarooB().getName());	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooC() != null){
						System.out.println("9. "+zooKangaroos.getEnvironmentC().getKangarooC().getName());	
						}
						
					
						System.out.println("0. BACK");

	}

	public String vowelFinalList(){
		String theList = "";
		theList += zooKangaroos.kListVowel();
		theList += zooDragons.dListVowel();
		return theList;
	}


	

	public void executeCreate(Kangaroo theNew, int environment){
	zooKangaroos.createKangaroo(theNew, environment);
	}


		public String convertBloodType(int userInput){
		String bloodType = "";

			switch (userInput) {
				case 1: bloodType += "O";
				break;
				case 2: bloodType += "A";
				break;
				case 3: bloodType += "AB";
				break;
				case 4: bloodType += "B";
				break;
				default: bloodType += "ERROR";
				break;
				
			}
			

			return bloodType;
	}


	
	



	/*public String placeKangarooGender(){
		String message = "";
		switch (zooKangaroos.checkSelectedEnvironmentGender(environment)) {
			case true: message = "ERROR: The kangaroo can not be place in this environment because there is already one male.";
			break;
			case false:
			break;
		 } 
		 return message;
	} */


	public void kangarooListWE(){
						System.out.println("");
						System.out.println("Those are the kangaroos from the first environment: ");	
						
						if(zooKangaroos.getEnvironmentA().getKangarooA() != null){
						System.out.println("1. " +zooKangaroos.getEnvironmentA().getKangarooA().getName());	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooB() != null){
						System.out.println("2. "+zooKangaroos.getEnvironmentA().getKangarooB().getName());	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooC() != null){
						System.out.println("3. "+zooKangaroos.getEnvironmentA().getKangarooC().getName());	
						}

						System.out.println("");
						System.out.println("");


						System.out.println("Those are the kangaroos from the second environment: ");	
						
						if(zooKangaroos.getEnvironmentB().getKangarooA() != null){
						System.out.println("4. "+zooKangaroos.getEnvironmentB().getKangarooA().getName());	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooB() != null){
						System.out.println("5. "+zooKangaroos.getEnvironmentB().getKangarooB().getName());	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooC() != null){
						System.out.println("6. "+zooKangaroos.getEnvironmentB().getKangarooC().getName());	
						}

						System.out.println("");
						System.out.println("");


						System.out.println("Those are the kangaroos from the third environment: ");	
						
						if(zooKangaroos.getEnvironmentC().getKangarooA() != null){
						System.out.println("7. "+zooKangaroos.getEnvironmentC().getKangarooA().getName());	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooB() != null){
						System.out.println("8. "+zooKangaroos.getEnvironmentC().getKangarooB().getName());	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooC() != null){
						System.out.println("9. "+zooKangaroos.getEnvironmentC().getKangarooC().getName());	
						}
						
						System.out.println("");
					
						System.out.println("0. BACK");


						System.out.println("");


	}

	public void environmentPosibilities4A(){
	System.out.println("");
	System.out.println("Where do you wanna change it to?");
	System.out.println("1. Second environment");
	System.out.println("2. Third environment");
	System.out.println("");


	}


	public void environmentPosibilities4B(){
	System.out.println("");
	System.out.println("Where do you wanna change it to?");
	System.out.println("1. First environment");
	System.out.println("2. Third environment");
	System.out.println("");


	}


	public void environmentPosibilities4C(){
	System.out.println("");
	System.out.println("Where do you wanna change it to?");
	System.out.println("1. First environment");
	System.out.println("2. Second environment");
	System.out.println("");


	}






	
}//final
