package com.pmhung2.library_management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BorrowOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int borrowOrder_no;
    private Date dateOrder;
    private Date dateGiveBack;
}
