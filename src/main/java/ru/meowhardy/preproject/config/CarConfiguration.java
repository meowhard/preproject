package ru.meowhardy.preproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "car")
public class CarConfiguration {

    private int maxValue;

    private List<String> sortEnabled;

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public List<String> getSortEnabled() {
        return sortEnabled;
    }

    public void setSortEnabled(List<String> sortEnabled) {
        this.sortEnabled = sortEnabled;
    }
}