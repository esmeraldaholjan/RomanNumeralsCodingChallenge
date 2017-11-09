package seeba.task.RomanConverter.controller;
import seeba.task.RomanConverter.service.RomanConverterService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


/**
 * 
 * Tests for RomanConverterController
 * @author Esmeralda
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class RomanConverterControllerTest {
	
	@InjectMocks
	private RomanConverterController rcc;
	
	@Mock
	private RomanConverterService rcs;
	
	@Test
	public void romanConverterControllerTest(){
		
		// Test values
		int testValue1 = 1;
		int testValue2 = 38;
		int testValue3 = 4;
		int testValue4 = 9;
		
		// Test answers
		String testAnswer1 = "I";
		String testAnswer2 = "XXXVIII";
		String testAnswer3 = "IV";
		String testAnswer4 = "IX";
		
		when(rcs.toRomanNumberFormat(testValue1)).thenReturn(testAnswer1);
		when(rcs.toRomanNumberFormat(testValue2)).thenReturn(testAnswer2);
		when(rcs.toRomanNumberFormat(testValue3)).thenReturn(testAnswer3);
		when(rcs.toRomanNumberFormat(testValue4)).thenReturn(testAnswer4);
		
		String romanNumber1 = rcc.romanConvertorApi(testValue1);
		String romanNumber2 = rcc.romanConvertorApi(testValue2);
		String romanNumber3 = rcc.romanConvertorApi(testValue3);
		String romanNumber4 = rcc.romanConvertorApi(testValue4);
		
		assertEquals(testAnswer1,romanNumber1);
		assertEquals(testAnswer2,romanNumber2);
		assertEquals(testAnswer3,romanNumber3);
		assertEquals(testAnswer4,romanNumber4);
	}
}
