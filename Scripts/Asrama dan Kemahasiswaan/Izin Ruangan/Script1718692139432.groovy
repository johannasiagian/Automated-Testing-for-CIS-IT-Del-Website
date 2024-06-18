import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cis.del.ac.id/user/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_LoginFormusername'), 'if322061')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_LoginFormpassword'), 'r0h5FLeGCTYg+BkHRFNenXgKWnGicbHL')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Asrama  Kemahasiswaan'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Izin Ruangan'))

WebUI.click(findTestObject('Object Repository/Page_Izin Penggunaan Ruangan/a_Request'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/input_Rencana Mulai_IzinRuanganrencana_mulai'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/td_20'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/span_1000'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/span_1025'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/input_Rencana Berakhir_IzinRuanganrencana_berakhir'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/td_21'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/span_1100'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/span_1150'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/label_Keterangan'))

WebUI.setText(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/textarea_Keterangan_IzinRuangandesc'), 
    'Automated Testing')

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/label_Lokasi'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/select_Pilih RuanganGD512GD723AUDGD516GD714_0f9729'), 
    '11', true)

WebUI.click(findTestObject('Object Repository/Page_Request Izin Penggunaan Ruangan/button_Buat Baru'))

WebUI.closeBrowser()

