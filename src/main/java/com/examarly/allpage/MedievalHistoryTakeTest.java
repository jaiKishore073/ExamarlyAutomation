package com.examarly.allpage;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarlyBaseClass.BaseclassWeb;

public class MedievalHistoryTakeTest extends BaseclassWeb {
	
	public MedievalHistoryTakeTest() {
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
	 @FindBy(xpath ="//span[normalize-space()='Medieval History']")
	 WebElement medievalhistorymodule;
	 @FindBy(xpath ="//h2[contains(text(),'Northern')]")
	 WebElement northernindiasubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Northern')]")
	 WebElement northernindia;
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
	 @FindBy(xpath ="//h2[normalize-space()='South India: Chola']")
	 WebElement southindiasubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='South India: Chola']")
	 WebElement southindia;
	 @FindBy(xpath ="//h2[contains(text(),'Economic And Social Life, Education And Religious ')]")
	 WebElement economicandsocialsubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Economic And Social Life, Education And Religious ')]")
	 WebElement economicandsocial;
	 @FindBy(xpath ="//h2[contains(text(),'Rise Of Rajput Kingdom,Provincial Kingdom ,Foreign')]")
	 WebElement riseofrajputsubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Rise Of Rajput Kingdom,Provincial Kingdom ,Foreign')]")
	 WebElement riseofrajput;
	 @FindBy(xpath ="//h2[normalize-space()='Delhi Sultanate']")
	 WebElement delhisultanatesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Delhi Sultanate']")
	 WebElement delhisultanate;
	 @FindBy(xpath ="//h2[contains(text(),'Government, And Economic And Social Life Under Del')]")
	 WebElement governmentandeconomicsubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Government, And Economic And Social Life Under Del')]")
	 WebElement governmentandeconomic;
	 @FindBy(xpath ="//h2[contains(text(),'Vijaynagar Empire,Bahmani Kingdom, Provincial King')]")
	 WebElement vijaynagarsubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Vijaynagar Empire,Bahmani Kingdom, Provincial King')]")
	 WebElement vijaynagar;
	 @FindBy(xpath ="//h2[normalize-space()='Struggle For Empire In North India(1400-1525Ce)']")
	 WebElement strugglesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Struggle For Empire In North India(1400-1525Ce)']")
	 WebElement struggle;
	 @FindBy(xpath ="//h2[contains(text(),'Cultural Development In India(1200-1500Ce)- Bhakti')]")
	 WebElement culturaldevelopmentsubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Cultural Development In India(1200-1500Ce)- Bhakti')]")
	 WebElement culturaldevelopment;
	 @FindBy(xpath ="//h2[normalize-space()='Mughal Empire And Afghan(1525-1555Ce)']")
	 WebElement mughalsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Mughal Empire And Afghan(1525-1555Ce)']")
	 WebElement mughal;
	 @FindBy(xpath ="//h2[normalize-space()='Consolidation Of The Mughal Empire Age Of Akbar']")
	 WebElement consolidationsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Consolidation Of The Mughal Empire Age Of Akbar']")
	 WebElement consolidation;
	 @FindBy(xpath ="//h2[normalize-space()='Deccan And South India(Up To 1656)']")
	 WebElement deccanandsouthsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Deccan And South India(Up To 1656)']")
	 WebElement deccanandsouth;
	 @FindBy(xpath ="//h2[normalize-space()='India In The First Half Of The Seventeenth Century']")
	 WebElement indiainsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='India In The First Half Of The Seventeenth Century']")
	 WebElement indian;
	 @FindBy(xpath ="//h2[normalize-space()='Economic And Social Life Under The Mughals']")
	 WebElement economicandsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Economic And Social Life Under The Mughals']")
	 WebElement economicand;
	 @FindBy(xpath ="//h2[normalize-space()='Cultural And Religious Developments']")
	 WebElement culturalsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Cultural And Religious Developments']")
	 WebElement cultural;
	 @FindBy(xpath ="//h2[contains(text(),'Climax And Disintegration Of The Mughal Empire + R')]")
	 WebElement climaxsubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Climax And Disintegration Of The Mughal Empire + R')]")
	 WebElement climax;
	 
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
	 
	 public void MedievalHistoryModule()  {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(medievalhistorymodule));
		 element.click();
	 }
		
		 public void NorthIndiaSubtopic()  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(northernindiasubtopic));
			element.click();
		}
		 
		 public void NorthIndia()  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(northernindia));
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
	
		 public void SouthIndiaSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(southindiasubtopic));
			 element.click();
		 }
		 
		 public void SouthIndia() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(southindia));
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
	
		 public void EconomicandSocialSubbtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicandsocialsubtopic));
			 element.click();
		 }
		 
		 public void EconomicandSocial() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicandsocial));
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
	
		 public void RiseofRajputSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(riseofrajputsubtopic));
			 element.click();
		 }
		 
		 public void RiseofRajput() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(riseofrajput));
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
	
		 public void DelhiSultanateSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(delhisultanatesubtopic));
			 element.click();
		 }
		 
		 public void DelhiSultanate() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(delhisultanate));
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
		 public void GovernmentandEconomicSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(governmentandeconomicsubtopic));
			 element.click();
		 }
		 
		 public void GovernmentandEconomic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(governmentandeconomic));
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
		 public void VijaynagarEmpireSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(vijaynagarsubtopic));
			 element.click();
		 }
		 
		 public void VijaynagarEmpire() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(vijaynagar));
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
		 public void StruggleforEmpireSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(strugglesubtopic));
			 element.click();
		 }
		 
		 public void StruggleforEmpire() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(struggle));
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
		 public void CulturalDevelopmentSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(culturaldevelopmentsubtopic));
			 element.click();
		 }
		 
		 public void CulturalDevelopment() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(culturaldevelopment));
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
		 public void MughalEmpireSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mughalsubtopic));
			 element.click();
		 }
		 
		 public void MughalEmpire() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mughal));
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
		 public void ConsolidationSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(consolidationsubtopic));
			 element.click();
		 }
		 
		 public void Consolidation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(consolidation));
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
		 public void DeccanandSouthIndiaSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(deccanandsouthsubtopic));
			 element.click();
		 }
		 
		 public void DeccanandSouthIndia() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(deccanandsouth));
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
		 public void IndiainteFirstSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiainsubtopic));
			 element.click();
		 }
		 
		 public void IndiainteFirst() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indian));
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
		 public void EconomicandSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicandsubtopic));
			 element.click();
		 }
		 
		 public void Economicand() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicand));
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
		 public void CulturalandReligiousSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(culturalsubtopic));
			 element.click();
		 }
		 
		 public void CulturalandReligious() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cultural));
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
		 
		 public void ClimaxSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(climaxsubtopic));
			 element.click();
		 }
		 
		 public void Climax() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(climax));
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
