import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		// TODO Auto-generated method stub
		System.out.println("Banco XYZ");

	}

	@Override
	protected void rodape() {
		// TODO Auto-generated method stub
		System.out.println("(93) 99101-7373");

	}

	@Override
	protected void corpo(List<Conta> contas) {
		// TODO Auto-generated method stub
		for (Conta conta : contas) {
			System.out.println(conta.getNome() + " - " + conta.getSaldo());
		}
	}

}
