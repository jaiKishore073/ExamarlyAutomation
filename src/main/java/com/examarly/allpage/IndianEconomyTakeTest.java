package com.examarly.allpage;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarlyBaseClass.BaseclassWeb;

public class IndianEconomyTakeTest extends BaseclassWeb {

	public IndianEconomyTakeTest() {
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
	 @FindBy(xpath ="//div[contains(@class,'nav-buttons nav-buttons--right')]//img")
	 WebElement forwardmodule;
	 @FindBy(xpath ="//span[normalize-space()='Indian Economy']")
	 WebElement indianeconomymodule;
	 @FindBy(xpath ="//h2[contains(text(),'Land Reforms, Five Year Plans And Industrial Polic')]")
	 WebElement landreformssubtopic;
	 @FindBy(xpath ="//h3[contains(text(),'Land Reforms, Five Year Plans And Industrial Polic')]")
	 WebElement landreforms;
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
	 @FindBy(xpath = "//h3[contains(text(),'Poverty : Identification, Estimation And Its Cause')]")
	 WebElement povertyidentification;
	 @FindBy(xpath = "//h3[normalize-space()='Human Capital Formation In India']")
	 WebElement humancapital;
	 @FindBy(xpath = "//h3[contains(text(),'Rural Development : Agriculture And Credit Develop')]")
	 WebElement ruraldevelopmentagriculture;
	 @FindBy(xpath = "//h3[normalize-space()='Employment']")
	 WebElement employment;
	 @FindBy(xpath = "//h3[normalize-space()='Infrastructure : Health And Energy']")
	 WebElement infrastructurehealth;
	 @FindBy(xpath = "//h3[normalize-space()='Sustainable Development']")
	 WebElement sustainabledevelopment;
	 @FindBy(xpath = "//h3[normalize-space()='Indicators Of Human Development']")
	 WebElement indicatorsofhuman;
	 @FindBy(xpath = "//div[@class='title-wrapper']//img")
	 WebElement getback;
	 @FindBy(xpath = "//h2[contains(text(),'Money : Fiat Money, Money Supply, Money Multiplier')]")
	 WebElement moneyfiatmoneysubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Money : Fiat Money, Money Supply, Money Multiplier')]")
	 WebElement moneyfiatmoney;
	 @FindBy(xpath = "//h3[normalize-space()='Rbi And Monetary Policy : Crr, Slr,Etc And Banks']")
	 WebElement rbiandmonetary;
	 @FindBy(xpath = "//h3[contains(text(),'Nbfcs,')]")
	 WebElement nbfcs;
	 @FindBy(xpath = "//h3[normalize-space()='Car And Basel Iii Compliance']")
	 WebElement carandbasel;
	 @FindBy(xpath = "//h3[contains(text(),'Chit Funds, Small &Payment Banks And')]")
	 WebElement chitfundssmall;
	 @FindBy(xpath = "//h2[contains(text(),'Indian Money Market, Mutual Funds & Indian Capital')]")
	 WebElement indianmoneymarketsubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Indian Money Market, Mutual Funds & Indian Capital')]")
	 WebElement indianmoneymarket;
	 @FindBy(xpath = "(//h3[contains(text(),\"Financial Regulations, India'S Primary And Seconda\")])[1]")
	 WebElement financialregulations;
	 @FindBy(xpath = "//h3[contains(text(),'Commodity Trading And Spot Exchanges, Foreign Fina')]")
	 WebElement commoditytrading;
	 @FindBy(xpath = "//h3[contains(text(),'Angel Invester , Qfis & Participatory Note,')]")
	 WebElement angelinvestor;
	 @FindBy(xpath = "//h3[normalize-space()='Pension Sector Reforms , Reits And Invits']")
	 WebElement pensionsector;
	 @FindBy(xpath = "//h2[contains(text(),'Insurance Industry, Insurance Reforms & Irda, Rein')]")
	 WebElement insuranceindustrysubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Insurance Industry, Insurance Reforms & Irda, Rein')]")
	 WebElement insuranceindustry;
	 @FindBy(xpath = "//h2[normalize-space()='Budget And Its Components']")
	 WebElement budgetandcomponentssubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Budget And Its Components']")
	 WebElement budgetandcomponents;
	 @FindBy(xpath = "//h3[contains(text(),'Fiscal Policy & Frbm Act, Fiscal Consolidation, Db')]")
	 WebElement fiscalpolicy;
	 @FindBy(xpath = "//h3[normalize-space()='Public Debt']")
	 WebElement publicdebt;
	 @FindBy(xpath = "(//h2[normalize-space()=\"India'S Tax System , Gst, Direct Tax Reform\"])[1]")
	 WebElement indiastaxsystemsubtopic;
	 @FindBy(xpath = "(//h3[normalize-space()=\"India'S Tax System , Gst, Direct Tax Reform\"])[1]")
	 WebElement indiastaxsystem;
	 @FindBy(xpath = "//h2[normalize-space()='Forex Reserve ,External Debt To Gaar']")
	 WebElement forexreservesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Forex Reserve ,External Debt To Gaar']")
	 WebElement forexreserve;
	 @FindBy(xpath = "//h3[normalize-space()='Foreign Investment To Outlook Of Future']")
	 WebElement foreigninvestment;
	 @FindBy(xpath = "//h2[normalize-space()='Agriculture']")
	 WebElement agriculturesubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Agriculture']")
	 WebElement agriculture;
	 @FindBy(xpath = "//h3[contains(text(),'Land Reforms, Green Revolution And Cropping Patter')]")
	 WebElement landreformgreen;
	 @FindBy(xpath = "//h3[contains(text(),'Pds And Food Subsidies, Irrigation, Farm Mechaniza')]")
	 WebElement pdsandfood;
	 @FindBy(xpath = "//h3[normalize-space()='Wto And Agriculture']")
	 WebElement wtoandagriculture;
	 @FindBy(xpath = "//h3[contains(text(),'National Food Securities Act And Food Processing A')]")
	 WebElement nationalfoodscurities;
	 @FindBy(xpath = "//h2[normalize-space()='New Indsutrial Policy']")
	 WebElement newindustrialpolicysubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='New Indsutrial Policy']")
	 WebElement newindustrialpolicy;
	 @FindBy(xpath = "//h3[contains(text(),'Msme Sector, Fdi, Eodb, Make In India And Start Up')]")
	 WebElement msmesector;
	 @FindBy(xpath = "//h3[contains(text(),'Transport : Rails, Roads, Inland Waterways And Civ')]")
	 WebElement transportrails;
	 @FindBy(xpath = "//h2[contains(text(),'Trade In Service Sector, Manufactruing Vs Services')]")
	 WebElement tradeinservicesubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Trade In Service Sector, Manufactruing Vs Services')]")
	 WebElement tradeinservice;
	 @FindBy(xpath = "//h2[contains(text(),'Inflation And Its Types, Inflation Targeting, Base')]")
	 WebElement inflationanditstypessubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Inflation And Its Types, Inflation Targeting, Base')]")
	 WebElement inflationanditstypes;
	 @FindBy(xpath = "//h3[normalize-space()='Cpi, Wpi, Iip And Ppi']")
	 WebElement cpiwpilip;
	 @FindBy(xpath = "//h3[contains(text(),'Depression, Recovery, Boom, Recession And Double D')]")
	 WebElement depressionrecoveryboom;
	 @FindBy(xpath = "//h3[contains(text(),'Economic System And National Income : Gdp, Gnp, Nd')]")
	 WebElement economicsystemandnational;
	 @FindBy(xpath = "//h2[normalize-space()='Imf, World Bank, Adb, Oecd, Brics Bank And Aiib']")
	 WebElement imfworldbanksubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Imf, World Bank, Adb, Oecd, Brics Bank And Aiib']")
	 WebElement imfworldbank;
	 @FindBy(xpath = "(//h2[contains(text(),'Important Terms From Glossary')])[1]")
	 WebElement importanttermsfromglossarysubtopic;
	 @FindBy(xpath = "(//h3[contains(text(),'Important Terms From Glossary')])[1]")
	 WebElement importanttermsfromglossary;

	 
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
	 
