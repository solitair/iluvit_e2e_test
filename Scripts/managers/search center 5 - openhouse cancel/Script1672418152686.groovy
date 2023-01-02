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

'Push Notification Error Alert.'
Mobile.tap(findTestObject('Alert 알림창 - OK 버튼 - android.widget.Button'), 2, FailureHandling.OPTIONAL)

Mobile.comment('로그인 화면')

Mobile.setText(findTestObject('Object Repository/로그인/로그인 - 아이디 필드 - android.widget.EditText -'), 'oqwerp', 0)

Mobile.setText(findTestObject('로그인/로그인 - 패스워드 필드 - android.widget.EditText -'), 'asdf1234!', 0)

Mobile.tap(findTestObject('Object Repository/로그인/로그인 - 로그인 버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.tap(findTestObject('하단 메뉴바 - 시설찾기 탭 - android.widget.ImageView'), 0)

Mobile.comment('시설찾기 화면')

'GPS Location Error Alert.'
Mobile.tap(findTestObject('Alert 알림창 - OK 버튼 - android.widget.Button'), 2, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('시설찾기/주변시설 - 헤더 - 시설찾기 텍스트 - android.widget.TextView'), 5)

Mobile.tap(findTestObject('시설찾기/입학설명회탭 - android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('시설찾기/입학설명회 - 설명글 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('시설찾기/입학설명회 - 필터아이콘 - android.widget.ImageView'), 0)

Mobile.comment('검색필터 모달')

Mobile.waitForElementPresent(findTestObject('시설찾기/입학설명회 - 검색필터 모달 - 타이틀 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('시설찾기/입학설명회 - 검색필터모달 - 어린이집 태그 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('시설찾기/입학설명회 - 검색필터모달 - 청결 태그 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('시설찾기/입학설명회 - 검색필터모달 - 체육 태그 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('시설찾기/입학설명회 - 검색필터모달 - 캠핑 태그 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('시설찾기/입학설명회 - 검색필터모달 - 천주교 태그 - android.widget.TextView'), 0)

Mobile.tapAtPosition(300, 1653)

Mobile.tap(findTestObject('시설찾기/입학설명회 - 검색필터모달 - 닫기 아이콘 - android.widget.TextView'), 0)

Mobile.comment('입학설명회 화면')

Mobile.verifyElementNotVisible(findTestObject('시설찾기/입학설명회 - 어린이집 텍스트 - android.widget.TextView'), 0)

Mobile.verifyElementNotVisible(findTestObject('시설찾기/입학설명회 - 청결 텍스트 - android.widget.TextView'), 0)

Mobile.verifyElementNotVisible(findTestObject('시설찾기/입학설명회 - 체육 텍스트 - android.widget.TextView'), 0)

Mobile.verifyElementNotVisible(findTestObject('시설찾기/입학설명회 - 캠핑 텍스트 - android.widget.TextView'), 0)

Mobile.verifyElementNotVisible(findTestObject('시설찾기/입학설명회 - 천주교 텍스트 - android.widget.TextView'), 0)

Mobile.verifyElementNotVisible(findTestObject('시설찾기/입학설명회 - 만1세 텍스트 - android.widget.TextView'), 0)

Mobile.closeApplication()

