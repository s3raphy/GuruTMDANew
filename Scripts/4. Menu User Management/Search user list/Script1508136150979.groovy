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

'เปิดเบราเซอร์'
not_run: WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

'ขยายหน้าต่าง เบราเซอร์'
not_run: WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'เข้าสู่ URL'
not_run: WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'คลิกเมนู UserManagement'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA/a_User Management'), FailureHandling.CONTINUE_ON_FAILURE)

'กรอกข้อความในช่อง Search'
WebUI.setText(findTestObject('Search user list/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'Dog1111', FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบไม่มีรายการแสดงผล'
WebUI.verifyElementNotPresent(findTestObject('Search user list//i_fa fa-pencil-square-o'), 5)

'กรอกข้อความในช่อง Search'
WebUI.setText(findTestObject('Search user list/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'Creme', FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบมีชื่ออยู่ในระบบ'
WebUI.verifyElementPresent(findTestObject('Search user list/td_Creme'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'ปิดเบราเซอร์'
not_run: WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

