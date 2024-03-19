package com.duc.tasksubmissionservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private String image;
    private Long assignedUserId;
    private List<String> tag = new ArrayList<>();
    private TaskStatus status;
    private LocalDateTime deadLine;
    private LocalDateTime createAt;
}
