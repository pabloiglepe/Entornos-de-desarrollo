package es.iessoterohernandez.daw.endes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;


/**
 * Hello world!
 */
public class HelloWorldPdf {

	public static void main(String[] args) {
		
		try {
			Document documento = new Document();
			String destino = "Hola_mundo.pdf";
			PdfWriter.getInstance(documento, new FileOutputStream(destino));
			documento.open();
			
			Phrase parrafo = new Phrase("Hola mundo");
			documento.add(parrafo);
			
			documento.close();
			
			System.out.println("Creado el PDF");
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
