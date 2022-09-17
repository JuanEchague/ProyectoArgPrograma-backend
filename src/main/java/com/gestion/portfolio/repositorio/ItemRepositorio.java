package com.gestion.portfolio.repositorio;

import com.gestion.portfolio.modelo.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepositorio extends JpaRepository<Item, Long> {
}
