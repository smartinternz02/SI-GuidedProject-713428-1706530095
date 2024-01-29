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

WebUI.setText(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    '5g smartphone')

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.rightClick(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in  5g smartphone/span_Redmi 12 5G Moonstone Silver 6GB RAM 1_9b34f3'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in  5g smartphone/span_Samsung'))

WebUI.rightClick(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in  5g smartphone/span_Samsung Galaxy S24 Ultra 5G (Titanium _5709df'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in  5g smartphone/span_Over 20,000'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in  5g smartphone/span_Electronics'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in  5g smartphone/i_a-icon a-icon-checkbox'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in  5g smartphone/label'))

WebUI.rightClick(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in 5g Smartphone - Over 20,000 _ab46dd/span_OnePlus Nord CE 3 5G (Aqua Surge, 12GB_9fd44c'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in 5g Smartphone - Over 20,000 _ab46dd/div_SEARCH_DC_ASSETS_633895C,SEARCH_ATC_EXP_62a49c'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in 5g Smartphone - Over 20,000 _ab46dd/i_4 Stars  Up'))

WebUI.rightClick(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in 5g Smartphone - Over 20,000 _11e26c/i_4.1 out of 5 stars'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_003_FilteredSearch/Page_Amazon.in 5g Smartphone - Over 20,000 _11e26c/div_Check each product page for other buyin_faa9a5'))

WebUI.closeBrowser()

