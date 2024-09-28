package com.example.mathservice.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.Duration;

@Configuration
public class WebdriverConfig {

    @Value("${timeout:30}")
    private int timeout;

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "chrome") //if property = chrome
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    //@Primary
    //@ConditionalOnProperty(name="browser", havingValue = "firefox")    //if property = firefox
    @ConditionalOnMissingBean       //if property, browser is not equal to chrome then run this bean.Kind of default bean for browser type
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
    }
}
