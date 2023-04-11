package com.example.mathservice.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchComponent extends Base{

    @FindBy (name = "q")
    private WebElement searchbox;

    @FindBy (name = "btnK")
    private List<WebElement> searchBtns;

    public void search(String string){
        this.searchbox.sendKeys(string);
        this.searchbox.sendKeys(Keys.TAB);
        this.searchBtns.stream().filter(e -> e.isDisplayed() && e.isEnabled()).findFirst().ifPresent(WebElement::click);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((driver)->searchbox.isDisplayed());
    }
}
