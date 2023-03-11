package com.examarly.allpageautomation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.examarly.allpage.AncientHistoryTakeTest;
import com.examarly.allpage.ArtandCultureTakeTest;
import com.examarly.allpage.EnvironmentTakeTest;
import com.examarly.allpage.GeographyTakeTest;
import com.examarly.allpage.IndianEconomyTakeTest;
import com.examarly.allpage.IndianPolityTakeTest;
import com.examarly.allpage.MedievalHistoryTakeTest;
import com.examarly.allpage.ModernHistoryTakeTest;

public class TakeTestofAllSubtopics extends com.examarlyBaseClass.BaseclassWeb {

	IndianPolityTakeTest indianpolity;
	AncientHistoryTakeTest ancienthistory;
	MedievalHistoryTakeTest medievalhistory;
	ModernHistoryTakeTest modernhistory;
	ArtandCultureTakeTest artandculture;
    IndianEconomyTakeTest indianeconomy;
    GeographyTakeTest geography;
    EnvironmentTakeTest environment;
    
    
	public TakeTestofAllSubtopics() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		try {
			initilization();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		indianpolity = new IndianPolityTakeTest();
		ancienthistory = new AncientHistoryTakeTest();
		medievalhistory = new MedievalHistoryTakeTest();
		modernhistory = new ModernHistoryTakeTest();
		artandculture = new ArtandCultureTakeTest();
		indianeconomy =  new IndianEconomyTakeTest();
		geography = new GeographyTakeTest();
		environment = new EnvironmentTakeTest();
		}

	@Test
	public void IndianPolityModule() throws InterruptedException {
		indianpolity.Login();
		indianpolity.EntermobileNumber();
		indianpolity.LoginClick();
		indianpolity.Otp();
		indianpolity.Otp1();
		indianpolity.Otp2();
		indianpolity.Otp3();
		indianpolity.VerifyClick();
		indianpolity.Stats();
		indianpolity.Syllabus();
		indianpolity.HistoricalBackgroundSubtopic();
		indianpolity.HistoricalBackground();
	    indianpolity.TakeTest();
	    indianpolity.ReadyToBegin();
	    indianpolity.Option1();
	    indianpolity.NextinTest();
	    indianpolity.Option2();
	    indianpolity.Submit();
	    indianpolity.Yes();
	    indianpolity.ShowSolutions();
	    indianpolity.ViewSolutions();
	    indianpolity.NextinTest();
	    indianpolity.ViewSolutions();
	    indianpolity.NextinTest();
	    indianpolity.ViewSolutions();
	    indianpolity.NextinTest();
	    indianpolity.ViewSolutions();
	    indianpolity.NextinTest();
	    indianpolity.ViewSolutions();
	    indianpolity.EndQuiz();
	    indianpolity.Streak();
		indianpolity.MakingofConstitution();
		indianpolity.Preamble();
		indianpolity.UnionTerritory();
		indianpolity.Citizenship();
		indianpolity.FundamentalRights();
		indianpolity.FundamentalDuties();
		indianpolity.DirectivePrinciples();
		indianpolity.MajorConstitutional();
		indianpolity.UnitaryAndFederal();
		indianpolity.CentreStateRelationsSubtopic();
		indianpolity.CentreStateRelations();
		indianpolity.Parlimentarysystem();
		indianpolity.InterstateCouncil();
		indianpolity.Emergencyprovisions();
		indianpolity.FederalSystem();
		indianpolity.CentralGovernmentSubtopic();
		indianpolity.Parliment();
		indianpolity.PesidentandVicepresident();
		indianpolity.PrimeMinister();
		indianpolity.UnionCouncilofMinisters();
		indianpolity.SupremeCourt();
		indianpolity.JudicialReview();
		indianpolity.ParlimentaryCommittee();
		indianpolity.StateGovernmentSubtopic();
		indianpolity.Governer();
		indianpolity.ChiefMinister();
		indianpolity.Highcourt();
		indianpolity.StateCouncilofMinister();
		indianpolity.StateLegislature();
		indianpolity.Tribunals();
		indianpolity.SubordinateCourts();
		indianpolity.PanchayathRajSubtopic();
		indianpolity.PanchayathRaj();
		indianpolity.UrbanGovernance();
		indianpolity.ScheduleandTribalAreasSubtopic();
		indianpolity.ScheduleandTribalAreas();
		indianpolity.ElectionCommissionSubtopic();
		indianpolity.StationaryandConstitutionslBodies();
		indianpolity.FinanceCommission();
		indianpolity.UpscandSpsc();
		indianpolity.NationalCommissionforScs();
		indianpolity.NationalCommissionforSts();
		indianpolity.NationalCommisionforObcs();
		indianpolity.Cag();
		indianpolity.Gst();
		indianpolity.SpecialOfficer();
		indianpolity.AttorneryGeneralofIndia();
		indianpolity.AdvocateGeneraloftheState();
		indianpolity.MajorNonconstitutionalBodiesSubtopic();
		indianpolity.MajorNonconstitutionalBodies();
		indianpolity.CoperativeSocietySubtopic();
		indianpolity.CoperativeSociety();
		indianpolity.OfficialLanguage();
		indianpolity.PoliticalPartiesSubtopic();
		indianpolity.PoliticalParties();
		indianpolity.AntiDefectionlaw();
	}
	
