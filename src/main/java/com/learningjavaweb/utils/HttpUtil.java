package com.learningjavaweb.utils;

import java.io.BufferedReader;
import java.io.IOException;

public class HttpUtil {
	
	private String value;
	
	public HttpUtil(String value) {
		this.value = value;
	}
	
	/*
	 * public <T> T toModel(Class<T> tclass) {
	 * 
	 * }
	 */
	
	public static HttpUtil of (BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
	    try {
	    	String line;
			while ((line = reader.readLine()) != null) {
			    sb.append(line);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return new HttpUtil(sb.toString());
	}

}
