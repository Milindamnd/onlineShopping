package com.mili.onlineShopping.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {
	private static final String absolute_path="E:\\Game\\onlineShopping\\src\\main\\webapp\\files\\images\\";
	private static String real_path="";
	
	
	public static void uploadImageFile(HttpServletRequest request, MultipartFile image_file, String code) {
		real_path=request.getSession().getServletContext().getRealPath("/files/images/");
		if(!new File("absolute_path").exists()) {
			new File(absolute_path).mkdirs();
		}
		if(!new File("real_path").exists()) {
			new File(real_path).mkdirs();
		}
		try {
			image_file.transferTo(new File(real_path + code + ".jpg"));
			image_file.transferTo(new File(absolute_path + code + ".jpg"));
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
