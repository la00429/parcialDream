package co.edu.uptc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private Long id;
    private String name;
    private String lastName;
    private String age;
    private String contact;
}
