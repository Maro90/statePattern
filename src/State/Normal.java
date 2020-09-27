package State;

public class Normal extends  Mood {

	public Normal(Vikingo vikingo) {
		super(vikingo);
	}

	@Override
	public void recibirAtaque() {
		this.vikingo.setMood(this.vikingo.getColericoMood());
	}

	@Override
	public void meditar() {
		this.vikingo.setMood(this.vikingo.getCalmadoMood());
	}
}
