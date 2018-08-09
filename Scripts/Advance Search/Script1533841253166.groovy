import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://link.springer.com/')

WebUI.click(findTestObject('Advance Search/Page_Home - Springer/button_Search Options'))

WebUI.click(findTestObject('Advance Search/Page_Home - Springer/a_Advanced Search'))

WebUI.setText(findTestObject('Advance Search/Page_Advanced Search - Springer/input_author-is'), 'Elvis')

WebUI.click(findTestObject('Advance Search/Page_Advanced Search - Springer/button_Search'))

WebUI.click(findTestObject('Advance Search/Page_Search Results - Springer/a_Elvis Hozdi'))

WebUI.click(findTestObject('Advance Search/Page_Search Results - Springer/a_Elvis Hozdi'))

WebUI.click(findTestObject('Advance Search/Page_Search Results - Springer/p_within              Elvis Ho'))

WebUI.click(findTestObject('Advance Search/Page_Search Results - Springer/button_Search Options'))

WebUI.click(findTestObject('Advance Search/Page_Search Results - Springer/a_Advanced Search'))

WebUI.click(findTestObject('Advance Search/Page_Advanced Search - Springer/button_Search'))

WebUI.closeBrowser()

