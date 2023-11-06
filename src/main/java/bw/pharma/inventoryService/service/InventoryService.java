package bw.pharma.inventoryService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bw.pharma.inventoryService.entity.InventoryEntity;
import bw.pharma.inventoryService.model.Inventory;
import bw.pharma.inventoryService.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepository inventoryRepository;
	
public List<Inventory> getAllInventories() throws Exception {
		
		try{
				List<InventoryEntity> inventories = inventoryRepository.findAll();
				List<Inventory> customInventories = new ArrayList<>();
				inventories.stream().forEachOrdered(d -> {
					Inventory inventory = new Inventory();
					BeanUtils.copyProperties(d, inventory);
					customInventories.add(inventory);
				});
				return customInventories;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public String addInventory(InventoryEntity inventory) {
		
		try {
			if(!inventoryRepository.existsByItemNameAndAgeRange(inventory.getItemName(), inventory.getAgeRange())) {
				inventoryRepository.save(inventory);
				return "Item added successfully";
				
			}else {return "Item already exists";}
		}
		catch(Exception ex) {
			throw ex;
		}
	
	}
	public String removeInventory(InventoryEntity inventory) {
		
		try {
			if(inventoryRepository.existsByItemNameAndAgeRange(inventory.getItemName(), inventory.getAgeRange())) {
				inventoryRepository.delete(inventory);
				return "Inventory removed from list successfully";
			}
			else {return "Inventory does not exist";}
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}
		
	public String updateInventory(InventoryEntity inventory) {
		try {
			if(inventoryRepository.existsByItemNameAndAgeRange(inventory.getItemName(), inventory.getAgeRange())) {
				inventoryRepository.save(inventory);
				return "INventory details updated successfully";
			}
			else {return "Inventory does not exist";}
		}
		catch(Exception ex) {
			throw ex;
		}
	}

}
