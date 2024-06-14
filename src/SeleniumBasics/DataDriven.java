package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("D:\\Root Folder(PS)\\Automation\\Test Data\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheet("Sheet1");
		for(int i=0;i<=s.getLastRowNum();i++)
		{
			
			String text= s.getRow(i).getCell(0).getStringCellValue();
			System.out.println("First data =" +text);
			String text2=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("First data =" +text2);
		}
		
		

	}

}
