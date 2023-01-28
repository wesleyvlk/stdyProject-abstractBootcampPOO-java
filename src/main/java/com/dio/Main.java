package com.dio;

import java.time.LocalDate;

import com.dio.challenge.domain.Bootcamp;
import com.dio.challenge.domain.Course;
import com.dio.challenge.domain.Dev;
import com.dio.challenge.domain.Mentoring;

public class Main {
    public static void main(String[] args) {
        Course basicCourse = new Course();
        basicCourse.setTitle("Conhecendo a Linguagem de Programação Java");
        basicCourse.setDescription("null");
        basicCourse.setWorkload(8);

        Course intermediaryCourse = new Course();
        intermediaryCourse.setTitle("Programação Orientada a Objetos e Collections com Java");
        intermediaryCourse.setDescription("null");
        intermediaryCourse.setWorkload(10);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("(Dominando Programação Orientada a Objetos com Java");
        mentoring.setDescription("null");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Experience");
        bootcamp.setDescription("null");
        bootcamp.getContents().add(basicCourse);
        bootcamp.getContents().add(intermediaryCourse);
        bootcamp.getContents().add(mentoring);

        Dev wesleyDev = new Dev();
        wesleyDev.setName("Wesley");
        System.out.println("- Inscrito: " + wesleyDev.getSubscribedContent());
        wesleyDev.subscribeToBootcamp(bootcamp);
        System.out.println("\n- Inscrito: " + wesleyDev.getSubscribedContent());
        wesleyDev.progress();
        wesleyDev.progress();
        wesleyDev.progress();
        System.out.println();
        System.out.println("- Concluído: " + wesleyDev.getConcludedContent());
        System.out.println();
        System.out.println("- Inscrito: " + wesleyDev.getSubscribedContent());
        System.out.println();
        System.out.println("- XP: " + wesleyDev.calculateTotalXP());
    }
}
