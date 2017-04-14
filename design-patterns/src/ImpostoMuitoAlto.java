
public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {
		// TODO Auto-generated constructor stub
	}

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
