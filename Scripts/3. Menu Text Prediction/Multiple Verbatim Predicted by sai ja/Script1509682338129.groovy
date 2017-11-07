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
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

'ขยายหน้าต่างเบราเซอร์'
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'เข้าสู่ URL'
WebUI.navigateToUrl('http://192.168.11.59/', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.click(findTestObject('Page_Guru TMDA (3)/span_Login'), FailureHandling.STOP_ON_FAILURE)

'กรอก Username'
WebUI.setText(findTestObject('Page_Guru TMDA (4)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.STOP_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.click(findTestObject('Page_Guru TMDA (4)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'คลิกเมนู Text Prediction'
WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Text Prediction'), FailureHandling.STOP_ON_FAILURE)

'เลือก Upload file'
WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Upload File'), FailureHandling.STOP_ON_FAILURE)

'เลือกไฟล์ Excel'
WebUI.uploadFile(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (4)/input_upfile'), 'D:\\test-Copy.xlsx', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Upload'
WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Upload'), FailureHandling.STOP_ON_FAILURE)

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนกรณี API ผิดพลาด'
not_run: WebUI.click(findTestObject('Upload file without Labeling/Uploading/button_ (1)'), FailureHandling.OPTIONAL)

'เลือกประเภท Sheet'
WebUI.selectOptionByIndex(findTestObject('Page_Guru TMDA (5)/select_sheet'), '1')

'รอให้การแจ้งเตือนปรากฎขึ้นมา'
WebUI.waitForElementPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 10, FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is verified'
WebUI.verifyElementPresent(findTestObject('Upload file without Labeling/Uploading/div_Your file is verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (3)/button_'), FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 5, FailureHandling.STOP_ON_FAILURE)

'มีสัญลักษณ์เครื่องหมายถูกต้องสีเขียว'
WebUI.waitForElementPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (2)/i_fa fa-check w3-text-green'), 10, FailureHandling.STOP_ON_FAILURE)

'เลือกหน้าต่างมายังปุ่ม Start'
WebUI.scrollToElement(findTestObject('Page_Guru TMDA (16)/button_Start'), 2, FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Start'
WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Start'), FailureHandling.STOP_ON_FAILURE)

'รอจนกว่าการโหลดเสร็จสิ้น'
WebUI.waitForElementNotPresent(findTestObject('Upload file without Labeling/div_loader'), 60, FailureHandling.STOP_ON_FAILURE)

'รอ Select All ปรากฎ'
WebUI.waitForElementPresent(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), 7)

'Un-Check  Select all'
WebUI.click(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), FailureHandling.STOP_ON_FAILURE)

'กดสามเหลี่ยมเปิดเมนูเพิ่มเติม'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/i_fa fa-caret-right (2)'))

'ทำเครื่องหมายถูกหน้าเมนูย่อย ethic'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/label_Ethic (1)'))

'---ตรวจสอบ ethic'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_Staff Quality'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบ ethic'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI/span_Private Reason'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export (1)'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Ethic_un'))

'ทำเครื่องหมายถูกหน้าเมนูย่อย staff appearance'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Staff Appearance'))

'---ตรวจสอบ staff appearance'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI/span_Staff Quality (1)'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export02'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Staff Appearance_un'))

'กดสามเหลี่ยมเปิดเมนูเพิ่มเติม เมนู private reason'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//i_fa fa-caret-right_private'))

'ทำเครื่องหมายถูกหน้าเมนู private reason'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Private Reason'))

'---ตรวจสอบ private reason'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI/span_Private Reason (1)'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export03'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/label_Private Reason_un'))

'กดสามเหลี่ยมเปิดเมนูเพิ่มเติม เมนู timing'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/i_fa fa-caret-right_time'))

'ทำเครื่องหมายถูกหน้าเมนู timing'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Timing'))

'---ตรวจสอบ Timing'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI/span_Timing'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export04'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Timing_un'))

'ทำเครื่องหมายถูกหน้าเมนูย่อย queue time'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Queue Time'))

'---ตรวจสอบ queue time'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_Timing'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export05'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/label_Queue Time_un'))

'ทำเครื่องหมายถูกหน้าเมนูย่อย service time'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Service Time'))

'---ตรวจสอบ service time'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_Timing'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//button_Export06'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Service Time'))

'ทำเครื่องหมายถูกหน้าเมนูย่อย waiting time'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Waiting Time'))

'---ตรวจสอบ waiting time'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_Timing'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export07'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Waiting Time'))

'กดสามเหลี่ยมเปิดเมนูเพิ่มเติม เมนู competitors'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//i_fa fa-caret-right_competitors'))

'ทำเครื่องหมายถูกหน้าเมนู competitors'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Competitors'))

'---ตรวจสอบ competitors'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI/span_Competitors'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export09'))

'เอาเครื่องหมายกาถูกออก'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//label_Competitors'))

'select all'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/label_Select All'))

'---ตรวจสอบ ATM Machine'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_ATM Machine'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบ E Machine'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_E Machine'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export10'))

'เปิดหน้า 2'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//a_2'))

'---ตรวจสอบ ATM Machine'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_ATM Machine'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export10'))

'เปิดหน้า 4\r\n'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI//a_4'))

'---ตรวจสอบ E Machine'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_E Machine'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบ loan'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_Loan'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบ sms alert'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_SMS Alert'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบ mutual fund'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Multiple Prediction By SAI//span_Mutual Fund'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม export'
WebUI.click(findTestObject('Predicted in details/Multiple Prediction By SAI/button_Export10'))

WebUI.closeBrowser()

