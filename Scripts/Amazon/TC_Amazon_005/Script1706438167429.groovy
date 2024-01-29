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

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Online Shopping site in India Shop Onl_10c5f3/a_Hello, sign in  Account  Lists'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Online Shopping site in India Shop Onl_10c5f3/a_Hello, sign in  Account  Lists'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Sign In/a_Create your Amazon account'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Sign In/a_Create your Amazon account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Registration/h1_Create Account'), 
    0)

WebUI.setText(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Registration/input_customerName'), 
    'Vladimir Putin')

WebUI.setText(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Registration/input_email'), '9876543210')

WebUI.setText(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Registration/input_secondaryLoginClaim'), 
    'VladimirPutin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Registration/input_password'), 
    '/iU0mF259Yuz6GJQpt5TBA==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Registration/div_Please Enable Cookies to Continue      _3a9ca0'), 
    0)

WebUI.click(findTestObject('Object Repository/Amazon/TC_Amazon_005_SignUp/Page_Amazon Registration/inputcontinue'))

WebUI.closeBrowser()

