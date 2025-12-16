package com.axonivy.demo.formeditordemos.test.it;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.axonivy.ivy.webtest.IvyWebTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

@IvyWebTest
public class TableUITest extends WebBaseSetup {
  @Test
  void TableUIAddingNewTabledata() {
    login();
    startTableUIProcess();

    $("i.pi.pi-plus").click();
    SelenideElement frame = $("iframe[title='Update form']").shouldBe(Condition.visible);
    Selenide.switchTo().frame(frame);
    $(By.id("update-form:date-picker_input")).shouldBe(Condition.visible).click();
    $(".p-datepicker").shouldBe(Condition.visible);
    $("a.ui-state-highlight").click();

    $(By.id("update-form:category-select")).click();
    $("li[data-label='Meal']").click();

    $(By.id("update-form:amount-input_input")).click();
    $(By.id("update-form:amount-input_input")).setValue("2");

    $(By.id("update-form:description-input")).click();
    $(By.id("update-form:description-input")).setValue("test-description");

    $(By.id("update-form:save-button")).click();
    Selenide.switchTo().defaultContent();
    $(By.id("form:layout20")).shouldHave(Condition.text("Total amount: 1"));
    $(By.id("form:travel-expenses-data:0:remove-button")).click();
    $$("button").findBy(Condition.text("Yes")).click();
    $(By.id("form:layout20")).shouldHave(Condition.text("Total amount: 0"));
  }

}