	@Test (dependsOnMethods = {"IndianPolityModule"})
	public void AncientHistoryModule() throws InterruptedException {
			
		ancienthistory.AncientHistoryModule();
		ancienthistory.TheStoneAgeSubtopic();
		ancienthistory.TheStoneAge();
		ancienthistory.TakeTest();
		ancienthistory.ReadyToBegin();
		ancienthistory.Option1();
		ancienthistory.NextinTest();
		ancienthistory.Option2();
	    ancienthistory.Submit();
	    ancienthistory.Yes();
	    ancienthistory.ShowSolutions();
	    ancienthistory.ViewSolutions();
	    ancienthistory.NextinTest();
	    ancienthistory.ViewSolutions();
	    ancienthistory.NextinTest();
	    ancienthistory.ViewSolutions();
	    ancienthistory.NextinTest();
	    ancienthistory.ViewSolutions();
	    ancienthistory.NextinTest();
	    ancienthistory.ViewSolutions();
	    ancienthistory.EndQuiz();
	    ancienthistory.GetBack();
		ancienthistory.IndusValleySubtopic();
		ancienthistory.IndusValley();
		ancienthistory.VedicAgeSubtopic();
		ancienthistory.VedicAge();
		ancienthistory.JainismBuddismSubtopic();
		ancienthistory.JainismBuddism();
		ancienthistory.MahajanapadasSubtopic();
		ancienthistory.Mahajanapadas();
		ancienthistory.MouryasSubtopic();
		ancienthistory.Mouryas();
		ancienthistory.PostMouryanAgeSubtopic();
		ancienthistory.PostMouryanAge();
		ancienthistory.GuptasSubtopic();
		ancienthistory.Guptas();
		ancienthistory.RegionalCivilisationsSubtopic();
		ancienthistory.RegionalCivilisations();
		ancienthistory.ReligionScienceSubtopic();
		ancienthistory.ReligionScience();
		ancienthistory.SangamAgeSubtopic();
		ancienthistory.SangamAge();
	
		}
	
