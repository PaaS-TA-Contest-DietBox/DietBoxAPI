package com.example.paasta.DietBoxAPI.repositories;

import com.example.paasta.DietBoxAPI.models.Foods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Foods, Long> {
}
