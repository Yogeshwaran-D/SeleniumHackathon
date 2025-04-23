package flightSearchAutomation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	// Method to write data to an Excel file
	public static void writeData(String[][] data) throws FileNotFoundException, IOException {
		// Create a FileOutputStream to write to the specified Excel file
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\TestData.xlsx");
		// Create a new workbook and sheet
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Flight Data");
		// Get the number of rows and cells from the data array
		int rowIndex = data.length;
		int cellIndex = data[0].length;
		for (int i = 0; i < rowIndex; i++) {
			// Create a new row
			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < cellIndex; j++) {
				// Create a new cell and set its value
				row.createCell(j).setCellValue(data[i][j]);
			}
		}
		// Write the workbook to the file and close the resources
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
