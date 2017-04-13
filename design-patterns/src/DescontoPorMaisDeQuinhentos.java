
public class DescontoPorMaisDeQuinhentos {

	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		return 0;
	}
}
