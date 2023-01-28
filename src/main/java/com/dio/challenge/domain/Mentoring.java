package com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    @Override
    public double calculateXP() {
        return XP_MIN * 20d;
    }

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\nMentoria {" + "\ntitulo=" + getTitle() + ", \ndescrição=" + getDescription() + ", \ndata="
                + date + "\n}";
    }

}
