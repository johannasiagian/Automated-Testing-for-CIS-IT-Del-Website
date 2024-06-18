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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_Asrama  Kemahasiswaan_fa fa-angle-left pu_908d13'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Surat Pengantar Proyek'))

WebUI.click(findTestObject('Object Repository/Page_Riwayat Pengajuan Surat Pengantar Proyek/a_Request Surat'))

WebUI.setText(findTestObject('Object Repository/Page_Request Surat Pengantar Proyek/input_Nama Tempat_SuratPengantarProyeknama_tujuan'), 
    'Proyek')

WebUI.setText(findTestObject('Object Repository/Page_Request Surat Pengantar Proyek/textarea_Alamat Tempat_SuratPengantarProyek_c258c5'), 
    'Jalan')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Request Surat Pengantar Proyek/select_---Pilih Mata Kuliah--- StudiProyek _b980b9'), 
    '1036', true)

WebUI.click(findTestObject('Page_Riwayat Pengajuan Surat Pengantar Proyek/a_Request Surat'))

WebUI.closeBrowser()

