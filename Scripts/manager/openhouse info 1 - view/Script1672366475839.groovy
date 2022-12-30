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

Mobile.comment('홈 화면에서 시설정보수정 링크 동작 확인')

Mobile.startApplication(GlobalVariable.G_AppFileName, true)

Mobile.comment('로그인 화면')

Mobile.setText(findTestObject('Object Repository/로그인/로그인 - 아이디 필드 - android.widget.EditText -'), 'oqwerp', 0)

Mobile.setText(findTestObject('로그인/로그인 - 패스워드 필드 - android.widget.EditText -'), 'asdf1234!', 0)

Mobile.tap(findTestObject('Object Repository/로그인/로그인 - 로그인 버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.waitForElementPresent(findTestObject('Object Repository/홈/홈 - 시설관리자 텍스트 - android.widget.TextView -'), 2)

Mobile.verifyElementText(findTestObject('홈/홈 - 시설관리자 텍스트 - android.widget.TextView -'), '시설 관리자')

Mobile.tap(findTestObject('홈/홈 - 설명회 이미지 - android.widget.ImageView'), 0)

Mobile.comment('설명회관리 화면')

Mobile.waitForElementPresent(findTestObject('설명회/설명회관리 - 헤더 타이틀 - android.widget.TextView -'), 0)

Mobile.tap(findTestObject('설명회/설명회관리 - 첫 번째 자세히보기 버튼 - android.widget.TextView'), 0)

Mobile.comment('설명회 정보 화면')

Mobile.waitForElementPresent(findTestObject('설명회/설명회 정보 - 헤더 타이틀 - android.widget.TextView -'), 2)

Mobile.verifyElementText(findTestObject('설명회/설명회 정보 - 날짜 1 - android.widget.TextView'), '2022-11-18')

Mobile.verifyElementText(findTestObject('설명회/설명회 정보 - 날짜 2 - android.widget.TextView'), '2023-12-31')

Mobile.scrollToText('작성 완료')

Mobile.closeApplication()

