package registrocomposer;

import java.util.ArrayList;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

public class RegistroComposer extends GenericForwardComposer<Component> {
	Textbox txtUsuarioRegistro;
	Textbox txtPasswordRegistro;
	Textbox txtPasswordConfirmar;
	Button btnRegistrar;
	Textbox txtUsuarioInicio;
	Textbox txtPasswordInicio;
	Label lblCaptcha;
	Textbox txtCaptcha;
	Button btnInicio;
	Label lblNumeroUsuario;
	Intbox intNumero;
	
	private ArrayList<String> usuarios = new ArrayList<String>();
	private ArrayList<String> passwords = new ArrayList<String>();
	
	public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        intNumero.setValue(0);
	}
	public void onClick$btnRegistrar(Event event) {
		if(!txtUsuarioRegistro.getValue().equals("") && !txtPasswordRegistro.getValue().equals("")) {
			if(txtPasswordConfirmar.getValue().equals(txtPasswordRegistro.getValue())) {
			usuarios.add(txtUsuarioRegistro.getValue());
			passwords.add(txtPasswordRegistro.getValue());
			lblNumeroUsuario.setValue(String.valueOf(usuarios.size()));
			Messagebox.show("La cuenta se ha creado correctamente");
			txtUsuarioRegistro.setValue("");
			txtPasswordRegistro.setValue("");
			txtPasswordConfirmar.setValue("");
			}
			else {
				Messagebox.show("Las contraseñas no son iguales");
			}
		} else {
			Messagebox.show("Ingrese un usuario y contraseña");
		}
	}
	public void onClick$btnInicio(Event event) {
		int numeroUsuario= intNumero.getValue();
		if(txtUsuarioInicio.getValue().equals("administrador") && txtPasswordInicio.getValue().equals("admin")) {
			for(int i = 0; i < usuarios.size(); i++){ 
				System.out.println(usuarios.get(i) + "-" + passwords.get(i));
		}
		} else if(txtUsuarioInicio.getValue().equals(usuarios.get(numeroUsuario)) && txtPasswordInicio.getValue().equals(passwords.get(numeroUsuario))) {
			Messagebox.show("Inicio de sesión exitoso");
		} else {
			Messagebox.show("Nombre de usuario o contraseña incorrectos");
		}
	}
}
