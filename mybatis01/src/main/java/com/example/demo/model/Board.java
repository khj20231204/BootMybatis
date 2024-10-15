package com.example.demo.model;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("board") // DTO 클래스 alias 설정
public class Board {
	private int no;
	private String name;
	private String subject;
	private String content;
	private Date register;
}
