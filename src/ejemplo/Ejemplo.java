package ejemplo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;

public class Ejemplo extends GenericForwardComposer<Component> {
	Intbox int1;
	Button btn1;
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota", "Mini", "Volskwagen"};
	public void onClick$btn1(Event event) {
		for(int i = 0; i <=6; i++){
			System.out.println(cars[i]);
		}
	}
}
