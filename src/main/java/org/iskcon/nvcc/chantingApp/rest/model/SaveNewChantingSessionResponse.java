/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

/**
 * @author MA041SH
 *
 */
public class SaveNewChantingSessionResponse extends AbstractRestResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5434205760861560462L;

	private static final String tag = "save_new_chanting_session";
	
	private Boolean chantingSessionSaved;

	/**
	 * @return the chantingSessionSaved
	 */
	public Boolean getChantingSessionSaved() {
		return chantingSessionSaved;
	}

	/**
	 * @param chantingSessionSaved the chantingSessionSaved to set
	 */
	public void setChantingSessionSaved(Boolean chantingSessionSaved) {
		this.chantingSessionSaved = chantingSessionSaved;
	}

	/**
	 * @return the tag
	 */
	public static String getTag() {
		return tag;
	}
	
	
}
