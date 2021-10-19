package com.inputoutput.fileio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO {
	
	/**
	 * 파일 하나를 열린 InputStream 에서 열린 OutputStream으로 복사 한다.
	 * @param is
	 * @param os
	 * @param close
	 * @throws IOException 
	 */
	public static void copyFile(InputStream is , OutputStream os, boolean close) throws IOException{
		int b;
		
		while((b=is.read()) != -1){
			os.write(b);
		}
		is.close();
		if(close){
			os.close();
		}
	}
}
