package com.tws.refactoring.extract_method;

import org.junit.Test;

import com.tws.refactoring.extract_variable.BannerRender;

import static org.junit.Assert.assertEquals;


public class BannerRenderTest {
@Test
public void should_return_banner_when_given_IEonMAC() {
	String platform="MAC";
	String browser="IE";
	String result;
	BannerRender bannerRender = new BannerRender();
	
	result = bannerRender.renderBanner(platform,browser);
	
	assertEquals("IE on Mac?", result);
	
}

}
