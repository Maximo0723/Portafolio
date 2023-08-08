package logincomposer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

public class LoginComposer extends GenericForwardComposer<Component> {
	Textbox txtUsuario;
	Textbox txtContrase�a;
	Button btnInicio;
	
	public void onClick$btnInicio(Event event) {
		if(txtUsuario.getValue().equals("administrador") && txtContrase�a.getValue().equals("adm")) {
			Executions.sendRedirect("/administrador.zul");
		} else if(txtUsuario.getValue().equals("cliente") && txtContrase�a.getValue().equals("123")) {
			Executions.sendRedirect("/cliente.zul");
		} else {
			Messagebox.show("Las claves son incorrectas");
			txtUsuario.setValue("");
			txtContrase�a.setValue("");
		}
	}
}
