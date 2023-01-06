package com.human.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 라이브러리 기능
// - 클래스의 getter, setter, toString 메소드를 자동정의
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;

	
	
	
}
