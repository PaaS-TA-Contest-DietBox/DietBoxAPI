package com.example.paasta.DietBoxAPI.controller;

import com.example.paasta.DietBoxAPI.services.FoodOpenApiServiceImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@EnableScheduling
@RequestMapping("open-api")
public class FoodOpenApiController {

    private final FoodOpenApiServiceImpl foodOpenApiService;

    public FoodOpenApiController(FoodOpenApiServiceImpl foodOpenApiService) {
        this.foodOpenApiService = foodOpenApiService;
    }

    @Scheduled(cron = "0 0 4 * * *")
    public void dataUpdateScheduler() {
        foodOpenApiService.nutrientsDataBaseUpdateProcessorByFoodOpenApi();
    }
}
