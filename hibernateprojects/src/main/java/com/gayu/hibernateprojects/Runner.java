package com.gayu.hibernateprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<>();
		laps.add(new Laptop("Mac",16,5000));
		laps.add(new Laptop("Dell",8,700));
		laps.add(new Laptop("Acer",10,600));
		Collections.sort(laps);
		
		for(Laptop l:laps) {
			System.out.println(laps);
		}
	}
}
