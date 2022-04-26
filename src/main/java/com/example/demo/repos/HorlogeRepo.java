package com.example.demo.repos;

import com.example.demo.basicModels.show.Horloge;
import com.example.demo.basicModels.show.Show;
import com.example.demo.enums.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Collection;

public interface HorlogeRepo extends CrudRepository<Horloge, Long> {

    ArrayList<Horloge> findByEvent(Event primarydate);

    boolean existsByEventAndShow(Event eventType, Show Show);

    Horloge findByEventAndShow(Event eventType, Show foundShow);

    Collection<Horloge> findAllByEventAndShow(Event event, Show foundShow);
}
