/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author ma041sh
 *
 */
public class TechnicalStatusSerializer extends JsonSerializer<TechnicalStatus> {

	@Override
	public void serialize(TechnicalStatus value, JsonGenerator generator,
			SerializerProvider provider) throws IOException {
	//	generator.writeStartObject();
	//	generator.writeFieldName("technicalStatus");
		generator.writeString(value.toString());
	//	generator.writeEndObject();
	}
}
