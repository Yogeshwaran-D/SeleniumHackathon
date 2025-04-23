package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SecureCacheResponse;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI {

	public static void readSheet() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");

		// load workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// load sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// XSSFSheet sheet = workbook.getSheetAt(0);

		int row = sheet.getLastRowNum();
		
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println("No of rows : " + row);
		System.out.println("No of cols : " + col);

		for (int i = 0; i <= row; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			for (int j = 0; j < col; j++) {
				XSSFCell cell = currentRow.getCell(j);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();
	}

	public static void writeSheet() throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writeData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("Java");
		row0.createCell(1).setCellValue(1234);
		row0.createCell(2).setCellValue("Automation");
		
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("Python");
		row1.createCell(1).setCellValue(5678);
		row1.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");
		
	}
	public static void main(String[] args) {
		try {
			readSheet();
			writeSheet();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
