package com.axonivy.demo.formeditordemos.test.it;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import java.time.Duration;

import org.apache.commons.lang3.StringUtils;

import com.axonivy.ivy.webtest.engine.EngineUrl;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class WebBaseSetup {
  protected static final String DYNAMIC_UI_PROCESS_PATH = "formeditor-demos/19AC88F44CEAAC4D/start.ivp";
  protected static final int DEFAULT_TIMEOUT_DURATION = 2;
  protected static final String LOGIN_URL = "formeditor-demos-test/19AD8A34AE465F0C/login.ivp?username=%s&password=%s";
  protected static final String DEVELOPER_USER = "Developer";
  protected static final String DROPDOWN_LABEL_SUFFIX = "_label";
  protected static final String DROPDOWN_LIST_SUFFIX = "_items";

  protected void startDynamicUIProcess() {
    open(EngineUrl.createProcessUrl(DYNAMIC_UI_PROCESS_PATH));
  }

  protected void verifyAndClickItemLabelInDropdown(String dropdownCssSelector, String labelText, String dropdownListSuffix,
      String dropdownLabelSuffix) {
    // Click target drop down when it's ready
    var dropdown = verifyElementVisible(dropdownCssSelector);
    dropdown.click();

    String dropdownListCssSelector = dropdownCssSelector + dropdownListSuffix;
    verifyElementVisible(dropdownListCssSelector);

    // Find the dropdown item that matches the label text
    SelenideElement targetElement = $$(dropdownListCssSelector + " li").stream().filter(item -> labelText.equals(item.text())).findAny()
        .orElseThrow(() -> new AssertionError(getDropdownItemNotFoundMessage(labelText)))
        .shouldBe(visible, Duration.ofSeconds(DEFAULT_TIMEOUT_DURATION));
    targetElement.click();
    $(dropdownCssSelector + dropdownLabelSuffix).shouldBe(Condition.text(labelText), Duration.ofSeconds(DEFAULT_TIMEOUT_DURATION));
  }

  protected String getDropdownItemNotFoundMessage(String optionName) {
    return String.join(StringUtils.SPACE, "Dropdown item with text", optionName, "not found!");
  }

  protected void login(String username, String password) {
    open(EngineUrl.createProcessUrl(LOGIN_URL.formatted(username, password)));
  }

  protected void login() {
    login(DEVELOPER_USER, DEVELOPER_USER);
  }

  protected SelenideElement verifyElementVisible(String elementId) {
    var element = $(elementId);
    element.shouldBe(visible, Duration.ofSeconds(DEFAULT_TIMEOUT_DURATION));
    return element;
  }
}
