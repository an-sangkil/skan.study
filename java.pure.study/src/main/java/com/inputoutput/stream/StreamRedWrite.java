/*
 * $Id: org.eclipse.jdt.ui.prefs,v 1.1 2010/03/13 01:26:23 smrscvs1 Exp $
 * created by    : AN SANG KIL
 * creation-date : 2010. 5. 7.
 * =========================================================
 * Copyright (c) 2010 ManInSoft, Inc. All rights reserved.
 */
package com.inputoutput.stream;

import java.io.IOException;

/**
 * <code>InputStream นื OutputStream Test Class</code>
 * System.in.read();
 * @author hjk
 *
 */
/**
 * @author hjk
 *
 */
public class StreamRedWrite {
	
	public static void main(String []args) throws IOException{
		int b = 0 ;
		try{
			b = System.in.read();
			
		}catch(Exception e){
			System.out.println("Caught" +  e);
		}
		System.out.println("Real this Data:" +  (char)b);
	}
}
