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

WebUI.openBrowser('Amazon.in')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_in'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/div_All'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_All'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Fresh'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Amazon miniTV'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Sell'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Best Sellers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Todays Deals'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Mobiles'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Electronics'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Customer Service'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Prime'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_New Releases'), 
    0)

WebUI.verifyElementPresent(findTestObject('Amazon/TC_Amazon_001_Homepage/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Gift Ideas'), 
    0)

WebUI.closeBrowser()

