package com.mattvoget.tsspring.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mattvoget.tsspring.models.Note;

@RepositoryRestResource(collectionResourceRel = "note", path = "note")
public interface NoteRepository extends MongoRepository<Note, String>{

}
