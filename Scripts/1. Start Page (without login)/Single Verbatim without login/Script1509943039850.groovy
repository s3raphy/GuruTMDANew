import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.11.59/')

'กดปุ่ม Predict'
WebUI.click(findTestObject('Single verbatim without login//i_fa fa-location-arrow w3-text (1)'))

'ยืนยันข้อความแจ้งเตือน Verbatim is not null'
WebUI.verifyElementPresent(findTestObject('single verbatim with login/span_Verbatim is not null'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกข้อความ predict'
WebUI.setText(findTestObject('Single verbatim without login/input_input-text w3-large inpu'), 'บริการดีแต่รอคิวนาน')

'กดปุ่ม Predict'
WebUI.click(findTestObject('Single verbatim without login//i_fa fa-location-arrow w3-text (1)'))

'ตรวจสอบผลลัพธ์ Predict '
WebUI.verifyElementPresent(findTestObject('Single verbatim without login//div_predict-result'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบผลลัพธ์ Predict '
WebUI.verifyElementPresent(findTestObject('Single verbatim without login//div_row'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกข้อความ predict ที่เป็นคำหยาบ'
WebUI.setText(findTestObject('Single verbatim without login/input_input-text w3-large inpu'), 'โคยยยยย')

'กดปุ่ม Predict'
WebUI.click(findTestObject('Single verbatim without login//i_fa fa-location-arrow w3-text (1)'))

'ตรวจสอบผลลัพธ์ Predict '
WebUI.verifyElementPresent(findTestObject('Single verbatim without login//div_predict-result (1)'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบผลลัพธ์ critical'
WebUI.verifyElementPresent(findTestObject('single verbatim with login/img'), 20, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.closeBrowser()

