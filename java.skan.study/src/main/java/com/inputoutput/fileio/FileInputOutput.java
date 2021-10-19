package com.inputoutput.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutput {
	
	public static void main(String av[]) throws IOException{
		InputStream is = null;
		OutputStream os = null;

		try{
			File uploaderDir = new File("C:\\FILE_TEMP");
			if(!uploaderDir.exists()){
				uploaderDir.mkdirs();
			}
			
			is = new BufferedInputStream(new FileInputStream("C:\\FILE_TEMP\\abc.txt"));
			os = new BufferedOutputStream(new FileOutputStream("C:\\FILE_TEMP\\cdf.txt"));
			
			int b;
			
			while((b=is.read()) != -1){
				os.write(b);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			is.close();
			os.close();
		}
		
	}
}
