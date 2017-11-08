/**
 * 
 */
package seeba.task.RomanConverter.controller;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Esmeralda
 *
 */
public class RomanConverterControllerTest {
	
	@Test
	public void romanConvertorApiTest() {
		RomanConverterController rcc = new RomanConverterController();
		String rccTest = rcc.romanConvertorApi(55);
		
		assertEquals("slova", rccTest);
	}

}
