package State;

public class Vikingo {
	
	Normal normal;
	Colerico colerico;
	Calmado calmado;
	Berseker berseker;
	
	Mood mood;
	
	
	public Vikingo() {
		normal = new Normal(this);
		colerico = new Colerico(this);
		calmado = new Calmado(this);
		berseker = new Berseker(this);
		mood = normal;
	}
	
	public void setMood(Mood mood) {
		this.mood = mood;
	}
	
	public void recibirAtaque() {
		this.mood.recibirAtaque();
	}
	
	public void meditar() {
		this.mood.meditar();
	}
	
	public Mood getNormalMood() {
		return this.normal;
	}
	
	public Mood getColericoMood() {
		return this.colerico;
	}

	public Mood getBersekerMood() {
		return this.berseker;
	}

	public Mood getCalmadoMood() {
		return this.calmado;
	}
}
