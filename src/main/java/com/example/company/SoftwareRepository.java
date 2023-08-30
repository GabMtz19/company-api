package com.example.company;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareRepository extends MongoRepository<Software, ObjectId> {
}
