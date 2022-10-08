package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import dal.Autor;



public class archivo {
	private Autor rejist;
	private List<Autor> rejistro;
	
	private String fileEntry;
	private String fileName;
	
	



	public archivo() {
		super();
	}


	public Autor getRejist() {
		return rejist;
	}


	public void setRejist(Autor rejist) {
		this.rejist = rejist;
	}


	public List<Autor> getRejistro() {
		return rejistro;
	}


	public void setRejistro(List<Autor> rejistro) {
		this.rejistro = rejistro;
	}


	public String getFileEntry() {
		return fileEntry;
	}


	public void setFileEntry(String fileEntry) {
		this.fileEntry = fileEntry;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public void save() {
		
		File file = new File(fileEntry + "\\" + fileName);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(rejist);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Autor open() {
		try {
			File file = new File(fileEntry);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Autor b = (Autor)ois.readObject();
			ois.close();
			return b;
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void saveList() {
		
		File file = new File(fileEntry + "\\" + fileName);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(rejistro);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Autor> openList() {
		try {
			File file = new File(fileEntry);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			List<Autor> b = (List<Autor>)ois.readObject();
			ois.close();
			return b;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
