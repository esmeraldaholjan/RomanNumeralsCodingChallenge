package seeba.task.RomanConverter.service;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author Esmeralda
 *
 */
public class RomanConverterServiceImpl implements RomanConverterService {

	/* (non-Javadoc)
	 * @see seeba.task.RomanConverter.service.RomanConverterService#toRomanNumberFormat(int)
	 */
	@Autowired
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    } 
    
	public String toRomanNumberFormat(int number) {
		
		//Implementation of the converter
        int l =  map.floorKey(number);
        
        if ( number == l ) {
            return map.get(number);
        }
        else if ( number == 0 ) {
        	return "We are sorry but zero number doesn't have its own Roman numeral.";
        }
        else if ( number > 4999 ) {
        	return "We are sorry but we are not able to convert number bigger than 4999.";
        }
        else if ( number < 0 ) {
        	return "We are sorry but negative numbers don't have there own Roman numerals.";
        }
        
        return map.get(l) + toRomanNumberFormat(number-l);

	}

}
