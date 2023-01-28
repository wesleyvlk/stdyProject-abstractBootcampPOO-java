package com.dio.challenge.domain;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import lombok.Data;

@Data
public class Dev {

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> concludedContent = new LinkedHashSet<>();

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDev().add(this);
    }
    
    public void progress() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.concludedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else
            System.out.println("Você não está matriculado em nenhum conteúdo!");
    }

    public double calculateTotalXP() {
        Iterator<Content> iterator = this.concludedContent.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calculateXP();
            sum += next;
        }
        return sum;
    }
}
