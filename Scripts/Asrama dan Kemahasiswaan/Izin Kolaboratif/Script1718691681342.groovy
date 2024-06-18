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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Izin Kolaboratif'))

WebUI.click(findTestObject('Object Repository/Page_Izin Tambahan Jam Kolaboratif/a_Request izin'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/input_Rencana Mulai_IzinKolaboratifrencana_mulai'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/td_20'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/input_Rencana Berakhir_IzinKolaboratifrenca_cc4134'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/td_21'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/input_Batas Waktu_IzinKolaboratifbatas_waktu'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/span_1300'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/span_1350'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/label_Keterangan'))

WebUI.setText(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/textarea_Keterangan_IzinKolaboratifdesc'), 
    'Automated Testing')

WebUI.click(findTestObject('Object Repository/Page_Request Izin Tambahan Jam Kolaboratif/button_Buat Baru'))

WebUI.closeBrowser()

