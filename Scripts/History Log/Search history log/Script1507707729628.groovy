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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('192.168.11.59')

not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'creme')

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '1234')

'-สิ้นสุดการทดสอบ login\r\n'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

'กดปุ่ม Log'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/a_Log'))

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_2'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเครื่องหมายกากถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-untouched ng-pristine'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันปัจจุบัน โดยกด preview กดเลือกรายการ  และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_3'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim003'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'ทำเครื่องหมายกากถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล single วันปัจจุบัน โดยกด preview กดเลือกรายการ  และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเครื่องหมายกากถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดป่ม export สิ้นสุดการทดสอบข้อมูล multiple วันปัจจุบัน โดยกด preview กดเลือกรายการ  และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนายเป็น all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_4'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//div_ngxp__container ngxp__anim004'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเครื่องหมายกากถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันปัจจุบัน โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_5'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim005'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'-ทำเครื่องหมายกากถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูล single วันปัจจุบัน โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเครื่องหมายกากถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูล multiple วันปัจจุบัน โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันปัจจุบัน โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_8'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล single วันปัจจุบัน โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA/i_fa fa-times w3-xlarge w3-tex'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล multiple วันปัจจุบัน โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ใส่ข้อมูลวันที่ที่ต้องการค้นหา ใน input แรก'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n'), '02/11/2017')

'เลือกประเภทการทำนาย all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเครื่องหมายกาถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันที่ 11/10/2017 โดยกด preview กดเลือกรายการ และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_ 6'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim006'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'ทำเครื่องหมายกาถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล single วันที่ 11/10/2017 โดยกด preview กดเลือกรายการ และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเครื่องหมายกาถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล multiple วันที่ 11/10/2017 โดยกด preview กดเลือกรายการ และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเครื่องหมายกาถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันที่ 11/10/2017 โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 11'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-ทำเครื่องหมายกาถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูล single วันที่ 11/10/2017 โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย  เป็น multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเครื่องหมายกาถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูล multiple วันที่ 11/10/2017 โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น all\r\n'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันที่ 11/10/2017 โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 12345689'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล single วันที่ 11/10/2017 โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล multi วันที่ 11/10/2017 โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ใส่ข้อมูลวันที่ ใน input หลัง'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n (1)'), '02/11/2017')

'เลือกประเภทการทำนาย เป็น all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ '))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเครื่องหมายกาถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันที่ 11/10/2017-31/11/2017 โดยกด preview กดเลือกรายการ และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ทำเครื่องหมายกาถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล single วันที่ 11/10/2017-31/11/2017 โดยกด preview กดเลือกรายการ และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น multiple\r\n'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเครื่องหมายกาถูกหลังรายการที่เลือก'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล multiple วันที่ 11/10/2017-31/11/2017 โดยกด preview กดเลือกรายการ และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น all\r\n'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_  (1)'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเครื่องหมายกาถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันที่ 11/10/2017-31/10/2017 โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-ทำเครื่องหมายกาถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูล single วันที่ 11/10/2017-31/10/2017 โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเครื่องหมายกาถูกหลังรายการที่เลือก สิ้นสุดการทดสอบข้อมูล multiple วันที่ 11/10/2017-31/10/2017 โดยกด preview และกดเลือกรายการ'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูลทั้งหมด (All) วันที่ 11/10/2017-31/11/2017 โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเคอเซอร์ชี้ที่ไฟล์ single เพื่อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_12'))

'ตรวจสอบ pop up preview ของไฟล์ single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล single วันที่ 11/10/2017-31/11/2017 โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'กดปุ่ม preview ของไฟล์ multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'กดปุ่มกากกะบาทที่หน้าต่าง preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-กดปุ่ม export สิ้นสุดการทดสอบข้อมูล multiple วันที่ 11/10/2017-31/11/2017 โดยกด preview และกด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรวจสอบผล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือกประเภทการทำนาย เป็น all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0')

'กดกากะบาทลบวันที่ input ข้างหน้า'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_mydpicon icon-mydpremove'))

'---ตรวจสอบผล'
WebUI.verifyElementNotPresent(findTestObject('Search history log/search history log//button_Preview'), 5)

not_run: WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'ใส่ข้อมูลวันที่ใน input หลัง'
WebUI.setText(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_selection ng-valid ng-di'), 
    '02/11/2017')

WebUI.closeBrowser()

