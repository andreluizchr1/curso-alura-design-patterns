
public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, String imposto) {

		if (imposto.equals("imposto")) {

			double icms = orcamento.getValor() * 0.1;
			System.out.println(icms);

		} else if (imposto.equals("ICSS")) {
			double iss = orcamento.getValor() * 0.6;
			System.out.println(iss);
		}

	}
}
