package com.poly.hangnt169.B8_CRUDHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hangnt169
 */
@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Category {

    // Java 3: JDBC
    // Java 4: Hibernate
    // Java 5 >: JPA
    // Hibernate : Truy van tren thuc the (Entity) : HQL (Hibernate Query Language)
    // ORM ( Object Relationship Mapping) : Mapping giua entity vs DB
    // varchar/nvarchar <=> String
    // int <=> Integer
    // bigint <=> Long
    // Mapping quan he : OneToOne (1-1), ManyToOne(N-1),OneToMany(1-N), ManyToMany(N-N)
    // 1 Class Entity <=> 1 Table trong DB
    // Cac truong thuoc tinh trong entity :
    // Cot binh thuong
    // Khoa Chinh
    // Khoa ngoai

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "category_name")
    private String categoryName;

}
