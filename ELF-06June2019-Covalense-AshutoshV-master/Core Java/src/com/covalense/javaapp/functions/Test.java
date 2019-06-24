package com.covalense.javapp.functions;

public class Test {

	public static void main(String[] args) {
		Human h = new Human();
		h.color="brown";
		h.height=125;
		h.weight=70;
		h.run();
		System.out.println("Height is"+h.height);
		System.out.println("Weight is "+ h.weight);
		System.out.println("Color is "+ h.color);
		
		Television1 t = new Television1();
		t.brand = "LG";
		t.cost=150000;
		t.color="Black";
		t.length = 45;
		t.watch();
		System.out.println("Brand is "+t.brand);
		System.out.println("Cost is "+t.cost);
		System.out.println("length is "+t.length);
		System.out.println("Color is "+t.color);
	}

}
