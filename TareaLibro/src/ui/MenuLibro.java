package ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


import dal.Autor;
import misc.archivo;


public class MenuLibro {
	
	public static  FileReader r;
	
	public static ArrayList <Autor> u = new ArrayList<Autor>();
		
	public static Scanner k = new Scanner (System.in);
	
	
	public void menu () {
		boolean salir = true;
		int op=0;
		choose();
		
		do {
			op= k.nextInt()
;
			switch(op) {
			case 1 :
				break;
			case 2:
				break;
			case 4:
				break;
			
			}
			
			
			
		}while(!salir);
		
		
	}
	public void choose() {
		System.out.println("1: Abrir");
		System.out.println("2: Agregar");
		System.out.println("3: Guardar");
		System.out.println("4: salir");
	
		
		
	}
	public void agregar() {
		Autor mo = new Autor();
		u.add(mo.asignatura());
		
		
	}
	public void save() {

		archivo al = new archivo();
			
		System.out.println("Por favor indica la ruta para guardar el archivo: ");
		al.setFileEntry(k.next());
		
		System.out.println("Por favor indica el nombre del archivo: ");		
		al.setFileName(k.next());
		
		al.getRejistro();
		
		al.saveList();
	}
	public FileReader open() {
		System.out.println("Por favor indica la ruta del archivo a abrir: ");
		String fileEntry = k.next();
		
		try {
			r = new FileReader(fileEntry);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	

}
