package userInterface;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		// TODOS SAO TIPO FUNCIONARIO, MAS CADA UM TEM UM TRABALHO ESPECIFICO
		Funcionario f1, f2, f3, f4;
		
		f1 = new Chefe(1234, "Jonas Chefe", 5000.0, 15.0, 500.0);
		f2 = new Comissionado(1235, "Ana Vendedora", 4000.0, 35.0);
		f3 = new Horista(1236, "Paula Designer", 80, 150.0);
		f4 = new Empreiteiro(1237, "Pedro Construtor", 5872.35);
		
		System.out.println(f1.getNumRegistro() + " - " + f1.getNome() + " R$ " + f1.calcularSalario());
		System.out.println(f2.getNumRegistro() + " - " + f2.getNome() + " R$ " + f2.calcularSalario());
		System.out.println(f3.getNumRegistro() + " - " + f3.getNome() + " R$ " + f3.calcularSalario());
		System.out.println(f4.getNumRegistro() + " - " + f4.getNome() + " R$ " + f4.calcularSalario());
	}
}
