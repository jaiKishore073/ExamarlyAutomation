package com.examarly.allpage;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarlyBaseClass.BaseclassWeb;

public class GeographyTakeTest extends BaseclassWeb{
	
	public GeographyTakeTest() {
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
	 @FindBy(xpath ="//span[contains(text(),'Geography')]")
	 WebElement geographymodule;
	 @FindBy(xpath ="//h2[normalize-space()='The Origin And Evolution Of The Earth']")
	 WebElement theoriginandevolutionsubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='The Origin And Evolution Of The Earth']")
	 WebElement theoriginandevolution;
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
	 @FindBy(xpath = "//h3[normalize-space()='Interior Of The Earth']")
	 WebElement interioroftheearth;
	 @FindBy(xpath = "//h3[normalize-space()='Distribution Of Oceans And Continents']")
	 WebElement distributionofoceans;
	 @FindBy(xpath = "//h3[normalize-space()='Minerals And Rocks']")
	 WebElement mineralsandrocks;
	 @FindBy(xpath = "//h3[normalize-space()='Geomorphic Processes']")
	 WebElement geomorphicprocess;
	 @FindBy(xpath = "//h3[normalize-space()='Landforms And Their Evolution']")
	 WebElement landreformsandtheirevolution;
	 @FindBy(xpath = "//h2[normalize-space()='Composition And Structure Of Atmosphere']")
	 WebElement compositionandstructuresubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Composition And Structure Of Atmosphere']")
	 WebElement compositionandstructure;
	 @FindBy(xpath = "//h3[normalize-space()='Solar Radiation, Heat Balance And Temperature']")
	 WebElement solarradiationheat;
	 @FindBy(xpath = "//h3[normalize-space()='Atmospheric Circulation And Weather Systems']")
	 WebElement atmosphericcirculation;
	 @FindBy(xpath = "//h3[normalize-space()='Water In The Atmosphere']")
	 WebElement waterintheatmosphere;
	 @FindBy(xpath = "//h3[normalize-space()='World Climate And Climate Change']")
	 WebElement worldclimateandclimatechange;
	 @FindBy(xpath = "//h2[normalize-space()='Water (Oceans)']")
	 WebElement wateroceanssubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Water (Oceans)']")
	 WebElement wateroceans;
	 @FindBy(xpath = "//h3[normalize-space()='Movements Of Ocean Water']")
	 WebElement movementsofoceanwater;
	 @FindBy(xpath = "//h2[contains(text(),'India — Location')]")
	 WebElement indianlocationsubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'India — Location')]")
	 WebElement indianlocation;
	 @FindBy(xpath = "//h3[normalize-space()='Structure And Physiography']")
	 WebElement structureandphilosophy;
	 @FindBy(xpath = "//h3[normalize-space()='Drainage System']")
	 WebElement drainagesystem;
	 @FindBy(xpath = "//h3[normalize-space()='Climate']")
	 WebElement climate;
	 @FindBy(xpath = "//h3[normalize-space()='Natural Vegetation']")
	 WebElement naturalvegetation;
	 @FindBy(xpath = "//h3[normalize-space()='Soils']")
	 WebElement soils;
	 @FindBy(xpath = "//h3[normalize-space()='Natural Hazards And Disasters']")
	 WebElement naturalhazardsanddisaters;
	 @FindBy(xpath = "//h3[normalize-space()='Land Resources And Agriculture']")
	 WebElement landresources;
	 @FindBy(xpath = "//h3[normalize-space()='Water Resources']")
	 WebElement waterresources;
	 @FindBy(xpath = "//h3[normalize-space()='Mineral And Energy Resources']")
	 WebElement mineralandenergy;
	 @FindBy(xpath = "//h3[normalize-space()='Manufacturing Industries']")
	 WebElement manufacturingindustries;
	 @FindBy(xpath = "//h2[contains(text(),'Population: Distribution, Density, Growth And Comp')]")
	 WebElement populationdistributionsubtopic;
	 @FindBy(xpath = "//h3[contains(text(),'Population: Distribution, Density, Growth And Comp')]")
	 WebElement populationdistribution;
	 @FindBy(xpath = "//h3[normalize-space()='Human Development']")
	 WebElement humandevelopment;
	 @FindBy(xpath = "//h3[normalize-space()='Human Settlements']")
	 WebElement humansettlements;
	 @FindBy(xpath = "//h3[normalize-space()='Migration: Types, Causes And Consequences']")
	 WebElement migrationtypes;
	 @FindBy(xpath = "//h3[normalize-space()='Primary Activities']")
	 WebElement primaryactivities;
	 @FindBy(xpath = "//h3[normalize-space()='Secondary Activities']")
	 WebElement secondaryactivities;
	 @FindBy(xpath = "//h3[normalize-space()='Tertiary And Quaternary Activities']")
	 WebElement tertiaryandquaternary;
	 @FindBy(xpath = "//h3[normalize-space()='Transport And Communication']")
	 WebElement transportandcommunication;
	 @FindBy(xpath = "//h3[normalize-space()='International Trade']")
	 WebElement internationaltrade;
	 
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
	 
	 public void GeographyModule()  {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(geographymodule)); 
			element.click();
	 }
		
		 public void TheOriginandrevolutionSubtopic()  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(theoriginandevolutionsubtopic));
			 element.click();
	}
		 
		 public void TheOriginandrevolution()  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(theoriginandevolution));
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
		 
		 public void InteriorofTheEarth() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(interioroftheearth));
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
	
		 public void DistributionoftheOcieans() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(distributionofoceans));
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
		 public void MineralsandRocks() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mineralsandrocks));
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
		 public void GeopmorphicProcess() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(geomorphicprocess));
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
		 public void LandReformsandTheirEvolution() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(landreformsandtheirevolution));
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
		
		 
		 public void CompositionandStructureSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(compositionandstructuresubtopic));
			 element.click();
	 } 	 
		 public void CompositionandStructure() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(compositionandstructure));
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
		 public void SolarRadiation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(solarradiationheat));
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
		 public void AtmosphericCircualtion() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(atmosphericcirculation));
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
		 public void WaterinAtmosphere() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(waterintheatmosphere));
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
		 public void WorldClimate() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(worldclimateandclimatechange));
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
		 public void WaterOceansSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wateroceanssubtopic));
			 element.click();
	 } 	 
		 public void WaterOceans() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wateroceans));
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
		 public void MovementsofOcean() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(movementsofoceanwater));
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
		 public void IndiaLocationSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianlocationsubtopic));
			 element.click();
	 } 	 
		 public void IndiaLocation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianlocation));
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
		 public void StructureandPhilosophy() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(structureandphilosophy));
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
		 public void DrainageSystem() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(drainagesystem));
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
		 public void Climate() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(climate));
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
		 public void NaturalVegetation() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(naturalvegetation));
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
		 public void Soils() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(soils));
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
		 public void NaturalHazards() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(naturalhazardsanddisaters));
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
		 public void LandResources() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(landresources));
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
		 public void WaterResources() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(waterresources));
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
		 public void MineralandEnergy() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mineralandenergy));
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
		 public void ManufacturingIndustries() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(manufacturingindustries));
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
		 public void PopulationDistributionSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(populationdistributionsubtopic));
			 element.click();
	 } 	 
		 public void PopulationDistribution() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(populationdistribution));
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
		 public void HumanDevelopment() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(humandevelopment));	
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
		 public void HumanSettement() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(humansettlements));
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
		 public void MigrationTypes() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(migrationtypes));
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
		 public void PrimaryActivities() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(primaryactivities));
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
		 public void SecondaryActivities() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(secondaryactivities));
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
		 public void TertiaryandQuaternary() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tertiaryandquaternary)); 
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
		 public void TransportandCommunication() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(transportandcommunication));
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
		 public void InternationalTrade() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(internationaltrade));
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
