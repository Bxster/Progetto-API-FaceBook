package univpm.social.time;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class testTime {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	 /*
         Se passo ad esempio il 31 febbraio deve resitutirmi false
         perchè quel giorno non esiste
    */
	
	
	@Test
	void test() {
		
		Assertions.assertEquals(false, TimeConversion.isLegalDate("02-31-2021"));
	}
	
	
	/*
	     
	 */
	
	@Test
	void testFromStringToStandardDate() 
	{
		// MM-dd-yyyy
		String time = "12-21-2021";
		Date date = new Date("December 21, 2021 00:00:00");
		
		Assertions.assertEquals(date, TimeConversion.fromStringToStandardDate(time));
	}
	
	
	
	

}
