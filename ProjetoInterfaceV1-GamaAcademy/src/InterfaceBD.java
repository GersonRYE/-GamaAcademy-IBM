
// Interface é uma classe abstrata que contem unicamente exclusivos metodos abstratos(cabeçalhos de metodos)
// Interface - serve para Especificar quais funcionalidades eu preciso
// exemplo carro precisa de uma peça original mas pode ter peças alternativas semelhantes
public interface InterfaceBD {
	public void conectar();

	public void desconectar();

	public void executar(String comando);
}
