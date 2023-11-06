package bw.pharma.inventoryService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InventoryEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id; 
	@Id
	String itemName; 
	String itemDescription, 
	volumeQuant,
	description,
	ageRange,
	expiryDate;
	
	public InventoryEntity() {
		
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
