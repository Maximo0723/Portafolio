package practicacalculadora;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;

public class Calculadora extends GenericForwardComposer<Component> {
	
	Label lblpantalla;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btnSuma;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btnResta;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btnMultiplicacion;
	Button btnBorrar;
	Button btn0;
	Button btnIgual;
	Button btnDivicion;
	
	private int primerNumero;
	private int segundoNumero;
	private int resultado;
	private boolean aux;
	private String tipoOperacion;
	public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        lblpantalla.setValue("0");
	}
	public void onClick$btnBorrar(Event event) {
		lblpantalla.setValue("0");
	}
	public void onClick$btnSuma(Event event) {
		primerNumero= Integer.valueOf(lblpantalla.getValue());
		lblpantalla.setValue("0");
		tipoOperacion = "+";
	}
	public void onClick$btnResta(Event event) {
		primerNumero= Integer.valueOf(lblpantalla.getValue());
		lblpantalla.setValue("0");
		tipoOperacion = "-";
	}
	public void onClick$btnMultiplicacion(Event event) {
		primerNumero= Integer.valueOf(lblpantalla.getValue());
		lblpantalla.setValue("0");
		tipoOperacion = "*";
	}
	public void onClick$btnDivicion(Event event) {
		primerNumero= Integer.valueOf(lblpantalla.getValue());
		lblpantalla.setValue("0");
		tipoOperacion = "/";
	}
	public void onClick$btnIgual(Event event) {
		if(tipoOperacion == "+") {
			segundoNumero= Integer.valueOf(lblpantalla.getValue());
			
			String resultado= String.valueOf(primerNumero + segundoNumero);
			lblpantalla.setValue(resultado);
		}
		if(tipoOperacion == "-") {
			segundoNumero= Integer.valueOf(lblpantalla.getValue());
			
			String resultado= String.valueOf(primerNumero - segundoNumero);
			lblpantalla.setValue(resultado);
		}
		if(tipoOperacion == "*") {
			segundoNumero= Integer.valueOf(lblpantalla.getValue());
			
			String resultado= String.valueOf(primerNumero * segundoNumero);
			lblpantalla.setValue(resultado);
		}
		if(tipoOperacion == "/") {
			segundoNumero= Integer.valueOf(lblpantalla.getValue());
			
			String resultado= String.valueOf(primerNumero / segundoNumero);
			lblpantalla.setValue(resultado);
		}
	}
	public void onClick$btn1(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "1");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "1");
		}
	}
	public void onClick$btn2(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "2");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "2");
		}
	}
	public void onClick$btn3(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "3");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "3");
		}
	}
	public void onClick$btn4(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "4");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "4");
		}
	}
	public void onClick$btn5(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "5");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "5");
		}
	}
	public void onClick$btn6(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "6");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "6");
		}
	}
	public void onClick$btn7(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "7");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "7");
		}
	}
	public void onClick$btn8(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "8");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "8");
		}
	}
	public void onClick$btn9(Event event) {
		if (lblpantalla.getValue() == "0") {
			lblpantalla.setValue("");
			lblpantalla.setValue(lblpantalla.getValue() + "9");
		} else {
			lblpantalla.setValue(lblpantalla.getValue() + "9");
		}
	}
	public void onClick$btn0(Event event) {
		lblpantalla.setValue(lblpantalla.getValue() + "0");
	}
}
