package parameterization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Valueby_string {

	public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream("C:\\Users\\user\\Documents\\Book1string.xlsx");
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		//String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		// System.out.println(data);
	}

}