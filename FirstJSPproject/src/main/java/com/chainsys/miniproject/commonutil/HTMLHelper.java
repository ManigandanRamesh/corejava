package com.chainsys.miniproject.commonutil;

public class HTMLHelper {
	public static String getHTMLTemplate(String title,String body) {
		String htmlOutPut="<html><head><title>"+title+"</title></head><body>";
		htmlOutPut += "<div>"+body+"</div></body></html>";
		return htmlOutPut;
	}
}



