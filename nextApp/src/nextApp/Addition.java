package nextApp;

public class Addition {
	
	int nombre1 = Integer.parseInt("2");
	int nombre2 = Integer.parseInt("8");


	
	public Addition() {

	}

	public Addition(int nombre1, int nombre2) {
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;

	}
	
	public int getNombre1() {
		return nombre1;
	}
	public int getNombre2() {
		return nombre2;
	}

	public void setNombre1(int nombre1) {
		this.nombre1 = nombre1;
	}
	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}

	@Override
	public String toString() {
		return "Addition [nombre1=" + nombre1 + ", nombre2=" + nombre2 + " ";
	}
	

	public void afficher() {
	    return(	"La somme est " + (nombre1 + nombre2));
	}
	
}
