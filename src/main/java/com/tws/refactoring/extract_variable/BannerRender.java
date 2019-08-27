package com.tws.refactoring.extract_variable;

public class BannerRender {

	public boolean isMACPlatform(String platform) {
		return platform.toUpperCase().indexOf("MAC") > -1;
	}
	public boolean isIEBrowser(String browser) {
		return browser.toUpperCase().indexOf("MAC") > -1;
	}
    public String renderBanner(String platform, String browser) {
        if (isMACPlatform(platform) && isIEBrowser(browser)) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