	@Test(dependsOnMethods = {"AncientHistoryModule"})
	public void MedievalHistoryModule() throws InterruptedException {
		
		medievalhistory.MedievalHistoryModule();
		medievalhistory.NorthIndiaSubtopic();
		medievalhistory.NorthIndia();
		medievalhistory.TakeTest();
		medievalhistory.ReadyToBegin();
		medievalhistory.Option1();
		medievalhistory.NextinTest();
		medievalhistory.Option2();
		medievalhistory.Submit();
	    medievalhistory.Yes();
	    medievalhistory.ShowSolutions();
	    medievalhistory.ViewSolutions();
	    medievalhistory.NextinTest();
	    medievalhistory.ViewSolutions();
	    medievalhistory.NextinTest();
	    medievalhistory.ViewSolutions();
	    medievalhistory.NextinTest();
	    medievalhistory.ViewSolutions();
	    medievalhistory.NextinTest();
	    medievalhistory.ViewSolutions();
	    medievalhistory.EndQuiz();
	    medievalhistory.GetBack();
		medievalhistory.SouthIndiaSubtopic();
		medievalhistory.SouthIndia();
		medievalhistory.EconomicandSocialSubbtopic();
		medievalhistory.EconomicandSocial();
		medievalhistory.RiseofRajputSubtopic();
		medievalhistory.RiseofRajput();
		medievalhistory.DelhiSultanateSubtopic();
		medievalhistory.DelhiSultanate();
		medievalhistory.GovernmentandEconomicSubtopic();
		medievalhistory.GovernmentandEconomic();
		medievalhistory.VijaynagarEmpireSubtopic();
		medievalhistory.VijaynagarEmpire();
		medievalhistory.StruggleforEmpireSubtopic();
		medievalhistory.StruggleforEmpire();
		medievalhistory.CulturalDevelopmentSubtopic();
		medievalhistory.CulturalDevelopment();
		medievalhistory.MughalEmpireSubtopic();
		medievalhistory.MughalEmpire();
		medievalhistory.ConsolidationSubtopic();
		medievalhistory.Consolidation();
		medievalhistory.DeccanandSouthIndiaSubtopic();
		medievalhistory.DeccanandSouthIndia();
		medievalhistory.IndiainteFirstSubtopic();
		medievalhistory.IndiainteFirst();
		medievalhistory.EconomicandSubtopic();
		medievalhistory.Economicand();
		medievalhistory.CulturalandReligiousSubtopic();
		medievalhistory.CulturalandReligious();
	}

