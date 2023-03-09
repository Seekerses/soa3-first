package com.example.soa.services;

import com.example.soa.model.MeleeWeapon;
import com.example.soa.model.SpaceMarine;
import com.example.soa.model.dto.SpaceMarinePage;
import com.example.soa.util.NameGroup;
import com.example.soa.util.Pageable;

import javax.ejb.Remote;
import java.util.List;
import java.util.Optional;

@Remote
public interface SpaceMarineRepository {
    SpaceMarine getSpaceMarineWithMaxHealth();

    List<NameGroup> groupByName();

    Optional<SpaceMarine> findById(Long id);

    List<SpaceMarine> findAll();

    SpaceMarine saveAndFlush(SpaceMarine spaceMarine);

    SpaceMarine update(SpaceMarine spaceMarine);

    void delete(SpaceMarine spaceMarine);

    SpaceMarinePage getByFilter(Pageable pageable,
                                Long id,
                                String name,
                                String createdBefore,
                                String createdAfter,
                                Long xCoordinateGreaterThan,
                                Long xCoordinateLesserThan,
                                Long xCoordinateEquals,
                                Integer yCoordinateGreaterThan,
                                Integer yCoordinateLesserThan,
                                Integer yCoordinateEquals,
                                Long healthGreaterThan,
                                Long healthLesserThan,
                                Long healthEquals,
                                Integer heartCountGreaterThan,
                                Integer heartCountLesserThan,
                                Integer heartCountEquals,
                                Boolean loyal,
                                MeleeWeapon meleeWeapon,
                                String chapterName,
                                String chapterWorld);
}
