package com.examarly.allpage;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarlyBaseClass.BaseclassWeb;

 public class IndianPolityTakeTest  extends BaseclassWeb{
	
 public IndianPolityTakeTest() {
	PageFactory.initElements(driver, this);
  }

 @FindBy(xpath = "//div[@class='homepage-landing-section-hero-button start-todays-prep btn-stp-cpy']")
 WebElement login;
 @FindBy(xpath = "//button[@class='ng-binding']")
 WebElement dontAllow;
 @FindBy(xpath = "//input[@name='mobileNumber']")
 WebElement enterMobileNumber;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement loginClick;
 @FindBy(xpath = "//input[@name='otp1']")
 WebElement otp;
 @FindBy(xpath = "//input[@name='otp2']")
 WebElement otp1;
 @FindBy(xpath = "//input[@name='otp3']")
 WebElement otp2;
 @FindBy(xpath = "//input[@name='otp4']")
 WebElement otp3;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement verify;
 @FindBy(xpath = "(//button[contains(text(),'View Achievements')])")
 WebElement stats;
 @FindBy(xpath ="(//span[contains(text(),'Syllabus')])[1]")
 WebElement syllabus;
 @FindBy(xpath = "//h2[normalize-space()='Historical Background']")
 WebElement historicalBackgroundSubtopic;
 @FindBy(xpath = "//h3[normalize-space()='Historical Background']")
 WebElement historicalBackground;
 @FindBy(xpath ="//button[contains(text(),'Take Test')]")
 WebElement taketest;
 @FindBy(css = ".btn-primary")
 WebElement readytobegin;
 @FindBy(xpath = "(//p[normalize-space()='A'])")
 WebElement option1;
 @FindBy(xpath = "(//button[normalize-space()='Next'])")
 WebElement nextintest;
 @FindBy(xpath = "(//p[normalize-space()='B'])")
 WebElement option2;
 @FindBy(xpath = "(//p[normalize-space()='A'])")
 WebElement option3;
 @FindBy(xpath = "(//p[normalize-space()='D'])")
 WebElement option4;
 @FindBy(xpath = "(//p[normalize-space()='C'])")
 WebElement option5;
 @FindBy(xpath = "//button[normalize-space()='Submit']")
 WebElement submit;
 @FindBy(xpath = "(//button[normalize-space()='Yes'])")
 WebElement yes;
 @FindBy(xpath = "(//button[contains(@class,'btn-secondary')][normalize-space()='Show solutions'])")
 WebElement showsolutions;
 @FindBy(xpath = "(//p[@class='solution-button'])")
 WebElement viewsolutions;
 @FindBy(xpath = "//div[@class='solution']")
 WebElement viewsolutionstext;
 @FindBy(xpath = "(//img[@class='close'])")
 WebElement cancel;
 @FindBy(xpath = "(//button[normalize-space()='End quiz'])")
 WebElement endquiz;
 @FindBy(xpath = "//div[contains(@class,'button next')]//img")
 WebElement nextvideos;
 @FindBy(xpath = "//button[@class='continue']")
 WebElement streak;
 @FindBy(xpath = "//div[@class='title-wrapper']//img")
 WebElement getback;
 @FindBy(xpath = "(//h3[normalize-space()='Making Of The Constitution'])")
 WebElement makingofconstitution;
 @FindBy(xpath = "(//h3[normalize-space()='Preamble'])")
 WebElement preamble;
 @FindBy(xpath = "(//h3[normalize-space()='Union & Its Territory'])")
 WebElement unionanditsterritory;
 @FindBy(xpath = "(//h3[normalize-space()='Citizenship'])")
 WebElement citizenship;
 @FindBy(xpath = "(//h3[normalize-space()='Fundamental Rights'])")
 WebElement fundamentalrights;
 @FindBy(xpath = "(//h3[normalize-space()='Fundamental Duties'])")
 WebElement fundamentalduties;
 @FindBy(xpath = "(//h3[normalize-space()='Directive Principles Of State Policy'])")
 WebElement directiveprincliples;
 @FindBy(xpath = "(//h3[normalize-space()='Major Constitutional Amendment Acts'])")
 WebElement majorconstitutionalamendment;
 @FindBy(xpath = "(//h3[normalize-space()='Unitary & Federal Features Of Indian Constitution'])")
 WebElement unitaryandfederal;
 @FindBy(xpath = "//h2[normalize-space()='Centre-State Relations']")
 WebElement centreStateRelationsSubtopic;
 @FindBy(xpath = "//h3[normalize-space()='Centre-State Relations']")
 WebElement centrestaterelations;
 @FindBy(xpath = "(//h3[normalize-space()='Parliamentary System'])")
 WebElement parlimentarysystem;
 @FindBy(xpath = "(//h3[normalize-space()='Inter-State Councils'])")
 WebElement interstatecouncil;
 @FindBy(xpath = "(//h3[normalize-space()='Emergency Provisions'])")
 WebElement emergencyprovisions;
 @FindBy(xpath = "(//h3[normalize-space()='Federal System'])")
 WebElement federalsystem;
 @FindBy(xpath = "(//h2[normalize-space()='Central Government'])")
 WebElement centralgovernmentSubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Parliament'])")
 WebElement parliment;
 @FindBy(xpath = "(//h3[normalize-space()='President & Vice-President'])")
 WebElement presidentandvicepresident;
 @FindBy(xpath = "(//h3[normalize-space()='President & Vice-President'])")
 WebElement primeminister;
 @FindBy(xpath = "(//h3[normalize-space()='Union Council Of Ministers'])")
 WebElement unioncouncilofministers;
 @FindBy(xpath = "(//h3[normalize-space()='Supreme Court'])")
 WebElement supremecourt;
 @FindBy(xpath = "(//h3[normalize-space()='Judicial Review, Judicial Activism & Pil'])")
 WebElement judicialreview;
 @FindBy(xpath = "(//h3[normalize-space()='Parliamentary Committee'])")
 WebElement parlimentarycommittee;
 @FindBy(xpath = "(//h2[normalize-space()='State Government'])")
 WebElement stategovernmentsubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Governor'])")
 WebElement governer;
 @FindBy(xpath = "(//h3[normalize-space()='Chief Minister'])")
 WebElement chiefminister;
 @FindBy(xpath = "(//h3[normalize-space()='High Court'])")
 WebElement highcourt;
 @FindBy(xpath = "(//h3[normalize-space()='State Council Of Minister'])")
 WebElement statecouncilofminister;
 @FindBy(xpath = "(//h3[normalize-space()='State Legisture'])")
 WebElement statelegislature;
 @FindBy(xpath = "(//h3[normalize-space()='Tribunals'])")
 WebElement tribunals;
 @FindBy(xpath = "(//h3[normalize-space()='Subordinate Courts'])")
 WebElement Subordinatecourts;
 @FindBy(xpath = "(//h2[normalize-space()='Panchayati Raj & 73Rd Amendment'])")
 WebElement panchayatrajsubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Panchayati Raj & 73Rd Amendment'])")
 WebElement panchayatraj;
 @FindBy(xpath = "//h3[normalize-space()='Urban Governance']")
 WebElement urbangovernance;
 @FindBy(xpath = "(//h2[normalize-space()='Schedule And Tribal Areas'])")
 WebElement scheduleandtribalareassubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Schedule And Tribal Areas'])")
 WebElement scheduleandtribalareas;
 @FindBy(xpath = "(//h2[normalize-space()='Election Commission'])")
 WebElement electioncommissionsubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Statutory & Constitutional Bodies'])")
 WebElement stationaryandconstitutionalbodies;
 @FindBy(xpath = "(//h3[normalize-space()='Finance Commission'])")
 WebElement financecommision;
 @FindBy(xpath = "(//h3[normalize-space()='Upsc & Spsc'])")
 WebElement upscandspsc;
 @FindBy(xpath = "(//h3[normalize-space()='National Commission For Scs'])")
 WebElement nationalcommisionforscs;
 @FindBy(xpath = "(//h3[normalize-space()='National Commission For Sts'])")
 WebElement nationalcommisionforsts;
 @FindBy(xpath = "(//h3[normalize-space()='National Commission For Obcs'])")
 WebElement nationalcommisionforobcs;
 @FindBy(xpath = "(//h3[normalize-space()='Cag'])")
 WebElement cag;
 @FindBy(xpath = "(//h3[normalize-space()='Gst'])")
 WebElement gst;
 @FindBy(xpath = "(//h3[normalize-space()='Special Officer For Linguistic Minorities'])")
 WebElement specialofficer;
 @FindBy(xpath = "(//h3[normalize-space()='Attorney General Of India'])")
 WebElement attornarygeneral;
 @FindBy(xpath = "(//h3[normalize-space()='Advocate General Of The State'])")
 WebElement advocategeneralofstate;
 @FindBy(xpath = "(//h2[normalize-space()='Major Non-Constitutional Bodies'])")
 WebElement majornonconstitutionsubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Major Non-Constitutional Bodies'])")
 WebElement majornonconstitution;
 @FindBy(xpath = "(//h2[normalize-space()='Co-Operative Society'])")
 WebElement cooperativesocietysubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Co-Operative Society'])")
 WebElement cooperativesociety;
 @FindBy(xpath = "(//h3[normalize-space()='Official Language'])")
 WebElement officiallanguage;
 @FindBy(xpath = "(//h2[normalize-space()='Political Parties'])")
 WebElement politicalpartiesubtopic;
 @FindBy(xpath = "(//h3[normalize-space()='Political Parties'])")
 WebElement politicalparties;
 @FindBy(xpath = "(//h3[normalize-space()='Anti-Defection Law'])")
 WebElement antidefectionlaw;
 
 String totalXPString;
 int firstXp;
 
 public void Login() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(login));
	 element.click();
 }
 
 public void DontAllow() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(dontAllow));
	 element.click();
 }
 
 public void EntermobileNumber() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.visibilityOf(enterMobileNumber));
	 element.sendKeys("7483513449");
 }

 public void LoginClick() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginClick));
	 element.click();
 }

 public void Otp() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.visibilityOf(otp));
	 element.sendKeys("1");
 }
 
 public void Otp1() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.visibilityOf(otp1));
	 element.sendKeys("2");
}
 
	public void Otp2() throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  WebElement element = wait.until(ExpectedConditions.visibilityOf(otp2));
	  element.sendKeys("3");
		
}
	public void Otp3() throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  WebElement element = wait.until(ExpectedConditions.visibilityOf(otp3));
	  element.sendKeys("4");
 }
	
 public void VerifyClick() throws InterruptedException {
	// Thread.sleep(15000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(verify));
	element.click();
	Thread.sleep(5000);
 }
	
 public void Stats() throws InterruptedException {
	 
	 try {
		 stats.click();
		Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println("Not Displayed Streak");
		Thread.sleep(8000);
	}
 }
 
 public void Syllabus()  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(syllabus)); 
	element.click();
 }
 
 public void HistoricalBackgroundSubtopic() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(historicalBackgroundSubtopic));
	 element.click();
 }
 
 public void HistoricalBackground() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(historicalBackground));
	 element.click();
 }
 
 public void TakeTest() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.visibilityOf(taketest));
	 try {
			Thread.sleep(3000);
			element.click();
		} catch (Exception e) {
		} 
 }
 
 public void ReadyToBegin() throws InterruptedException {
	 Thread.sleep(10000);
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.visibilityOf(readytobegin));
	 try {
			Thread.sleep(1000);
			element.click();
		} catch (Exception e) {
		} 
 }
 
 public void Option1() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(option1));
	 element.click();
 }
 
 public void NextinTest() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(option2));
	 element.click();
 }
 
 public void Option2() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(option3));
	 element.click();
 }
 
 public void Option3() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(option3));
	 element.click();
 }
 
 public void Option4() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(option4));
	 element.click();
 }
 
 public void Option5() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(option5));
	 element.click();
 }
 
 public void Submit() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submit));
	 element.click();
 }
 
 public void Yes() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(yes));
	 element.click();
 }
 
 public void ShowSolutions() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(showsolutions));
	 element.click();
 }
 
 public void ViewSolutions() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(viewsolutions));
	 element.click();
	 if(viewsolutionstext.isDisplayed()) {
		 cancel.click();
	 }
 }

 
 public void EndQuiz() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(endquiz));
	 element.click();
 }
 
 public void Streak() throws InterruptedException {
	 Thread.sleep(3000);
	 try {
		streak.click();
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println("Not Displayed Streak");
	}
	 
 }
 
 public void GetBack() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getback));
	 element.click();
 }
 
 public void MakingofConstitution() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(makingofconstitution));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void Preamble() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(preamble));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void UnionTerritory() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(unionanditsterritory));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void Citizenship() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(citizenship));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void FundamentalRights() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(fundamentalrights));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void FundamentalDuties() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(fundamentalduties));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void DirectivePrinciples() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(directiveprincliples));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void MajorConstitutional() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(majorconstitutionalamendment));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }

 public void UnitaryAndFederal() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(unitaryandfederal));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 
 public void CentreStateRelationsSubtopic() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(centreStateRelationsSubtopic));
	 element.click();
 }
 
 public void CentreStateRelations() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(centrestaterelations));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void Parlimentarysystem() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(parlimentarysystem));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void InterstateCouncil() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(interstatecouncil));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void Emergencyprovisions() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emergencyprovisions));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void FederalSystem() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(federalsystem));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 
 public void CentralGovernmentSubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(centralgovernmentSubtopic));
	 element.click();
 }
 
 public void Parliment() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(parliment));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void PesidentandVicepresident() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(presidentandvicepresident));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void PrimeMinister() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(primeminister));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void UnionCouncilofMinisters() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(unioncouncilofministers));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void JudicialReview() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(judicialreview));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 
 public void SupremeCourt() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(supremecourt));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }

 public void ParlimentaryCommittee() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(parlimentarycommittee));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 public void StateGovernmentSubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(stategovernmentsubtopic));
	 element.click();
 }
 public void Governer() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(governer));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void ChiefMinister() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(chiefminister));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void Highcourt() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(highcourt));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void StateCouncilofMinister() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(statecouncilofminister));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void StateLegislature() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(statelegislature));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void Tribunals() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tribunals));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void SubordinateCourts() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Subordinatecourts));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 public void PanchayathRajSubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(panchayatrajsubtopic));
	 element.click();
 }
 
 public void PanchayathRaj() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(panchayatraj));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 
 public void UrbanGovernance() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(urbangovernance));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 
 public void ScheduleandTribalAreasSubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(scheduleandtribalareassubtopic));
	 element.click();
 }
 public void ScheduleandTribalAreas() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(scheduleandtribalareas));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 
 public void ElectionCommissionSubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(electioncommissionsubtopic));
	 element.click();
 }
 public void StationaryandConstitutionslBodies() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(stationaryandconstitutionalbodies));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void FinanceCommission() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(financecommision));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void UpscandSpsc() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(upscandspsc));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void NationalCommissionforScs() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(nationalcommisionforscs));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void NationalCommissionforSts() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(nationalcommisionforsts));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void NationalCommisionforObcs() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(nationalcommisionforobcs));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void Cag() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cag));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void Gst() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(gst));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void SpecialOfficer() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(specialofficer));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void AttorneryGeneralofIndia() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(attornarygeneral));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void AdvocateGeneraloftheState() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(advocategeneralofstate));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 public void MajorNonconstitutionalBodiesSubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(majornonconstitutionsubtopic));
	 element.click();
 }
 
 public void MajorNonconstitutionalBodies() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(majornonconstitution));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 public void CoperativeSocietySubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cooperativesocietysubtopic));
	 element.click();
 }
 public void CoperativeSociety() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cooperativesociety));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 public void OfficialLanguage() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(officiallanguage));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 public void PoliticalPartiesSubtopic() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(politicalpartiesubtopic));
	 element.click();
 }
 
 public void PoliticalParties() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(politicalparties));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
 }
 
 public void AntiDefectionlaw() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(antidefectionlaw));
	 element.click();
	 this.TakeTest();
	 this.ReadyToBegin();
	 this.Option1();
	 this.NextinTest();
	 this.Option2();
	 this.Submit();
	 this.Yes();
	 this.ShowSolutions();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.NextinTest();
	 this.ViewSolutions();
	 this.EndQuiz();
	 this.GetBack();
 }
 
 } 