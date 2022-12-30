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

Mobile.comment('시설정보수정 화면에서 상단 화면에서의 작업 테스트')

Mobile.startApplication(GlobalVariable.G_AppFileName, true)

Mobile.comment('로그인 화면')

Mobile.setText(findTestObject('Object Repository/로그인/로그인 - 아이디 필드 - android.widget.EditText -'), 'oqwerp', 
    0)

Mobile.setText(findTestObject('로그인/로그인 - 패스워드 필드 - android.widget.EditText -'), 'asdf1234!', 0)

Mobile.tap(findTestObject('Object Repository/로그인/로그인 - 로그인 버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.waitForElementPresent(findTestObject('Object Repository/홈/홈 - 시설관리자 텍스트 - android.widget.TextView -'), 
    2)

Mobile.tap(findTestObject('홈/홈 - 시설이름 - android.widget.TextView -'), 0)

Mobile.comment('시설정보 화면')

Mobile.verifyElementText(findTestObject('Object Repository/시설정보/시설정보 - 헤더이름 - android.widget.TextView'), '시설정보')

Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

'시설정보수정 화면에서 \'시설명\' 수정'
Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 시설명 필드 - android.widget.EditText -'), '아이러빗어린이집-테스트', 5)

'시설정보수정 화면에서 \'원장명\' 수정'
Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 원장명 필드 - android.widget.EditText -'), '현승구-테스트', 5)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 설립유형 필드 - android.widget.EditText -'), '민간-테스트', 5)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 전화번호 필드 - android.widget.EditText'), '0101234567', 5)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 소개글 필드 - android.widget.EditText -'), '안녕하세요-테스트', 5)

Mobile.scrollToText('수정완료')

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

'필드값을 테스트용으로 변경하고 검사함'
Mobile.comment('시설정보수정 화면')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 시설명 필드 - android.widget.TextView'), '아이러빗어린이집-테스트')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 원장명 필드 - android.widget.TextView'), '현승구-테스트')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 설립유형 필드 - android.widget.TextView'), '민간-테스트')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 전화번호 필드 - android.widget.TextView'), '0101234567')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 소개글 필드 - android.widget.TextView'), '안녕하세요-테스트')

'시설정보 화면에서 \'수정 아이콘\' 누르기'
Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

'필드값을 원상복구 시키고 다시 검사함'
Mobile.comment('시설정보수정 화면')

'시설정보수정 화면에서 \'시설명\' 수정'
Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 시설명 필드 - android.widget.EditText -'), '아이러빗어린이집', 3)

'시설정보수정 화면에서 \'원장명\' 수정'
Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 원장명 필드 - android.widget.EditText -'), '현승구', 3)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 설립유형 필드 - android.widget.EditText -'), '민간', 3)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 전화번호 필드 - android.widget.EditText'), '01025655898', 3)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 소개글 필드 - android.widget.EditText -'), '안녕하세요.', 3)

Mobile.scrollToText('수정완료')

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 시설명 필드 - android.widget.TextView'), '아이러빗어린이집')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 원장명 필드 - android.widget.TextView'), '현승구')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 설립유형 필드 - android.widget.TextView'), '민간')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 전화번호 필드 - android.widget.TextView'), '01025655898')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 소개글 필드 - android.widget.TextView'), '안녕하세요.')

Mobile.tap(findTestObject('시설정보/시설정보 - 헤더백버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.closeApplication()
