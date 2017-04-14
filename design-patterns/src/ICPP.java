
public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	public double menorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maiorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaiorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500;
	}

}
