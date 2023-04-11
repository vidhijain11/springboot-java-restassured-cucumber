package com.example.mathservice;

import com.example.mathservice.page.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends SpringBaseTestNGTest{

    @Autowired
    GooglePage googlePage;

    @Test
    public void search(){
        this.googlePage.goTO();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("Spring");
    }
}
