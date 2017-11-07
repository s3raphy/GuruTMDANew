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

'เปิดเบราเซอร์'
not_run: WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

'ขยายหน้าต่างเบราเซอร์'
not_run: WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'เข้าสู่ URL'
not_run: WebUI.navigateToUrl('http://192.168.11.59/', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
not_run: WebUI.click(findTestObject('Page_Guru TMDA (3)/span_Login'), FailureHandling.STOP_ON_FAILURE)

'กรอก Username'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (4)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.STOP_ON_FAILURE)

'กรอกรหัสผ่าน'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
not_run: WebUI.click(findTestObject('Page_Guru TMDA (4)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'คลิกเมนู Text Prediction'
not_run: WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Text Prediction'), FailureHandling.STOP_ON_FAILURE)

'เลือก Upload file'
not_run: WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Upload File'), FailureHandling.STOP_ON_FAILURE)

'เลือกไฟล์ Excel'
not_run: WebUI.uploadFile(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (4)/input_upfile'), 'C:\\test.xlsx', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Upload'
not_run: WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Upload'), FailureHandling.STOP_ON_FAILURE)

'รอให้แถบดำเนินการหายไป'
not_run: WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนกรณี API ผิดพลาด'
not_run: WebUI.click(findTestObject('Upload file without Labeling/Uploading/button_ (1)'), FailureHandling.OPTIONAL)

'เลือกประเภท Sheet'
not_run: WebUI.selectOptionByIndex(findTestObject('Page_Guru TMDA (5)/select_sheet'), '1')

'รอให้การแจ้งเตือนปรากฎขึ้นมา'
not_run: WebUI.waitForElementPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 
    10, FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is verified'
not_run: WebUI.verifyElementPresent(findTestObject('Upload file without Labeling/Uploading/div_Your file is verified.'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
not_run: WebUI.click(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (3)/button_'), FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนหายไป'
not_run: WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 
    5, FailureHandling.STOP_ON_FAILURE)

'มีสัญลักษณ์เครื่องหมายถูกต้องสีเขียว'
not_run: WebUI.waitForElementPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (2)/i_fa fa-check w3-text-green'), 
    10, FailureHandling.STOP_ON_FAILURE)

'เลือกหน้าต่างมายังปุ่ม Start'
not_run: WebUI.scrollToElement(findTestObject('Page_Guru TMDA (16)/button_Start'), 2, FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Start'
not_run: WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Start'), FailureHandling.STOP_ON_FAILURE)

'รอจนกว่าการโหลดเสร็จสิ้น'
not_run: WebUI.waitForElementNotPresent(findTestObject('Upload file without Labeling/div_loader'), 60, FailureHandling.STOP_ON_FAILURE)

'รอ Select All ปรากฎ'
WebUI.waitForElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/label_Select All'), 
    7)

'Un-Check  Select all'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/label_Select All'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดงรายการ Predict ไม่แสดง'
WebUI.verifyElementNotPresent(findTestObject('Upload file without Labeling/list/div_row'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Check  Select all'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/label_Select All'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Accessibility'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Accessibility'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Company Brand'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Company Brand'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Process'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Process'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Product Feature'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Product Feature'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Staff Quality'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Staff Quality'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Competitors'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/span_Competitors (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Timing'
WebUI.verifyElementPresent(findTestObject('Predicted in details/span_Timing'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Private Reason'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/span_Private Reason (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Select all'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/label_Select All'), FailureHandling.STOP_ON_FAILURE)

'Check  Accessibility'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/label_Accessibility'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Capacity'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_Capacity'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Convenience'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_Convenience'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Facility'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_Facility'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Staffing'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_Staffing'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง System'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_System'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Accessibility'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/label_Accessibility'), FailureHandling.STOP_ON_FAILURE)

'กดขยายเพื่อดูประเภท\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/i_fa fa-caret-right'))

'Check  Capacity'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/label_Capacity'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Capacity'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_Capacity'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Capacity'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/label_Capacity'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  Convenience'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/label_Convenience'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Convenience'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_Convenience (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Convenience'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/label_Convenience'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  Staffing'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/label_Staffing'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Staffing'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility//span_Staffing 1'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Staffing'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/label_Staffing'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  System'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility//label_System'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง System'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_System 1'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  System'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility//label_System'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  facility'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility//label_Facility'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง facility'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility/span_Facility (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  facility'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Accessibility//label_Facility'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  Company Brand'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand/label_Company Brand'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Advertising'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//span_Advertising (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Loyalty'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//span_Loyalty (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Credibility'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand/span_Credibility'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Company Brand'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand/label_Company Brand'), 
    FailureHandling.STOP_ON_FAILURE)

'กดขยายเพื่อดูประเภท\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand/i_fa fa-caret-right'))

'Check  Advertising'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//label_Advertising'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Advertising'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//span_Advertising 1'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Advertising'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//label_Advertising'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  Loyalty'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//label_Loyalty'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Loyalty'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//span_Loyalty 1'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Loyalty'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Company Brand//label_Loyalty'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  Process'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_Process'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Quality'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//span_Quality'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Simp'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process/span_Simplicity'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง SLA'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//span_SLA'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Process'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_Process'), FailureHandling.STOP_ON_FAILURE)

'กดขยายเพื่อดูประเภท\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//i_fa fa-caret-right'))

'Check Quality'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_Quantity'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Quality'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//span_Quality (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Quality'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_Quantity'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Simp'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_Simplicity'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Simp'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process/span_Simplicity (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Simp'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_Simplicity'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Simp'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_SLA'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Simp'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//span_SLA (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Simp'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Process//label_SLA'), FailureHandling.STOP_ON_FAILURE)

'Check  Product Feature'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Product Feature'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Dispute'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Dispute'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Ease of Use'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Ease of Use'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Privilege'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Privilege'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Promotion'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Promotion'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Variability  '
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Variability'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/a_page-link'))

