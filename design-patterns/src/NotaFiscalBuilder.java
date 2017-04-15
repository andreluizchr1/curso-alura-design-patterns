import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String observacao;
	private Calendar data;
	private String cnpj;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public NotaFiscalBuilder() {
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}

	public void adicionarAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;

	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		imposto += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		data = Calendar.getInstance();
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, todosItens, observacao);

		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(nf);
		}

		return nf;
	}

}
