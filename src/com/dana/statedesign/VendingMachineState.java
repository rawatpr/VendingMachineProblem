package com.dana.statedesign;

/**
 * 
 * @author Praveen Rawat
 *
 */
public interface VendingMachineState {
	public void selectProductAndInsertMoney(String productName, int money);

	public void dispenseProduct();

}
