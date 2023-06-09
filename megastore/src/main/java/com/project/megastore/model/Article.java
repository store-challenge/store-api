package com.project.megastore.model;

import org.springframework.data.annotation.Id;

public record Article(@Id Long id, String name, Double amount) {
}
