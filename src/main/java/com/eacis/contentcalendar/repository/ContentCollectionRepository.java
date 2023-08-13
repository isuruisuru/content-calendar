package com.eacis.contentcalendar.repository;

import com.eacis.contentcalendar.model.Content;
import com.eacis.contentcalendar.model.Status;
import com.eacis.contentcalendar.model.Type;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>(
            Arrays.asList(
                    new Content(1,"My first blog post","My first blog post", Status.IDEA, Type.ARTICLE, LocalDateTime.now(),null,""),
                    new Content(2,"My second blog post","My second blog post", Status.IN_PROGRESS, Type.VIDEO, LocalDateTime.now(),null,""),
                    new Content(3,"My third blog post","My third blog post", Status.IDEA, Type.ARTICLE, LocalDateTime.now(),null,"")

            )
    );

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.add(content);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void updateContent(Content content, Integer id) {
        for(int i=0;i<=contentList.size();i++){
            Content c = contentList.get(i);
            if(c.id().equals(id)){
                contentList.set(i, content);
                return;
            }
        }
    }
}
