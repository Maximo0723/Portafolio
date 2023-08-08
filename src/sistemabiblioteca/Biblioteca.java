package sistemabiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Libro> listaLibros = new ArrayList<>();

	public void agregarLibro(String titulo, String autor, int isbn) {
		Libro libro = new Libro(titulo, autor, isbn);
		listaLibros.add(libro);
	}

	public void prestarLibro(int isbn) {
		if (existeLibro(isbn)) {// Verifica si el libro existe.
			for (Libro libro : listaLibros) {
				if (libro.getIsbn() == isbn) {
					libro.setDisponible(false);
				}
			}
		}
	}

	public void devolverLibro(int isbn) {
		boolean existeLibro = false;
		for (Libro libro : listaLibros) {
			if (libro.getIsbn() == isbn && libro.isDisponible()) {
				existeLibro = true;
				System.out.println("El libro ya está en la biblioteca");
				break;
			} else if (libro.getIsbn() == isbn && libro.isDisponible() == false) {
				existeLibro = true;
				libro.setDisponible(true);
				System.out.println("Acabas de devolver el libro exitosamente");
				break;
			}	
		}
		if (existeLibro == false) {
			System.out.println("El libro no es de esta biblioteca");
		}
	}

	public void mostrarLibrosExistentes() {
		String status = "";
		for (Libro libro : listaLibros) {
			if (libro.isDisponible()) {
				status = "Disponible";
			} else {
				status = "No disponible";
			}
			System.out.println("[Titulo: " + libro.getTitulo() + ", " + "Autor: " + libro.getAutor() + ", " + "ISBN: "
					+ libro.getIsbn() + ", " + "Disponibilidad: " + status + "]");
		}
	}

	public void mostrarLibrosDisponibles() {
		for (Libro libro : listaLibros) {
			if (libro.isDisponible()) {
				System.out.println("[Titulo: " + libro.getTitulo() + ", " + "Autor: " + libro.getAutor() + ", "
						+ "ISBN: " + libro.getIsbn() + ", " + "Disponibilidad: disponible]");
			}
		}
	}

	public void mostrarLibrosNoDisponibles() {
		for (Libro libro : listaLibros) {
			if (!libro.isDisponible()) {
				System.out.println("[Titulo: " + libro.getTitulo() + ", " + "Autor: " + libro.getAutor() + ", "
						+ "ISBN: " + libro.getIsbn() + ", " + "Disponibilidad: No disponible]");
			}
		}
	}

	public void llenarBiblioteca() {
		agregarLibro("El principito", "Antoine de Saint-Exupéry", 9789);
		agregarLibro("Juego de tronos", "George Martin", 4691);
		agregarLibro("El Señor de los Anillos", "Tolkien", 1649);
		agregarLibro("Tokio Blues", "Murakami", 7615);
		agregarLibro("La Insoportable Levedad del Ser", "Kundera", 4999);
		agregarLibro("Eso", "Stephen King", 7514);
		agregarLibro("Poética", "Platón", 5564);
		agregarLibro("Aura", "Carlos Fuentes", 7948);
		agregarLibro("Momo", "Michael Ende", 3264);
		agregarLibro("El Escritor", "Máximo Olivares", 2289);
	}

	public boolean existeLibro(int isbn) {// Verifica si un libro existe en la lista de libros
		boolean existe = false;
		boolean existeIsbn = false;

		for (Libro libro : listaLibros) {
			if (libro.getIsbn() == isbn && libro.isDisponible()) {
				existeIsbn = true;
				existe = true;
				System.out.println("El libro esta disponible y será prestado");
				break;
			} else if (libro.getIsbn() == isbn && libro.isDisponible() == false) {
				existeIsbn = true;
				System.out.println("El libro está prestado");
				break;
			}
		}
		if (!existeIsbn) {
			System.out.println("No existe en la biblioteca");
		}
		return existe;
	}
}
