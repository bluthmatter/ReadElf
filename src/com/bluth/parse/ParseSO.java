package com.bluth.parse;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.bluth.parse.ReadElf.Symbol;
import com.bluth.readelf.ELFFileParser;

public class ParseSO {

	public static void main(String[] args) throws Exception {
		parseSO();
	}

	private static void parseSO() throws Exception {
		ELFFileParser.main(new String[]{"libgetstr.so" });
	}
	
	static void outMap(Map<String, String> map) {
		Iterator<?> i = map.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, String> entry = (Entry<String, String>) i.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "===" + value);
		}
	}
}
