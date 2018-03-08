/**
 * Copyright (c) 2013 Tianjian, Inc. All rights reserved.
 * This software is the confidential and proprietary information of 
 * Tianjian, Inc. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the 
 * license agreement you entered into with Tianjian.
 */
package com.qmh.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * TODO
 * <p>Title: DateJsonValueProcessor.java</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: Tianjian</p>
 * <p>team: TianjianTeam</p>
 * @author: LengJiong
 * @date 2018年2月15日上午11:07:22
 * @version 1.0
 * 
 */
public class DateJsonValueProcessor implements JsonValueProcessor  {  
	  
    private String format = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";  
  
    public DateJsonValueProcessor() {  
    }  
  
    public DateJsonValueProcessor(String format) {  
        this.format = format;  
    }  
      
    @Override  
    public Object processArrayValue(Object value, JsonConfig jsonConfig) {  
        String[] obj = {};  
        if (value instanceof Date[] && !value.equals(null)) {  
        SimpleDateFormat sf = new SimpleDateFormat(format);  
        Date[] dates = (Date[]) value;  
        obj = new String[dates.length];  
        for (int i = 0; i < dates.length; i++) {  
        obj[i] = sf.format(dates[i]);  
        }  
        }  
        return obj;  
    }  
  
    @Override  
    public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {  
        if (value instanceof Date && !value.equals(null)) {  
            String str = new SimpleDateFormat(format).format((Date) value);  
            return str;  
        }  
            return "";  
        }  
  
    public String getFormat() {  
        return format;  
    }  
    public void setFormat(String format) {  
        this.format = format;  
    }  
  
}  
