
public class CalculadorDeImposto {

	public void realizaCalculoICMS(Orcamento orcamento, String imposto) {

			double icms = new ICMS().calculaICMS(orcamento);
			System.out.println(icms);

	}
	
	public void realizaCalculoISS(Orcamento orcamento){
		
		double iss = new ISS().calculaISS(orcamento);
		System.out.println(iss);
	}
}
