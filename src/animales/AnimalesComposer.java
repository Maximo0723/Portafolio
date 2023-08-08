package animales;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;

public class AnimalesComposer extends GenericForwardComposer<Component> {
	Button btnAnimal;
	Button btnGato;
	Button btnPerro;
	Label lblEjemplo;
	Intbox intCantidadPatas;
	Animal animal= new Animal();
	
	public void onClick$btnAnimal(Event event) {
		animal.comer();
		animal.setCantidadPatas(intCantidadPatas.getValue());
		animal.getCantidadPatas();
	}
	public void onClick$btnGato(Event event) {
		Gato silvestre= new Gato();
		silvestre.setCantidadOjos(2);
		System.out.println("El gato tiene " + silvestre.getCantidadOjos() + " ojos");
		System.out.println("El gato tiene " + silvestre.getCantidadPatas() + " patas");
	}
	public void onClick$btnPerro(Event event) {
		Perro perro= new Perro();
		perro.hacerRuido();
	}
}
