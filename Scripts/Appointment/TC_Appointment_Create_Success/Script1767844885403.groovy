import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common Use/Login_As_Valid_User'), [:])

WebUI.selectOptionByLabel(findTestObject('Appointment/select_Facility', [('variable_0') : 'Tokyo CURA Healthcare Center'
            , ('variable_1') : 'Seoul CURA Healthcare Center', ('variable') : 'Hong Kong CURA Healthcare Center']), 'Seoul CURA Healthcare Center', 
    false)

WebUI.check(findTestObject('Appointment/input_Apply for hospital readmission_checkbox'))

WebUI.check(findTestObject('Appointment/input_Medicaid_radio_program_medicaid'))

WebUI.setText(findTestObject('Appointment/input_Visit Date'), '31/01/2026')

WebUI.setText(findTestObject('Appointment/textarea_Comment_txt_comment'), 'Routine checkup')

WebUI.click(findTestObject('Appointment/button_Book Appointment'))

WebUI.waitForPageLoad(10)

WebUI.verifyTextPresent('Facility', false)

