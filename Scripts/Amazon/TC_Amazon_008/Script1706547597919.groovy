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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.setText(findTestObject('Object Repository/Amazon/TC_Amazon_008_AddtoCart/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'samsung tab')

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_008_AddtoCart/Page_Amazon.in  samsung tab/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_008_AddtoCart/Page_Amazon.in  samsung tab/span_Samsung Galaxy Tab A9 27.94 cm (11.0 i_4a94ea'))

WebUI.switchToWindowTitle('Samsung Galaxy Tab A9+ 27.94 cm (11.0 inch) Display, RAM 8 GB, ROM 128 GB Expandable, Wi-Fi Tablet, Silver : Amazon.in: Electronics')

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_008_AddtoCart/Page_Samsung Galaxy Tab A9 27.94 cm (11.0 i_76248f/input_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_008_AddtoCart/Page_Samsung Galaxy Tab A9 27.94 cm (11.0 i_76248f/aattach-close_sideSheet-link'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_008_AddtoCart/Page_Samsung Galaxy Tab A9 27.94 cm (11.0 i_76248f/a_1                                        _7d74ab'))

WebUI.closeBrowser()

