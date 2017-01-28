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
public class RestResponseCodeSerializer extends
		JsonSerializer<RestResponseCode> {

	@Override
	public void serialize(RestResponseCode value, JsonGenerator generator,
			SerializerProvider provider) throws IOException {
	//	generator.writeStartObject();
	//	generator.writeFieldName("responseCode");
		generator.writeString(String.valueOf(value.getValue()));
	//	generator.writeEndObject();
	}
}
