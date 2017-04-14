
public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if (deveUsarMaiorTaxa(orcamento)) {
			return maiorTaxa(orcamento);
		} else {
			return menorTaxa(orcamento);
		}
	}

	public abstract double menorTaxa(Orcamento orcamento);

	public abstract double maiorTaxa(Orcamento orcamento);

	public abstract boolean deveUsarMaiorTaxa(Orcamento orcamento);

}
