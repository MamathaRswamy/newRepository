package testNGproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderExtra {
public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	String Data() throws EncryptedDocumentException, IOException{
	File abspath=new File("./resource/TestData.xlsx");
	FileInputStream fis=new FileInputStream(abspath);
	
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Sheet1");
	
	int noOfRows = sheet.getPhysicalNumberOfRows();
	int noOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
	String[] [ ] sarr=new String[noOfRows][noOfCells];
	for(int i=0;i<noOfRows;i++) {
		for(int j=0;j<noOfCells;j++) {
			sarr[i][j]=sheet.getRow(i).getCell(j).toString();
		}
	}
	for(String [] arr:sarr) {
		for(String value:arr) {
			return value;
		}
		System.out.println();
	}
	return null;	
}}
}
