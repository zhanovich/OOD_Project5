public class AddMoneyState implements State {
	GambleMachine gambleMachine;
 
	public AddMoneyState(GambleMachine gambleMachine) {
		this.gambleMachine = gambleMachine;
	}
  
	public void addMoney() {
		System.out.println("Money have been added");
	}
 
	public void cashOut() {
		System.out.println("Cash out balance is: " + gambleMachine.balance);
		gambleMachine.setState(gambleMachine.getNoMoneyState());
	}
 
	public void tryLuck() {
		System.out.println("You turned...");
		gambleMachine.setState(gambleMachine.getResultState());
	}

    public void result() {
        System.out.println("You turned...");
    }
 
	public String toString() {
		return "Waiting for your turn";
	}

}