public class GambleMachineTestDrive {

	public static void main(String[] args) {
		GambleMachine gumballMachine = new GambleMachine(50);

		System.out.println(gumballMachine);
		gumballMachine.addMoney();
		gumballMachine.tryLuck();

		gumballMachine.tryLuck();
		gumballMachine.tryLuck();
		gumballMachine.cashOut();
		System.out.println(gumballMachine);
	}
}