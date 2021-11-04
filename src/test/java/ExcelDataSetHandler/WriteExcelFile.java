package ExcelDataSetHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public WriteExcelFile() {

	}
    // Escribimos los datos en el fichero.
	//C.  Creamos dos metodos. 
	// 1� Nos permite escribir una lista de datos (array) en el excel
	public void writeExcel(String filepath, String sheetName, String[] dataToWrite) throws IOException {

		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);

		// creamos el libro
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		// creamos el objeto de la hoja
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);

		// calculamos la cantidad de filas que existen.
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

		// creamos un objeto fila.
		XSSFRow row = newSheet.getRow(0);

		// creamos una nueva fila, que es donde vamos a escribir
		XSSFRow newRow = newSheet.createRow(rowCount + 1); // para que la cree al final de la fila

		for (int i = 0; i < row.getLastCellNum(); i++) {
			// creamos una celda
			XSSFCell newCell = newRow.createCell(i);
			newCell.setCellValue(dataToWrite[i]);

		}

		// cerramos el stream
		inputStream.close();

		FileOutputStream outputStream = new FileOutputStream(file);

		newWorkbook.write(outputStream);

		// cerramos el outputStream
		outputStream.close();

	}

	// D. Creamos un metodo que nos va a permitir escribir un valor en una celda especifica
	
	public void writeCellValue(String filepath, String sheetName, int rowNumber, int cellNum, String resultText)
			throws IOException { // donde resultText es el texto que queremos escribir en esa celda especifica
		
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream); // newWorkbook es el libro de excel que recibe el inputStream
		// creamos la hoja de excel
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName); 

		// sacamos por consola el valor de la primera celda para poder ver que esta
		// pasando en nuestro codigo
		//System.out.println("first cell value is: " + firstCell.getStringCellValue());//nos envia a consola el valor de la primera celda, a modo de chequeo

		// creamos la proxima celda (columna B)
		XSSFCell lastCell = newSheet.createRow(rowNumber+1).createCell(cellNum - 1);
		lastCell.setCellValue(resultText); // el texto que queremos escribir

		System.out.println("next cell value is: " + lastCell.getStringCellValue()); //nos envia a consola el valor de la segunda celda, a modo de chequeo
        
		inputStream.close();

		// creamos un outPutStream para escribir esa informacion
		FileOutputStream outputStream = new FileOutputStream(file);

		newWorkbook.write(outputStream);
		outputStream.close();

	}

}
