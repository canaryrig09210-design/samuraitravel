package com.example.samuraitravel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data

public class Role {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id")
//	   フィールドで定義しているのがidのためプロジェクト内ではidという名前で扱う
	   private Integer id;
//	   フィールドで定義しているのがnameのためプロジェクト内ではnameという名前で扱う
	   @Column(name = "name")
	   private String name;  

}
