package com.axonivy.demo.formeditordemos.test.it;

import org.junit.jupiter.api.Test;

import com.axonivy.ivy.webtest.IvyWebTest;

@IvyWebTest
public class DynamicUITest extends WebBaseSetup {

  private static final String COUNTRY_DROPDOWN_CSS_SELECTOR = "#form\\:country";
  private static final String FEDERAL_STATE_DROPDOWN_CSS_SELECTOR = "#form\\:federal-state";

  @Test
  void dynamicUIShowFederalStateWhenCountryOfGermanyIsChosen() {
    login();
    startDynamicUIProcess();
    // Click to "Germany" option in Country drop-down
    verifyAndClickItemLabelInDropdown(COUNTRY_DROPDOWN_CSS_SELECTOR, "Germany", DROPDOWN_LIST_SUFFIX, DROPDOWN_LABEL_SUFFIX);
    // Check if "Federal State" is rendered
    verifyElementVisible(FEDERAL_STATE_DROPDOWN_CSS_SELECTOR);
  }
}