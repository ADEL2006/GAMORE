package com.example.reactboard.dto;

import com.example.reactboard.db.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardSaveDto {
    private Long idx;   // 고유번호 (primary key)
    private String title;   // 제목
    private String contents;    // 내용
    private String createdBy;   // 작성자

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .idx(idx)
                .title(title)
                .contents(contents)
                .createdBy(createdBy)
                .build();
    }
}
