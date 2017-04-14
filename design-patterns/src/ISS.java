
public class ISS extends Imposto {

	public ISS() {

	}

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return outroImposto.calcula(orcamento);
	}
}
