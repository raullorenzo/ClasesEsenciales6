package edu.upc.eetac.dsa.rlorenzo.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoTexto {
	
	
	public int cuentaChars(){
		int num=0;
		
		
		try {
			FileReader fr = new FileReader("/home/raul/registro.txt");
			BufferedReader br = new BufferedReader(fr);
			int aux = br.read();
			int count =-1;
			while(aux!=-1){
				aux = br.read();
				count++;
			}
			num = count;
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return num;
	}

}
