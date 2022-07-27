package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

public class Enrollment {
    private Long id;
    private String student;
    private LocalDateTime enrollmentDate = LocalDateTime.now();
}
