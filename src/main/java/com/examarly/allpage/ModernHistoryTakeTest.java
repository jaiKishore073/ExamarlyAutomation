package com.examarly.allpage;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarlyBaseClass.BaseclassWeb;

public class ModernHistoryTakeTest extends BaseclassWeb{
	
	public ModernHistoryTakeTest() {
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
	 @FindBy(xpath ="//span[normalize-space()='Syllabus'][1]")
	 WebElement syllabus;
	 @FindBy(xpath ="//span[normalize-space()='Modern History']")
	 WebElement modernhistorymodule;
	 @FindBy(xpath ="(//h2[contains(text(),'Advent, Expansion And Consolidation Of British Pow')])[1]")
	 WebElement adventexpansionSubtopic;
	 @FindBy(xpath ="(//h3[contains(text(),'Advent, Expansion And Consolidation Of British Pow')])[1]")
	 WebElement adventexpansion;
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
	 @FindBy(xpath = "(//p[normalize-space()='Notes'])")
	 WebElement notes;
	 @FindBy(xpath = "//div[@class='title-wrapper']//img")
	 WebElement getback;
	 @FindBy(xpath = "//h2[contains(text(),'Economic Impact And Rising Resentment Against Brit')]")
	 WebElement economicimpactandraisingSubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Economic Impact And Rising Resentment Against Brit')]")
	 WebElement economicimpactandraising;
	 @FindBy(xpath = "//h2[normalize-space()='Socio-Religious And Cultural Reform']")
	 WebElement socioreligiousSubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Socio-Religious And Cultural Reform']")
	 WebElement socioreligious;
	 @FindBy(xpath = "//h2[normalize-space()='Indian National Movement']")
	 WebElement indiannationalsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Indian National Movement']")
	 WebElement indiannational;
	 @FindBy(xpath = "//h2[normalize-space()='Advent Of The Europeans In India']")
	 WebElement adventofeuropeanssubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Advent Of The Europeans In India']")
	 WebElement adventofeuropeans;
	 @FindBy(xpath = "//h2[normalize-space()='India On The Eve Of British Conquest']")
	 WebElement indiaontheevesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='India On The Eve Of British Conquest']")
	 WebElement indiaontheeve;
	 @FindBy(xpath = "(//h2[contains(text(),'Expansion And Consolidation Of British Power In In')])[2]")
	 WebElement expansionandconsolidationsubtopic;
	 @FindBy(xpath = "(//h3[contains(text(),'Expansion And Consolidation Of British Power In In')])[1]")
	 WebElement expansionandconsolidation;
	 @FindBy(xpath = "//h2[contains(text(),'People’S Resistance Against British Before 1857')]")
	 WebElement peoplesresistancesubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'People’S Resistance Against British Before 1857')]")
	 WebElement peoplesresistance;
	 @FindBy(xpath = "//h2[normalize-space()='The Revolt Of 1857']")
	 WebElement therevoltsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='The Revolt Of 1857']")
	 WebElement therevolt;
	 @FindBy(xpath = "//h2[normalize-space()='Socio-Religious Reform Movements: General Features']")
	 WebElement socioreligiousreformsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Socio-Religious Reform Movements: General Features']")
	 WebElement socioreligiousreform;
	 @FindBy(xpath = "//h2[contains(text(),'A General Survey Of Socio-Cultural Reform Movement')]")
	 WebElement ageneralsurveysubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'A General Survey Of Socio-Cultural Reform Movement')]")
	 WebElement ageneralsurvey;
	 @FindBy(xpath = "//h2[normalize-space()='Beginning Of Modern Nationalism In India']")
	 WebElement beginningofmodernsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Beginning Of Modern Nationalism In India']")
	 WebElement beginningofmodern;
	 @FindBy(xpath = "//h2[contains(text(),'Indian National Congress: Foundation And The Moder')]")
	 WebElement indiannationalcongresssubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Indian National Congress: Foundation And The Moder')]")
	 WebElement indiannationalcongress;
	 @FindBy(xpath = "//h2[normalize-space()='Era Of Militant Nationalism (1905-1909)']")
	 WebElement eraofmilitantsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Era Of Militant Nationalism (1905-1909)']")
	 WebElement eraofmilitant;
	 @FindBy(xpath = "//h2[contains(text(),'First Phase Of Revolutionary Activities (1907-1917')]")
	 WebElement firstphasesubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'First Phase Of Revolutionary Activities (1907-1917')]")
	 WebElement firstphase;
	 @FindBy(xpath = "//h2[normalize-space()='First World War And Nationalist Response']")
	 WebElement firstworldwarsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='First World War And Nationalist Response']")
	 WebElement firstworldwar;
	 @FindBy(xpath = "//h2[normalize-space()='Emergence Of Gandhi']")
	 WebElement emergenceofgandhisubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Emergence Of Gandhi']")
	 WebElement emergenceofgandhi;
	 @FindBy(xpath = "//h2[normalize-space()='Non-Cooperation Movement And Khilafat Aandolan']")
	 WebElement noncoperationsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Non-Cooperation Movement And Khilafat Aandolan']")
	 WebElement noncoperation;
	 @FindBy(xpath = "//h2[contains(text(),'Emergence Of Swarajists, Socialist Ideas,Revolutio')]")
	 WebElement emergenceofswarajistssubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Emergence Of Swarajists, Socialist Ideas,Revolutio')]")
	 WebElement emergenceofswarajists;
	 @FindBy(xpath = "//h2[normalize-space()='Simon Commission And The Nehru Report']")
	 WebElement simoncommissionsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Simon Commission And The Nehru Report']")
	 WebElement simoncommission;
	 @FindBy(xpath = "//h2[contains(text(),'Civil Disobedience Movement And Round Table Confer')]")
	 WebElement civildisobediencesubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Civil Disobedience Movement And Round Table Confer')]")
	 WebElement civildisobedience;
	 @FindBy(xpath = "//h2[contains(text(),'Debates On The Future Strategy After Civil Disobed')]")
	 WebElement debatesonfuturesubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Debates On The Future Strategy After Civil Disobed')]")
	 WebElement debatesonfuture;
	 @FindBy(xpath = "//h2[normalize-space()='Congress Rule In Provinces']")
	 WebElement congressrulesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Congress Rule In Provinces']")
	 WebElement congressrule;
	 @FindBy(xpath = "//h2[normalize-space()='Nationalist Response In The Wake Of World War Ii']")
	 WebElement nationalistresponsesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Nationalist Response In The Wake Of World War Ii']")
	 WebElement nationalistresponse;
	 @FindBy(xpath = "//h2[contains(text(),'Quit India Movement, Demand For Pakistan,And The I')]")
	 WebElement quitindiasubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Quit India Movement, Demand For Pakistan,And The I')]")
	 WebElement quitindia;
	 @FindBy(xpath = "//h2[normalize-space()='Post-War National Scenario']")
	 WebElement postwarsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Post-War National Scenario']")
	 WebElement postwar;
	 @FindBy(xpath = "//h2[normalize-space()='Independence With Partition']")
	 WebElement independencewithpartitionsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Independence With Partition']")
	 WebElement independencewithpartition;
	 @FindBy(xpath = "//h2[contains(text(),'Constitutional, Administrative And Judicial Develo')]")
	 WebElement constitutionaladminsubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Constitutional, Administrative And Judicial Develo')]")
	 WebElement constitutionaladmin;
	 @FindBy(xpath = "//h2[normalize-space()='Survey Of British Policies In India']")
	 WebElement surveyofbritishsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Survey Of British Policies In India']")
	 WebElement surveyofbritish;
	 @FindBy(xpath = "//h2[normalize-space()='Economic Impact Of British Rule In India']")
	 WebElement economicimpactsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Economic Impact Of British Rule In India']")
	 WebElement economicimpact;
	 @FindBy(xpath = "//h2[normalize-space()='Development Of Indian Press']")
	 WebElement developmentofindiansubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Development Of Indian Press']")
	 WebElement developmentofindian;
	 @FindBy(xpath = "//h2[normalize-space()='Development Of Education']")
	 WebElement developmentofeducationsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Development Of Education']")
	 WebElement developmentofeducation;
	 @FindBy(xpath = "//h2[normalize-space()='Peasant Movements 1857-1947']")
	 WebElement peasantmovementsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Peasant Movements 1857-1947']")
	 WebElement peasantmovement;
	 @FindBy(xpath = "//h2[normalize-space()='The Movement Of The Working Class']")
	 WebElement themovementofworkingsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='The Movement Of The Working Class']")
	 WebElement themovementofworking;
	 @FindBy(xpath = "//h2[normalize-space()='Challenges Before The New-Born Nation']")
	 WebElement challengesbeforesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Challenges Before The New-Born Nation']")
	 WebElement challengesbefore;
	 @FindBy(xpath = "//h2[normalize-space()='The Indian States']")
	 WebElement theindianstatessubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='The Indian States']")
	 WebElement theindianstates;
	 @FindBy(xpath = "//h2[normalize-space()='Miscellaneous']")
	 WebElement miscellaneoussubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Miscellaneous']")
	 WebElement miscellaneous;
	 
	 
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
	 
	 public void ModernHistoryModule()  {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(modernhistorymodule));
			element.click();
		 }
		
		 public void AdventExpansionSubtopic()  {
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(adventexpansionSubtopic));
				element.click();
		}
		 
		 public void AdventExpansion()  {
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(adventexpansion));
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
		 
		 public void GetBack() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getback));
			 element.click();
		 }
	
		 public void EconomicImpactandRaisingSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicimpactandraisingSubtopic));
			 element.click();
		 }
		 
		 public void EconomicImpactandRaising() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicimpactandraising));
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
	
		 public void SocialReligiousSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(socioreligiousSubtopic));
			 element.click();
		 }
		 
		 public void SocialReligious() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(socioreligious));
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
	
		 public void IndianNationalMovementSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiannationalsubtopic));
			 element.click();
		 }
		 
		 public void IndianNationalMovement() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiannational));
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
	
		 public void AdventofTheEuropeonSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(adventofeuropeanssubtopic));
			 element.click();
		 }
		 
		 public void AdventofTheEuropeon() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(adventofeuropeans));
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
		 public void IndiaonTheEveSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiaontheevesubtopic));
			 element.click();
		 }
		 
		 public void IndiaonTheEve() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiaontheeve));
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
		 public void ExpansionandConsolidationSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(expansionandconsolidationsubtopic));
			 element.click();
		 }
		 
		 public void ExpansionandConsolidation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(expansionandconsolidation));
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
		 public void PeoplesResistanceSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(peoplesresistancesubtopic));
			 element.click();
		 }
		 
		 public void PeoplesResistance() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(peoplesresistance));
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
		 public void TheRevoltof1857Subtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(therevoltsubtopic));
			 element.click();
		 }
		 
		 public void TheRevoltof1857() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(therevolt));
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
		 public void SocioReligousReformSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(socioreligiousreformsubtopic));
			 element.click();
		 }
		 
		 public void SocioReligousReform() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(socioreligiousreform));
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
		 public void AgeneralSurveySubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ageneralsurveysubtopic));
			 element.click();
		 }
		 
		 public void AgeneralSurvey() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ageneralsurvey));
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
		 public void BeginningofModernSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(beginningofmodernsubtopic));
			 element.click();
		 }
		 
		 public void BeginningofModern() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(beginningofmodern));
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
		 public void IndianNationalCongressSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiannationalcongresssubtopic));
			 element.click();
		 }
		 
		 public void IndianNationalCongress() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiannationalcongress));
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
		 public void EraofMillitantSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(eraofmilitantsubtopic));
			 element.click();
		 }
		 
		 public void EraofMillitant() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(eraofmilitant));
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
		 public void FirstPhaseSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(firstphasesubtopic));
			 element.click();
		 }
		 
		 public void FirstPhase() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(firstphase));			
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
		 
		 public void FirstWorldWarSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(firstworldwarsubtopic));
			 element.click();
		 }
		 
		 public void FirstWorldWar() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(firstworldwar));
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
		 
		 public void EmergenceofGandhiSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emergenceofgandhisubtopic));
			 element.click();
		 }
		 
		 public void EmergenceofGandhi() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emergenceofgandhi));
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
		 public void NonCooperationSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(noncoperationsubtopic));
			 element.click();
		 }
		 
		 public void NonCooperation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(noncoperation));
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
		 public void EmergenceofSwarajitsSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emergenceofswarajistssubtopic));
			 element.click();
		 }
		 
		 public void EmergenceofSwarajits() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emergenceofswarajists));
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
		 public void SimonCommissionSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(simoncommissionsubtopic));
			 element.click();
		 }
		 
		 public void SimonCommission() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(simoncommission));
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
		 public void CivilDisobedienceSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(civildisobediencesubtopic));
			 element.click();
		 }
		 
		 public void CivilDisobedience() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(civildisobedience));
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
		 public void DebatesSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(debatesonfuturesubtopic));
			 element.click();
		 }
		 
		 public void Debates() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(debatesonfuture));
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
		 public void CongressRuleSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(congressrulesubtopic));
			 element.click();
		 }
		 
		 public void CongressRule() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(congressrule));
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
		 public void NationalResponseSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(nationalistresponsesubtopic));
			 element.click();
		 }
		 
		 public void NationalResponse() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(nationalistresponse));
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
		 public void QuitIndiaMovementSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(quitindiasubtopic));
			 element.click();
		 }
		 
		 public void QuitIndiaMovement() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(quitindia));
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
		 public void PostWarSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(postwarsubtopic));
			 element.click();
		 }
		 
		 public void PostWar() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(postwar));
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
		 public void IndependenceSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(independencewithpartitionsubtopic));
			 element.click();
		 }
		 
		 public void Independence() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(independencewithpartition));
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
		 public void ConstitutionalAdminSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(constitutionaladminsubtopic));
			 element.click();
		 }
		 
		 public void ConstitutionalAdmin() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(constitutionaladmin));
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
		 public void SurveyofBritishSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(surveyofbritishsubtopic));
			 element.click();
		 }
		 
		 public void SurveyofBritish() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(surveyofbritish));
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
		 public void EconomicImpactSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicimpactsubtopic));
			 element.click();
		 }
		 
		 public void EconomicImpact() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicimpact));
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
		 public void DevelopmentofInidanPressSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(developmentofindiansubtopic));
			 element.click();
		 }
		 
		 public void DevelopmentofInidan() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(developmentofindian));
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
		 public void DevelopmentofEducationSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(developmentofeducationsubtopic));
			 element.click();
		 }
		 
		 public void DevelopmentofEducation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(developmentofeducation));
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
		 public void PeasantMovementsSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(peasantmovementsubtopic));
			 element.click();
		 }
		 
		 public void PeasantMovements() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(peasantmovement));
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
		 public void TheMovementofWorkingSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(themovementofworkingsubtopic));
			 element.click();
		 }
		 
		 public void TheMovementofWorking() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(themovementofworking));
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
		 public void ChallengesBeforeSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(challengesbeforesubtopic));
			 element.click();
		 }
		 
		 public void ChallengesBefore() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(challengesbefore));
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
		 public void TheIndianStatesSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(theindianstatessubtopic));
			 element.click();
		 }
		 
		 public void TheIndianStates() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(theindianstates));
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
		 public void MiscellaneousSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(miscellaneoussubtopic));
			 element.click();
		 }
		 
		 public void Miscellaneous() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(miscellaneous));
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
