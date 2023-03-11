package com.examarly.allpage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.examarlyBaseClass.BaseclassWeb;

public class AncientHistoryTakeTest extends BaseclassWeb{
	
	public AncientHistoryTakeTest() {
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
	 @FindBy(xpath ="//span[normalize-space()='Ancient History']")
	 WebElement ancienHistoryModule;
	 @FindBy(xpath ="//h2[normalize-space()='The Stone Age']")
	 WebElement stoneagesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='The Stone Age']")
	 WebElement stoneage;
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
	 @FindBy(xpath ="//h2[normalize-space()='Indus Valley Civilisation']")
	 WebElement indusvalleysubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Indus Valley Civilisation']")
	 WebElement indusvalley;
	 @FindBy(xpath ="//h2[normalize-space()='Vedic Age']")
	 WebElement vedicagesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Vedic Age']")
	 WebElement vedicage;
	 @FindBy(xpath ="//h2[normalize-space()='Jainism+Buddhism']")
	 WebElement jainismandbudhismsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Jainism+Buddhism']")
	 WebElement jainismandbudhism;
	 @FindBy(xpath ="//h2[normalize-space()='Mahajanapadas']")
	 WebElement mahajanapadassubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Mahajanapadas']")
	 WebElement mahajanapadas;
	 @FindBy(xpath ="//h2[normalize-space()='Mauryas']")
	 WebElement mouryassubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Mauryas']")
	 WebElement mouryas;
	 @FindBy(xpath ="//h2[normalize-space()='Post Mauryan Age']")
	 WebElement postmouryanagesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Post Mauryan Age']")
	 WebElement postmouryanage;
	 @FindBy(xpath ="//h2[normalize-space()='Guptas']")
	 WebElement guptassubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Guptas']")
	 WebElement guptas;
	 @FindBy(xpath ="//h2[normalize-space()='Regional Civilisations']")
	 WebElement regionalcivilisationsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Regional Civilisations']")
	 WebElement regionalcivilisation;
	 @FindBy(xpath ="//h2[normalize-space()='Religion, Science,Architecture And Civilisation']")
	 WebElement religionsciencesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Religion, Science,Architecture And Civilisation']")
	 WebElement religionscience;
	 @FindBy(xpath ="//h2[normalize-space()='Sangam Age']")
	 WebElement sangamagesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Sangam Age']")
	 WebElement sangamage;
	 
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
	 
	 public void AncientHistoryModule()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ancienHistoryModule)); 
		element.click();
	 }
	
	 public void TheStoneAgeSubtopic()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(stoneagesubtopic)); 
		element.click();
	}
	 
	 public void TheStoneAge()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(stoneage));
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
	 
	 public void IndusValleySubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indusvalleysubtopic));
		 element.click();
	 }
	 
	 public void IndusValley() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indusvalley));
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
	 
	 public void VedicAgeSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(vedicagesubtopic));
		 element.click();
	 }
	 
	 public void VedicAge() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(vedicage));
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
	 
	 public void JainismBuddismSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(jainismandbudhismsubtopic));
		 element.click();
	 }
	 
	 public void JainismBuddism() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(jainismandbudhism));
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
	 
	 public void MahajanapadasSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mahajanapadassubtopic));
		 element.click();
	 }
	 
	 public void Mahajanapadas() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mahajanapadas));
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
	
	 public void MouryasSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mouryassubtopic));
		 element.click();
	 }
	
	 public void Mouryas() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mouryas));
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
	
	 public void PostMouryanAgeSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(postmouryanagesubtopic));
		 element.click();
	 }
	 
	 public void PostMouryanAge() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(postmouryanage));
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
	 
	 public void GuptasSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(guptassubtopic));
		 element.click();
	 }
	 
	 public void Guptas() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(guptas));
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
	
	 public void RegionalCivilisationsSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(regionalcivilisationsubtopic));
		 element.click();
	 }
	 
	 public void RegionalCivilisations() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(regionalcivilisation));
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
	 
	 public void ReligionScienceSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(religionsciencesubtopic));
		 element.click();
	 }
	
	 public void ReligionScience() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(religionscience));
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
	
	 public void SangamAgeSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(sangamagesubtopic));
		 element.click();
	 }
	 
	 public void SangamAge() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(sangamage));
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
