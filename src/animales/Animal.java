package animales;

public class Animal {
	private int cantidadPatas;
	private int cantidadOjos;
	private int peso;
	private boolean tieneCuello;
	
	public void comer() {
		System.out.println("El animal esta comiendo");
	}
	public void hacerRuido() {
		System.out.println("El animal hace ruido");
	}
	public int getCantidadPatas() {
		return cantidadPatas;
	}
	public void setCantidadPatas(int aux) {
		this.cantidadPatas= aux;
	}
	public int getCantidadOjos() {
		return cantidadOjos;
	}
	public void setCantidadOjos(int cantidadOjos) {
		this.cantidadOjos = cantidadOjos;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isTieneCuello() {
		return tieneCuello;
	}
	public void setTieneCuello(boolean tieneCuello) {
		this.tieneCuello = tieneCuello;
	}
	
}
