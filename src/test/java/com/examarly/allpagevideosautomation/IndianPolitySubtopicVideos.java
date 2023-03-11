package com.examarly.allpagevideosautomation;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import com.examarly.allpage.IndianPolityTakeTest;
    import com.examarly.allpageyoutubevideos.IndianPolityYouTubeVideos;

	public class IndianPolitySubtopicVideos  extends com.examarlyBaseClass.BaseclassWeb {

		IndianPolityYouTubeVideos indianpolity;

		public IndianPolitySubtopicVideos() {
			super();
		}
		
		@BeforeClass
		public void setUp() {
			try {
				initilization();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			indianpolity = new IndianPolityYouTubeVideos();
		}

		
		@Test
		public void LoginPage() throws InterruptedException {

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
//		indianpolity.HistoricalBackground();
//		indianpolity.HistoricalBackgroundSubtopic();
//		indianpolity.Video();
//		indianpolity.YoutubeClick();
//		indianpolity.GetBack();
//		indianpolity.MakingofConstitution();
		indianpolity.GetFoward();
		indianpolity.EnvironmentModule();
		indianpolity.EcologyTopic();
		indianpolity.EcologySubTopic();
		indianpolity.Video();
		indianpolity.YoutubeClick();
		indianpolity.GetBack();
		
		//indianpolity.YoutubeClick();
		//indianpolity.YouTubeNext();

		
		
		
		
}
	}
