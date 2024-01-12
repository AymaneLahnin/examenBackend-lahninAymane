package com.example.examen.repositories;

import com.example.examen.entities.OrdreDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrdreDetail,Long> {
}
