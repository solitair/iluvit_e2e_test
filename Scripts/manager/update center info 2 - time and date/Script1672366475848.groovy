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

Mobile.comment('시설정보수정 화면에서 운영시간과 개원일 수정 작업 테스트')

Mobile.startApplication(GlobalVariable.G_AppFileName, true)

Mobile.comment('로그인 화면')

Mobile.setText(findTestObject('Object Repository/로그인/로그인 - 아이디 필드 - android.widget.EditText -'), 'oqwerp', 0)

Mobile.setText(findTestObject('로그인/로그인 - 패스워드 필드 - android.widget.EditText -'), 'asdf1234!', 0)

Mobile.tap(findTestObject('Object Repository/로그인/로그인 - 로그인 버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.waitForElementPresent(findTestObject('Object Repository/홈/홈 - 시설관리자 텍스트 - android.widget.TextView -'), 2)

Mobile.tap(findTestObject('홈/홈 - 시설이름 - android.widget.TextView -'), 0)

Mobile.comment('시설정보 화면')

Mobile.verifyElementText(findTestObject('Object Repository/시설정보/시설정보 - 헤더이름 - android.widget.TextView'), '시설정보')

Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

Mobile.comment('시설정보수정 화면')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 운영시간1 필드 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('날짜 시간 모달/시간 모달 - 오전 버튼 - android.widget.RadioButton'), 4)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 오전 버튼 - android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('Object Repository/날짜 시간 모달/시간 모달 - 9시 - android.widget.RadialTimePickerViewRadialPickerTouchHelper -'), 
    0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 00분 - android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 0)

'This is used to handle abnormal situation when the clock modal pops up again.'
Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 운영시간2 필드 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('날짜 시간 모달/시간 모달 - 오후 버튼 - android.widget.RadioButton'), 4)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 오후 버튼 - android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('Object Repository/날짜 시간 모달/시간 모달 - 7시 - android.widget.RadialTimePickerViewRadialPickerTouchHelper -'), 
    0)

Mobile.tap(findTestObject('Object Repository/날짜 시간 모달/시간 모달 - 30분 - android.widget.RadialTimePickerViewRadialPickerTouchHelper -'), 
    0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 0)

'This is used to handle abnormal situation when the clock modal pops up again.'
Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 개원일 필드 - android.widget.TextView -'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/날짜 모달 - 이전달 아이콘 - android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/날짜 시간 모달/날짜 모달 - 24일 - android.view.View'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/날짜 모달 - 확인 버튼 - android.widget.Button'), 0)

'This is used to handle abnormal situation when the calendar modal pops up again.'
Mobile.tap(findTestObject('날짜 시간 모달/날짜 모달 - 확인 버튼 - android.widget.Button'), 1, FailureHandling.OPTIONAL)

Mobile.scrollToText('수정완료')

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 운영시간 필드 - android.widget.TextView'), '09:00 ~ 19:30')

Mobile.verifyMatch(estDateTest1, '2022-([0-9]+)-24', true)

Mobile.tap(findTestObject('Object Repository/시설정보/시설정보 - 수정아이콘 - android.widget.ImageView -'), 0)

'필드값을 원상복구 시키고 다시 검사함'
Mobile.comment('시설정보수정 화면')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 운영시간1 필드 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('날짜 시간 모달/시간 모달 - 오전 버튼 - android.widget.RadioButton'), 4)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 오전 버튼 - android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 7시 - android.widget.RadialTimePickerViewRadialPickerTouchHelper -'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 30분 - android.widget.RadialTimePickerViewRadialPickerTouchHelper -'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 0)

'This is used to handle abnormal situation when the clock modal pops up again.'
Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 운영시간2 필드 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('날짜 시간 모달/시간 모달 - 오후 버튼 - android.widget.RadioButton'), 4)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 오후 버튼 - android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 9시 - android.widget.RadialTimePickerViewRadialPickerTouchHelper -'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 00분 - android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 0)

'This is used to handle abnormal situation when the clock modal pops up again.'
Mobile.tap(findTestObject('날짜 시간 모달/시간 모달 - 확인 버튼 - android.widget.Button - confirm'), 1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 개원일 필드 - android.widget.TextView -'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/날짜 모달 - 다음달 아이콘 - android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/날짜 모달 - 10일 - android.view.View'), 0)

Mobile.tap(findTestObject('날짜 시간 모달/날짜 모달 - 확인 버튼 - android.widget.Button'), 0)

'This is used to handle abnormal situation when the calendar modal pops up again.'
Mobile.tap(findTestObject('날짜 시간 모달/날짜 모달 - 확인 버튼 - android.widget.Button'), 1, FailureHandling.OPTIONAL)

Mobile.scrollToText('수정완료')

'시설정보수정 화면에서 "수정완료" 버튼 누르기'
Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 수정완료 버튼 - android.widget.TextView -'), 0)

Mobile.waitForElementPresent(findTestObject('시설정보수정/시설정보수정 - 완료모달 창 - android.widget.LinearLayout -'), 2)

Mobile.verifyElementText(findTestObject('시설정보수정/시설정보수정 - 완료모달 메시지 - android.widget.TextView -'), '정보 수정되었습니다.')

Mobile.tap(findTestObject('시설정보수정/시설정보수정 - 완료모달 OK버튼 - android.widget.Button -'), 0)

Mobile.comment('시설정보 화면')

Mobile.waitForElementPresent(findTestObject('시설정보/시설정보 - 헤더이름 - android.widget.TextView'), 2)

Mobile.verifyElementText(findTestObject('시설정보/시설정보 - 운영시간 필드 - android.widget.TextView'), '07:30 ~ 21:00')

Mobile.verifyMatch(estDateTest2, '2022-([0-9]+)-10', true)

Mobile.tap(findTestObject('시설정보/시설정보 - 헤더백버튼 - android.widget.TextView -'), 0)

Mobile.comment('홈 화면')

Mobile.closeApplication()

