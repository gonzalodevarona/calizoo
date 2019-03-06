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

	


	public String kangarooList(){
		String reply = "";

						
						if(zooKangaroos.getEnvironmentA().getKangarooA() != null){
						reply += "1. " +zooKangaroos.getEnvironmentA().getKangarooA().getName()+"\n";	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooB() != null){
						reply += "2. "+zooKangaroos.getEnvironmentA().getKangarooB().getName()+"\n";	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooC() != null){
						reply += "3. "+zooKangaroos.getEnvironmentA().getKangarooC().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooA() != null){
						reply += "4. "+zooKangaroos.getEnvironmentB().getKangarooA().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooB() != null){
						reply += "5. "+zooKangaroos.getEnvironmentB().getKangarooB().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooC() != null){
						reply += "6. "+zooKangaroos.getEnvironmentB().getKangarooC().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooA() != null){
						reply += "7. "+zooKangaroos.getEnvironmentC().getKangarooA().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooB() != null){
						reply += "8. "+zooKangaroos.getEnvironmentC().getKangarooB().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooC() != null){
						reply += "9. "+zooKangaroos.getEnvironmentC().getKangarooC().getName()+"\n";	
						}
						
					
						reply += "0. BACK";

		return reply;

	}

	public String vowelFinalList(){
		String theList = "";
		theList += zooKangaroos.kListVowel();
		theList += zooDragons.dListVowel();
		return theList;
	}


	

	public String executeCreate(Kangaroo theNew, int environment){
		String reply = "";
		reply += zooKangaroos.createKangaroo(theNew, environment);
		return reply;
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




	public String kangarooListWE(){
		String reply = "";
						reply += "\nThose are the kangaroos from the first environment: \n";	
						
						if(zooKangaroos.getEnvironmentA().getKangarooA() != null){
						reply += "1. " +zooKangaroos.getEnvironmentA().getKangarooA().getName()+"\n";	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooB() != null){
						reply += "2. "+zooKangaroos.getEnvironmentA().getKangarooB().getName()+"\n";	
						} 
						
						if(zooKangaroos.getEnvironmentA().getKangarooC() != null){
						reply += "3. "+zooKangaroos.getEnvironmentA().getKangarooC().getName()+"\n";	
						}

						reply += "\n";


						reply += "\nThose are the kangaroos from the second environment: \n";	
						
						if(zooKangaroos.getEnvironmentB().getKangarooA() != null){
						reply += "4. "+zooKangaroos.getEnvironmentB().getKangarooA().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooB() != null){
						reply += "5. "+zooKangaroos.getEnvironmentB().getKangarooB().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentB().getKangarooC() != null){
						reply += "6. "+zooKangaroos.getEnvironmentB().getKangarooC().getName()+"\n";	
						}

						reply += "\n";


						reply += "\nThose are the kangaroos from the third environment: \n";	
						
						if(zooKangaroos.getEnvironmentC().getKangarooA() != null){
						reply += "7. "+zooKangaroos.getEnvironmentC().getKangarooA().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooB() != null){
						reply += "8. "+zooKangaroos.getEnvironmentC().getKangarooB().getName()+"\n";	
						}
						
						if(zooKangaroos.getEnvironmentC().getKangarooC() != null){
						reply += "9. "+zooKangaroos.getEnvironmentC().getKangarooC().getName()+"\n";	
						}
						
						
					
						reply += "\n0. BACK\n";


						

			return reply;
	}


	

	public String executeCheck4Change(int kangarooSw) {

		String goK = "";
		goK = zooKangaroos.checkForChange(kangarooSw);
		return goK;
	}



	public String executeChange(int userInput, int kangarooSw){
		String reply = "";
	reply += zooKangaroos.changeKangaroo(userInput, kangarooSw);
	return reply;
	}





	
}//final
