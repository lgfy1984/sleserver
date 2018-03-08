/**
 * Copyright (c) 2013 Tianjian, Inc. All rights reserved.
 * This software is the confidential and proprietary information of 
 * Tianjian, Inc. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the 
 * license agreement you entered into with Tianjian.
 */
package com.qmh.util;
/**
 * TODO
 * <p>Title: testarray.java</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: Tianjian</p>
 * <p>team: TianjianTeam</p>
 * @author: LengJiong
 * @date 2018年2月23日下午8:00:42
 * @version 1.0
 * 
 */
public class testarray {
	
	
	public static void main(String args[]){
		Integer[][] data = new Integer[20][];
        //构造假数据
        for(int i = 0;i <20; i++){
            Integer[] column = new Integer[23];
            for(int j= 0;j <23; j++){
                if(i ==0 || i == 19){
                    if(j == 9){
                        column[j] = 0;
                    }
                }else if(i ==1 || i == 18){
                    if(j == 9 || j ==8){
                        column[j] = 0;
                    }
                }else if(i == 2 || i == 17){
                    if(j != 0){
                        column[j] =0;
                    }
                }else{
                    if(i >8 && i <12 && j >6&& j <9) {
                        column[j] = 1;
                    }else {
                        column[j] = 0;
                    }
                }
            }
            data[i] = column;
            
	    }
        for(int i=0;i<data.length;i++){
        	System.out.println("一维"+i+"行："+data[i]);
        	for(int j=0;j<23;j++){
            	System.out.print("二维"+i+"行"+j+"列："+data[i][j]);
        	}
        }
	}
}
