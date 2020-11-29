import fr.uha.ensisa.idm.mixin.sim.svg.SVGMixingMachine;
public class ExampleMixingMachine extends SVGMixingMachine {

	public int run() {
		double i ;
		double j ;
		open(0);
		move(-4);
		if(scan() != 9) return -1; 
		suck(9);move(5);blow(9);
		shut(0);
		move(-2);suck(30);move(1);blow(30);
		open(0);
		move(-3);
		if(scan() < 6) return -1; 
		suck(6);move(5);blow(6);
		shut(0);
		move(-3);suck(30);move(1);blow(30);
		move(1);
		filt(1);suck(3);move(3);filt(0);blow(3);
		move(-4);suck(30);move(1);blow(30);
		move(2);
		suck(2);move(2);filt(0);blow(2);
		wait(8);
		move(-5);suck(30);move(1);blow(30);
		return 0;
	}
	public static void main(String[] args) throws Exception {
		ExampleMixingMachine exampleMixingMachine = new ExampleMixingMachine();
		for (int i = 1; i <= exampleMixingMachine.getInputCups(); ++i) {
			exampleMixingMachine.setAtInputCup(i, 9);
		}
		exampleMixingMachine.run();
	}
}