import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("./Data/Demo.xlsx"));
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		for (int row = 0; row < rowcount; row++) {
			for (int col = 0; col < firstRow.getLastCellNum(); col++) {
				Cell c1 = sh.getRow(row).getCell(col);
				System.out.println(c1);
			}
		}

	}

}