	 public void GetForward() throws InterruptedException  {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(forwardmodule)); 
			element.click();
		    Thread.sleep(2000);
		 }
	 
	 
	 public void IndianEconomyModule()  {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianeconomymodule));
			element.click();
		 }
		
		 public void LandReformsSubtopic()  {
		   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(landreformssubtopic));
			element.click();
		}
		 
		 public void LandReforms()  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(landreforms));
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
		 
		 public void PovertyIdentification() throws InterruptedException  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(povertyidentification));
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
		 
		 public void HumanCapital() throws InterruptedException  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(humancapital));
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
		 public void RuralDevelopment() throws InterruptedException  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ruraldevelopmentagriculture));
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
		 public void Employment() throws InterruptedException  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(employment));
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
		 public void Infrastructure() throws InterruptedException  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(infrastructurehealth));
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
		 public void SustainableDevelopment() throws InterruptedException  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(sustainabledevelopment));
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
		 public void IndicatorsofHumanDevelopment() throws InterruptedException  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indicatorsofhuman));
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
		 
		 public void MoneyFiatSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(moneyfiatmoneysubtopic));
			 element.click();
		 }
		 
		 public void MoneyFiat() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(moneyfiatmoney));
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
		 
		 public void RbiandMonetary() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(rbiandmonetary));
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
	 
		 public void NdfcsBanking() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(nbfcs));
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
		 
		 public void CarandBasel() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(carandbasel));
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
		 
		 public void ChitFund() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(chitfundssmall));
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
		 public void IndiaMoneyMarketSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianmoneymarketsubtopic));
			 element.click();
		 }
		 
		 public void IndianmoneyMarket() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianmoneymarket));	
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
		 
		 public void FinancialRegulations() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(financialregulations));
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
		 
		 public void CommodityTrading() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(commoditytrading));
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
		 
		 public void AngelInvestor() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(angelinvestor));
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
		 
		 public void PensionSector() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pensionsector));
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
		 
		 public void InsuranceIndustrySubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(insuranceindustrysubtopic));		
			 element.click();
		 }
		 
		 public void InsuranceIndustry() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(insuranceindustry));
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
		 
		 public void BudgetanditsComponentsSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(budgetandcomponentssubtopic));	
			 element.click();
		 }
		 
		 public void BudgetanditsComponents() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(budgetandcomponents));
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
		 
		 public void FiscalPolicy() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(fiscalpolicy));
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
		 
		 public void PublicDebt() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(publicdebt));
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
		 
		 public void IndiasTaxSystemSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiastaxsystemsubtopic));
			 element.click();
		 }
		 
		 public void IndiasTaxSystem() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiastaxsystem));
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
		 
		 public void ForexReserveSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(forexreservesubtopic));
			 element.click();
		 }
		 
		 public void ForexReserve() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(forexreserve));
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
		 
		 public void ForeignInvestment() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(foreigninvestment));
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
		 
		 public void AgricultureSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(agriculturesubtopic));
			 element.click();
		 }
		 
		 public void Agriculture() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(agriculture));		
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
		 
		 public void LandReformsGreenRevolution() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(landreformgreen));
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
		 
		 public void PdsandFood() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pdsandfood));
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
		 
		 public void WtoandAgriculture() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wtoandagriculture));
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
		 
		 public void NationalFoodSecurities() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(nationalfoodscurities));
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
		 public void NewIndustrialPolicySubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(newindustrialpolicysubtopic));
			 element.click();
		 }
		 public void NewIndustrialPolicy() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(newindustrialpolicy));
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
		 public void MsmeSector() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(msmesector));
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
		 public void TransportRails() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(transportrails));
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
		 public void TradeinServiceSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tradeinservicesubtopic));
			 element.click();
		 }
		 public void TradeinService() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tradeinservice));	
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
		 public void InflamationSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(inflationanditstypessubtopic));
			 element.click();
		 }
		 public void Inflamation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(inflationanditstypes));
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
		 public void CpiWpiLip() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cpiwpilip));
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
		 public void DepressionRecovery() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(depressionrecoveryboom));
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
		 public void EconomicSystem() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(economicsystemandnational));
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
		 public void ImfWorldBankSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(imfworldbanksubtopic));
			 element.click();
		 }
		 public void ImfWorldBank() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(imfworldbank));
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
