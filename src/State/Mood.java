package State;

public abstract class Mood {
	Vikingo vikingo;
	public abstract void recibirAtaque();
	public abstract void meditar();
	
	public Mood(Vikingo vikingo) {
		this.vikingo = vikingo;
	}
}
