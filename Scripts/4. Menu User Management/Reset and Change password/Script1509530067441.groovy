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
not_run: WebUI.openBrowser('')

'ขยายหน้าต่างเบราเซอร์'
not_run: WebUI.maximizeWindow()

'เข้าสู่ URL'
not_run: WebUI.navigateToUrl('192.168.11.59')

'Login'
not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

'Login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'Creme')

'Login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '1234')

'Login'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

'เลือกเมนู User management'
WebUI.click(findTestObject('reset password//a_User Management (1)'))

'กรอกข้อความในช่องค้นหา'
WebUI.setText(findTestObject('Edit user profile/list/input_ng-untouched ng-valid ng'), 'Do not change')

'กดปุ่มแก้ไข Profile'
WebUI.click(findTestObject('reset password//i_fa fa-pencil-square-o (1)'))

'คลิกลิ้ง Reset password'
WebUI.click(findTestObject('reset password//a_Reset Password (1)'))

'กดปุ่ม Yes'
WebUI.click(findTestObject('reset password//button_Yes (1)'))

'รอให้หน้าต่างคอนเฟิมปิดไป'
WebUI.waitForElementNotPresent(findTestObject('reset password/img_w3-center'), 5)

'กดรุปโปรไฟล์มุมด้านบนขวา'
WebUI.click(findTestObject('reset password//img_Profile (1)'))

'กดปุ่ม Logout'
WebUI.click(findTestObject('reset password//button_LOGOUT (1)'))

'Login'
WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

'Login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'Creme')

'Login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'Creme')

'Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

'ตรวจสอบเมนูปรากฎหลังเข้าสู่ระบบเสร็จสิ้น'
WebUI.verifyElementPresent(findTestObject('reset password//a_Help (1)'), 5)

'กดรุปโปรไฟล์มุมด้านบนขวา'
WebUI.click(findTestObject('reset password/img_Profile (1)'))

'กดลิ้ง Edit profile'
WebUI.click(findTestObject('reset password//span_Edit Profile (1)'))

'กรอกรหัสผ่านเดิม'
WebUI.setText(findTestObject('reset password//input_old_password (1)'), 'Creme')

'กรอกรหัสผ่านใหม่'
WebUI.setText(findTestObject('reset password//input_new_password (1)'), '1234')

'กรอกยืนยันรหัสผ่าน'
WebUI.setText(findTestObject('reset password//input_cf_password (1)'), '1234')

'กดปุ่ม Submit'
WebUI.click(findTestObject('reset password//button_SUBMIT (1)'))

'ยืนยันการแจ้งเตือน Edit Profile Successful'
WebUI.verifyElementPresent(findTestObject('reset password//div_Edit Profile Successful. (1)'), 5)

'ปิดหน้าต่างแจ้งเตือน'
WebUI.click(findTestObject('reset password//button_ Closing Edit successful (1)'))

'กดรุปโปรไฟล์มุมด้านบนขวา'
WebUI.click(findTestObject('reset password//img_Profile (1)'))

'กดปุ่ม Logout'
WebUI.click(findTestObject('reset password//button_LOGOUT (1)'))

'Login'
WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

'Login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'Creme')

'Login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '1234')

'Login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

'ตรวจสอบเมนูปรากฎหลังเข้าสู่ระบบเสร็จสิ้น'
WebUI.verifyElementPresent(findTestObject('reset password//a_Help (1)'), 5)

not_run: WebUI.closeBrowser()

