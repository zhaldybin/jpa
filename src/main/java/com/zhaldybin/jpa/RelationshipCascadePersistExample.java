package com.zhaldybin.jpa;

import java.time.LocalDate;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RelationshipCascadePersistExample {

    public static void main(String... args) {
        Musician musician = new Musician();
        musician.setName("Metallica");
        Musician musician2 = new Musician();
        musician2.setName("Megadeth");
        Concert concert = new Concert();
        concert.setDate(LocalDate.now());
        concert.setMusicians(Set.of(musician, musician2));
        ConcertRepository repository = new ConcertRepository();
        repository.save(concert);
    }
}