'ตรวจสอบแสดง Incident '
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Incident'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Performance '
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Performance'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Fee '
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Fee'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Policy '
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/001/span_Policy'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Product Feature'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Product Feature'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//i_fa fa-caret-right'))

'Check Dispute'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Dispute'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Dispute'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/span_Dispute (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Dispute '
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Dispute'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Privilege'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Privilege'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Privilege'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//span_Privilege (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Privilege'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Privilege'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Ease of Use'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Ease of Use'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Ease of Use'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/span_Ease of Use'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Ease of Use'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Ease of Use'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Promotion'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Promotion'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Promotion'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//span_Promotion (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Promotion'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Promotion'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Variability'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Variability'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Variability'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//span_Variability (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Variability'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Variability'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Incident'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Incident'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Incident'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//span_Incident (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Incident'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Incident'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Performance'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Performance'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Performance'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//span_Performance (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Performance'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Performance'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Fee'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Fee'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Fee'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//span_Fee (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Fee'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Fee'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Policy'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Policy'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Policy'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature/span_Policy (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Policy'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Prodyct Feature//label_Policy'), 
    FailureHandling.STOP_ON_FAILURE)

'Check  Product Feature'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Staff Quality'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Communication skill+Knowledge\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_Communication skillKnowle'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Manner+Service'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_MannerService'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Take Ownership\r\n\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_Take Ownership'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Force Sale\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_Force Sale'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Ethic'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality/span_Ethic'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality/a_page-link'))

'ตรวจสอบแสดง Staff Appearance\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_Staff Appearance (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check  Product Feature'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Staff Quality'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality/i_fa fa-caret-right'))

'Check Communication skill+Knowledge\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Communication SkillKnowl'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Communication skill+Knowledge\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_Communication skillKnowle (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Communication skill+Knowledge\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Communication SkillKnowl'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Manner+Service\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_ServiceManner'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Manner+Service\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_MannerService (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Manner+Service\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_ServiceManner'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Take Ownership\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Take Ownership'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Take Ownership\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//span_Take Ownership (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Take Ownership\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Take Ownership'), 
    FailureHandling.STOP_ON_FAILURE)

'Check Force Sale\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Force Sale'), 
    FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Force Sale\r\n'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality/span_Force Sale (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Un-Check Force Sale\r\n'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/Staff Quality//label_Force Sale'), 
    FailureHandling.STOP_ON_FAILURE)

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

'ปิดเบราเซอร์'
not_run: WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

