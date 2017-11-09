package seeba.task.RomanConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import seeba.task.RomanConverter.service.RomanConverterService;

/**
 * This is the Main Controller, that has simulates as "API" for RomanConverterService
 * 
 * @author Esmeralda
 *
 */

@Controller
public class RomanConverterController {

	public RomanConverterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RomanConverterController(RomanConverterService romanControllerService) {
		super();
		this.romanControllerService = romanControllerService;
	}

	@Autowired
	private RomanConverterService romanControllerService;
	
	/**
	 * 
	 * @param number - integer that has to be converted to Roman numerals
	 * @return romanNumber - Roman numeral for "number"
	 * 
	 */
	public String romanConvertorApi (int number) {
		String romanNumber = new String();
		// Call to service
		romanNumber = romanControllerService.toRomanNumberFormat(number);
		
		return romanNumber;
	}
	

}
