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

not_run: WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('http://192.168.11.59/')

not_run: WebUI.click(findTestObject('Page_Guru TMDA (3)/span_Login'))

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (4)/input_ng-untouched ng-valid ng'), 'piew')

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew')

not_run: WebUI.click(findTestObject('Page_Guru TMDA (4)/button_Login'))

WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Text Prediction'))

WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Upload File'))

WebUI.uploadFile(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (4)/input_upfile'), 'C:\\test-Copy.xlsx')

WebUI.waitForElementClickable(findTestObject('Page_Guru TMDA (5)/button_Upload'), 30)

WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Upload'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5)

WebUI.selectOptionByValue(findTestObject('Page_Guru TMDA (5)/select_sheet'), '1: withLabel', true)

WebUI.check(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (3)/button_'))

WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 5)

WebUI.check(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (2)/i_fa fa-check w3-text-green'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Guru TMDA (16)/button_Start'), 0)

WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Start'))

WebUI.click(findTestObject('Page_Guru TMDA (21)/button_Export'))

WebUI.closeBrowser()

