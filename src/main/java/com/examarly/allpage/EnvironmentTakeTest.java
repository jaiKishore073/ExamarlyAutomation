package com.examarly.allpage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.examarlyBaseClass.BaseclassWeb;

public class EnvironmentTakeTest extends BaseclassWeb{
	
	public EnvironmentTakeTest(){
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
	 @FindBy(xpath ="//span[normalize-space()='Environment']")
	 WebElement environmentmodule;
	 @FindBy(xpath ="//h2[normalize-space()='Ecology']")
	 WebElement ecologysubtopic;
	 @FindBy(xpath ="//h3[normalize-space()='Ecology']")
	 WebElement ecology;
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
	 @FindBy(xpath = "//h3[normalize-space()='Functions Of An Ecosystem']")
	 WebElement functionsaofanecosystem;
	 @FindBy(xpath = "//h3[normalize-space()='Terrestrial Ecosystem']")
	 WebElement terrestrialecosystem;
	 @FindBy(xpath = "//h3[normalize-space()='Aquatic Ecosystem']")
	 WebElement aquaticecosystem;
	 @FindBy(xpath = "//h3[normalize-space()='Environmental Pollution']")
	 WebElement environmentalpollution;
	 @FindBy(xpath = "//h3[normalize-space()='Renewable Energy']")
	 WebElement renewableenergy;
	 @FindBy(xpath = "//h3[normalize-space()='Environmental Impact Assessment']")
	 WebElement environmentalimpact;
	 @FindBy(xpath = "//h3[normalize-space()='Biodiversity']")
	 WebElement biodiversity;
	 @FindBy(xpath = "//h3[normalize-space()='Indian Biodiversity']")
	 WebElement indianbiodiversity;
	 @FindBy(xpath = "//h3[normalize-space()='Schedule Animals Of Wpa, 1972']")
	 WebElement scheduleanimals;
	 @FindBy(xpath = "//h3[normalize-space()='Animal Diversity Of India']")
	 WebElement animaldiversity;
	 @FindBy(xpath = "//h3[normalize-space()='Plant Diversity Of India And Marine Organism .']")
	 WebElement plantdiversity;
	 @FindBy(xpath = "//h3[normalize-space()='Protected Area Network']")
	 WebElement protectedarea;
	 @FindBy(xpath = "//h3[normalize-space()='Conservation Efforts']")
	 WebElement conservationefforts;
	 @FindBy(xpath = "//h3[normalize-space()='Climate Change']")
	 WebElement climatechange;
	 @FindBy(xpath = "//h3[contains(text(),'Ocean Acidification')]")
	 WebElement oceanacidification;
	 @FindBy(xpath = "//h3[normalize-space()='Mitigation Strategies']")
	 WebElement mitigationstratergies;
	 @FindBy(xpath = "//h3[normalize-space()='India And Climate Change']")
	 WebElement indiaandclimate;
	 @FindBy(xpath = "//h3[normalize-space()='Climate Change Organizations']")
	 WebElement climatechangeorganizations;
	 @FindBy(xpath = "//h3[normalize-space()='Agriculture']")
	 WebElement agriculture;
	 @FindBy(xpath = "//h2[normalize-space()='Acts & Policies']")
	 WebElement actsandpoliciessubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Acts & Policies']")
	 WebElement actsandpolicies;
	 @FindBy(xpath = "//h3[normalize-space()='Institutions And Measures']")
	 WebElement institutionsandmeasures;
	 @FindBy(xpath = "//h3[normalize-space()='Environmental Organizations']")
	 WebElement environmentalorganisations;
	 @FindBy(xpath = "//h3[normalize-space()='International Environmental Conventions']")
	 WebElement internationalenvironmental;
	 @FindBy(xpath = "//h3[normalize-space()='Environment Issues And Health Effects']")
	 WebElement environmentalissues;
	 @FindBy(xpath = "//h2[normalize-space()='Appendix']")
	 WebElement appendixsubtopic;
	 @FindBy(xpath = "//h3[normalize-space()='Appendix']")
	 WebElement appendix;
	 @FindBy(xpath = "//h3[normalize-space()='Glossary']")
	 WebElement glossary;
	
	
	 
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
	 
	 
	 public void EnvironmentModule()  {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(environmentmodule));
			element.click();
		 }
		
		 public void EcologySubtopic()  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ecologysubtopic));
			 element.click();
		}
		 
		 public void Ecology()  {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ecology));
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
		 
		 public void FunctionsofanEcosystem() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(functionsaofanecosystem));
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
		 
		 public void TerrestrialEcosystem() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(terrestrialecosystem));
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
		 
		 public void AcquaticEcoSystem() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(aquaticecosystem));
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
		 
		 public void EnvironmentalPollution() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(environmentalpollution));
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
		 
		 public void RenewableEnergy() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(renewableenergy));
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
		 
		 public void EnvironmentalImpactAssessment() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(environmentalimpact));
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
		 
		 public void Biodeiversity() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(biodiversity));
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
		 
		 public void IndianBiodiversity() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indianbiodiversity));
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
		 
		 public void ScheduleAnimals() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(scheduleanimals));
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
		 
		 public void AnimalDiversity() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(animaldiversity));
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
		 
		 public void PlantDiversity() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(plantdiversity));
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
		 
		 public void ProtectedAreaNetwork() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(protectedarea));	
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
		 
		 public void ConservationEfforts() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(conservationefforts));
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
		 
		 public void ClimateChange() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(climatechange));
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
		 
		 public void OceanAcidification() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(oceanacidification));
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
		 
		 public void MitigationStratergies() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mitigationstratergies));
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
		 
		 public void IndiaandClimate() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(indiaandclimate));
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
		 public void ClimateChangeOrganizations() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(climatechangeorganizations));
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
			 this.GetBack();
		 }
		 
		 
		 
		 public void ActandPoliciesSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(actsandpoliciessubtopic));
			 element.click();
		 }
		 
		 public void ActandPolicies() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(actsandpolicies));
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
		 public void InstitutionsandMeasures() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(institutionsandmeasures));
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
		 public void EnvironmentalOrganizations() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(environmentalorganisations));
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
		 public void InternationalEnvironmetalConventions() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(internationalenvironmental));
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
		 public void EnvironmentalIssues() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(environmentalissues));
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
		 public void AppendixSubtopic() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(appendixsubtopic));
			 element.click();
		 }
		 
		 public void Appendix() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(appendix));
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
		 public void Glossary() throws InterruptedException {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(glossary));
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
