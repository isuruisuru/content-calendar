package com.eacis.contentcalendar.repository;

import com.eacis.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    
}
