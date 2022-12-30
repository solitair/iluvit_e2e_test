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

Mobile.verifyElementText(findTestObject('시설찾기/주변시설 - 모달 - 광명광성초등학교병설유치원 이름필드 - android.widget.TextView'), '광명광성초등학교병설유치원')

'어린이집 태그 클릭'
Mobile.tap(findTestObject('Object Repository/시설찾기/주변시설 - 모달 - 어린이집 태그 - android.widget.TextView -'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/시설찾기/주변시설 - 모달 - 아이러빗어린이집 이름 필드 - android.widget.TextView'), 
    '아이러빗어린이집')

'모달을 중간 위치로 올리기'
Mobile.tap(findTestObject('시설찾기/주변시설 - 모달 상단 터치라인 - android.view.ViewGroup'), 0)

Mobile.swipe(0, 1534, 0, 1200)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('시설찾기/주변시설 - 모달 - 이랜드코코몽 이름필드 - android.widget.TextView'), '이랜드코코몽 어린이집')

Mobile.swipe(0, 1173, 0, 800)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'아이러빗어린이집 이름 클릭'
Mobile.tap(findTestObject('시설찾기/주변시설 - 모달 - 아이러빗어린이집 이름 필드 - android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('시설찾기/주변시설 - 모달 - 원장님이 텍스트 - android.widget.TextView'), 5)

Mobile.tap(findTestObject('시설찾기/주변시설 - 모달 - 원장님이 텍스트 - android.widget.TextView'), 0)

Mobile.swipe(0, 1646, 0, 1200)

Mobile.waitForElementPresent(findTestObject('시설찾기/주변시설 - 모달 - 원장명 label - android.widget.TextView'), 5)

Mobile.tap(findTestObject('Object Repository/시설찾기/주변시설 - 모달 - 설명회 탭 - android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('시설찾기/주변시설 - 모달 - 원장님이 텍스트 - android.widget.TextView'), 0)

Mobile.swipe(0, 974, 0, 500)

Mobile.verifyElementText(findTestObject('시설찾기/주변시설 - 모달 - 설명회 - 신청기간 - android.widget.TextView'), '신청기간')

Mobile.tap(findTestObject('시설찾기/주변시설 - 모달 상단 터치라인 - android.view.ViewGroup'), 0)

Mobile.swipe(0, 573, 0, 1000)

