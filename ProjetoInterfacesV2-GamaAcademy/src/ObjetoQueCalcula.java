
public class ObjetoQueCalcula implements InterfaceModuloUm, InterfaceModuloDois {
	public void realizaAlgumCalculo() {
		System.out.println("Pronto...Calculei");
	}

	@Override
	public void efetivarContas() {
		realizaAlgumCalculo();
	}

	@Override
	public void calcularValores() {
		realizaAlgumCalculo();
	}
}
