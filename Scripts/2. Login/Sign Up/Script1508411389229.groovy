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

'ขยายหน้าต่างเบราเซอร์'
not_run: WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'เข้าสู่ URL'
not_run: WebUI.navigateToUrl('http://192.168.11.59/', FailureHandling.CONTINUE_ON_FAILURE)

'คลิกปุ่ม Login'
WebUI.click(findTestObject('signup/start/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'เลื่อนหน้าต่างมายังปุ่ม Sign Up'
WebUI.scrollToElement(findTestObject('signup/login/a_Sign Up'), 3, FailureHandling.CONTINUE_ON_FAILURE)

'คลิกปุ่ม Sign Up'
WebUI.click(findTestObject('signup/login/a_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'เก็บเวลาปัจุบันของเครื่อง'
Date date = new Date()

'เก็บเวลาปัจุบันของเครื่อง'
java.text.SimpleDateFormat df = new java.text.SimpleDateFormat()

'เก็บเวลาปัจุบันของเครื่อง'
df.applyPattern('ddmmyyyyHHmmss')

'กรอก Username'
WebUI.setText(findTestObject('signup/signup/input_username'), 'Creme', FailureHandling.STOP_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('signup/signup/input_password'), '1234', FailureHandling.STOP_ON_FAILURE)

'กรอกยืนยันรหัสผ่าน'
WebUI.setText(findTestObject('signup/signup/input_cfpassword'), '1234', FailureHandling.STOP_ON_FAILURE)

'กรอกชื่อ'
WebUI.setText(findTestObject('signup/signup/input_first_name'), 'Piratchana', FailureHandling.STOP_ON_FAILURE)

'กรอกนามสกุล'
WebUI.setText(findTestObject('signup/signup/input_last_name'), 'Maksub', FailureHandling.STOP_ON_FAILURE)

'กรอกอีเมล'
WebUI.setText(findTestObject('signup/signup/input_email'), 'Cprcn@gmail.com', FailureHandling.STOP_ON_FAILURE)

'เลือกคำถาม'
WebUI.selectOptionByValue(findTestObject('signup/signup/select_question'), '1', true, FailureHandling.STOP_ON_FAILURE)

'กรอกคำตอบ'
WebUI.setText(findTestObject('signup/signup/input_answer'), 'Dog', FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'เลือกรูปภาพจากเครื่อง'
WebUI.uploadFile(findTestObject('signup/signup/input_file-input'), 'C:\\Penguins.jpg', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความ Username'
WebUI.setText(findTestObject('signup/signup/input_username'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความ Username'
WebUI.sendKeys(findTestObject('signup/signup/input_username'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Username ว่าง'
WebUI.verifyElementPresent(findTestObject('signup/signup/Required/div_Username is required.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอก Username'
WebUI.setText(findTestObject('signup/signup/input_username'), 'Creme', FailureHandling.STOP_ON_FAILURE)

'รอให้ปุ่ม Sign Up สามารถคลิกได้'
WebUI.waitForElementClickable(findTestObject('signup/signup//button_Sign Up'), 5)

'คลิกปุ่ม Sign Up'
WebUI.click(findTestObject('signup/signup/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

'ยืนยันการแจ้งเตือน Pop up'
WebUI.verifyElementPresent(findTestObject('signup/signup//div_Username is existing accou'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'คลิกปุ่มปิด Pop up แจ้งเตือน'
WebUI.click(findTestObject('signup/signup//button_'), FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความ Password'
WebUI.setText(findTestObject('signup/signup/input_password'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความ Password'
WebUI.sendKeys(findTestObject('signup/signup/input_password'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Password ว่าง'
WebUI.verifyElementPresent(findTestObject('signup/signup/Required/div_Password is required.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('signup/signup/input_password'), '1234', FailureHandling.STOP_ON_FAILURE)

'กรอกยืนยันรหัสผ่านไม่ให้ตรงกันกับช่องรหัสผ่าน'
WebUI.setText(findTestObject('signup/signup/input_cfpassword'), '54321', FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือนรหัสผ่านไม่ตรงกันกับยืนยันรหัสผ่าน'
WebUI.verifyElementPresent(findTestObject('signup/signup/div_Password and Confirm Passw'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'ลบข้อความในกล่องข้อความยืนยันรหัสผ่าน'
WebUI.setText(findTestObject('signup/signup/input_cfpassword'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความยืนยันรหัสผ่าน'
WebUI.sendKeys(findTestObject('signup/signup/input_cfpassword'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือนรหัสผ่านไม่ตรงกันกับยืนยันรหัสผ่าน'
WebUI.verifyElementPresent(findTestObject('signup/signup/div_Password and Confirm Passw'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกยืนยันรหัสผ่านให้ตรงกันกับช่องรหัสผ่าน'
WebUI.setText(findTestObject('signup/signup/input_cfpassword'), '1234', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความชื่อ'
WebUI.setText(findTestObject('signup/signup/input_first_name'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความชื่อ'
WebUI.sendKeys(findTestObject('signup/signup/input_first_name'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Firstname ว่าง'
WebUI.verifyElementPresent(findTestObject('signup/signup/Required/div_Firstname is required.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกชื่อเป็นตัวเลข'
WebUI.setText(findTestObject('signup/signup/input_first_name'), '55555', FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Firstname ไม่สามารถกรอกตัวเลขได้'
WebUI.verifyElementPresent(findTestObject('signup/signup//div_Firstname is not pattern.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกชื่อ'
WebUI.setText(findTestObject('signup/signup/input_first_name'), 'Piratchana', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความนามสกุล'
WebUI.setText(findTestObject('signup/signup/input_last_name'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความนามสกุล'
WebUI.sendKeys(findTestObject('signup/signup/input_last_name'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Lastname ว่าง'
WebUI.verifyElementPresent(findTestObject('signup/signup/Required/div_Lastname is required.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกรหัสผ่านเป็นตัวเลข'
WebUI.setText(findTestObject('signup/signup/input_last_name'), '55555', FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Lastname ไม่สามารถกรอกตัวเลขได้'
WebUI.verifyElementPresent(findTestObject('signup/signup//div_Lastname is not pattern.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกนามสกุล'
WebUI.setText(findTestObject('signup/signup/input_last_name'), 'Maksub', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความอีเมล'
WebUI.setText(findTestObject('signup/signup/input_email'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความอีเมล'
WebUI.sendKeys(findTestObject('signup/signup/input_email'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Email ว่าง'
WebUI.verifyElementPresent(findTestObject('signup/signup/Required/div_Email is required.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอก Email ไม่มี @'
WebUI.setText(findTestObject('signup/signup/input_email'), 'Cprcnnnnnn', FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันข้อความแจ้งเตือนรูปแบบ Email ผิดพลาด'
WebUI.verifyElementPresent(findTestObject('signup/signup//div_Email is not pattern.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอก Email'
WebUI.setText(findTestObject('signup/signup/input_email'), 'Cprcn@gmail.com', FailureHandling.STOP_ON_FAILURE)

'ไม่เลือกคำถาม'
WebUI.selectOptionByIndex(findTestObject('signup/signup/select_question'), '0', FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือน Question ไม่ได้เลือกไว้'
WebUI.verifyElementPresent(findTestObject('signup/signup/Required/div_Question is required.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกคำถามที่ 1'
WebUI.selectOptionByValue(findTestObject('signup/signup/select_question'), '1', true, FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความคำตอบ'
WebUI.setText(findTestObject('signup/signup/input_answer'), 'e', FailureHandling.STOP_ON_FAILURE)

'ลบข้อความในกล่องข้อความคำตอบ'
WebUI.sendKeys(findTestObject('signup/signup/input_answer'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ยืนยันปุ่ม Sign Up ไม่สามารถคลิกได้'
WebUI.verifyElementNotClickable(findTestObject('signup/signup/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

'ยืนยันการแจ้งเตือนกล่องข้อความ Answer ว่าง'
WebUI.verifyElementPresent(findTestObject('signup/signup/Required/div_Answer is required.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกคำตอบ'
WebUI.setText(findTestObject('signup/signup/input_answer'), 'Dog', FailureHandling.STOP_ON_FAILURE)

'กรอก Username'
WebUI.setText(findTestObject('signup/signup/input_username'), df.format(date), FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Sign Up'
WebUI.click(findTestObject('signup/signup/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบการแจ้งเตือนแบบ Pop up โดยมีข้อความว่า Successful'
WebUI.verifyElementPresent(findTestObject('signup/signup/div_Sign Up Successful'), 2, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนแบบ Pop up'
WebUI.click(findTestObject('signup/signup//button_'), FailureHandling.STOP_ON_FAILURE)

'เลื่อนหน้าจอขึ้นไปหาปุ่ม Login'
WebUI.scrollToElement(findTestObject('signup/start/span_Login'), 2, FailureHandling.STOP_ON_FAILURE)

'ปิดเบราเซอร์'
not_run: WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

