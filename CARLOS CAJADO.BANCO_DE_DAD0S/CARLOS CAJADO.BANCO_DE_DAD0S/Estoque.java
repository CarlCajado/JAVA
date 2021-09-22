
public class Estoque {
	public Estoque() {
		
	}
	public Estoque(String produto, String valor, String quantidade) {
		super();
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	private String produto;
	private String valor;
	private String quantidade;
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Estoque [produto=" + produto + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	
}

