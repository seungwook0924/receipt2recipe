package com.seungwook.r2r.repository;

import com.seungwook.r2r.domain.Heart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HeartRepository extends JpaRepository<Heart, Long> {
    List<Heart> findByMemberUserEmail(String userEmail);
    Optional<Heart> findByMemberUserEmailAndRecipeId(String userEmail, Long recipeId);
}
