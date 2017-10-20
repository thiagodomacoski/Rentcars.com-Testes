package com.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;

public class WriteObject {

	public static final SimpleDateFormat FORMAT = new SimpleDateFormat("ddMMyy_hh-mm-ss");
 

	public static boolean write(final Class _clz, final String data) throws IOException{
		if(null == _clz || null == data) {
			return false;
		}
		final String path  = ("json"+File.separator+_clz.getSimpleName()+File.separator+FORMAT.format(System.currentTimeMillis())+".json");
		final File file = new File(path);
		FileUtils.writeByteArrayToFile(file, data.getBytes());
		return false;
	}

}
