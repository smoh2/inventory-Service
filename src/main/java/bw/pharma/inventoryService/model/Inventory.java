package bw.pharma.inventoryService.model;

public class Inventory {
	int id; 
	String itemName, 
	itemDescription, 
	volumeQuant,
	description,
	ageRange,
	expiryDate;


	public Inventory() {
		
	}
	

	public Inventory( String itemName, String itemDescription, String volumeQuant, String description,
			String ageRange, String expiryDate) {
		super();
		
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.volumeQuant = volumeQuant;
		this.description = description;
		this.ageRange = ageRange;
		this.expiryDate = expiryDate;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public String getVolumeQuant() {
		return volumeQuant;
	}


	public void setVolumeQuant(String volumeQuant) {
		this.volumeQuant = volumeQuant;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getAgeRange() {
		return ageRange;
	}


	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}
	
}
