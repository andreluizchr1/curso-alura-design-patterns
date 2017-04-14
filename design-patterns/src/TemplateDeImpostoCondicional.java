
public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if (deveUsarMaiorTaxa(orcamento)) {
			return maiorTaxa(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return menorTaxa(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	public abstract double menorTaxa(Orcamento orcamento);

	public abstract double maiorTaxa(Orcamento orcamento);

	public abstract boolean deveUsarMaiorTaxa(Orcamento orcamento);

}
