package com.codecool.submarinemanager.submarine;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmarineRepository extends CrudRepository<Submarine, Integer> {

    public Iterable<Submarine> findAllByArchivedFalse();
    public Submarine findSubmarineByArchivedFalseAndId(Integer id);
}