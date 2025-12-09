package com.axonivy.demo.formeditordemos.test.it;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.axonivy.ivy.webtest.IvyWebTest;

@IvyWebTest
public class SimpleUITest extends WebBaseSetup {
	private static final String COUNTRY_DROPDOWN_CSS_SELECTOR = "#form\\:country";
	private static final String FIRSTNAME_INPUT_CSS_SELECTOR = "#form\\:first-name";
	private static final String LASTNAME_INPUT_CSS_SELECTOR = "#form\\:last-name";
	private static final String DATE_OF_BIRTH_INPUT_CSS_SELECTOR = "#form\\:date-of-birth_input";
	private static final String AGE_INPUT_CSS_SELECTOR = "#form\\:age_input";
	private static final String ABOUT_ME_INPUT_CSS_SELECTOR = "#form\\:about-me";
	private static final String SUBMIT_BUTTON_CSS_SELECTOR = "#form\\:submit-button";
	private static final String EMAIL_CSS_SELECTOR = "#form\\:email";
	private static final String FIRSTNAME_INPUT_VALUE = "Hoang";
	private static final String LASTNAME_INPUT_VALUE = "Vu";
	private static final String EMAIL_INPUT_VALUE = "hoangvu@gmail.com";

	@BeforeEach
	void setUpTest() {
		login();
		startSimpleUIProcess();
	}

	@Test
	void simpleUIShowsCountriesDroppdownWhenClick() {
		verifyAndClickItemLabelInDropdown(COUNTRY_DROPDOWN_CSS_SELECTOR, "Germany", DROPDOWN_LIST_SUFFIX,
				DROPDOWN_LABEL_SUFFIX);
	}

	@Test
	void simpleUIInputsShouldBeDisabledOnSecondScreen() {
		fillInput(FIRSTNAME_INPUT_CSS_SELECTOR, FIRSTNAME_INPUT_VALUE);
		fillInput(LASTNAME_INPUT_CSS_SELECTOR, LASTNAME_INPUT_VALUE);
		fillInput(EMAIL_CSS_SELECTOR, EMAIL_INPUT_VALUE);
		var submitButton = verifyElementVisible(SUBMIT_BUTTON_CSS_SELECTOR);
		submitButton.click();
		verifyReadOnlyInput(FIRSTNAME_INPUT_CSS_SELECTOR);
		verifyReadOnlyInput(LASTNAME_INPUT_CSS_SELECTOR);
		verifyReadOnlyInput(EMAIL_CSS_SELECTOR);
		verifyReadOnlyInput(AGE_INPUT_CSS_SELECTOR);
		verifyReadOnlyInput(DATE_OF_BIRTH_INPUT_CSS_SELECTOR);
		verifyReadOnlyDropdown(COUNTRY_DROPDOWN_CSS_SELECTOR);
		verifyReadOnlyInput(ABOUT_ME_INPUT_CSS_SELECTOR);
	}
}
