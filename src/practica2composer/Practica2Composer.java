package practica2composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

public class Practica2Composer extends GenericForwardComposer<Component> {
	Checkbox chHabilitar;
	Textbox txtNombre;
	Datebox dtFechaNacimiento;
	Intbox intEdad;
	Checkbox chPasatiempo1;
	Checkbox chPasatiempo2;
	Checkbox chPasatiempo3;
	Button btnPasatiempos;
	Label lblResultados;
	public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        txtNombre.setDisabled(true);
        intEdad.setDisabled(true);
        dtFechaNacimiento.setDisabled(true);
        chPasatiempo1.setDisabled(true);
        chPasatiempo2.setDisabled(true);
        chPasatiempo3.setDisabled(true);
	}
	
	public void onCheck$chHabilitar(Event event) {
        if (chHabilitar.isChecked() == true) {
        	txtNombre.setDisabled(false);
            intEdad.setDisabled(false);
            dtFechaNacimiento.setDisabled(false);
            chPasatiempo1.setDisabled(false);
            chPasatiempo2.setDisabled(false);
            chPasatiempo3.setDisabled(false);
        } else {
        	txtNombre.setDisabled(true);
            intEdad.setDisabled(true);
            dtFechaNacimiento.setDisabled(true);
            chPasatiempo1.setDisabled(true);
            chPasatiempo2.setDisabled(true);
            chPasatiempo3.setDisabled(true);
        	
        }
		
	}
	public void onClick$btnPasatiempos(Event event) {
		String mensaje= txtNombre.getValue() + " " + "tienes "+ String.valueOf(intEdad.getValue()) + " años y tienes "+ contarCheckbox() + " pasatiempos";
		System.out.println(mensaje);
	}
	public int contarCheckbox() {
		int var1= 0;
		if (chPasatiempo1.isChecked()) {
			var1= var1 + 1;
		}
		if (chPasatiempo2.isChecked()) {
			var1= var1 + 1;
		}
		if (chPasatiempo3.isChecked()) {
			var1= var1 + 1;
		}
		
		return var1;
	}
}
