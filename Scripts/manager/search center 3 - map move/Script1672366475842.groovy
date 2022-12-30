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

Mobile.startApplication(GlobalVariable.G_AppFileName, true)

Mobile.comment('로그인 화면')

Mobile.setText(findTestObject('Object Repository/로그인/로그인 - 아이디 필드 - android.widget.EditText -'), 'oqwerp', 0)

Mobile.setText(findTestObject('로그인/로그인 - 패스워드 필드 - android.widget.EditText -'), 'asdf1234!', 0)

Mobile.tap(findTestObject('Object Repository/로그인/로그인 - 로그인 버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.tap(findTestObject('시설찾기 탭 - android.widget.ImageView'), 0)

Mobile.comment('시설찾기 화면')

Mobile.waitForElementPresent(findTestObject('시설찾기/주변시설 - 헤더 - 시설찾기 텍스트 - android.widget.TextView'), 5)

'지도가 완전하게 나타날 때까지 기다림.'
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설찾기/주변시설 - 지도 - android.widget.FrameLayout'), 0)

Mobile.swipe(600, 700, 0, 700)

Mobile.verifyElementText(findTestObject('시설찾기/주변시설 - 현위치에서 텍스트 - android.widget.TextView'), '현 위치에서 재검색')

Mobile.tap(findTestObject('시설찾기/주변시설 - 현위치에서 텍스트 - android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('시설찾기/주변시설 - 모달 - 시내유치원 이름필드 - android.widget.TextView'), 0)

