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

Mobile.scrollToText('홈페이지')

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 홈페이지 필드 - android.widget.EditText'), 'www.iluvit.app', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 연령1 필드 - android.widget.EditText'), '0', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 연령2 필드 - android.widget.EditText'), '5', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 현원 필드 - android.widget.EditText'), '100', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 정원 필드 - android.widget.EditText'), '330', 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총반수 만0세 필드 - android.widget.EditText'), '0', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총반수 만1세 필드 - android.widget.EditText'), '1', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총반수 만2세 필드 - android.widget.EditText'), '2', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총아이수 만0세 필드 - android.widget.EditText'), '0', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총아이수 만1세 필드 - android.widget.EditText'), '10', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총아이수 만2세 필드 - android.widget.EditText'), '20', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 특별아이수 필드 - android.widget.EditText'), '3', 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총교사수 필드 - android.widget.EditText'), '34', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 교사수 1년미만 필드 - android.widget.EditText'), '1', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 교사수 1년이상2년미만 필드 - android.widget.EditText'), '10', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 교사수 2년이상4년미만 필드 - android.widget.EditText'), '5', 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 보육료 만0세 필드 - android.widget.EditText'), '10000', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 보육료 만1세 필드 - android.widget.EditText'), '10010', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 보육료 만2세 필드 -android.widget.EditText'), '11000', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 건축연도 필드 - android.widget.EditText'), '2010', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 프로그램 입력 필드 - android.widget.EditText'), '새 프로그램', 0)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 프로그램추가 아이콘 - android.widget.TextView'), 0)

Mobile.scrollToText('수정완료')

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.scrollToText('홈페이지', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 홈페이지 필드 - android.widget.TextView'), 'www.iluvit.app')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 연령 필드 - android.widget.TextView'), '0세 ~ 5세')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 현원 필드 - android.widget.TextView'), '100명')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 정원 필드 - android.widget.TextView'), '330명')

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총반수 만0세 필드 - android.widget.TextView'), '0')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총반수 만1세 필드 - android.widget.TextView'), '1')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총반수 만2세 필드 - android.widget.TextView'), '2')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총아이수 만0세 필드 - android.widget.TextView'), '0')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총아이수 만1세 필드 - android.widget.TextView'), '10')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총아이수 만2세 필드 - android.widget.TextView'), '20')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 특별아이수 필드 - android.widget.TextView'), '3')

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총교사수 필드 - android.widget.TextView'), '34명')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 교사수 1년미만 필드 - android.widget.TextView'), '1')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 교사수 1년이상2년미만 필드 - android.widget.TextView'), '10')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 교사수 2년이상4년미만 필드 - android.widget.TextView'), '5')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 보육료 만0세 필드 - android.widget.TextView'), '10000')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 보육료 만1세 필드 - android.widget.TextView'), '10010')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 보육료 만2세 필드 - android.widget.TextView'), '11000')

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementVisible(findTestObject('시설정보/시설정보 - 프로그램 - 새 프로그램 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

'시설정보를 다시 원상복구하기 위해 시설정보수정 화면으로 이동함.'
Mobile.comment('시설정보수정 화면')

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 헤더블록 - android.view.ViewGroup'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 헤더 이름 - android.widget.TextView -'), '시설정보수정')

Mobile.scrollToText('홈페이지')

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 홈페이지 필드 - android.widget.EditText'), 'iluvit.app', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 연령1 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 연령2 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 현원 필드 - android.widget.EditText'), '10', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 정원 필드 - android.widget.EditText'), '33', 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총반수 만0세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총반수 만1세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총반수 만2세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총아이수 만0세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총아이수 만1세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총아이수 만2세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 특별아이수 필드 - android.widget.EditText'), '', 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 총교사수 필드 - android.widget.EditText'), '11', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 교사수 1년미만 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 교사수 1년이상2년미만 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 교사수 2년이상4년미만 필드 - android.widget.EditText'), '', 0)

Mobile.swipe(0, 1000, 0, 500)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 보육료 만0세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 보육료 만1세 필드 - android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 보육료 만2세 필드 -android.widget.EditText'), '', 0)

Mobile.setText(findTestObject('시설정보수정/시설정보수정 - 건축연도 필드 - android.widget.EditText'), '2022', 0)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 프로그램 - 새 프로그램 삭제아이콘 - android.widget.TextView'), 0)

Mobile.scrollToText('수정완료')

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.scrollToText('홈페이지', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 홈페이지 필드 - android.widget.TextView'), 'iluvit.app')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 연령 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 현원 필드 - android.widget.TextView'), '10명')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 정원 필드 - android.widget.TextView'), '33명')

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총반수 만0세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총반수 만1세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총반수 만2세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총아이수 만0세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총아이수 만1세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총아이수 만2세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 특별아이수 필드 - android.widget.TextView'), '정보없음')

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 총교사수 필드 - android.widget.TextView'), '11명')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 교사수 1년미만 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 교사수 1년이상2년미만 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 교사수 2년이상4년미만 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 보육료 만0세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 보육료 만1세 필드 - android.widget.TextView'), '정보없음')

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 보육료 만2세 필드 - android.widget.TextView'), '정보없음')

Mobile.swipe(0, 1000, 0, 500)

Mobile.verifyElementNotExist(findTestObject('시설정보/시설정보 - 프로그램 - 새 프로그램 - android.widget.TextView'), 0)

Mobile.tap(findTestObject('시설정보/시설정보 - 헤더백버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.closeApplication()

