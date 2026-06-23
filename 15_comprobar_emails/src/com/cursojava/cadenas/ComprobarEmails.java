package com.cursojava.cadenas;

public class ComprobarEmails {

	public static void main(String[] args) {
		final String DOMINIO_COMPROBAR="gmail";
		//String[] emails= {"prueba@gmail.com","test@gmailboot.com","other@hotmail.com","this@mymail.es"};
		String emails="prueba@gmail.com|test@gmailboot.com|other@hotmail.com|this@mymail.es";
		//indicar cuantos emails son del dominio gmail
		int ocurrencias=0;
		for(String e:emails.split("[|]")) {
			if(comprobarEmail(e,DOMINIO_COMPROBAR)) {
				ocurrencias++;
			}
		}
		System.out.println("Dominio gmail: "+ocurrencias);

	}
	
	static boolean comprobarEmail(String email,String dominio) {
		int pos1=email.indexOf("@");
		int pos2=email.lastIndexOf(".");
		String proveedor=email.substring(pos1+1,pos2);
		return proveedor.equals(dominio);
	}

}
