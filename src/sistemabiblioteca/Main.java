package sistemabiblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.llenarBiblioteca();
		int opcion;
		String titulo;
		String autor;
		int isbn;
		while(true) {
			System.out.println("Menú");
			System.out.println("Ingrese una opción");
			System.out.println("1) Agregar Libro");
			System.out.println("2) Prestar Libro");
			System.out.println("3) Devolver Libro");
			System.out.println("4) Mostrar Libros Existentes");
			System.out.println("5) Mostrar Libros Disponibles");
			System.out.println("6) Mostrar Libros No Disponibles");
			opcion = sc.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Ingrese el titulo del libro:");
					titulo = sc.nextLine();
					System.out.println("Ingrese el autor del libro:");
					autor = sc.nextLine();
					System.out.println("Ingrese el ISBN del libro:");
					isbn = sc.nextInt();
					biblioteca.agregarLibro(titulo, autor, isbn);
					break;
				case 2:
					System.out.println("Ingrese el ISBN del libro a prestar:");
					isbn = sc.nextInt();
					biblioteca.prestarLibro(isbn);
					break;
				case 3:
					System.out.println("Ingrese el ISBN del libro a devolver:");
					isbn = sc.nextInt();
					biblioteca.devolverLibro(isbn);
					break;
				case 4:
					biblioteca.mostrarLibrosExistentes();
					break;
				case 5:
					biblioteca.mostrarLibrosDisponibles();
					break;
				case 6:
					biblioteca.mostrarLibrosNoDisponibles();
					break;
			}
		}
	}

}
