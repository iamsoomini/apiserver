package org.zerock.apiserver.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;


//entity 생성시 제일 중요한건 pk가 있어야함.
//entity class가 있고 entity 객체가 있는데 구분하는게 좋음.
// builder랑 밑에 두개는 세트임. 3개는 같이 다니는거라 생각하기.

@Entity
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    private String title;

    private String content;

    private boolean complete;

    private LocalDate dueDate;

}
