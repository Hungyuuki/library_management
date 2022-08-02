package com.pmhung2.library_management.Entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name = "Students", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 30)
    private String studentName;
    @NotBlank
    @Size(min = 3, max = 30)
    private String address;
    @NotBlank
    @Size(min = 3, max = 30)
    @Email
    private String email;
    @NotBlank
    @Lob
    private String image;
}
