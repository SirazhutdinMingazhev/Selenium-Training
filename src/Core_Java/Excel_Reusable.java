package Core_Java;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Arrays;

public class Excel_Reusable {
    public static File f;
    public static FileInputStream fis;
    public static XSSFWorkbook wb;
    public static XSSFSheet sh;
    public static FileOutputStream fos;

    public static void readExcelSheet(String excelFilePath, String sheetName) {
        try {
            f = new File(excelFilePath); // Create an object of File class to open xlsx file
            fis = new FileInputStream(f); //Create an object of FileInputStream class to read excel file // or enter excel file path instead of (f)
            wb = new XSSFWorkbook(fis); // creating object for workbook
            sh = wb.getSheet(sheetName); // reading sheet
        }catch(Exception e){
            e.fillInStackTrace();
        }
    }

    public static void writeToExcel(String lookForSheetName, int create_Row_Index, int create_Cell_Index, String set_Cell_Value) {

        try {
            int sheet_count = wb.getNumberOfSheets();


            // retreived all sheet names and stored in an array
            String sheet_names[] = new String[sheet_count];
            for (int i = 0; i < sheet_names.length; i++) {
                sheet_names[i] = wb.getSheetAt(i).getSheetName();
            }

            // checking if desiredSheet is existing in workbook true/false
            boolean status = Arrays.stream(sheet_names).anyMatch(lookForSheetName::equals);
            //   System.out.println(dd);

            // writting values into sheet and creating new sheet if it doesn't exist
            if (status) {
                wb.getSheet(lookForSheetName).createRow(create_Row_Index).createCell(create_Cell_Index).setCellValue(set_Cell_Value);
            } else {
                wb.createSheet(lookForSheetName).createRow(create_Row_Index).createCell(create_Cell_Index).setCellValue(set_Cell_Value);
            }

            // saving entered values in excel file
            fos = new FileOutputStream(f);
            wb.write(fos); // save data in excel
            fos.close();
            wb.close();
            fis.close();
        }catch (Exception e){
            //e.fillInStackTrace();
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void enterValuesIntoExistingExcelFile(String sheetName,int rowNum, int cellNum, String set_Cell_Value){
        try {
            wb.getSheet(sheetName);

            if(sh.getRow(rowNum)!=null) {
                sh.getRow(rowNum).createCell(cellNum).setCellValue(set_Cell_Value);
            }else{
                sh.createRow(rowNum).createCell(cellNum).setCellValue(set_Cell_Value);
            }
            fos = new FileOutputStream(f);
            wb.write(fos);

            fos.close();
            wb.close();
            fis.close();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }


public static void main(String[] args) {
        readExcelSheet("/Users/sirazhutdinmingazhev/Desktop/SeleniumWorkFolder/ExcelFileForSelenium.xlsx","Sheet1");
    //writeToExcel("Sheet10",17,10,"hello");
    enterValuesIntoExistingExcelFile("Sheet1",17,15,"sky");
}
}
