package com.zhaldybin.jpa;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.Set;

@Slf4j
public class RelationshipExample {

    public static void main(String... args) {
        Musician musician = new Musician();
        musician.setName("Metallica");
        MusicianRepository musicianRepository = new MusicianRepository();
        Musician savedMusician = musicianRepository.save(musician);
        log.info("saved musician: {}", savedMusician);
        Musician musician2 = new Musician();
        musician2.setName("Megadeth");
        Musician savedMusician2 = musicianRepository.save(musician2);
        log.info("saved musician: {}", savedMusician2);
        Concert concert = new Concert();
        concert.setDate(LocalDate.now());
        concert.setMusicians(Set.of(savedMusician, savedMusician2));
        ConcertRepository repository = new ConcertRepository();
        Concert savedConcert = repository.save(concert);
        log.info("saved concert: {}", savedConcert);
    }
}
