package com.example.DietBoxAPI.services.interfaces;


import com.example.DietBoxAPI.models.Foods;
import com.example.DietBoxAPI.models.data_enums.Nutrients;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public interface FoodService {

    HashMap<String, Nutrients> categorySetter();

    double[] ingestedTotalNutrientsGetter(List<String> eats, HashMap<String, Nutrients> categories);

    ArrayList<Foods> foodListExtractFromDB();

    HashSet<String> exceptCategorySetter();

    double priorCalculator(Foods food, double carbohydrate, double protein, double fat);

    ArrayList<Foods>[] extractCandidates(double[] ingested, ArrayList<Foods> foodDB, HashSet<String> except);

    ArrayList<Foods> menuRecommendation(ArrayList<Foods>[] candidates);

    int getTotalSize(ArrayList<Foods>[] candidates);

    void save(Foods food);

    void delete(Foods food);
}
