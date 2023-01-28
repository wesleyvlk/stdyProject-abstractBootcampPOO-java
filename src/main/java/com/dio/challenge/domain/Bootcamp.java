package com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate initDate = LocalDate.now();
    private final LocalDate finalDate = initDate.plusDays(45);
    private Set<Dev> subscribedDev = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

}
