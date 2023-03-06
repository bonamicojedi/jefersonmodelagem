package usuarios;

public class Professor extends Pessoa {
	private String materia;
	@Override
	public void printDados() {
		System.out.println("Professor: "+nome+"\nIdade: "+idade+"\nMateria: "+materia);
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}
}
