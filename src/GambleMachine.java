public class GambleMachine {
	State noMoneyState;
	State addMoneyState;
	State soldState;
	State resultState;

	State state = noMoneyState;
	double balance = 0;

	public GambleMachine(double balance) {
		noMoneyState = new NoMoneyState(this);
		addMoneyState = new AddMoneyState(this);
		resultState = new ResultState(this);
		this.balance = balance;

		if (balance > 0) {
			state = addMoneyState;
		}
	}

	public void addMoney() {
		balance = balance + 25;
		state.addMoney();
	}

	public void cashOut() {
		state.cashOut();
		System.out.println("Your cash out amount is: " + balance);
		balance = 0;
	}

	public void tryLuck() {
		state.tryLuck();
		state.result();
	}

	void setState(State state) {
		this.state = state;
	}

	void deductBet() {
		System.out.println("Drum is rolling...");
		if (balance >= 2.5) {
			balance = balance -2.5;
		}
	}

	void betWon() {
		System.out.println("You WON!!!");
		balance = balance + 5;
	}
	
	public State getResultState() {
		return resultState;
	}

	public void setResultState(State resultState) {
		this.resultState = resultState;
	}

	public State getNoMoneyState() {
		return noMoneyState;
	}

	public State getAddMoneyState() {
		return addMoneyState;
	}

	public State getSoldState() {
		return soldState;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Your Balance is : " + balance;
	}
}