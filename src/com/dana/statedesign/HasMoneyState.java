/**
 * 
 */
package com.dana.statedesign;

/**
 * @author Praveen Rawat
 *
 */
public class HasMoneyState implements VendingMachineState {

	@Override
	public void selectProductAndInsertMoney(String productName, int money) {
		System.out.println("Already one order is in process, can not selected other product and insert the money !!!");

	}

	@Override
	public void dispenseProduct() {
		System.out.println("Product is dispencing now !!!");
	}

}
