package sistemabiblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private int isbn;
	private boolean disponible;
	
	public Libro(String titulo, String autor, int isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponible = true;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
