package com.example.DietBoxAPI.configurations;

import com.example.DietBoxAPI.models.data_enums.RDA;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "rda")
@Getter
@Setter
public class RDAConfig {
    private RDA recommendedDailyAllowance;

    public RDAConfig() {
        this.recommendedDailyAllowance = recommendedDailyAllowance.RECOMMENDED_DAILY_ALLOWANCE;
    }
}
