
public class TesteDeImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imposto icms = new ICMS();
		Imposto iss = new ISS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
	}

}
