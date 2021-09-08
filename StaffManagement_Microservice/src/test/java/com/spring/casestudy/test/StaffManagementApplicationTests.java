package com.spring.casestudy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.casestudy.service.StaffServicesImpl;

@SpringBootTest
class StaffManagementApplicationTests {

	StaffServicesImpl guestServiceImplMock = mock(StaffServicesImpl.class);
	
	@Test
	@DisplayName("Test for adding staff")
    public void addStaffTest(){
        when(guestServiceImplMock.addStaff(101, "Varun Sharma" , "Mp street,Pune", 50000, 15000, 35, "Receptionist", "varun@gmail.com")).thenReturn("Successfully added");
        assertEquals("Successfully added", guestServiceImplMock.addStaff(101, "Varun Sharma" , "Mp street,Pune", 50000, 15000, 35, "Receptionist", "varun@gmail.com"));
    }
	
	@Test
    @DisplayName("Test for updating staff")
    public void updateStaffTest(){
        when(guestServiceImplMock.updateStaff(101, "Varun Sharma" , "Mp street,Pune", 50000, 15000, 35, "Receptionist", "varun@gmail.com")).thenReturn("Successfully updated");
        assertEquals("Successfully updated", guestServiceImplMock.updateStaff(101, "Varun Sharma" , "Mp street,Pune", 50000, 15000, 35, "Receptionist", "varun@gmail.com"));
    }
	
	 @Test
	    @DisplayName("Test for deleting staff")
	    public void deleteStaffTest(){
	        when(guestServiceImplMock.deleteStaff(101)).thenReturn("Successfully deleted");
	        assertEquals("Successfully deleted", guestServiceImplMock.deleteStaff(101));
	    }

}