	@Test(dependsOnMethods = {"MedievalHistoryModule"})
	public void ModernHistoryModule() throws InterruptedException {
		
		modernhistory.ModernHistoryModule();
		modernhistory.AdventExpansionSubtopic();
		modernhistory.AdventExpansion();
		modernhistory.TakeTest();
		modernhistory.ReadyToBegin();
		modernhistory.Option1();
		modernhistory.NextinTest();
		modernhistory.Option2();
		modernhistory.Submit();
		modernhistory.Yes();
		modernhistory.ShowSolutions();
		modernhistory.ViewSolutions();
		modernhistory.NextinTest();
	    modernhistory.ViewSolutions();
	    modernhistory.NextinTest();
	    modernhistory.ViewSolutions();
	    modernhistory.NextinTest();
	    modernhistory.ViewSolutions();
	    modernhistory.NextinTest();
	    modernhistory.ViewSolutions();
	    modernhistory.EndQuiz();
	    modernhistory.GetBack();
	    modernhistory.EconomicImpactandRaisingSubtopic();
	    modernhistory.EconomicImpactandRaising();
	    modernhistory.SocioReligousReformSubtopic();
	    modernhistory.SocioReligousReform();
	    modernhistory.IndianNationalMovementSubtopic();
	    modernhistory.IndianNationalMovement();
	    modernhistory.AdventofTheEuropeonSubtopic();
	    modernhistory.AdventofTheEuropeon();
	    modernhistory.IndiaonTheEveSubtopic();
	    modernhistory.IndiaonTheEve();
	    modernhistory.ExpansionandConsolidationSubtopic();
	    modernhistory.ExpansionandConsolidation();
	    modernhistory.PeoplesResistanceSubtopic();
	    modernhistory.PeoplesResistance();
	    modernhistory.TheRevoltof1857Subtopic();
	    modernhistory.TheRevoltof1857();
	    modernhistory.SocioReligousReformSubtopic();
	    modernhistory.SocioReligousReform();
	    modernhistory.AgeneralSurveySubtopic();
	    modernhistory.AgeneralSurvey();
	    modernhistory.BeginningofModernSubtopic();
	    modernhistory.BeginningofModern();
	    modernhistory.IndianNationalCongressSubtopic();
	    modernhistory.IndianNationalCongress();
	    modernhistory.EraofMillitantSubtopic();
	    modernhistory.EraofMillitant();
	    modernhistory.FirstPhaseSubtopic();
	    modernhistory.FirstPhase();
	    modernhistory.FirstWorldWarSubtopic();
	    modernhistory.FirstWorldWar();
	    modernhistory.EmergenceofGandhiSubtopic();
	    modernhistory.EmergenceofGandhi();
	    modernhistory.NonCooperationSubtopic();
	    modernhistory.NonCooperation();
	    modernhistory.EmergenceofSwarajitsSubtopic();
	    modernhistory.EmergenceofSwarajits();
	    modernhistory.SimonCommissionSubtopic();
	    modernhistory.SimonCommission();
	    modernhistory.CivilDisobedienceSubtopic();
	    modernhistory.CivilDisobedience();
	    modernhistory.DebatesSubtopic();
	    modernhistory.Debates();
	    modernhistory.CongressRuleSubtopic();
	    modernhistory.CongressRule();
	    modernhistory.NationalResponseSubtopic();
	    modernhistory.NationalResponse();
	    modernhistory.QuitIndiaMovementSubtopic();
	    modernhistory.QuitIndiaMovement();
	    modernhistory.PostWarSubtopic();
	    modernhistory.PostWar();
	    modernhistory.IndependenceSubtopic();
	    modernhistory.Independence();
	    modernhistory.ConstitutionalAdminSubtopic();
	    modernhistory.ConstitutionalAdmin();
	    modernhistory.SurveyofBritishSubtopic();
	    modernhistory.SurveyofBritish();
	    modernhistory.EconomicImpactSubtopic();
	    modernhistory.EconomicImpact();
	    modernhistory.DevelopmentofInidanPressSubtopic();
	    modernhistory.DevelopmentofInidan();
	    modernhistory.DevelopmentofEducationSubtopic();
	    modernhistory.DevelopmentofEducation();
	    modernhistory.PeasantMovementsSubtopic();
	    modernhistory.PeasantMovements();
	    modernhistory.TheMovementofWorkingSubtopic();
	    modernhistory.TheMovementofWorking();
	    modernhistory.ChallengesBeforeSubtopic();
	    modernhistory.ChallengesBefore();
	    modernhistory.TheIndianStatesSubtopic();
	    modernhistory.TheIndianStates();
	    modernhistory.MiscellaneousSubtopic();
	    modernhistory.Miscellaneous();
	
	}		
		
	@Test(dependsOnMethods = {"ModernHistoryModule"})
	public void ArtandCultureModule() throws InterruptedException {
		
		artandculture.ArtandCultureModule();
		artandculture.IndianArchitectureSubtopic();
		artandculture.IndianArchitecture();
		artandculture.TakeTest();
		artandculture.ReadyToBegin();
		artandculture.Option1();
		artandculture.NextinTest();
		artandculture.Option2();
		artandculture.Submit();
		artandculture.Yes();
		artandculture.ShowSolutions();
		artandculture.ViewSolutions();
		artandculture.NextinTest();
		artandculture.ViewSolutions();
		artandculture.NextinTest();
		artandculture.ViewSolutions();
		artandculture.NextinTest();
		artandculture.ViewSolutions();
		artandculture.NextinTest();
		artandculture.ViewSolutions();
		artandculture.EndQuiz();
		artandculture.GetBack();
		artandculture.IndianSculptureSubtopic();
		artandculture.IndianSculpture();
		artandculture.IndianPoetrySubtopic();
		artandculture.IndianPoetry();
		artandculture.ArtsofIndusValleySubtopic();
		artandculture.ArtsofIndusValley();
		artandculture.JainismandBuddhismSubtopic();
		artandculture.JainismandBuddhism();
		artandculture.IndianPaintingSubtopic();
		artandculture.IndianPainting();
		artandculture.IndianMusicSubtopic();
		artandculture.IndianMusic();
		artandculture.IndianDanceFormsSubtopic();
		artandculture.IndianDanceForms();
		artandculture.IndianLiteratureSubtopic();
		artandculture.IndianLiterature();
		artandculture.DifferentPhilosophiesSubtopic();
		artandculture.DifferentPhilosophies();
		artandculture.OtherArtFormsSubtopic();
		artandculture.OtherArtForms();
		artandculture.CoinsinAncientSubtopic();
		artandculture.CoinsinAncient();
		artandculture.FairsandFestivalsSubtopic();
		artandculture.FairsandFestivals();
		
	}
	
