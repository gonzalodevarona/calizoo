/*
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR CALI ZOO CODE
 * @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @DATE: 23 FEBRUARY 2019
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

}