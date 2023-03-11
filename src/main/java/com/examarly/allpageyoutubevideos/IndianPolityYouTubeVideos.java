package com.examarly.allpageyoutubevideos;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.examarly.utils.WAITS;
import com.examarlyBaseClass.BaseclassWeb;

public class IndianPolityYouTubeVideos extends BaseclassWeb {
	
	public IndianPolityYouTubeVideos() {
		PageFactory.initElements(driver, this);
	  }
	
	@FindBy(xpath = "//div[@class='homepage-landing-section-hero-button start-todays-prep btn-stp-cpy']")
	 WebElement login;
	 @FindBy(xpath = "//button[@class='ng-binding'][1]")
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
	 @FindBy(xpath = "//button[normalize-space()='View Achievements']")
	 WebElement stats;
	 @FindBy(xpath ="//span[normalize-space()='Syllabus']")
	 WebElement syllabus;
	 @FindBy(xpath = "//h2[normalize-space()='Historical Background']")
	 WebElement historicalBackground;
	 @FindBy(xpath = "//h3[normalize-space()='Historical Background']")
	 WebElement historicalBackgroundSubtopic;
	 @FindBy(xpath ="//div[@class='content-wrapper-container']")
	 WebElement video;
	 @FindBy(xpath ="//div[@class='left-video-section']")
	 WebElement youtubeclick;
	 @FindBy(xpath = "(//div[@class='button next '])[1]")
	 WebElement Youtubenext;
	 @FindBy(xpath = "//div[@class='title-wrapper']//img")
	 WebElement getback;
	 @FindBy(xpath = "(//h3[normalize-space()='Making Of The Constitution'])[1]")
	 WebElement makingofconstitution;
	 @FindBy(xpath ="//div[@class='nav-buttons nav-buttons--right']")
	 WebElement topicforward;
	 @FindBy(xpath ="//span[normalize-space()='Environment']")
	 WebElement environmentmodule;
	 @FindBy(xpath ="//h2[normalize-space()='Ecology']")
	 WebElement ecologytopic;
	 @FindBy(xpath ="//h3[normalize-space()='Ecology']")
	 WebElement ecologysubtopic;
	 
	 public void Login() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(login));
		 login.click();
	 }
	 
	 public void DontAllow() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(dontAllow));
		 dontAllow.click();
	 }
	 
	 public void EntermobileNumber() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element = wait.until(ExpectedConditions.visibilityOf(enterMobileNumber));
		 enterMobileNumber.sendKeys("8553481764");
	 }

	 public void LoginClick() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginClick));
		 loginClick.click();
	 }

	 public void Otp() throws InterruptedException {
		 WAITS.waitforelementtobevisibleWebElement(driver, otp, 10);
		 otp.sendKeys("1");
	 }
	 
	 public void Otp1() throws InterruptedException {
		 WAITS.waitforelementtobevisibleWebElement(driver, otp1, 10);
		 otp1.sendKeys("2");
	}
	 
		public void Otp2() throws InterruptedException {
		  WAITS.waitforelementtobevisibleWebElement(driver, otp2, 10);
		  otp2.sendKeys("3");
			
	}
		public void Otp3() throws InterruptedException {
		  WAITS.waitforelementtobevisibleWebElement(driver, otp3, 10);
		  otp3.sendKeys("4");
	 }
		
	 public void VerifyClick() throws InterruptedException {
		WAITS.waitforelementtobeclickable(driver, verify, 20);
		verify.click();
		Thread.sleep(6000);
	 }
		
	 public void Stats() throws InterruptedException {
		stats.click();
	 }
	 
	 public void Syllabus()  {
		WAITS.waitforelementtobeclickable(driver, syllabus, 20); 
	    syllabus.click();
	 }
	 
	 public void HistoricalBackground() {
		 WAITS.waitforelementtobeclickable(driver, historicalBackground, 20);
		 historicalBackground.click();
	 }
	 
	 public void HistoricalBackgroundSubtopic() {
		 WAITS.waitforelementtobeclickable(driver, historicalBackgroundSubtopic, 20);
		 historicalBackgroundSubtopic.click();
	 }
	 
	 public void Video()  {
		WAITS.waitforelementtobeclickable(driver, video, 20); 
		video.click();
	 }
	 
	 public void YoutubeClick() throws InterruptedException  {
		WAITS.waitforelementtobeclickable(driver, youtubeclick, 20); 
		Boolean errormessagedisplayed = Youtubenext.isDisplayed();
		while (errormessagedisplayed) {
			youtubeclick.click();
			Thread.sleep(3000);
			youtubeclick.click();
			Thread.sleep(3000);
			try {
				Youtubenext.click();
			} catch (Exception e) {
				errormessagedisplayed = false;
			}
			
		}
	 }
	 
	 public void GetBack() throws InterruptedException  {
		WAITS.waitforelementtobeclickable(driver, getback, 20); 
		getback.click();
		Thread.sleep(3000);
		getback.click();
	 }

	 public void MakingofConstitution() throws InterruptedException {
		 WAITS.waitforelementtobeclickable(driver, makingofconstitution, 20);
		 makingofconstitution.click();
		 this.Video();
		 this.YoutubeClick();
		 this.GetBack();
	 }
	
	 public void GetFoward() throws InterruptedException  {
		 Thread.sleep(2000);
		WAITS.waitforelementtobeclickable(driver, topicforward, 20); 
		topicforward.click();
	 }
	 
	 public void EnvironmentModule() throws InterruptedException  {
		 Thread.sleep(2000);
			WAITS.waitforelementtobeclickable(driver, environmentmodule, 20); 
			environmentmodule.click();
		 }
	 
	 public void EcologyTopic() {
		 WAITS.waitforelementtobeclickable(driver, ecologytopic, 20);
		 ecologytopic.click();
	 }
	 
	 public void EcologySubTopic() {
		 WAITS.waitforelementtobeclickable(driver, ecologysubtopic, 20);
		 ecologysubtopic.click();
	 }
	 
	
//	 WebElement youtubevideo;
//	 @FindBy(xpath ="(//body/div[@id='root']/div[2]")
//	 WebElement youtubevideoclick; 
//	 @FindBy(xpath = "//button[normalize-space()='Take Test']")
//	 
//	public void YouTube() throws InterruptedException {
//		 WAITS.waitforelementtobeclickable(driver, youtubevideo, 20);
//		 youtubevideo.click();
//	 }
//	 
//	 public void YouTubeClick() throws InterruptedException {
//		 //WAITS.waitforelementtobeclickable(driver, youtubevideoclick, 20);
//		 Thread.sleep(5000);
//		 youtubevideoclick.click();
//		 Thread.sleep(3000);
//		 youtubevideoclick.click();
//		 
//		 for(int i=0;i<=5;i++)
//		 {
//		 nextvideos.click();
//		 }	 
//		 WAITS.waitforelementtobeclickable(driver,getback, 10);
//		 getback.click();
//	 }
//	 
//	 
//	 public void Notes() throws InterruptedException {
//		 WAITS.waitforelementtobeclickable(driver, notes, 10);
//		 notes.click();
//		 Thread.sleep(3000);
//		 
//	 for(int i=0;i<=9;i++)
//	    {
//		 nextvideos.click();
//	     }
//	 }
//	 

}
