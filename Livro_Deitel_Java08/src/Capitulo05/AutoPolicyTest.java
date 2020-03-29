package Capitulo05;

public class AutoPolicyTest {

	public static void main(String[] args) {
		//criar dois objetos AutoPolicy
		
		AutoPolicy police1 = new AutoPolicy(123456,"Space Fox","CE");
		AutoPolicy police2 = new AutoPolicy(123456,"HB20","RJ");
		
		policyInNoFaultState(police1);
		policyInNoFaultState(police2);
		
	}
	
	public static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("The auto Policy");
		System.out.printf(
				"Account #: %d; Car: %s; State: %s %s a no-fault state%n%n",
				policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
				(policy.isNoFaultState() ? "is" : "is not"));
	}
}
