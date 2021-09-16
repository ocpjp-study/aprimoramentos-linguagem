package exemplos;

public class Exemplo5 {

	public static void main(String[] args) {

		try (MeuArquivoLeituraOutro ler = new MeuArquivoLeituraOutro("lendo livro")) {
			throw new IllegalStateException("lan�ada pelo nova exception de dentro do block try");
		} catch (IllegalStateException e) {
			System.out.println("Capturada: " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Supressed: " + t.getMessage());
			}
		}
	}

}