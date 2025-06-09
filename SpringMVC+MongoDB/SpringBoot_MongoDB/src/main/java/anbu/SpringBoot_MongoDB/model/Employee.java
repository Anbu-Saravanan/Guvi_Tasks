package anbu.SpringBoot_MongoDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
    @Id

    private String id;
    private String name;
    private String email;
    private String location;
}
