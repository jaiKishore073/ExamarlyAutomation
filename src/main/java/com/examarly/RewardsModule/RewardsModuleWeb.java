package com.examarly.RewardsModule;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarly.utils.WAITS;
import com.examarlyBaseClass.BaseclassWeb;

 public class RewardsModuleWeb  extends BaseclassWeb{
	
 public RewardsModuleWeb() {
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
 @FindBy(xpath = "(//div[contains(@class,'xp-details')])[1]//h3")
 WebElement totalXp;
 @FindBy(xpath ="//span[normalize-space()='Syllabus']")
 WebElement syllabus;
 @FindBy(xpath = "//h2[normalize-space()='Historical Background']")
 WebElement historicalBackground;
 @FindBy(xpath = "//h3[normalize-space()='Historical Background']")
 WebElement historicalBackgroundSubtopic;
 @FindBy(xpath ="//button[contains(text(),'Take Test')]")
 WebElement taketest;
 @FindBy(css = ".btn-primary")
 WebElement readytobegin;
 @FindBy(xpath = "//p[normalize-space()='A']")
 WebElement q1;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement next;
 @FindBy(xpath = "//p[normalize-space()='A']")
 WebElement q2;
 @FindBy(xpath = "//p[normalize-space()='A']")
 WebElement q3;
 @FindBy(xpath = "//button[normalize-space()='Submit']")
 WebElement submit;
 @FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
 WebElement yes;
 @FindBy(xpath = "//p[contains(@class,'score')]")
 WebElement score;
 @FindBy(css = "div[class='button-container desktop'] button[class='btn-primary']")
 WebElement nextintest;
 @FindBy(css = "div[class='button-container desktop'] button[class='btn-primary']")
 WebElement nextintest1;
 @FindBy(xpath = "//p[@class='box-value']")
 WebElement XPEarned;
 @FindBy(xpath = "(//span[contains(text(),'Stats')])[1]")
 WebElement statspage;
 @FindBy(xpath = "//div[@class='sub-heading']")
 WebElement completeyourstreak; 
 @FindBy(xpath = "//button[@class='continue']")
 WebElement continuebuttoninstreak; 
 @FindBy(xpath = "(//div[@class='xp-details'])[1]//h3")
 WebElement rewardsgained;
 @FindBy(xpath = "//button[@class='primary continue']")
 WebElement continuebutton;
 @FindBy(xpath = "//div[@aria-label='animation']")
 WebElement streak;
 @FindBy(xpath = "//button[@class='continue']")
 WebElement clickoncontinue;
 @FindBy(xpath = "(//h3[normalize-space()='Making Of The Constitution'])[1]")
 WebElement makingofconstitution;
 @FindBy(xpath = "(//button[normalize-space()='Take Revision Test 1'])[1]")
 WebElement takerevisiontest;
 @FindBy(xpath ="(//span[normalize-space()='Ancient History'])[1]")
 WebElement ancienthistory;
 @FindBy(xpath = "//h2[normalize-space()='The Stone Age']")
 WebElement thestoneage;
 @FindBy(xpath = "//h3[normalize-space()='The Stone Age']")
 WebElement thestoneagesubtopic;
 @FindBy(xpath = "//button[@class='primary continue']")
 WebElement topiccompletion;
 @FindBy(xpath = "(//button[@class='primary continue'])[1]")
 WebElement completionofallsubtopics;
 @FindBy(xpath = "(//span[contains(text(),'Stats')])[1]")
 WebElement statspagelast;
 @FindBy(xpath = "//div[@class='title-wrapper']//img")
 WebElement getback;
 
 String totalXPString;
 String totalrewardsatendString;
 int totalscoreNumber;
 int firstXp;
 int gainedXP;
 int totalXP;
 
 public void Login() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, login, 20); 
	 login.click();
 }
 
 public void DontAllow() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, dontAllow, 20); 
	 dontAllow.click();
 }
 
 public void EntermobileNumber() throws InterruptedException {
	 WAITS.waitforelementtobevisibleWebElement(driver, enterMobileNumber, 20); 
	 enterMobileNumber.sendKeys("8553481764");
 }

 public void LoginClick() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, loginClick, 20); 
	 loginClick.click();
 }

 public void Otp() throws InterruptedException {
	 WAITS.waitforelementtobevisibleWebElement(driver, otp, 20); 
	 otp.sendKeys("1");
 }
	public void Otp1() throws InterruptedException {
    WAITS.waitforelementtobevisibleWebElement(driver, otp1, 20); 
	otp1.sendKeys("2");
}
	public void Otp2() throws InterruptedException {
	WAITS.waitforelementtobevisibleWebElement(driver, otp2, 20); 
	otp2.sendKeys("3"); 
}
	public void Otp3() throws InterruptedException {
	WAITS.waitforelementtobevisibleWebElement(driver, otp3, 20); 	
	otp3.sendKeys("4");
 }
	
 public void VerifyClick() throws InterruptedException {
	WAITS.waitforelementtobeclickable(driver, verify, 20);
	verify.click();
	Thread.sleep(8000);
 }
	
 public void Stats() throws InterruptedException {
	stats.click();
	Thread.sleep(5000);
 }

 public void TotalXp() throws InterruptedException {
	totalXPString = totalXp.getText();
	firstXp = Integer.parseInt(totalXPString);
	System.out.println(totalXPString);
	Thread.sleep(3000);
 }

 public void Syllabus() throws InterruptedException {
	WAITS.waitforelementtobeclickable(driver, syllabus, 20); 
    syllabus.click();
 }
 
 public void HistoricalBackground() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, historicalBackground, 20);
	 historicalBackground.click();
 }

 public void HistoricalBackgroundSubtopic() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, historicalBackgroundSubtopic, 20);
	 historicalBackgroundSubtopic.click();
 }

 public void TakeTest() throws InterruptedException {
		 WAITS.waitforelementtobeclickable(driver, taketest, 10);
		 Thread.sleep(3000);
		 taketest.click();
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

 public void Q1() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, q1, 20);
	 q1.click();
 }

 public void Next() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, next, 20);
	 next.click();
 }
 
 public void Q2() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, q2, 20);
	 q2.click();
 }
 
 public void Q3() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, q3, 20);
	 q3.click();
 }
 
 public void Submit() throws InterruptedException {
	WAITS.waitforelementtobeclickable(driver, submit, 20);
	submit.click();
 }
 
 public void Yes() throws InterruptedException {
	WAITS.waitforelementtobeclickable(driver, yes, 20);
	yes.click();
	Thread.sleep(50000);
 }
 
 public void Score() throws InterruptedException {
	 WAITS.waitforelementtobeclickable(driver, score, 20);
	 String scoreString = score.getText();
	 String[] scoreStringwithoutpercentageString = scoreString.split("%");
	 String totalscore = scoreStringwithoutpercentageString[0];
	 totalscoreNumber = Integer.parseInt(totalscore);
	 System.out.println(scoreString);
	 System.out.println(totalscore);
	 Thread.sleep(5000);
}

 public void NextinTest() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(nextintest));
	 nextintest.click();
 }
 
 public void XPEarned() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(XPEarned));
	String xPEarnedString = XPEarned.getText();
	gainedXP = Integer.parseInt(xPEarnedString);
	System.out.println(xPEarnedString);
	int XP = Integer.parseInt(xPEarnedString);
	int divide = 2;
	int requirevalue = totalscoreNumber/divide;
	if (requirevalue == XP) {
		System.out.println("Percentage calculated and the score obtained is validated");
	}
	continuebutton.click();
	Thread.sleep(3000);
