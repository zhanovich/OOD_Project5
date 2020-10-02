import java.util.Random;

public class ResultState implements State {
	GambleMachine gambleMachine;
	Random random = new Random(System.currentTimeMillis());
	
	public ResultState(GambleMachine gambleMachine) {
		this.gambleMachine = gambleMachine;
	}

	public void addMoney() {
		System.out.println("Cannot add money");
	}

	public void cashOut() {
		System.out.println("Cannot cash out");
	}

	public void tryLuck() {
		System.out.println("Cannot try luck");
	}

	public void result() {
		System.out.println("Drum roll...");
		
		int winner = random.nextInt(3);
		if (gambleMachine.getBalance() == 0) {
			System.out.println("No money to play");
			gambleMachine.setState(gambleMachine.getNoMoneyState());
		} if ((winner == 0) && (gambleMachine.getBalance() >= 2.5)) {
			gambleMachine.deductBet();
			gambleMachine.betWon();
		} else {
			gambleMachine.deductBet();
			System.out.println("You loose, try one more time");
		}
	}
}