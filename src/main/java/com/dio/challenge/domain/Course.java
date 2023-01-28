package com.dio.challenge.domain;

public class Course extends Content {

    private int workload;

    @Override
    public double calculateXP() {
        return XP_MIN * workload;
    }

    public Course() {
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "\nCurso {" + "\ntitulo=" + getTitle() + ", \ndescrição=" + getDescription() + ", \ncarga horaria="
                + workload + "\n}";
    }

}
