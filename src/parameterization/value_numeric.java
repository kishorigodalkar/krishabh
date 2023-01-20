package parameterization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class value_numeric {

	public static void main(String[] args) throws Throwable {
	FileInputStream file = new FileInputStream("C:\\Users\\user\\Documents\\numeric.xlsx");
	double data = WorkbookFactory.create(file).getSheet("sheet2").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(data);
	}

}
