package Capitulo05;

public class AutoPolicy {
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	//Construtor
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	
	//Getters e Setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}

	public String getState() {
		return state;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	// os nomes dos métodos que retornam valores BOOLEAN, devem iniciar com "is" 
	public boolean isNoFaultState() {
		boolean noFaultState;
		
		switch (getState()) {
			case "CE": case "BA": case "PB": case "RN":
				noFaultState = true;
				break;
			default:
				noFaultState = false;
				break;
		}
		
		return noFaultState;
	}
	
	
	
}
