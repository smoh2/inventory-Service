package bw.pharma.inventoryService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bw.pharma.inventoryService.entity.InventoryEntity;
import bw.pharma.inventoryService.model.Inventory;
import bw.pharma.inventoryService.service.InventoryService;

@RestController
@CrossOrigin(origins="127.0.0.1")
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;
	
	@RequestMapping (value = "getInventories", method = RequestMethod.GET)
	public List<Inventory> getInventories() throws Exception{
		return inventoryService.getAllInventories();
	}
	
	@RequestMapping(value= "addInventory", method = RequestMethod.POST)
	public String addDispensary(@RequestBody InventoryEntity inventory) {
		return inventoryService.addInventory(inventory);
	}
	
	@RequestMapping(value= "updateInventory", method = RequestMethod.PUT)
	public String updateInventory(@RequestBody InventoryEntity inventory) {
		return inventoryService.updateInventory(inventory);
	}
	
	@RequestMapping(value= "removeInventory", method = RequestMethod.DELETE)
	public String removeInventory(@RequestBody InventoryEntity inventory) {
		return inventoryService.removeInventory(inventory);
	}

}
