package ExcelDataSetHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Creamos una clase para leer de un archivo excel 

public class ReadExcelFile {

	public ReadExcelFile() {

	}

	// A. creamos un metodo que nos permita leer toda una hoja de Excel. Fila por fila y sus 
	// correspondientes celdas.
	// filepath: source del excel, sheetName: Nombre de la hoja del libro de excel
	public Integer readExcel(String filepath, String sheetName,String cadenaComparacion) throws IOException {
		//Creamos un objeto de tipo File
		File file = new File(filepath);

		// Creamos el inputStream donde se encuentra los datos del archivo que pasamos
		FileInputStream inputStream = new FileInputStream(file);

		// Creamos el objeto donde vamos a guardar el libro de excel. Con el inputStream el cual tiene todos los datos del archivo que cargamos
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);

		// Creamos el objeto donde vamos a guardar la hoja con la que estamos trabajamos
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);

		// Guardamos cuantas filas de datos tiene este excel
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

		//Iteramos Filas y dentro de las filas las celdas correspondientes
		for (int i = 0; i <= rowCount; i++) {
			// El Objeto fila (row) lee fila por fila:
			XSSFRow row = newSheet.getRow(i);
			// En cada orw leemos las celdas
			for (int j = 0; j < row.getLastCellNum(); j++) { // getLastCellNum() cantidad de celdas que tiene una fila
				if(row.getCell(j).getStringCellValue().equals(cadenaComparacion))
					return j;
			}

		}
		return 0;
	}

	public Integer lastRow(String filepath, String sheetName) throws IOException {
		//Creamos un objeto de tipo File
		File file = new File(filepath);

		// Creamos el inputStream donde se encuentra los datos del archivo que pasamos
		FileInputStream inputStream = new FileInputStream(file);

		// Creamos el objeto donde vamos a guardar el libro de excel. Con el inputStream el cual tiene todos los datos del archivo que cargamos
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);

		// Creamos el objeto donde vamos a guardar la hoja con la que estamos trabajamos
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);

		// Guardamos cuantas filas de datos tiene este excel
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

		return rowCount;
	}
	public Integer randomRow(String filepath, String sheetName) throws IOException {
		Random claseRandom = new Random();
		//Creamos un objeto de tipo File
		File file = new File(filepath);

		// Creamos el inputStream donde se encuentra los datos del archivo que pasamos
		FileInputStream inputStream = new FileInputStream(file);

		// Creamos el objeto donde vamos a guardar el libro de excel. Con el inputStream el cual tiene todos los datos del archivo que cargamos
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);

		// Creamos el objeto donde vamos a guardar la hoja con la que estamos trabajamos
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);

		// Guardamos cuantas filas de datos tiene este excel
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

		return claseRandom.nextInt(rowCount);
	}

	public Integer randomCell(String filepath, String sheetName) throws IOException {
		Random claseRandom = new Random();
		//Creamos un objeto de tipo File
		File file = new File(filepath);

		// Creamos el inputStream donde se encuentra los datos del archivo que pasamos
		FileInputStream inputStream = new FileInputStream(file);

		// Creamos el objeto donde vamos a guardar el libro de excel. Con el inputStream el cual tiene todos los datos del archivo que cargamos
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);

		// Creamos el objeto donde vamos a guardar la hoja con la que estamos trabajamos
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);

		// Guardamos cuantas filas de datos tiene este excel
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

		int randomRow = claseRandom.nextInt(rowCount);

		XSSFRow row = newSheet.getRow(randomRow);

		int randomCell = claseRandom.nextInt(1)+1;

		XSSFCell cell = row.getCell(randomCell);

		return randomCell;
	}



	// B. Lee el valor especifico de una celda  
	
	public String getCellValue(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException {
		//creamos un archivo
		File file = new File(filepath);
		
		//creamos un inputStream para poder leer los datos del archivo
		FileInputStream inputStream = new FileInputStream(file);
		
		//creamos el libro de excel, le pasamos el inputStream
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		//creamos la hoja y le pasamos el nombre de la hoja que viene por parametro
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		//Creamos una row en la hoja de calculos
		//Leemos una row especifica y se la asignamos a row
		XSSFRow row = newSheet.getRow(rowNumber); 
		
		//Creamos la celda en base a la row creada previamente y pasando el nro de celda por parametro
		XSSFCell cell = row.getCell(cellNumber);
		
		//Devolvemos el valor de esa celda
		return cell.getStringCellValue();
	}
	
	
	
	
	
	
	
	
	
	
	

}
