package com.project.megastore.model;

import org.springframework.data.annotation.Id;

public record User(@Id Long id, String name) {
}
