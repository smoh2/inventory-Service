package bw.pharma.inventoryService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bw.pharma.inventoryService.entity.InventoryEntity;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, String> {
	
	public boolean existsByItemNameAndAgeRange(String itemName, String ageRange);
	public boolean existsByExpiryDate(String expiryDate);

}
