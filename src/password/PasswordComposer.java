package password;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

public class PasswordComposer extends GenericForwardComposer<Component> {
	Textbox txtPassword;
	Button btnGenerar;
	
	public void onClick$btnGenerar(Event event) {
		GeneradorPassword pwd= new GeneradorPassword();
		String password= pwd.generarPassword(8);
		txtPassword.setValue(password);
	}
}
