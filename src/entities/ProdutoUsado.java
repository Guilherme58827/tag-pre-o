package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	SimpleDateFormat form =new SimpleDateFormat("dd/MM/yyyy");
	private Date dataCriação;
	ProdutoUsado(){
		super();
	}
	public ProdutoUsado(String nome, Double preço, Date dataCriação) {
		super(nome, preço);
		this.dataCriação = dataCriação;
	}
	public Date getDataCriação() {
		return dataCriação;
	}
	public void setDataCriação(Date dataCriação) {
		this.dataCriação = dataCriação;
	}
	@Override
	public String tagPreço() {
		return nome +"(usado)  R$"+String.format("%.2f", preço)+ "( data de fabricação " + form.format(dataCriação)+")" ;
	}
	
}
