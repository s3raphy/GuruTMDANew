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

'เ�?ิดเ�?ราเ�?อร�?'
not_run: WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

'�?ยายห�?�?าต�?า�? เ�?ราเ�?อร�?'
not_run: WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'เ�?�?าสู�? URL'
not_run: WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'�?ลิ�?เม�?ู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'�?รอ�?�?�?อ�?วามล�?�?�?�?�?อ�?�?�?�?หา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'�?ด�?ุ�?ม�?�?�?�?�? Profile'
WebUI.click(findTestObject('Edit user profile/list/i_fa fa-pencil-square-o'))

'�?ดสั�?ลั�?ษณ�?ดิ�?สอหลั�?�?ื�?อ'
WebUI.click(findTestObject('Edit user profile/Edit//i_fa fa-pencil name'))

'�?ดสั�?ลั�?ษณ�?ดิ�?สอหลั�?อีเมล'
WebUI.click(findTestObject('Edit user profile/Edit/i_fa fa-pencil email'))

'ล�?�?�?อ�?วาม�?�?�?ล�?อ�?�?�?อ�?วาม First name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'e')

'ล�?�?�?อ�?วาม�?�?�?ล�?อ�?�?�?อ�?วาม First name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_firstname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ตรว�?สอ�?�?ุ�?ม Submit �?ม�?สามารถ�?ด�?ด�?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'�?รอ�?�?ื�?อเ�?�?�?ตัวเล�?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), '55555')

'ตรว�?สอ�?�?ุ�?ม Submit �?ม�?สามารถ�?ด�?ด�?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'�?รอ�?�?ื�?อที�?ถู�?รู�?�?�?�?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'Piratchana')

'ล�?�?�?อ�?วาม�?�?�?ล�?อ�?�?�?อ�?วาม Last name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'e')

'ล�?�?�?อ�?วาม�?�?�?ล�?อ�?�?�?อ�?วาม Last name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_lastname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ตรว�?สอ�?�?ุ�?ม Submit �?ม�?สามารถ�?ด�?ด�?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'�?รอ�?�?ามส�?ุลเ�?�?�?ตัวเล�?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), '55555')

'ตรว�?สอ�?�?ุ�?ม Submit �?ม�?สามารถ�?ด�?ด�?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'�?รอ�?�?ามส�?ุลที�?ถู�?รู�?�?�?�?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'Maksub')

'ล�?�?�?อ�?วาม�?�?�?ล�?อ�?�?�?อ�?วาม Email'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'e')

'ล�?�?�?อ�?วาม�?�?�?ล�?อ�?�?�?อ�?วาม Email'
WebUI.sendKeys(findTestObject('Edit user profile/Edit/input_email'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ตรว�?สอ�?�?ุ�?ม Submit �?ม�?สามารถ�?ด�?ด�?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'�?รอ�?อีเมล�?ม�?�?ส�? @ �?ละ�?ม�?มี .co'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'Cremecreme')

'ตรว�?สอ�?�?ุ�?ม Submit �?ม�?สามารถ�?ด�?ด�?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'�?รอ�?อีเมลที�?ถู�?รู�?�?�?�?'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'Creme@mail.com')

'�?ด�?ุ�?ม Submit'
WebUI.click(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'ตรว�?สอ�?�?าร�?�?�?�?เตือ�? Edit Profile Successful'
WebUI.verifyElementPresent(findTestObject('Edit user profile/Edit/div_Edit Profile Successful.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม�?ิด�?าร�?�?�?�?เตือ�?'
WebUI.click(findTestObject('Edit user profile/Edit/button_'))

'�?ิดเ�?ราเ�?อร�?'
not_run: WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

