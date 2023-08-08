package controlador;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;

public class IndexComposer extends GenericForwardComposer<Component> {
	Label lblCalculadora;
	
	public void onClick$lblCalculadora(Event event) {
		Executions.sendRedirect("/calculadora.zul");
		System.out.println("11");
	}
}