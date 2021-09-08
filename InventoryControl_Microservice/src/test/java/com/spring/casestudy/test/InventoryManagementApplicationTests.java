package com.spring.casestudy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.casestudy.service.InventoryServicesImpl;

@SpringBootTest
class InventoryManagementApplicationTests {

	InventoryServicesImpl inventoryServicesImpl = mock(InventoryServicesImpl.class);
	
	@Test
	@DisplayName("Test for adding room")
    public void addRoomTest(){
        when(inventoryServicesImpl.addRoom(12, false, true, "AC_room")).thenReturn("Successfully added");
        assertEquals("Successfully added", inventoryServicesImpl.addRoom(12, false, true, "AC_room"));
    }
	
	@Test
    @DisplayName("Test for updating room")
    public void updateRoomTest(){
        when(inventoryServicesImpl.updateRoom(15, true, false, "NonAC_room")).thenReturn("Successfully updated");
        assertEquals("Successfully updated", inventoryServicesImpl.updateRoom(15, true, false, "NonAC_room" ));
    }
	
	 @Test
	    @DisplayName("Test for deleting room")
	    public void deleteRoomTest(){
	        when(inventoryServicesImpl.deleteRoom(10)).thenReturn("Successfully deleted");
	        assertEquals("Successfully deleted", inventoryServicesImpl.deleteRoom(10));
	    }

}
