package parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class boolean_value {

	public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream("C:\\Users\\user\\Documents\\boolean.xlsx");
		boolean data = WorkbookFactory.create(file).getSheet("sheet3").getRow(0).getCell(0).getBooleanCellValue();
		System.out.println(data);
	}
}
