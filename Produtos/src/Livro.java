
public class Livro extends Produto {

	private String autor;
	private String isbn;
	
	public Livro (int codigo, double preco, String descricao, String autor, String isbn) {

		
		super(codigo, preco, descricao);

		this.autor = autor;
		this.isbn = isbn;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getISBN() {
		return autor;
	}
}
