package com.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter //lombok 어노테이션
//@NoArgsConstructor //기본생성자
//@AllArgsConstructor //모든 형태의 생성자를 만들어 줌 

@Data //한번에 다 생성
public class LombokTest {
	private String name;
	private int age;
	private int ban;
	private int no;
	private String addr;
	
	
	
}
