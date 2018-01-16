package com.codecool.submarinemanager.submarine;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmarineRepository extends CrudRepository<Submarine, Integer> {
}
