package entities;

public class ProdutoImportado extends Produto{
	private Double taxaAlfandega;
	ProdutoImportado(){
		super();
	}
	public ProdutoImportado(String nome, Double preço, Double taxaAlfandega) {
		super(nome, preço);
		this.taxaAlfandega = taxaAlfandega;
	}
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}
	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	public Double preçoTotal() {
		return preço + taxaAlfandega;
	}
	@Override
	public String tagPreço() {
		return nome +" R$ "+String.format("%.2f", preçoTotal())+ " (taxa do produto " + taxaAlfandega+")" ;
	}



}
