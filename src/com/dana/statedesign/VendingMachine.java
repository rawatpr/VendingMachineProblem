/**
 * 
 */
package com.dana.statedesign;

/**
 * @author Praveen Rawat
 *
 */
public class VendingMachine implements VendingMachineState {

	VendingMachineState vendingMachineState = null;

	public VendingMachine() {
		this.vendingMachineState = new NoMoneyState();
	}

	@Override
	public void selectProductAndInsertMoney(String productName, int money) {
		this.vendingMachineState.selectProductAndInsertMoney(productName, money);

		VendingMachineState hasMoneyState = new HasMoneyState();

		if (vendingMachineState instanceof NoMoneyState) {
			this.vendingMachineState = hasMoneyState;

			System.out.println("Vending Machine internal state moved to HasMoneyState !!!");
		}

	}

	@Override
	public void dispenseProduct() {

		this.vendingMachineState.dispenseProduct();
		VendingMachineState noMoneyState = new NoMoneyState();

		if (this.vendingMachineState instanceof HasMoneyState) {
			this.vendingMachineState = noMoneyState;
		}

	}

	/**
	 * @return the vendingMachineState
	 */
	public VendingMachineState getVendingMachineState() {
		return vendingMachineState;
	}

	/**
	 * @param vendingMachineState
	 *            the vendingMachineState to set
	 */
	public void setVendingMachineState(VendingMachineState vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}

}