	@Test(dependsOnMethods = {"ArtandCultureModule"})
	public void IndianEconomyModule() throws InterruptedException {
		
		indianeconomy.GetForward();
		indianeconomy.IndianEconomyModule();
		indianeconomy.LandReformsSubtopic();
		indianeconomy.LandReforms();
		indianeconomy.TakeTest();
		indianeconomy.ReadyToBegin();
		indianeconomy.Option1();
		indianeconomy.NextinTest();
		indianeconomy.Option2();
		indianeconomy.Submit();
		indianeconomy.Yes();
		indianeconomy.ShowSolutions();
		indianeconomy.ViewSolutions();
		indianeconomy.NextinTest();
		indianeconomy.ViewSolutions();
		indianeconomy.NextinTest();
		indianeconomy.ViewSolutions();
		indianeconomy.NextinTest();
		indianeconomy.ViewSolutions();
		indianeconomy.NextinTest();
		indianeconomy.ViewSolutions();
		indianeconomy.EndQuiz();
		indianeconomy.PovertyIdentification();
		indianeconomy.HumanCapital();
		indianeconomy.RuralDevelopment();
		indianeconomy.Employment();
		indianeconomy.Infrastructure();
		indianeconomy.SustainableDevelopment();
		indianeconomy.IndicatorsofHumanDevelopment();
		indianeconomy.MoneyFiatSubtopic();
		indianeconomy.RbiandMonetary();
		indianeconomy.NdfcsBanking();
		indianeconomy.CarandBasel();
		indianeconomy.ChitFund();
		indianeconomy.IndiaMoneyMarketSubtopic();
		indianeconomy.IndianmoneyMarket();
		indianeconomy.FinancialRegulations();
		indianeconomy.CommodityTrading();
		indianeconomy.AngelInvestor();
		indianeconomy.PensionSector();
		indianeconomy.InsuranceIndustrySubtopic();
		indianeconomy.InsuranceIndustry();
		indianeconomy.BudgetanditsComponentsSubtopic();
	//	indianeconomy.BudgetanditsComponents();
		indianeconomy.FiscalPolicy();
		indianeconomy.PublicDebt();
		indianeconomy.IndiasTaxSystemSubtopic();
		indianeconomy.IndiasTaxSystem();
		indianeconomy.ForexReserveSubtopic();
		indianeconomy.ForexReserve();
		indianeconomy.ForeignInvestment();
		indianeconomy.AgricultureSubtopic();
		indianeconomy.Agriculture();
		indianeconomy.LandReformsGreenRevolution();
		indianeconomy.PdsandFood();
		indianeconomy.WtoandAgriculture();
		indianeconomy.NationalFoodSecurities();
		indianeconomy.NewIndustrialPolicySubtopic();
		indianeconomy.NewIndustrialPolicy();
		indianeconomy.MsmeSector();
		indianeconomy.TransportRails();
		indianeconomy.TradeinServiceSubtopic();
		indianeconomy.TradeinService();
		indianeconomy.InflamationSubtopic();
		indianeconomy.Inflamation();
		indianeconomy.CpiWpiLip();
		indianeconomy.DepressionRecovery();
		indianeconomy.EconomicSystem();
		indianeconomy.ImfWorldBankSubtopic();
		indianeconomy.ImfWorldBank();
		
	}
	
