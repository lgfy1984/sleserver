/**
 * Copyright (c) 2013 Tianjian, Inc. All rights reserved.
 * This software is the confidential and proprietary information of 
 * Tianjian, Inc. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the 
 * license agreement you entered into with Tianjian.
 */
package com.qmh.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;


/**
 * TODO
 * <p>Title: df.java</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: Tianjian</p>
 * <p>team: TianjianTeam</p>
 * @author: LengJiong
 * @date 2018年2月15日上午10:54:32
 * @version 1.0
 * 
 */
public class JsonDateFormatFull extends JsonSerializer<Date> {
    
	@Override
	public void serialize(Date value, JsonGenerator jgen,
			SerializerProvider provider) throws

	IOException, JsonProcessingException {
		SimpleDateFormat formatter =   new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		String formattedDate = formatter.format(value);
		jgen.writeString(formattedDate);

	}

}
