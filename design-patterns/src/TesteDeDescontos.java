
public class TesteDeDescontos {

	public static void main(String[] args) {

		CalculadorDeDesconto descontos = new CalculadorDeDesconto();

		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionarItem(new Item("Caneta", 10.0));
		orcamento.adicionarItem(new Item("Ventilador", 210.0));

		double descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);

	}
}
