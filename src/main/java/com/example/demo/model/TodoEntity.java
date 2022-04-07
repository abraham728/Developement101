package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;


@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="Todo")
public class TodoEntity {

		@Id
		@GeneratedValue(generator="system-uuid") //ID자동으로 생성, generator는 어떤 방식으로 ID를 생성할지 지정가능.
		@GenericGenerator(name="system-uuid", strategy="uuid")
		private String id;  //object의 ID
		private String userId; // 이 오브젝트를 생성한 사용자의 아이 
		private String title; // Todo타이틀(예: 운동하기) 
		
		private boolean done; //true - todo를 완료한 경우(checked))
}
