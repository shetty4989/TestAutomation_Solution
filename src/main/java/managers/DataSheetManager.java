package managers;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSheetManager {
    public  HashMap<String,HashMap<String,String>> dataMap = new HashMap<>();

    public  HashMap<String, HashMap<String, String>> data() {
        String filepath;
        String sheetName;
        try {
            filepath = FileReaderManager.getInstance().getConfigReader().getDataFilePath();
            FileInputStream fs = new FileInputStream(filepath);
            sheetName=FileReaderManager.getInstance().getConfigReader().getSheetName();
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            Row HeaderRow = sheet.getRow(0);
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row currentRow = sheet.getRow(i);
                HashMap<String, String> currentHashInner = new HashMap<>();
                for (int j = 1; j < currentRow.getPhysicalNumberOfCells(); j++) {
                    Cell currentCell = currentRow.getCell(j);
                    currentCell.setCellType(1);
                    currentHashInner.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
                }
                dataMap.put(currentRow.getCell(0).getStringCellValue(), currentHashInner);
            }
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataMap;
    }
}