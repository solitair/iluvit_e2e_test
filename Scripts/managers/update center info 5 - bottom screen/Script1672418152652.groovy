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

Mobile.waitForElementPresent(findTestObject('Object Repository/홈/홈 - 시설관리자 화면 - 시설관리자 텍스트 - android.widget.TextView -'), 
    2)

Mobile.tap(findTestObject('홈/홈 - 시설관리자 화면 - 시설이름 - android.widget.TextView -'), 0)

Mobile.comment('시설정보 화면')

Mobile.verifyElementText(findTestObject('Object Repository/시설정보/시설정보 - 헤더이름 - android.widget.TextView'), '시설정보')

Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

Mobile.comment('시설정보수정 화면')

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 헤더블록 - android.view.ViewGroup'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 헤더 이름 - android.widget.TextView -'), '시설정보수정')

Mobile.scrollToText('제공서비스')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 테마키워드 - 자연친화 태그 - android.widget.TextView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 테마키워드 - 코딩 태그 - android.widget.TextView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 600)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 제공서비스 - 해당없음 태그 - android.view.ViewGroup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 제공서비스 - 아침돌봄 태그 - android.view.ViewGroup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 제공서비스 - 특수학급 태그 - android.view.ViewGroup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 기본시설 - 통학버스 필드 - android.widget.EditText'), '10', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 기본시설 - CCTV 필드 - android.widget.EditText'), '29', 0)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 기본시설 - 놀이터 태그 - android.widget.TextView - playground'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 기본시설 - 키즈노트사용 태그 - android.widget.TextView - kidsnote'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 600)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 부가정보 - 입력 필드 - android.widget.EditText'), '부가정보테스트', 0)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 부가정보 - 추가 아이콘 - android.widget.TextView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1500, 0, 1000)

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.scrollToText('테마 키워드', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 테마키워드 - 자연친화 태그 - android.widget.TextView'), '자연친화')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 테마키워드 - 코딩 태그 - android.widget.TextView'), '코딩')

Mobile.swipe(0, 1000, 0, 600)

Mobile.verifyElementExist(findTestObject('시설정보/시설정보 - 제공서비스 - 해당없음 - android.view.ViewGroup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 기본시설 - 통학버스 - android.widget.TextView'), '통학버스 10대')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 기본시설 - CCTV - android.widget.TextView'), 'CCTV 29대')

Mobile.verifyElementExist(findTestObject('시설정보/시설정보 - 기본시설 - 놀이터 - android.widget.TextView'), 0)

Mobile.swipe(0, 1000, 0, 600)

Mobile.verifyElementVisible(findTestObject('시설정보/시설정보 - 부가정보 - 부가정보테스트 - android.widget.TextView - extrainfo'), 0)

Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

'시설정보를 다시 원상복구하기 위해 시설정보수정 화면으로 이동함.'
Mobile.comment('시설정보수정 화면')

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 헤더블록 - android.view.ViewGroup'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 헤더 이름 - android.widget.TextView -'), '시설정보수정')

Mobile.scrollToText('제공서비스')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 테마키워드 - 자연친화 태그 - android.widget.TextView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 테마키워드 - 코딩 태그 - android.widget.TextView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 600)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 제공서비스 - 해당없음 태그 - android.view.ViewGroup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 제공서비스 - 아침돌봄 태그 - android.view.ViewGroup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 제공서비스 - 특수학급 태그 - android.view.ViewGroup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 기본시설 - 통학버스 필드 - android.widget.EditText'), '4', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 기본시설 - CCTV 필드 - android.widget.EditText'), '10', 0)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 기본시설 - 놀이터 태그 - android.widget.TextView - playground'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 기본시설 - 키즈노트사용 태그 - android.widget.TextView - kidsnote'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 600)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 부가서비스 - 부가서비스 제거아이콘 - android.widget.TextView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('수정완료')

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.scrollToText('테마 키워드', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('시설정보/시설정보 - 테마키워드 - 자연친화 태그 - android.widget.TextView'), 2)

Mobile.verifyElementNotExist(findTestObject('시설정보/시설정보 - 테마키워드 - 코딩 태그 - android.widget.TextView'), 2)

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementExist(findTestObject('시설정보/시설정보 - 제공서비스 - 해당없음 - android.view.ViewGroup'), 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 기본시설 - 통학버스 - android.widget.TextView'), '통학버스 4대')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 기본시설 - CCTV - android.widget.TextView'), 'CCTV 10대')

Mobile.verifyElementExist(findTestObject('시설정보/시설정보 - 기본시설 - 놀이터 - android.widget.TextView'), 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementNotExist(findTestObject('시설정보/시설정보 - 부가정보 - 부가정보테스트 - android.widget.TextView - extrainfo'), 0)

Mobile.tap(findTestObject('시설정보/시설정보 - 헤더백버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.closeApplication()

