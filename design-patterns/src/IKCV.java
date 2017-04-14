
public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		// TODO Auto-generated method stub
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double menorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maiorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean deveUsarMaiorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}

}
