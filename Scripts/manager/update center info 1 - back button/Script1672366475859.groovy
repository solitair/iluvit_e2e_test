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

Mobile.comment('시설정보수정 화면에서 그대로 되돌아오는 작업 테스트')

Mobile.startApplication(GlobalVariable.G_AppFileName, true)

Mobile.comment('로그인 화면')

Mobile.setText(findTestObject('Object Repository/로그인/로그인 - 아이디 필드 - android.widget.EditText -'), 'oqwerp', 
    0)

Mobile.setText(findTestObject('로그인/로그인 - 패스워드 필드 - android.widget.EditText -'), 'asdf1234!', 0)

Mobile.tap(findTestObject('Object Repository/로그인/로그인 - 로그인 버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.waitForElementPresent(findTestObject('Object Repository/홈/홈 - 시설관리자 텍스트 - android.widget.TextView -'), 
    2)

Mobile.verifyElementText(findTestObject('홈/홈 - 시설관리자 텍스트 - android.widget.TextView -'), '시설 관리자')

Mobile.tap(findTestObject('홈/홈 - 시설이름 - android.widget.TextView -'), 0)

Mobile.comment('시설정보 화면')

Mobile.verifyElementText(findTestObject('Object Repository/시설정보/시설정보 - 헤더이름 - android.widget.TextView'), '시설정보')

Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

Mobile.comment('시설정보수정 화면')

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 헤더블록 - android.view.ViewGroup'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 헤더 이름 - android.widget.TextView -'), '시설정보수정')

Mobile.tap(findTestObject('Object Repository/시설정보수정/시설정보수정 - 헤더백버튼 - android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/시설정보수정/시설정보수정 - 백버튼모달 메시지 - android.widget.TextView -'), 
    2)

'시설정보수정 화면에서 백버튼 모달창에서 "취소" 버튼 선택'
Mobile.tap(findTestObject('Object Repository/시설정보수정/시설정보수정 - 백버튼모달 취소 버튼 - android.widget.Button -'), 0)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 헤더백버튼 - android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 백버튼모달 메시지 - android.widget.TextView -'), 2)

'시설정보수정 화면에서 백버튼 모달창에서 "OK" 버튼 선택'
Mobile.tap(findTestObject('Object Repository/시설정보수정/시설정보수정 - 백버튼모달 예 버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.tap(findTestObject('시설정보/시설정보 - 헤더백버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.closeApplication()

