package demopack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcelLibrary {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("file path");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet("Sheet2");
			Row r=s.getRow(1);
			Cell c=r.getCell(0);
			String te=c.getStringCellValue();
			System.out.println(te);
			
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
