package com.example.contentcalender.repository;

import com.example.contentcalender.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findAllByTitleContains(String keyword);
    List<Content> findAllByContentType(String type);
}
