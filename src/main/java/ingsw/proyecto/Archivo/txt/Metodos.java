package ingsw.proyecto.Archivo.txt;

import java.io.*;

import ingsw.proyecto.SAGI.model.Residente;

public class Metodos {
	
	public void Escribir (String datos) {
		Residente res;
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
		
			f=new File(datos);
			w=new FileWriter(f);
			bw=new BufferedWriter(w);
			wr=new PrintWriter(f);
			
			wr.write("Primera linea");
			wr.append("\nSegunda Linea");
			wr.append("\nLinea Final");
			
			wr.close();
			bw.close();
			
		}catch (Exception e) {
			System.out.print("Ha sucedido un error"+e);		
		}
		
	}

}
