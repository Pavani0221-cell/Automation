package SeleniumBasics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExport {

	public static void main(String[] args) throws Exception {
	FileOutputStream fos=new FileOutputStream("D:\\Root Folder(PS)\\Automation\\Test Data\\DataExport1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet s=wb.createSheet("Institutions");
	XSSFSheet s1=wb.createSheet("Colleges");
	XSSFRow r=s.createRow(0);
	XSSFRow r1=s.createRow(1);
	r.createCell(0).setCellValue("Quality thought");
	r.createCell(1).setCellValue("Naresh Technologies");
	r1.createCell(0).setCellValue("SV Reddy Technologies");
	r1.createCell(1).setCellValue("Ramana Soft");		
	wb.write(fos);;
	}

}
