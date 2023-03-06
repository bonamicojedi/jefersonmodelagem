package usuarios;
public class Aluno extends Pessoa {
private int serie;
@Override
public void printDados() {
	System.out.println("Aluno: "+nome+"\nIdade: "+idade+"\nSérie: "+serie+"º");
}
public int getSerie() {
	return serie;
}
public void setSerie(int serie) {
	this.serie = serie;
}
}
