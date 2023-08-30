package com.example.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "software")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Software {
    @Id
    private ObjectId id;
    private String name;
    private String description;
    private String favorite;
}
