package State;

public class Calmado extends  Mood {

	public Calmado(Vikingo vikingo) {
		super(vikingo);
	}

	@Override
	public void recibirAtaque() {
		this.vikingo.setMood(this.vikingo.getNormalMood());
	}

	@Override
	public void meditar() {
		System.out.println("Se va a quedar dormido de lo tranquilo que está");
	}
}
