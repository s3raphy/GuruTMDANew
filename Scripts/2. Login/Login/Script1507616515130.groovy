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
not_run: WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

'ขยายหน้าต่างเบราเซอร์'
not_run: WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'เข้าสู่ URL'
not_run: WebUI.navigateToUrl('192.168.11.59', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม login'
WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.STOP_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '1234', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือน Username is not null'
WebUI.verifyElementPresent(findTestObject('Login/div_Username is not null.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอก Username '
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'Cremeee', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือน User Not Found'
WebUI.verifyElementPresent(findTestObject('Login/div_User Not Found'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอก Username'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'bbb', FailureHandling.STOP_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'bbb', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือน User Not Activate'
WebUI.verifyElementPresent(findTestObject('Login/div_User Not Activate'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอก Username'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'Creme', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความรหัสผ่าน'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความรหัสผ่าน'
WebUI.sendKeys(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือน Password is not null'
WebUI.verifyElementPresent(findTestObject('Login/div_Password is not null.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '55555', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือน Incorrect Password\r\n'
WebUI.verifyElementPresent(findTestObject('Login/div_Incorrect Password'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '1234', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบว่ามีเมนู Help หลังจาก Login สำเร็จ'
WebUI.verifyElementPresent(findTestObject('Page_Guru TMDA (7)/a_Help'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'ปิดเบราเซอร์'
not_run: WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

