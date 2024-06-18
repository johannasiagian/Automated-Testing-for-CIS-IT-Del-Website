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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Izin Keluar'))

WebUI.click(findTestObject('Object Repository/Page_Izin Keluar/a_Request Izin Keluar'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/input_Rencana Berangkat_IzinKeluarrencana_b_bd1150'))

// Tambahkan waitForElementClickable sebelum melakukan klik
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Request Izin Keluar/td_19'), 10)
WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/td_19'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/span_1500'))
WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/span_1530'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/input_Rencana Kembali_IzinKeluarrencana_kembali'))

// Tambahkan waitForElementClickable sebelum melakukan klik
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Request Izin Keluar/td_20'), 10)
WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/td_20'))

WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/span_1600'))
WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/span_1650'))

WebUI.setText(findTestObject('Object Repository/Page_Request Izin Keluar/textarea_Keperluan IK_IzinKeluardesc'), 'Automated Testing ')

WebUI.click(findTestObject('Object Repository/Page_Request Izin Keluar/button_Buat Baru'))

WebUI.closeBrowser()
