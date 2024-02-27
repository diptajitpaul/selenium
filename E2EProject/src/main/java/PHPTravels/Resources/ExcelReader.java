package PHPTravels.Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static List<String> excelValues=new ArrayList<String>();
	public static List<String> readExcel(int rownum) throws IOException
	{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\git\\selenium\\E2EProject\\TestData.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheetAt(0);
		int lastCol=sheet.getRow(0).getLastCellNum();

			Row row=sheet.getRow(rownum);
			//String cell1=row.getCell(0).toString();
			//String cell2=row.getCell(1).toString();
			for(int column=0;column<lastCol;column++)
			{
				excelValues.add(row.getCell(column).toString());
			}
		return excelValues;
		
		
		
	}
	
	
	public static String excel(String key,int rowNum) throws Exception
	{
		String val=null;
		FileInputStream f=new FileInputStream("");
		
		Workbook wb=new HSSFWorkbook(f);
		Sheet sheet= wb.getSheetAt(0);
		int colCount=sheet.getRow(0).getLastCellNum();
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<colCount;i++)
		{
			if(sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(key))
			{
				val=sheet.getRow(rowNum).getCell(i).getStringCellValue();
			}
		}
		
		return val;
		
	}

}