//	String rewardsGainedString = rewardsgained.getText();
//	totalXP = Integer.parseInt(rewardsGainedString);
//	System.out.println(rewardsgained.getText());
//	if (totalXP==(firstXp + gainedXP)) {
//		System.out.println("XP Points Validated");
	}
// 
 public void Streak() throws InterruptedException {
	 try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(clickoncontinue));
		element.click();
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println("Not Displayed Streak");
	} 
 }
 
	public void MakingOfTheConstitution() throws InterruptedException {
		WAITS.waitforelementtobeclickable(driver, makingofconstitution, 20);
		makingofconstitution.click();
	}
	
	public void TakeRevisionTest() throws InterruptedException{
		WAITS.waitforelementtobeclickable(driver, takerevisiontest, 20);
	    takerevisiontest.click();
	    Thread.sleep(8000);
	}
	
	public void XPEarned1() throws InterruptedException {
		String xPEarnedString = XPEarned.getText();
		gainedXP = Integer.parseInt(xPEarnedString);
		System.out.println(xPEarnedString);
		int XP = Integer.parseInt(xPEarnedString);
		int divide = 2;
		int requirevalue = totalscoreNumber/divide;
		if (requirevalue == XP) {
			System.out.println("Percentage calculated and the score obtained is validated");
		}
		continuebutton.click();
		Thread.sleep(5000);
 }
	
	public void GetBack() throws InterruptedException {
		 WAITS.waitforelementtobevisibleWebElement(driver, getback, 20); 
		 getback.click();
	 }
	
	public void AncientHistory () throws InterruptedException{
		WAITS.waitforelementtobeclickable(driver, ancienthistory, 20);
		ancienthistory.click();
	}
	
	public void TheStoneAge () throws InterruptedException{
		WAITS.waitforelementtobeclickable(driver, thestoneage, 20);
		thestoneage.click();
	    WAITS.waitforelementtobeclickable(driver, thestoneagesubtopic, 20);
	    thestoneagesubtopic.click();
	    Thread.sleep(5000);
	}	
	
	public void NextinTest1() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(nextintest1));
		 nextintest.click();
		 Thread.sleep(3000);
	 }
	
	public void TopicCompletion () throws InterruptedException{
		WAITS.waitforelementtobeclickable(driver, continuebutton, 20);
		continuebutton.click();
		Thread.sleep(3000);
	}
	
	public void Completionofallsubtopics () throws InterruptedException{
		String xPEarnedString = XPEarned.getText();
		gainedXP = Integer.parseInt(xPEarnedString);
		System.out.println(xPEarnedString);
		int XP = Integer.parseInt(xPEarnedString);
		int requirevalue = 10;
		if (requirevalue == XP) {
			System.out.println("Percentage calculated and the score obtained is validated");
		}
		continuebutton.click();
		Thread.sleep(5000);
	}
		
		public void Streak1() throws InterruptedException {
		try {
			completionofallsubtopics.click();
		} catch (Exception e) {
			System.out.println("Not Displayed Streak");
			Thread.sleep(3000);
		}
		}

	
	public void StatPage () throws InterruptedException{
		WAITS.waitforelementtobeclickable(driver, statspagelast, 20);
		statspagelast.click();
	    Thread.sleep(3000);
	}
	
	public void Validate () throws InterruptedException{
		totalXPString = totalXp.getText();
		firstXp = Integer.parseInt(totalXPString);
		System.out.println(totalXPString);
	    int i = firstXp;
		int p = 70;
		int Totalvaluerequired = i + p;
		
		if(Totalvaluerequired == firstXp) {
		System.out.println("TotalXp are Added to the Main Account");
		}
	}	
		
	}
