/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ma041sh
 *
 */
public class ChantingQuotesGenerator {

	/**
	 * quotes static database
	 */
	
	private static Map<Integer, String> quotes;
	
	static{
		quotes = new HashMap<Integer, String>();
		quotes.put(0, "Chanting is best yoga for current age of Kaliyuga");
		quotes.put(1, "Chanting is nice");
		quotes.put(2, "Chanting is most important");
		quotes.put(3, "Chanting is essence of life");
		quotes.put(4, "Chanting is same as personal association of Krishna");
		quotes.put(5, "Chanting is the only way of delivernace in Kaliyuga");
		quotes.put(6, "Chanting determines 99 % of spiritual progress");
		quotes.put(7, "Chanting will help to cleanse our heart of all impurities");
		quotes.put(8, "Chanting will help in self realization");
		
				
	}
	
	public static String getQuote(){
		SecureRandom random = new SecureRandom();
		Integer randomKey =random.nextInt(8);
		return quotes.get(randomKey);
	}
	
	
}
