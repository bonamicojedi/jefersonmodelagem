package main;
import usuarios.*;

public class main {
	
	public static void main(String [] args){ 
		Aluno a = new Aluno();
		Funcionario f = new Funcionario();
		Professor p = new Professor();
		
		a.setIdade(6);
		f.setIdade(35);
		p.setIdade(40);
		
		a.setNome("Joaozinho");
		f.setNome("Marcia");
		p.setNome("Jeferson");
		
		a.setSerie(1);
		f.setCargo("Secretaria");
		p.setMateria("Padrao de Projetos");
		
		a.printDados();
		System.out.println("\n");
		f.printDados();
		System.out.println("\n");
		p.printDados();


}

}
