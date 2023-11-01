package com.neotech.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {

		List<Map<String, String>> listOfMaps = new ArrayList<>();
		
		Map<String, String> caglar = new HashMap<>();
		caglar.put("firstName", "Caglar");
		caglar.put("lastName", "Akcinar");
		
		listOfMaps.add(caglar);
		
		Map<String, String> alban = new HashMap<>();
		alban.put("firstName", "Alban");
		alban.put("lastName", "Lutaj");
		
		listOfMaps.add(alban);

		System.out.println(listOfMaps);
		
		//how would we get a particular element of the list??
		listOfMaps.get(0);
	}

}
