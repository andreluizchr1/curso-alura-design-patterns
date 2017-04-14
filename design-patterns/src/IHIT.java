import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public double menorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	public double maiorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public boolean deveUsarMaiorTaxa(Orcamento orcamento) {
		// TODO Auto-generated method stub

		List<String> noOrcamento = new ArrayList<String>();
		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}

		return false;
	}

}
