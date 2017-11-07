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

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'กดปุ่ม User'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_User'))

'เลือก Admin'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_ADMIN'))

'กดปุ่ม Deactivated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED'))

'เลือก Activated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_ACTIVATED'))

'Refresh page'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'ตรวจสอบปุ่ม User ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/button_User'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบปุ่ม Deactivated ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม User'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_User'))

'เลือก Admin'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_ADMIN'))

'Refresh page'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'ตรวจสอบปุ่ม User ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/button_User'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบปุ่ม Deactivated ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Deactivated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED'))

'เลือก Activated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_ACTIVATED'))

'Refresh page'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'ตรวจสอบบทบาท User ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/button_User'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบสถานะ Deactivated ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม User'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_User'))

'เลือก Admin'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_ADMIN'))

'กดปุ่ม Deactivated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED'))

'เลือก Activated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_ACTIVATED'))

'กดปุ่ม Submit'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_SUBMIT'))

'ตรวจสอบการแจ้งเตือน User management Successful'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/div_User Management Successful'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_'))

'Refresh page'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'ตรวจสอบบทบาทเปลี่ยนเป็น Admin'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/button_Admin (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบสถานะเปลี่ยนเป็น Activated'
WebUI.verifyElementPresent(findTestObject('Chage status/Page_Guru TMDA (2)/button_ACTIVATED (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Admin'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_Admin (1)'))

'เลือก User'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_USER (1)'))

'กดปุ่ม Submit'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_SUBMIT'))

'ตรวจสอบการแจ้งเตือน User management Successful'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/div_User Management Successful'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_'))

'Refresh page'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'ตรวจสอบบทบาทเปลี่ยนเป็น User'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/button_User'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบสถานะ Activated ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Chage status/Page_Guru TMDA (2)/button_ACTIVATED (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Activated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_ACTIVATED (1)'))

'เลือก Deactivated'
WebUI.click(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED (1)'))

'กดปุ่ม Submit'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_SUBMIT'))

'ตรวจสอบการแจ้งเตือน User management Successful'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/div_User Management Successful'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Change role/Page_Guru TMDA (2)/button_'))

'Refresh page'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'ตรวจสอบบทบาท User ยังคงเดิม'
WebUI.verifyElementPresent(findTestObject('Change role/Page_Guru TMDA (2)/button_User'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบสถานะเปลี่ยนเป็น Deactivated '
WebUI.verifyElementPresent(findTestObject('Chage status/Page_Guru TMDA (2)/button_DEACTIVATED'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ปิดเบราเซอร์'
not_run: WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

