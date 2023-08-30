package com.example.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personnel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private ObjectId id;
    private String enrollment;
    private String firstName;
    private String lastName;
    private String position;
}
