package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static XSSFWorkbook workbook = new XSSFWorkbook();
	public static XSSFSheet sheet = workbook.createSheet("BeCognizantHeaderPage");
	public static XSSFRow headerRow = sheet.createRow(0);

	public static XSSFSheet ethicsSheet = workbook.createSheet("EthicsAndCompliance");
	public static XSSFRow ethicsHeaderRow = sheet.createRow(0);

	private static void setHeaderRowStyle(XSSFRow headerRow, int colIndex, String headerText) {
		CellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		Font font = workbook.createFont();
		font.setColor(IndexedColors.WHITE.getIndex());
		style.setFont(font);

		headerRow.createCell(colIndex).setCellValue(headerText);
		headerRow.getCell(colIndex).setCellStyle(style);
	}

	public static void writeUserDetails(List<String> userDetails, String filepath) {

		try {
			headerRow = sheet.getRow(0);
			// Write user details in excel sheet
			setHeaderRowStyle(headerRow, 0, "User Details");

			for (int i = 0; i < userDetails.size(); i++) {
				XSSFRow row = sheet.createRow(i + 1);

				// use cell index 0 to write in the first column
				row.createCell(0).setCellValue(userDetails.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeCompanyHeaderFeatures(List<String> companyHeaderData, String filepath) {
		try {
			// Assuming the sheet is already created
			headerRow = sheet.getRow(0);
			setHeaderRowStyle(headerRow, 1, "Company Header Features");

			for (int i = 0; i < companyHeaderData.size(); i++) {
				XSSFRow row = sheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = sheet.createRow(i + 1);
				}

				// use cell index 1 to write in the second column
				row.createCell(1).setCellValue(companyHeaderData.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeServiceLineHeaderFeatures(List<String> serviceLineHeaderData, String filepath) {
		try {
			// Assuming the sheet is already created
			headerRow = sheet.getRow(0);
			setHeaderRowStyle(headerRow, 2, "Service Line Header Features");

			for (int i = 0; i < serviceLineHeaderData.size(); i++) {
				XSSFRow row = sheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = sheet.createRow(i + 1);
				}

				// use cell index 2 to write in the third column
				row.createCell(2).setCellValue(serviceLineHeaderData.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeSubServiceLineHeaderFeatures(List<List<String>> subServiceLineHeaderData, String filepath) {
		try {
			// Assuming the sheet is already created
			headerRow = sheet.getRow(0);
			setHeaderRowStyle(headerRow, 2, "Service Line Header Features");

			for (int i = 0; i < subServiceLineHeaderData.get(0).size(); i++) {
				XSSFRow row = sheet.getRow(i + 12);

				if (row == null) {
					row = sheet.createRow(i + 12);
				}

				row.createCell(2).setCellValue(subServiceLineHeaderData.get(0).get(i));
			}

			for (int i = 0; i < subServiceLineHeaderData.get(1).size(); i++) {
				XSSFRow row = sheet.getRow(i + 17);

				if (row == null) {
					row = sheet.createRow(i + 17);
				}

				row.createCell(2).setCellValue(subServiceLineHeaderData.get(1).get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeSalesResourcesHeaderFeatures(List<String> salesresourcesHeaderData, String filepath) {
		try {
			// Assuming the sheet is already created
			headerRow = sheet.getRow(0);
			setHeaderRowStyle(headerRow, 3, "SalesResources Header Features");

			for (int i = 0; i < salesresourcesHeaderData.size(); i++) {
				XSSFRow row = sheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = sheet.createRow(i + 1);
				}

				// use cell index 3 to write in the fourth column
				row.createCell(3).setCellValue(salesresourcesHeaderData.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeMartketandCountryHeaderFeatures(List<String> marketAndCountryHeaderData,
			List<List<String>> subMarketAndCountryHeaderData, String filepath) {
		try {
			// Assuming the sheet is already created
			headerRow = sheet.getRow(0);

			// Write MarketandCountryHeaderData in cell number 4
			setHeaderRowStyle(headerRow, 4, "MarketandCountry Header Features");

			for (int i = 0; i < marketAndCountryHeaderData.size(); i++) {
				XSSFRow row = sheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = sheet.createRow(i + 1);
				}

				// use cell index 4 to write in the fifth column
				row.createCell(4).setCellValue(marketAndCountryHeaderData.get(i));
			}

			// Write SubMartketandCountryHeaderFeatures in cell number 4
			int rowIndex = marketAndCountryHeaderData.size() + 1; // Start index for submarketAndCountriesData

			for (List<String> sublist : subMarketAndCountryHeaderData) {
				for (int j = 0; j < sublist.size(); j++) {
					XSSFRow row = sheet.getRow(rowIndex);

					// if row doesn't exist, create a new one
					if (row == null) {
						row = sheet.createRow(rowIndex);
					}
					row.createCell(4).setCellValue(sublist.get(j));
					rowIndex++;
				}
				XSSFRow emptyRow = sheet.createRow(rowIndex);
				rowIndex++;
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeCorporateHeaderFeatures(List<String> CorporateHeaderData,
			List<List<String>> subCorporateHeaderData, String filepath) {
		try {
			// Assuming the sheet is already created
			headerRow = sheet.getRow(0);
			setHeaderRowStyle(headerRow, 5, "CorporateFunctions Header Features");

			for (int i = 0; i < CorporateHeaderData.size(); i++) {
				XSSFRow row = sheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = sheet.createRow(i + 1);
				}

				// use cell index 5 to write in the sixth column
				row.createCell(5).setCellValue(CorporateHeaderData.get(i));
			}

			// Write subCorporateHeaderFeatures in cell number 5
			int rowIndex = CorporateHeaderData.size() + 1; // Start index for submarketAndCountriesData

			for (List<String> sublist : subCorporateHeaderData) {
				for (int j = 0; j < sublist.size(); j++) {
					XSSFRow row = sheet.getRow(rowIndex);

					// if row doesn't exist, create a new one
					if (row == null) {
						row = sheet.createRow(rowIndex);
					}
					row.createCell(5).setCellValue(sublist.get(j));
					rowIndex++;
				}
				XSSFRow emptyRow = sheet.createRow(rowIndex);
				rowIndex++;
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writePeopleHeaderFeatures(List<String> PeopleHeaderData, String filepath) {
		try {
			// Assuming the sheet is already created
			headerRow = sheet.getRow(0);
			setHeaderRowStyle(headerRow, 6, "People Header Features");

			for (int i = 0; i < PeopleHeaderData.size(); i++) {
				XSSFRow row = sheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = sheet.createRow(i + 1);
				}

				// use cell index 6 to write in the seventh column
				row.createCell(6).setCellValue(PeopleHeaderData.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				sheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Ethics and Compliance Implementation

	public static void writeEthicsAndComplianceDetails(List<String> directorDetails, String filepath) {
		try {
			// Assuming the sheet is already created
			ethicsHeaderRow = ethicsSheet.createRow(0);
			setHeaderRowStyle(ethicsHeaderRow, 0, "Director Details");

			for (int i = 0; i < directorDetails.size(); i++) {
				XSSFRow row = ethicsSheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = ethicsSheet.createRow(i + 1);
				}

				row.createCell(0).setCellValue(directorDetails.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < ethicsHeaderRow.getLastCellNum(); i++) {
				ethicsSheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeAllResourcesLink(List<String> resourcesLink, String filepath) {
		try {
			// Assuming the sheet is already created
			ethicsHeaderRow = ethicsSheet.getRow(0);
			setHeaderRowStyle(ethicsHeaderRow, 1, "Resources Link");

			for (int i = 0; i < resourcesLink.size(); i++) {
				XSSFRow row = ethicsSheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = ethicsSheet.createRow(i + 1);
				}

				row.createCell(1).setCellValue(resourcesLink.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < ethicsHeaderRow.getLastCellNum(); i++) {
				ethicsSheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeBUSpecificRisk(List<String> buSpecificRisk, String filepath) {
		try {
			// Assuming the sheet is already created
			ethicsHeaderRow = ethicsSheet.getRow(0);
			setHeaderRowStyle(ethicsHeaderRow, 2, "BU Specific Risks");

			for (int i = 0; i < buSpecificRisk.size(); i++) {
				XSSFRow row = ethicsSheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = ethicsSheet.createRow(i + 1);
				}

				row.createCell(2).setCellValue(buSpecificRisk.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < ethicsHeaderRow.getLastCellNum(); i++) {
				ethicsSheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeEthicsAndComplianceRisk(List<String> ethicsComplianceRisk, String filepath) {
		try {
			// Assuming the sheet is already created
			ethicsHeaderRow = ethicsSheet.getRow(0);
			setHeaderRowStyle(ethicsHeaderRow, 3, "Ethics And Compliance Risks");

			for (int i = 0; i < ethicsComplianceRisk.size(); i++) {
				XSSFRow row = ethicsSheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = ethicsSheet.createRow(i + 1);
				}

				row.createCell(3).setCellValue(ethicsComplianceRisk.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < ethicsHeaderRow.getLastCellNum(); i++) {
				ethicsSheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}