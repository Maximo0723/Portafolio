package password;

import java.util.Random;

public class GeneradorPassword {
	
	public String generarPassword(int length) {
		String caracteres= "abcdefghijklmnñopqrstvwxyzABCDEFGHIJKLMNñOPQRSTVWXYZ1234567890~!@#$%^&*/:;_";//Escribir todas las letras en mayuscula y minuscula, todos los numeros y caracteres
		String password= "";
		
		for(int i = 0; i < length; i++) {
			//char caracteresChar= 
			int min= 0;
			int max= 74;
			int numeroAleatorio= new Random().nextInt(max-min)+min;
			password= password+caracteres.charAt(numeroAleatorio);
		}
		
		return password;
	}

}
