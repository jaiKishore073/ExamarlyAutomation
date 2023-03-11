package com.examarlyRewardsModule;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.examarly.RewardsModule.*;

public class RewardsWeb extends com.examarlyBaseClass.BaseclassWeb {

	RewardsModuleWeb rewards;

	public RewardsWeb() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		try {
			initilization();
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}

		rewards = new RewardsModuleWeb();
	}

	@Test
	public void LoginPage() throws InterruptedException {
		rewards.Login();
		rewards.EntermobileNumber();
		rewards.LoginClick();
		rewards.Otp();
		rewards.Otp1();
		rewards.Otp2();
		rewards.Otp3();
		rewards.VerifyClick();
		rewards.Stats();
		rewards.TotalXp();
		rewards.Syllabus();
		rewards.HistoricalBackground();
		rewards.HistoricalBackgroundSubtopic();
		rewards.TakeTest();
		rewards.ReadyToBegin();
		rewards.Q1();
		rewards.Next();
		rewards.Q2();
		rewards.Next();
		rewards.Q3();
		rewards.Submit();
		rewards.Yes();
		rewards.Score();
		rewards.NextinTest();
		rewards.XPEarned();
		rewards.Streak();
		rewards.MakingOfTheConstitution();
        rewards.TakeRevisionTest();
        rewards.ReadyToBegin();
        rewards.Q1();
        rewards.Next();
        rewards.Q2();
        rewards.Next();
        rewards.Q3();
        rewards.Submit();
        rewards.Yes();
		rewards.Score();
		rewards.NextinTest();
		rewards.XPEarned1();
		rewards.GetBack();
		rewards.AncientHistory();
		rewards.TheStoneAge();
		rewards.TakeTest();
		rewards.ReadyToBegin();
		rewards.Q1();
		rewards.Next();
		rewards.Q2();
		rewards.Next();
		rewards.Q3();
		rewards.Submit();
		rewards.Yes();
		rewards.NextinTest1();
		rewards.TopicCompletion();
		rewards.Completionofallsubtopics();
		rewards.Streak1();
		rewards.StatPage();
		rewards.Validate();

	}
	
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}

}