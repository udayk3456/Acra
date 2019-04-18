package com.acra.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import com.acra.demo.controller.AcraController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcraApplicationTests {
	ModelAndView m;
	static AcraController acra=new AcraController();
	@Test
	public void testLandingPage() {
		m=acra.landingPage();
		assertEquals("LandingPage.html",m.getViewName());
	}
	@Test
	public void testDashBoardPage() {
		m=acra.dashBoardPage();
		assertEquals("BizFileDashboardPage.html",m.getViewName());
	}
}
