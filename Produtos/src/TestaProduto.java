
public class TestaProduto {

	public static void main(String args[]) {
		Livro livro = new Livro(1, 55.0, "Universidade Java!", "Oziel Moreira Neto", "01010101010");
		System.out.println("Cod:" + livro.getCodigo());
		System.out.println("Desc:" + livro.getDescricao());
		System.out.println("Preco:" + livro.getPreco());
		System.out.println("Autor:" + livro.getAutor());
		System.out.println("ISBN:" + livro.getISBN());
		System.out.println(); 
		
		CompactDisc cd = new CompactDisc(2, 25.0, "Rock Brasileiro!", "Brasileiros", "BrasilRecords");
		System.out.println("Cod:" + cd.getCodigo());
		System.out.println("Desc:" + cd.getDescricao());
		System.out.println("Preco:" + cd.getPreco());
		System.out.println("Artista:" + cd.getArtista());
		System.out.println("Gravadora:" + cd.getGravadora());
		System.out.println();
	}

}
