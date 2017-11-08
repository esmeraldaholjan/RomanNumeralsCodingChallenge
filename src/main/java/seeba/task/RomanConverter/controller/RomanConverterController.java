package seeba.task.RomanConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import seeba.task.RomanConverter.service.RomanConverterService;

/**
 * This is main controller
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
	
	public String romanConvertorApi (int number) {
		String romanNumber = new String();
		
		romanNumber = romanControllerService.toRomanNumberFormat(number);
		
		return romanNumber;
	}
	

}
