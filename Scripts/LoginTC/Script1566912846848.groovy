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
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

InternalData data = findTestData(Login)

KeywordLogger log = new KeywordLogger()

log.logInfo(Login)

for (def index : (0..data.getRowNumbers() - 1)) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://www.ram.co.za/')

    WebUI.setText(findTestObject('input_Register_emailaddress'), data.internallyGetValue('Username1', index))

    WebUI.setText(findTestObject('input_Register_password'), data.internallyGetValue('Password1', index))

    WebUI.click(findTestObject('button_SUBMIT'))

    WebUI.verifyElementPresent(findTestObject('a_Demo'), 10)

    WebUI.click(findTestObject('a_Demo'))

    WebUI.closeBrowser()
}

