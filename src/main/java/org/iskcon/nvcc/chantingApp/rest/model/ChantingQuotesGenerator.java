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
		quotes.put(0, "This temporary life is full of miseries. Take shelter of the holy name as your only business.");
		quotes.put(1, "If one chants the holy names of the lord, even in helpless condition or without desiring to do so, all the reactions of his sinful life departs, just as when lion roars, all the small animals flee in fear.");
		quotes.put(2, "Even if one is illiterate (and thus cannot read Bhagavad gita and Srimad Bhagavatam) he can still perfect his life simply by chanting the maha mantra.");
		quotes.put(3, "Any person who is chanting the holy names of Krishna in course of time feels transcendental pleasure and very quickly becomes purified of all material contamination.");
		quotes.put(4, "Simply by properly doing our japa daily, we can be freed from the reactions to all sinful activities.");
		quotes.put(5, "One should chant incessantly, to avoid pride.");
		quotes.put(6, "Srila Prabhupada stressed 4 rules in japa: early morning chanting, full concentration, distinct pronunciation, attentive hearing.");
		quotes.put(7, "We cannot become fully Krishna conscious without chanting good quality rounds daily. Chanting is the most powerful way to become Krishna conscious.");
		quotes.put(8, "Japa does not mean a tongue exercise. It is only effective when we put our mind where the sound is, so that the sound can vibrate unpleasantness out of mind.");
		quotes.put(9, "Our strength is in following the regulative principles and chanting 16 rounds japa.");
		quotes.put(10, "Everyone begins his devotional life from the neophyte stage, but if one properly finishes chanting the prescribed number of rounds of hari-nama, he is elevated step by step to the highest platform, uttama-adhikari.");
		quotes.put(11,"Of all the regulative principles, the spiritual master's order to chant at least sixteen rounds is most essential.");
		quotes.put(12, "Japa must be heart deep and not only with the lips like something mechanical – in other words, chanting with the heart is our goal.");
				
	}
	
	public static String getQuote(){
		SecureRandom random = new SecureRandom();
		Integer randomKey =random.nextInt(8);
		return quotes.get(randomKey);
	}
	
	
}
