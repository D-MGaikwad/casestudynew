package com.spring.casestudy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.casestudy.service.GuestServicesImpl;

@SpringBootTest
class GuestManagementApplicationTests {

	GuestServicesImpl guestServiceImplMock = mock(GuestServicesImpl.class);
	
	@Test
	@DisplayName("Test for adding guest")
    public void addGuestTest(){
        when(guestServiceImplMock.addGuest(1, 45, "Raman Varma", "Male", "ram@gmail.com", "Jln Street,Pune ", "CapG", "8989674523")).thenReturn("Successfully added");
        assertEquals("Successfully added", guestServiceImplMock.addGuest(1, 45, "Raman Varma", "Male", "ram@gmail.com", "Jln Street,Pune ", "CapG", "8989674523"));
    }
	
	@Test
    @DisplayName("Test for updating guest")
    public void updateGuestTest(){
        when(guestServiceImplMock.updateGuest(1, 45, "Raman Varma", "Male", "ram@gmail.com", "Jln Street,Pune ", "CapG", "8989674523")).thenReturn("Successfully updated");
        assertEquals("Successfully updated", guestServiceImplMock.updateGuest(1, 45, "Raman Varma", "Male", "ram@gmail.com", "Jln Street,Pune ", "CapG", "8989674523"));
    }
	
	 @Test
	    @DisplayName("Test for deleting guest")
	    public void deleteGuestTest(){
	        when(guestServiceImplMock.deleteGuest(1)).thenReturn("Successfully deleted");
	        assertEquals("Successfully deleted", guestServiceImplMock.deleteGuest(1));
	    }

}
