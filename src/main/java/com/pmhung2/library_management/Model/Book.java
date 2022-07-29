package com.pmhung2.library_management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Book", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "book_name"
        })
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_no;
    @NotBlank
    @Size(min = 3, max = 30)
    private String book_name;
    @NotBlank
    @Size(min = 3, max = 30)
    private String address;
    @NotBlank
    @Size(min = 3, max = 30)
    private String email;
    @NotBlank
    @Size(min = 3, max = 30)
    private String image;
}
