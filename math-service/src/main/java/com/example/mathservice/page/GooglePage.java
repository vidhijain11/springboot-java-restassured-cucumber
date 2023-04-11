package com.example.mathservice.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base{

    @Autowired
    private SearchComponent searchComponent;

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    @Value("${url}:https://www.google.com")
    String url;
    public void goTO(){
        this.driver.get(url);
    }
    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}
