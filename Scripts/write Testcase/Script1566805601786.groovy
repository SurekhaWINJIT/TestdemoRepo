import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel{

private  static int i=0;

@Keyword
public static void demoKey(String name,String Column_Name) throws IOException{
	FileInputStream fis = new FileInputStream("D:\\Katalon Studio\\TestData\\Katalon_DDF.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rowCount = i;
	if (Column_Name=='Credential1'){
		Row row = sheet.getRow(rowCount+1);
		Cell cell = row.createCell(2,0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(name);
	}

	if (Column_Name=='Credential2'){
		Row row2 = sheet.getRow(rowCount+1);
		Cell cell2 = row2.createCell(3,0);
		cell2.setCellType(cell2.CELL_TYPE_STRING);
		cell2.setCellValue(name);
                    i = rowCount+1;
	}

FileOutputStream fos = new FileOutputStream("D:\\KatalonStudio\\TestData\\Katalon_DDF.xlsx");
	workbook.write(fos);
	fos.close();
}
}



String Credential1 = WebUI.getText(findTestObject(‘Object_Repository/SampleProjects/Katalon_DDF/Page_Sign in Katalon Studio/Page_Sign in Katalon Studio_01/div_Enter your details below’))

CustomKeywords.‘myPack.WriteExcel.demoKey’(Credential1,‘Credential1’)

System.out.println(Credential1) //Output will be “Enter your details below”

//WebUI.scrollToElement(findTestObject(‘Object Repository/SampleProjects/Katalon_DDF/Page_About Us Katalon Studio_DDF_READ_Write/a_Company’,5))

WebUI.click(findTestObject(‘Object Repository/SampleProjects/Katalon_DDF/Page_About Us Katalon Studio_DDF_READ_Write/a_Company’))

String Credential2 = WebUI.getText(findTestObject(‘Object Repository/SampleProjects/Katalon_DDF/Page_About Us Katalon Studio_DDF_READ_Write/div_3’))

CustomKeywords.‘myPack.WriteExcel.demoKey’(Credential2,‘Credential2’)

System.out.println(Credential2)//Output will be 3K



