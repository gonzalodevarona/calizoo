/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 1 MARCH 2019
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


						System.out.println("");
						System.out.println("Please select which kangaroo will be erased:");
						System.out.println("");
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

	
}
