package practicanombres;

import java.util.ArrayList;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

public class PracticaNombres extends GenericForwardComposer<Component> {
	Textbox txtNombre1;
	Textbox txtNombre2;
	Textbox txtNombre3;
	Textbox txtNombre4;
	Textbox txtNombre5;
	Button btnGuardar;//Botón para guardar los nombres
	Intbox intNumero;
	Button btnMostrar;
	Label lblMostrarNombre;
	
	private String[] nombres = {"","","","",""};
	ArrayList<String> lista = new ArrayList<String>();
	
	public void onClick$btnGuardar(Event event) {//Guarda los nombres en una lista
		nombres[0]= txtNombre1.getValue();
		nombres[1]= txtNombre2.getValue();
		nombres[2]= txtNombre3.getValue();
		nombres[3]= txtNombre4.getValue();
		nombres[4]= txtNombre5.getValue();
		lista.add(txtNombre1.getValue());
		lista.add(txtNombre2.getValue());
		lista.add(txtNombre3.getValue());
		lista.add(txtNombre4.getValue());
		lista.add(txtNombre5.getValue());
	}
	public void onClick$btnMostrar(Event event) {//Usa el numero ingresado para buscar el nombre correspondiente y mostrarlo
		int numeroNombre= intNumero.getValue() - 1;
		/*if(lblMostrarNombre.getValue() == "El nombres es: ") {
		lblMostrarNombre.setValue(lblMostrarNombre.getValue() + nombres[numeroNombre]);
		} else {
			lblMostrarNombre.setValue("El nombres es: " + nombres[numeroNombre]);
		}*/
		lista.get(numeroNombre);
		lblMostrarNombre.setValue(lista.get(numeroNombre));
	}
}
