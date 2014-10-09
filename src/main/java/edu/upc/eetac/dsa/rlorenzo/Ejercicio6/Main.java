package edu.upc.eetac.dsa.rlorenzo.Ejercicio6;

public class Main {
	public static void main(String[] args){
		int img;
		int text;
		
		
		
		
		ArchivoTexto textfile = new ArchivoTexto();
		ArchivoJpg imgfile = new ArchivoJpg();
		
		img=imgfile.cuentaBytes();
		text=textfile.cuentaChars();
		
		if(img<text){
			System.out.println("El archivo con más peso es registro.txt ");
		}else{
			System.out.println("El archivo con más peso es imagen.jpg ");
		}
		
		
	}

}
