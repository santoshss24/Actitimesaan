package libraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellibrary {

	public static String getValue(String path,String sheetName,int r,int c)
	{
		String value=" ";
		try {
			FileInputStream fin=new FileInputStream(path);
			 Workbook wb = WorkbookFactory.create(fin);
			 value=wb.getSheet(sheetName).getRow(r).getCell(c).getStringCellValue();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	public static Object[][] getExcelData(String path,String sheetName)
	{
		Object[][]arr=null;
		try {
			FileInputStream fin=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fin);
			int rows = wb.getSheet(sheetName).getPhysicalNumberOfRows();
			 arr=new Object[rows][3];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < wb.getSheet(sheetName).getRow(i).getPhysicalNumberOfCells(); j++) {
					arr[i][j]=wb.getSheet(sheetName).getRow(i).getCell(j).toString();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return arr;
		
	}
}
