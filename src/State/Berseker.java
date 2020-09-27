package State;

public class Berseker extends  Mood {

	public Berseker(Vikingo vikingo) {
		super(vikingo);
	}

	@Override
	public void recibirAtaque() {
		System.out.println("Sólo recibe la mitad del daño");
	}

	@Override
	public void meditar() {
		this.vikingo.setMood(this.vikingo.getNormalMood());
	}
}
