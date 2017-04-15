
public class TesteAcoes {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionarAcao(new EnviadorDeEmail());
		builder.adicionarAcao(new Impressora());
		builder.adicionarAcao(new EnviadorSMS());
		builder.adicionarAcao(new NotaFiscalDAO());

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCNPJ("12.345.678/0001-12")
				.comItem(new ItemDaNota("Item 1", 200)).comObservacao("Obs").naDataAtual().constroi();

		System.out.println(nf.getValorBruto());

	}

}
