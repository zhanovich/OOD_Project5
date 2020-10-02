public class NoMoneyState implements State {
    GambleMachine gambleMachine;
 
    public NoMoneyState(GambleMachine gambleMachine) {
        this.gambleMachine = gambleMachine;
    }
 
	public void addMoney() {
		System.out.println("Money have been added");
		gambleMachine.setState(gambleMachine.getAddMoneyState());
	}
 
	public void cashOut() {
		System.out.println("No money to cash out");
	}
 
	public void tryLuck() {
		System.out.println("No money, please add money to play");
	 }
 
	public void result() {
		System.out.println("No money, please add money to play");
	} 
 
	public String toString() {
		return "Add Money";
	}
}