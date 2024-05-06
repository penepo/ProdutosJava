
public class CompactDisc extends Produto{
	private String artista;
	private String gravadora;
	
	public CompactDisc (int codigo, double preco, String artista, String gravadora, String descricao) {
		super (codigo, preco, descricao);
		this.artista = artista;
		this.gravadora = gravadora;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public String getGravadora() {
		return gravadora;
	}
	
}
