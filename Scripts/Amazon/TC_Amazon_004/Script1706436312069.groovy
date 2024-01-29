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

WebUI.setText(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    '4k tv')

WebUI.click(findTestObject('Amazon/TC_Amazon_002_ItemSearch/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/input_Search Amazon.in_nav-search-submit-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in  4k tv/span_108 cm (43 inches) Y Series 4K Ultra H_c3a727'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in  4k tv/span_Sort byFeatured_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in  4k tv/a_Price Low to High'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in  4k tv/a_Price Low to High'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/span_108 cm (43 inches) 4K Ultra HD Smart L_adcb75'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/span_Price Low to High'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/a_Price High to Low'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/span_Price High to Low'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/a_Avg. Customer Review'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/span_Avg. Customer Review'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/a_Newest Arrivals'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/span_Newest Arrivals'))

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/a_Featured'))

WebUI.rightClick(findTestObject('Object Repository/Amazon/TC_Amazon_004_SortedSearch/Page_Amazon.in 4k Tv/span_108 cm (43 inches) Y Series 4K Ultra H_c3a727'))

WebUI.closeBrowser()

