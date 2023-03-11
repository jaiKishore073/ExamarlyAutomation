package com.examarly.allpage;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarlyBaseClass.BaseclassWeb;

public class ArtandCultureTakeTest extends BaseclassWeb{
	
	public ArtandCultureTakeTest() {
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
	 @FindBy(xpath ="//span[normalize-space()='Art and Culture']")
	 WebElement artandculturemodule;
	 @FindBy(xpath ="//h2[normalize-space()='Indian Architecture']")
	 WebElement indianarchitecturesubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Indian Architecture']")
	 WebElement indianarchitecture;
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
	 @FindBy(xpath = "//h2[normalize-space()='Indian Sculpture']")
	 WebElement indiansculpturesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Indian Sculpture']")
	 WebElement indiansculpture;
	 @FindBy(xpath = "//h2[normalize-space()='Indian Pottery']")
	 WebElement indianpoetrysubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Indian Pottery']")
	 WebElement indianpoetry;
	 @FindBy(xpath = "//h2[normalize-space()='Arts Of Indus Valley Civilization']")
	 WebElement artsofindusvalleysubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Arts Of Indus Valley Civilization']")
	 WebElement artsofindusvalley;
	 @FindBy(xpath = "//h2[normalize-space()='Jainism And Buddhism']")
	 WebElement jainismandbuddhismsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Jainism And Buddhism']")
	 WebElement jainismandbuddhism;
	 @FindBy(xpath = "//h2[normalize-space()='Indian Paintings And Murals']")
	 WebElement indianpaintingsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Indian Paintings And Murals']")
	 WebElement indianpainting;
	 @FindBy(xpath = "//h2[normalize-space()='Indian Music']")
	 WebElement indianmusicsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Indian Music']")
	 WebElement indianmusic;
	 @FindBy(xpath = "//h2[normalize-space()='Indian Dance Forms']")
	 WebElement indiandanceformssubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Indian Dance Forms']")
	 WebElement indiandanceforms;
	 @FindBy(xpath = "//h2[normalize-space()='Indian Literature']")
	 WebElement indianliteraturesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Indian Literature']")
	 WebElement indianliterature;
	 @FindBy(xpath = "//h2[normalize-space()='Different Philosophies']")
	 WebElement differentphilosophiessubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Different Philosophies']")
	 WebElement differentphilosophies;
	 @FindBy(xpath = "//h2[normalize-space()='Other Art Forms']")
	 WebElement otherartformssubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Other Art Forms']")
	 WebElement otherartforms;
	 @FindBy(xpath = "//h2[normalize-space()='Coins In Ancient And Medieval India']")
	 WebElement coinsinancientsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Coins In Ancient And Medieval India']")
	 WebElement coinsinancient;
	 @FindBy(xpath = "//h2[normalize-space()='Fairs And Festivals Of India']")
	 WebElement fairsandfestivalsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Fairs And Festivals Of India']")
	 WebElement fairsandfestival;
	 
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
	 
	 public void ArtandCultureModule()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(artandculturemodule)); 
		element.click();
	 }
	
	 public void IndianArchitectureSubtopic()  {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianarchitecturesubtopic));  
		 element.click();
	}
	 
	 public void IndianArchitecture()  {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianarchitecture)); 
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
	 
	 public void IndianSculptureSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiansculpturesubtopic));
		 element.click();
	 }
	 
	 public void IndianSculpture() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiansculpture));
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
	 
	 public void IndianPoetrySubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianpoetrysubtopic));
		 element.click();
	 }
	 
	 public void IndianPoetry() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianpoetry));
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
	 
	 public void ArtsofIndusValleySubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(artsofindusvalleysubtopic));
		 element.click();
	 }
	 
	 public void ArtsofIndusValley() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(artsofindusvalley));
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
	
	 public void JainismandBuddhismSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(jainismandbuddhismsubtopic));
		 element.click();
	 }
	
	 public void JainismandBuddhism() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(jainismandbuddhism));
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
	
	 public void IndianPaintingSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianpaintingsubtopic));
		 element.click();
	 }
	 
	 public void IndianPainting() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianpainting));
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
	 
	 public void IndianMusicSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianmusicsubtopic));
		 element.click();
	 }
	 
	 public void IndianMusic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianmusic));
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
	
	 public void IndianDanceFormsSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiandanceformssubtopic));
		 element.click();
	 }
	 
	 public void IndianDanceForms() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiandanceforms));
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
	 
	 public void IndianLiteratureSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianliteraturesubtopic));
		 element.click();
	 }
	
	 public void IndianLiterature() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianliterature));
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
	
	 public void DifferentPhilosophiesSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(differentphilosophiessubtopic));
		 element.click();
	 }
	 
	 public void DifferentPhilosophies() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(differentphilosophies));
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
	 
	 public void OtherArtFormsSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(otherartformssubtopic));
		 element.click();
	 }
	 
	 public void OtherArtForms() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(otherartforms));
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
	 
	 public void CoinsinAncientSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(coinsinancientsubtopic));
		 element.click();
	 }
	 
	 public void CoinsinAncient() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(coinsinancient));
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
	 
	 public void FairsandFestivalsSubtopic() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(fairsandfestivalsubtopic));
		 element.click();
	 }
	 
	 public void FairsandFestivals() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(fairsandfestival));
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