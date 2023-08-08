package practicacomposer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

public class PracticaComposer extends GenericForwardComposer<Component> {
	Textbox txtOpcion1;
	Textbox txtOpcion2;
	Textbox txtOpcion3;
	Button btnAgregar;
	Combobox cmbOpciones;
	Comboitem cmbitem1;
	Comboitem cmbitem2;
	Comboitem cmbitem3;
	Label lblEleccion;
	
	public void onClick$btnAgregar(Event event) {
		if(txtOpcion1.getValue().equals("") || (txtOpcion2.getValue().equals("") || (txtOpcion3.getValue().equals("")))) {
			System.out.println("Error, alguno o algunos de los cuadros de texto estan vacios");
		} else {
				cmbitem1.setLabel(txtOpcion1.getValue());
				cmbitem2.setLabel(txtOpcion2.getValue());
				cmbitem3.setLabel(txtOpcion3.getValue());
			}
	}
	public void onSelect$cmbOpciones(Event event) {
		lblEleccion.setValue(cmbOpciones.getValue());
	}
}
