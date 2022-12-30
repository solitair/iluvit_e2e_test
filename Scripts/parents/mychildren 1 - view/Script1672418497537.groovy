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

Mobile.comment('학부모 홈 화면에서 우리 아이 중 첫번째 클릭')

Mobile.startApplication(GlobalVariable.G_AppFileName, true)

'Push Notification Error Alert.'
Mobile.tap(findTestObject('Alert 알림창 - OK 버튼 - android.widget.Button'), 2, FailureHandling.OPTIONAL)

Mobile.comment('로그인 화면')

Mobile.setText(findTestObject('Object Repository/로그인/로그인 - 아이디 필드 - android.widget.EditText -'), 'sbl133', 0)

Mobile.setText(findTestObject('로그인/로그인 - 패스워드 필드 - android.widget.EditText -'), 'tmdqja12!', 0)

Mobile.tap(findTestObject('Object Repository/로그인/로그인 - 로그인 버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.waitForElementPresent(findTestObject('홈/홈 - 학부모 화면 - 학부모 텍스트 - android.widget.TextView'), 2)

Mobile.tap(findTestObject('홈/홈 - 학부모 화면 - 우리아이 리스트 첫번째 - android.widget.TextView'), 0)

Mobile.comment('이야기 화면')

Mobile.waitForElementPresent(findTestObject('이야기/프리뷰 - 아이러빗어린이집 - 헤더 타이틀 - android.view.View'), 0)

Mobile.verifyElementText(findTestObject('이야기/프리뷰 - 아이러빗어린이집 - 즐겨찾는 게시판 텍스트 - android.widget.TextView'), '즐겨찾는 게시판')

Mobile.tap(findTestObject('홈 탭 - android.widget.ImageView'), 0)

Mobile.comment('홈 화면')

Mobile.waitForElementPresent(findTestObject('홈/홈 - 학부모 화면 - 학부모 텍스트 - android.widget.TextView'), 2)

Mobile.closeApplication()

