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

'เปิดบราวเซอร์'
not_run: WebUI.openBrowser('')

'ขยายหน้าต่างเบราเซอร์'
not_run: WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'เข้าสู่ URL'
not_run: WebUI.navigateToUrl('http://192.168.11.59/')

'กดปุ่มเพื่อทำการ Login'
not_run: WebUI.click(findTestObject('Upload File with labelling//span_Login (1)'))

'กรอก Username'
not_run: WebUI.setText(findTestObject('Upload File with labelling/input_ng-untouched ng-pristine'), 'piew')

'กรอก Password'
not_run: WebUI.setText(findTestObject('Upload File with labelling/input_ng-untouched ng-pristine (1)'), 'piew')

'กดปุ่ม Login'
not_run: WebUI.click(findTestObject('Upload File with labelling//button_Login (1)'))

'กดเลือกเมนู Text Prediction '
WebUI.click(findTestObject('Upload File with labelling/a_Text Prediction'))

'กดเลือกเมนู Upkoad File'
WebUI.click(findTestObject('Upload File with labelling//a_Upload File (1)'))

'ตรวจสอบปุ่ม Upload ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Upload File with labelling/button_Upload (1)'), FailureHandling.CONTINUE_ON_FAILURE)

'ลองโหลดไฟล์ที่เป็นรูปภาพ'
WebUI.uploadFile(findTestObject('Upload File with labelling//input_upfile'), 'C:\\Penguins.jpg')

'รอให้ปุ่ม Upload สามารถกดได้'
WebUI.waitForElementClickable(findTestObject('Upload File with labelling//button_Upload (1)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Upload'
WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบการดำเนินการหาย'
WebUI.waitForElementClickable(findTestObject('Upload File with labelling/div_progress-bar-zone'), 10)

'ตรวจสอบการแสดง pop up สีแดง และข้อความ File Not Type of Excel'
WebUI.verifyElementPresent(findTestObject('Upload File with labelling/div_File Not Type of Excel'), 5)

'กดปุ่มปิด pop up'
WebUI.click(findTestObject('Upload File with labelling//button_'))

'รอให้ pop up สีแดง และข้อความ File Not Type of Excel หายไป'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling/div_File Not Type of Excel'), 5)

'ลองโหลดไฟล์ excel ที่ไม่ถูกรูปแบบ'
WebUI.uploadFile(findTestObject('Upload File with labelling//input_upfile'), 'C:\\test-Copy1.xlsx')

'รอให้ปุ่ม Upload สามารถกดได้'
WebUI.waitForElementClickable(findTestObject('Upload File with labelling//button_Upload (1)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Upload'
WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนกรณี API ผิดพลาด'
not_run: WebUI.click(findTestObject('Upload file without Labeling/Uploading/button_ (1)'), FailureHandling.OPTIONAL)

'เลือกประเภท sheet'
WebUI.selectOptionByIndex(findTestObject('Upload File with labelling/select_sheet'), '1', FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนปรากฎ'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/div_w3-padding-32 w3-center'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบการแสดง pop up สีแดง และข้อความ File Not Type of Excel'
WebUI.verifyElementPresent(findTestObject('Upload file without Labeling/Uploading/div_Your file is not verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Upload File with labelling/button_your file is not verified'))

'รอให้ pop up สีแดง และข้อความ File Not Type of Excel หายไป'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling/button_your file is not verified'), 5)

'ลองโหลดไฟล์ excel ที่ไม่ถูกรูปแบบ'
WebUI.uploadFile(findTestObject('Upload File with labelling/input_upfile'), 'C:\\test1.xlsx')

'รอให้ปุ่ม Upload สามารถกดได้'
WebUI.waitForElementClickable(findTestObject('Upload File with labelling//button_Upload (1)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Upload'
WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนกรณี API ผิดพลาด'
not_run: WebUI.click(findTestObject('Upload file without Labeling/Uploading/button_ (1)'), FailureHandling.OPTIONAL)

'เลือกประเภท sheet'
WebUI.selectOptionByIndex(findTestObject('Upload File with labelling/select_sheet (2)'), '1', FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนปรากฎ'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/div_w3-padding-32 w3-center'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is not verified'
WebUI.verifyElementPresent(findTestObject('Upload file without Labeling/Uploading/div_Your file is not verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Upload File with labelling/button_your file is not verified'))

'รอให้การแจ้งเตือนหายไป'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling/button_your file is not verified'), 5)

'โหลดไฟล์ Label'
WebUI.uploadFile(findTestObject('Upload File with labelling/input_upfile'), 'C:\\test.xlsx')

'รอให้ปุ่ม Upload สามารถกดได้'
WebUI.waitForElementClickable(findTestObject('Upload File with labelling//button_Upload (1)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Upload'
WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภท sheet'
WebUI.selectOptionByIndex(findTestObject('Upload File with labelling/select_sheet'), '1', FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนปรากฎขึ้นมา'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/div_w3-padding-32 w3-center'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is verified'
WebUI.verifyElementPresent(findTestObject('Upload File with labelling//div_Your file is verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปิดการแจ้งเตือน'
WebUI.click(findTestObject('Upload File with labelling/button_your file is verified'))

'รอให้การแจ้งเตือนหายไป'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling//div_w3-padding-32 w3-center'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'รอให้สัญลักษณ์เครื่องหมายถูกต้องสีเขียวแสดง'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/i_fa fa-check w3-text-green'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Preview'
WebUI.click(findTestObject('Upload File with labelling//button_Preview (1)'))

'ตรวจสอบการแสดงผลหลังจากกดปุ่ม preview'
WebUI.verifyElementPresent(findTestObject('Upload File with labelling/div_excel-reader'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ปิดหน้า preview'
WebUI.click(findTestObject('Upload File with labelling/i_fa fa-times w3-xlarge w3-tex'))

'เลื่อนหน้าต่างมายังปุ่ม Start'
WebUI.scrollToElement(findTestObject('Upload File with labelling//button_Start (1)'), 2, FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม start'
WebUI.click(findTestObject('Upload File with labelling//button_Start (1)'))

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'รอจนกว่าจะโหลดเสร็จ'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling//div_loader'), 20, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบการแสดงข้อมูลที่ predict'
WebUI.verifyElementPresent(findTestObject('Upload File with labelling/div_row'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ปิดบราวเซอร์'
not_run: WebUI.closeBrowser()

