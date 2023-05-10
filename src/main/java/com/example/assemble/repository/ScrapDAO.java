package com.example.assemble.repository;

import com.example.assemble.domain.scrap.Scrap;
import com.example.assemble.domain.scrap.ScrapId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScrapDAO extends JpaRepository<Scrap, ScrapId>{
    List<Scrap> findAllByUser_uid(int user_uid);
}