	@Test(dependsOnMethods = {"IndianEconomyModule"})
	public void GeographyModule() throws InterruptedException {
		
		geography.GetForward();
		geography.GeographyModule();
		geography.TheOriginandrevolutionSubtopic();
		geography.TheOriginandrevolution();
		geography.TakeTest();
		geography.ReadyToBegin();
		geography.Option1();
		geography.NextinTest();
		geography.Option2();
		geography.Submit();
		geography.Yes();
		geography.ShowSolutions();
		geography.ViewSolutions();
		geography.NextinTest();
		geography.ViewSolutions();
		geography.NextinTest();
		geography.ViewSolutions();
		geography.NextinTest();
		geography.ViewSolutions();
		geography.NextinTest();
		geography.ViewSolutions();
		geography.EndQuiz();
		geography.InteriorofTheEarth();
		geography.DistributionoftheOcieans();
		geography.MineralsandRocks();
		geography.GeopmorphicProcess();
		geography.LandReformsandTheirEvolution();
		geography.CompositionandStructureSubtopic();
		geography.CompositionandStructure();
		geography.SolarRadiation();
		geography.AtmosphericCircualtion();
		geography.WaterinAtmosphere();
        geography.WorldClimate();
        geography.WaterOceansSubtopic();
        geography.WaterOceans();
        geography.MovementsofOcean();
        geography.IndiaLocationSubtopic();
        geography.IndiaLocation();
        geography.StructureandPhilosophy();
        geography.DrainageSystem();
        geography.Climate();
       //geography.NaturalVegetation();
        geography.Soils();
        geography.NaturalHazards();
        geography.LandResources();
        geography.WaterResources();
        geography.MineralandEnergy();
        geography.ManufacturingIndustries();
        geography.PopulationDistributionSubtopic();
        geography.PopulationDistribution();
        geography.HumanDevelopment();
        geography.HumanSettement();
        geography.MigrationTypes();
        geography.PrimaryActivities();
        geography.SecondaryActivities();
        geography.TertiaryandQuaternary();
        geography.TransportandCommunication();
        geography.InternationalTrade();
 		
	}
	
	@Test(dependsOnMethods = {"GeographyModule"})
	public void Environment() throws InterruptedException {
		
		environment.GetForward();
		environment.EnvironmentModule();
		environment.EcologySubtopic();
		environment.Ecology();
		environment.TakeTest();
		environment.ReadyToBegin();
		environment.Option1();
		environment.NextinTest();
		environment.Option2();
		environment.Submit();
		environment.Yes();
		environment.ShowSolutions();
		environment.ViewSolutions();
		environment.NextinTest();
		environment.ViewSolutions();
		environment.NextinTest();
		environment.ViewSolutions();
		environment.NextinTest();
		environment.ViewSolutions();
		environment.NextinTest();
		environment.ViewSolutions();
		environment.EndQuiz();
		environment.FunctionsofanEcosystem();
		environment.TerrestrialEcosystem();
		environment.AcquaticEcoSystem();
		environment.EnvironmentalPollution();
		environment.RenewableEnergy();
		environment.EnvironmentalImpactAssessment();
		environment.Biodeiversity();
		environment.IndianBiodiversity();
		environment.ScheduleAnimals();
		environment.AnimalDiversity();
		environment.PlantDiversity();
		environment.ProtectedAreaNetwork();
		environment.ConservationEfforts();
		environment.ClimateChange();
		environment.OceanAcidification();
		environment.MitigationStratergies();
		environment.IndiaandClimate();
		environment.ClimateChangeOrganizations();
		environment.Agriculture();
		environment.ActandPoliciesSubtopic();
		environment.ActandPolicies();
		environment.InstitutionsandMeasures();
		environment.EnvironmentalOrganizations();
		environment.InternationalEnvironmetalConventions();
		environment.EnvironmentalIssues();
		environment.AppendixSubtopic();
		environment.Appendix();
		environment.Glossary();
		
	}
	
	}
	
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}