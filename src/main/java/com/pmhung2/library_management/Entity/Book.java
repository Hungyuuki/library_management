package com.pmhung2.library_management.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Book")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 30)
    private String book_name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Book_Category", joinColumns = @JoinColumn(name = "Book_id"), inverseJoinColumns = @JoinColumn(name = "Category_id"))
    private List<Category> categories = new ArrayList<>();
}
