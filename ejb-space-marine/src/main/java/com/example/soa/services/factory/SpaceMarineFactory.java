package com.example.soa.services.factory;

import com.example.soa.model.SpaceMarine;
import com.example.soa.model.dto.SpaceMarineCreateDTO;
import com.example.soa.services.exceptions.BadParams;

import javax.ejb.Remote;

@Remote
public interface SpaceMarineFactory {
    SpaceMarine create(SpaceMarineCreateDTO createDTO) throws BadParams;
}
