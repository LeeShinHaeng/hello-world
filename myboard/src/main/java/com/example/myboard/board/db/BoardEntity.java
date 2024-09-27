package com.example.myboard.board.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "board")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String boardName;
    private String status;
}
