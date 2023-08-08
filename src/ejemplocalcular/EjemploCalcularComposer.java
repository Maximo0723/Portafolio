package ejemplocalcular;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

public class EjemploCalcularComposer extends GenericForwardComposer<Component> {
	Intbox intCalcular1;
	Intbox intCalcular2;
	Button btnBoton1;
	Label lblResultado;
	public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        intCalcular1.setDisabled(true);
        intCalcular2.setDisabled(true);
        intCalcular1.setValue(56);
        intCalcular2.setValue(78);
	}
	
	public void onClick$btnBoton1(Event event) {
		int var1= Integer.valueOf(intCalcular1.getValue());
		int var2= Integer.valueOf(intCalcular2.getValue());
		int suma= var1 + var2;
		lblResultado.setValue(String.valueOf(suma));
	}

}
