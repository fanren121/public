package com.company.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author 鐧借檸
 * @category 鏂囦欢涓婁紶鎺у埗鍣�
 */
@Controller
public class UploadAction {

	@RequestMapping("/toupload")
	public String toupload() {
		return "upload";
	}

	/**
	 * 鍗曟枃浠朵笂浼�
	 */
	@RequestMapping("/upload1")
	public String upload1(@RequestParam("file") CommonsMultipartFile file) throws IllegalStateException, IOException {
		String name = file.getOriginalFilename();
		String path = "D:" + File.separator + name;
		file.transferTo(new File(path));
		System.out.println(path);
		return "success";
	}
	
	/**
	 * 鍗曟枃浠朵笂浼犲強涓嬭浇
	 */
	@RequestMapping("/upload2")
	public String upload2(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request)
			throws Exception {
		if (file != null) {
			File file2 = getFile(file, request);
			getFileUrl(file2, request);
			file.getFileItem().write(file2);	
		}
		return "success";
	}
	
	/**
	 * 澶氭枃浠朵笂浼犲強涓嬭浇
	 */
	@RequestMapping("/upload3")
	public String upload2(@RequestParam("file") CommonsMultipartFile[] files, HttpServletRequest request)
			throws Exception {
		for (CommonsMultipartFile file : files) {
			if (file != null) {
				File file2 = getFile(file, request);
				getFileUrl(file2, request);
				file.getFileItem().write(file2);
			}
		}
		return "success";

	}

	// 鍒涘缓鏂囦欢涓婁紶鐨勭墿鐞嗚矾寰勭殑鐩爣鏂囦欢
	public File getFile(CommonsMultipartFile file, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/upload/");// 寰楀埌鏈湴瀛樺偍璺緞
		String fileName = file.getOriginalFilename();// 寰楀埌鏂囦欢鍚�
		String fileType = fileName.substring(fileName.lastIndexOf("."));// 寰楀埌鏂囦欢绫诲瀷锛堝悗缂�鍚嶏級
		File file2 = new File(path, new Date().getTime() + fileType);// 鏂板缓涓�涓枃浠�
		return file2;
	}

	// 寰楀埌鐩爣鏂囦欢鐨刄RL璁块棶鍦板潃
	public void getFileUrl(File file2, HttpServletRequest request) {
		String path = request.getContextPath();
		path += "/upload/" + file2.getName();
		System.out.println(path);
		request.setAttribute("fileName", file2.getName());
		request.setAttribute("filePath", path);
	}
}
