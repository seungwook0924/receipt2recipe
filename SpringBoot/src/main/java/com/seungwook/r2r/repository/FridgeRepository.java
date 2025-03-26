package com.seungwook.r2r.repository;

import com.seungwook.r2r.domain.Fridge;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FridgeRepository extends JpaRepository<Fridge, Long> {
    Optional<Fridge> findByMemberUserEmail(String userEmail);
}
