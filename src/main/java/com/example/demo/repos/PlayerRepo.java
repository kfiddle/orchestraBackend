package com.example.demo.repos;

import com.example.demo.basicModels.player.Player;
import com.example.demo.enums.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PlayerRepo extends CrudRepository<Player, Long> {

    Collection<Player> findAllByType(Type type);

    boolean existsByFirstNameAreaAndLastName(String firstNameArea, String lastName);

    Player findByFirstNameAreaAndLastName(String firstNameArea, String lastName);

}
