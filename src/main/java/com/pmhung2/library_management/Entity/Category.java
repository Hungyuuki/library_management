package com.pmhung2.library_management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Category", uniqueConstraints = {@UniqueConstraint(columnNames = {"categoryname"})})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int category_no;
    @NotBlank
    @Size(min = 3, max = 30)
    private String category_name;
    @ManyToOne
}
