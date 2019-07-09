package com.covalense.assgnassessment.mobileobject;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class MobileList {
	private static  ArrayList<MobileBean> arrayList = new ArrayList<MobileBean>();
	
	public static void setMobile() {
		MobileBean m = new MobileBean();
		m.setName("Oppo 6");
		m.setBrand("Oppo");
		m.setPrice(16655);
		
		MobileBean m1 = new MobileBean();
		m1.setName("Oppo 6");
		m1.setBrand("Oppo");
		m1.setPrice(16655);
		
		MobileBean m2 = new MobileBean();
		m2.setName("Oppo 6");
		m2.setBrand("Oppo");
		m2.setPrice(16655);
		
		MobileBean m3 = new MobileBean();
		m3.setName("Oppo 6");
		m3.setBrand("Oppo");
		m3.setPrice(16655);
		
		
		MobileBean m4 = new MobileBean();
		m4.setName("Oppo 6");
		m4.setBrand("Oppo");
		m4.setPrice(16655);
		 arrayList.add(m);
		 arrayList.add(m1);
		 arrayList.add(m2);
		 arrayList.add(m3);
		 arrayList.add(m4);
		 for (MobileBean mobile : arrayList) {
			 log.info(""+mobile.getName());
			 log.info(""+mobile.getBrand());
			 log.info(""+mobile.getPrice());
			 
		}
	} 
	
	
}
