/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

/**
 * @author ma041sh
 *
 */
public enum TechnicalStatus {

	/**
	 * The status when there was no technical exception in service execution
	 */
	SUCCESS,
	/**
	 * The status when there was some technical exception in service execution and was caught in Rest controller
	 */
	FAIL;
}
