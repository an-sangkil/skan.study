/*
 * $Id: org.eclipse.jdt.ui.prefs,v 1.1 2010/03/13 01:26:23 smrscvs1 Exp $
 * created by    : AN SANG KIL
 * creation-date : 2010. 5. 7.
 * =========================================================
 * Copyright (c) 2010 ManInSoft, Inc. All rights reserved.
 */
package com.inputoutput.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <code>
 * 표준입력
 * System.out 위에 있는 System.in으로부터 BufferReader를 이용해 읽고 출력한다.
 * </code>
 * @author hjk
 *
 */
public class CatStdin {
	
	public static void main(String av[]){
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			
			String inputLine;
			
			while((inputLine = is.readLine()) != null){
				System.out.println(inputLine);
			}
		}catch(IOException e){
			System.out.println("IOException :" + e);
		} 
	}
}
