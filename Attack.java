package Protekk;

import Attakk.Protect;

class Protect2 extends Protect {
	protected void call() {
		super.call();
	}
}

public class Attack {
	public static void main(String[] args) {
		Protect2 prot = new Protect2();
		prot.call();
	}

}
