package com.github.rutvikrpatel.fileutil;

import java.io.File;

public class FileUtil{
	
    public static long getFileByte(File file) {
    	return file.length();
    }
    
    public static long getFileByte(String filePath) {
    	return new File(filePath).length();
    }
    
}