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

not_run: WebUI.navigateToUrl('http://192.168.11.59/', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (3)/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (4)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (4)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Text Prediction'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Upload File'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.uploadFile(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (4)/input_upfile'), 'C:\\test-Copy.xlsx', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementClickable(findTestObject('Page_Guru TMDA (5)/button_Upload'), 30, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Guru TMDA (5)/select_sheet'), '1: withLabel', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.check(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (3)/button_'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.check(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (2)/i_fa fa-check w3-text-green'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('Page_Guru TMDA (16)/button_Start'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Start'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Display Private reason list/label_Private Reason'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Display Accessibility list/Page_Guru TMDA (2)/div_row'), 3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

