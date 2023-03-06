package usuarios;

public class Funcionario extends Pessoa {
private String cargo;
	@Override
	public void printDados() {
		System.out.println("Funcionário: "+nome+"\nIdade: "+idade+"\nCargo: "+cargo);
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
