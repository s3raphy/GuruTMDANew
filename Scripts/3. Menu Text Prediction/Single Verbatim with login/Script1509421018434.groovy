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

not_run: WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Predict'
WebUI.click(findTestObject('Page single/Page_Guru TMDA/button_btn btn-link'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือน Verbatim is not null'
WebUI.verifyElementPresent(findTestObject('single verbatim with login/span_Verbatim is not null'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกข้อความ Predict'
WebUI.setText(findTestObject('Page_Guru TMDA (2)/input_input-text w3-large inpu'), 'บริการดีแต่รอคิวนาน', FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Predict'
WebUI.click(findTestObject('Page single/Page_Guru TMDA/button_btn btn-link'), FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบผลลัพธ์ Predict บรรทัดที่ 1'
WebUI.verifyElementPresent(findTestObject('Page_Guru TMDA (2)/div_row'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบผลลัพธ์ Predict บรรทัดที่ 2'
WebUI.verifyElementPresent(findTestObject('Page_Guru TMDA (2)/div_predict-result'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกข้อความ Predict'
WebUI.setText(findTestObject('Page_Guru TMDA (2)/input_input-text w3-large inpu'), 'โคยยยยย', FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม predict'
WebUI.click(findTestObject('single verbatim with login//button_btn btn-link'))

'ตรวจสอบผลลัพธ์ Predict บรรทัดที่ 2'
WebUI.verifyElementPresent(findTestObject('Page_Guru TMDA (2)/div_predict-result'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบผลลัพธ์ critical'
WebUI.verifyElementPresent(findTestObject('single verbatim with login/img'), 20, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

