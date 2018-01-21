package com.dana.statedesign;

public class Client {

	public static void main(String[] args) {

		VendingMachine vendingMachineState = new VendingMachine();

		System.out.println("Current state of the Vending machine is "
				+ vendingMachineState.getVendingMachineState().getClass().getName() + " \n");
		vendingMachineState.dispenseProduct();
		vendingMachineState.selectProductAndInsertMoney("Diet Coke", 20);

		System.out.println("Current state of the vending machine is "
				+ vendingMachineState.getVendingMachineState().getClass().getName() + "\n");

		vendingMachineState.selectProductAndInsertMoney("Pepsi", 25);
		vendingMachineState.dispenseProduct();

	}

}
