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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('192.168.11.59')

WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew')

WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew')

WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

WebUI.click(findTestObject('Search history log/Page_Guru TMDA/a_Log'))

WebUI.click(findTestObject('Search history log/Page_Guru TMDA (2)/span_mydpicon icon-mydpcalenda'))

WebUI.click(findTestObject('Search history log/Page_Guru TMDA (2)/button_headertodaybtn headerto'))

WebUI.click(findTestObject('Export history log/Page_Guru TMDA (1)/input_ng-untouched ng-pristine'))

WebUI.click(findTestObject('Export history log/Page_Guru TMDA (1)/button_Export'))

WebUI.sendKeys(findTestObject('Export history log/Page_Guru TMDA (1)/button_Export'), 'Enter')

WebUI.delay(2)

not_run: WebUI.closeBrowser()

