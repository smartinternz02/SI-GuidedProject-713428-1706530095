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

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Online Shopping site in India Shop Onl_10c5f3/a_EN'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Online Shopping site in India Shop Onl_10c5f3/a_EN'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/div_(function(f) var _np(window.P._namespac_5a8a07'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/h3_Language Settings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/span_-        HI                           _d828bb'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/i_a-icon a-icon-radio'))

WebUI.rightClick(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/input_a-button-input'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/div_(function(f) var _np(window.P._namespac_5a8a07_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/input_a-button-input'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_Change Language Settings/input_a-button-input'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon/TC_Amazon_010_Language/Page_, , ,    - Amazon.in/a_HI'), 
    'HI')

WebUI.closeBrowser()

