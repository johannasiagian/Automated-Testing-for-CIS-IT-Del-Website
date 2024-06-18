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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Layanan BAAK'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Surat Permohonan KP'))

WebUI.click(findTestObject('Object Repository/Page_Riwayat Pengajuan Surat Permohonan KP/a_Request Surat'))

WebUI.setText(findTestObject('Object Repository/Page_Request Surat Permohonan KP/textarea_Nama Tujuan_SuratPermohonanKpnama_tujuan'), 
    'kp')

WebUI.setText(findTestObject('Object Repository/Page_Request Surat Permohonan KP/div_Alamat Tujuan_redactor-editor'), '<p>alamat​</p>')

WebUI.click(findTestObject('Object Repository/Page_Request Surat Permohonan KP/input_Waktu Awal Kp_SuratPermohonanKpwaktu_awal_kp'))

WebUI.click(findTestObject('Object Repository/Page_Request Surat Permohonan KP/td_26'))

WebUI.click(findTestObject('Object Repository/Page_Request Surat Permohonan KP/input_Waktu Akhir Kp_SuratPermohonanKpwaktu_85727c'))

WebUI.click(findTestObject('Object Repository/Page_Request Surat Permohonan KP/a_29'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Request Surat Permohonan KP/select_Select.20232024202220232021202220202_f3bac7'), 
    '2023/2024', true)

WebUI.click(findTestObject('Page_Riwayat Pengajuan Surat Permohonan KP/a_Request Surat'))

WebUI.closeBrowser()

