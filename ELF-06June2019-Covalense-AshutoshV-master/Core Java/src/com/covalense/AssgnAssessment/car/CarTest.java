package com.covalense.assgnassessment.car;

import java.util.ArrayList;
import lombok.extern.java.Log;

@Log
public class CarTest {
	
	public static void main(String[] args) {
		ArrayList<Car> arrayList = new ArrayList<Car>();
		Car car1= new Car("Swift", "Maruti Suzuki", 800000);
		Car car2 = new Car("Ertiga", "Maruti Suzuki", 900000);
		Car car3 = new Car("Dzire", "Maruti Suzuki", 750000);
		Car car4 = new Car("Amaze", "Honda", 850000);
		Car car5 = new Car("Accord", "Honda", 105000);
		arrayList.add(car1);
		arrayList.add(car2);
		arrayList.add(car3);
		arrayList.add(car4);
		arrayList.add(car5);
		
		String searchCar = "Maruti Suzuki";
		for (Car car : arrayList) {
			if(car.getBrand()==searchCar) {
				log.info(""+car);
			}
		}
			
		
		
		
		
		
		
		
		
	}

}
