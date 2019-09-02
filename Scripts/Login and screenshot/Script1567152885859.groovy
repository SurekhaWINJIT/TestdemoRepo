import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.ram.co.za/')

WebUI.click(findTestObject('Object Repository/ClickMenu/Page_RAM - Home Page/a_Login'))

WebUI.takeScreenshot('Screenshot/Login.png')

WebUI.setText(findTestObject('Object Repository/ClickMenu/Page_RAM - Home Page/input_Register_emailaddress'), 'demo123@gmail.com')


WebUI.takeScreenshot('Screenshot/Username.png')

WebUI.setText(findTestObject('Object Repository/ClickMenu/Page_RAM - Home Page/input_Register_password'), 'demo@123')

WebUI.takeScreenshot('Screenshot/Password.png')

WebUI.click(findTestObject('Object Repository/ClickMenu/Page_RAM - Home Page/button_SUBMIT'))


WebUI.takeScreenshot('Screenshot/Logged_in.png')






