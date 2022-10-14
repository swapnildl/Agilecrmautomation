package com.agileCrmAutomation;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	private String getFileExtention(String filePath) {

		String extention = filePath.substring(filePath.indexOf("."));
		System.out.println(extention);
		return extention;
	}

	private Workbook getWorkbookInstance(String filePath) throws IOException {

		Workbook wb;
		FileInputStream input = new FileInputStream(filePath);
		// base on the file extention, thke the conntrol of workbook
		if (getFileExtention(filePath).equals(".xlsx")) {
			wb = new XSSFWorkbook(input);
		} else {
			wb = new HSSFWorkbook(input);
		}
		return wb;

	}

	private Sheet getsheet(String filePath, String sheetName) {
		Sheet sheet = null;
		try {
			Workbook wb = getWorkbookInstance(filePath);
			sheet = wb.getSheet(sheetName);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sheet;
	}

	public Object[][] getExcelData(String filePath, String sheetName) {
		Sheet sheet = getsheet(filePath, sheetName);
		int totalRow = sheet.getPhysicalNumberOfRows();
		System.out.println(totalRow);
		int totalColumn = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(totalColumn);
		return getCellValue(sheet, totalRow, totalColumn);

	}

	private Object[][] getCellValue(Sheet sheet, int totalRows, int totalColumns) {

		Object[][] value = new Object[totalRows][totalColumns];
		for (int i = 1; i < totalRows; i++) {
			// take conntrol on rows based on the i value
			Row row = sheet.getRow(i);
			if (row != null) {
				for (int j = 0; j < totalColumns; j++) {
					// take the control oc cell using row referance

					if (row.getCell(j) != null) {
						Cell cell = row.getCell(j);
						CellType type = cell.getCellType();

						switch (type) {

						case STRING:
							value[i][j] = cell.getStringCellValue();
							break;

						case NUMERIC:
							value[i][j] = cell.getStringCellValue();
							break;

						case BOOLEAN:
							value[i][j] = cell.getStringCellValue();
							break;

						case _NONE:
							value[i][j] = null;
							break;

						case BLANK:
							value[i][j] = null;
							break;
						default:
							value[i][j] = null;
						}
					} else {
						value[i][j] = null;
					}

				}
			}
		}

		return value;
	}

	public static void main(String[] args) throws IOException {
		// File path
		String filePath = "D:\\Test cases\\AgileCrm_TestCases.xlsx";
		ExcelUtil excelValues = new ExcelUtil();
		Object[][] data = excelValues.getExcelData(filePath, "Sheet1");

		int rowLength = data.length;
		int columnLength = 2;
		for (int i = 1; i <= rowLength - 1; i++) {
			for (int j = 0; j < columnLength; j++) {
				System.out.println(data[i][j]);
				System.out.println(rowLength+ " : " +columnLength  );
			}
		}

	}
}
