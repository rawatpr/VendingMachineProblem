/**
 * 
 */
package com.dana.statedesign;

/**
 * @author Praveen Rawat
 *
 */
public class NoMoneyState implements VendingMachineState {

	@Override
	public void selectProductAndInsertMoney(String productName, int money) {
		System.out.println(productName + " seleted and " + money + " is Inserted !!!");

	}

	@Override
	public void dispenseProduct() {
		System.out.println("No product selected and no money inserted, so can not dispense any product !!!");

	}

}
