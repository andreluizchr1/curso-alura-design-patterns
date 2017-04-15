import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {

		// List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1",
		// 200.0), new ItemDaNota("item 2", 400.0));
		//
		// double valorTotal = 0;
		//
		// for (ItemDaNota itemDaNota : itens) {
		// valorTotal += itemDaNota.getValor();
		// }
		//
		// double impostos = valorTotal * 0.05;
		//
		// NotaFiscal nf = new NotaFiscal("Razão Social", "CNPJ",
		// Calendar.getInstance(), valorTotal, impostos, itens,
		// "Observações");

		NotaFiscalBuilder builder = new NotaFiscalBuilder().paraEmpresa("Caelum Ensino e Inovação")
				.comCNPJ("12.345.678/0001-12").comItem(new ItemDaNota("Item 1", 200.0))
				.comItem(new ItemDaNota("Item 2", 300.0)).comItem(new ItemDaNota("Item 3", 400.0))
				.comObservacao("Observação").naDataAtual();

		NotaFiscal nf = builder.constroi();

		System.out.println(nf.getValorBruto());

	}

}
