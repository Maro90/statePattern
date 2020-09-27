package State;

public class Colerico extends  Mood {

	public Colerico(Vikingo vikingo) {
		super(vikingo);
	}

	@Override
	public void recibirAtaque() {
		this.vikingo.setMood(this.vikingo.getBersekerMood());		
	}

	@Override
	public void meditar() {
		// TODO Auto-generated method stub
		this.vikingo.setMood(this.vikingo.getNormalMood());
	}	
}
