package com.will.ch_11;

public class FuelConsumeTest_11_1 {

	public static void main(String[] args) {
		//High Dependency
		Fighter fiighter = new Fighter();
		fiighter.fly(8329);
		FuelConsumeCalculator.cal(fiighter, 3.0);
		Truck truck = new Truck();
		truck.move(9800);
		FuelConsumeCalculator.cal(truck, 0.3);
		
		// Low Dependency
		FiighterFuelMachine fiighter2 = new FiighterFuelMachine();
		fiighter2.fly(8329);
		FuelConsumeCalculator.cal(fiighter2, 3.0);
		TruckFuelMachine truck2 = new TruckFuelMachine();
		truck2.move(9800);
		FuelConsumeCalculator.cal(truck2, 3.0);

	}

}
