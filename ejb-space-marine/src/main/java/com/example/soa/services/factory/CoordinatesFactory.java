package com.example.soa.services.factory;

import com.example.soa.services.exceptions.BadParams;
import com.example.soa.model.Coordinates;

import javax.ejb.Remote;

@Remote
public interface CoordinatesFactory {
    Coordinates create(Long x, Integer y) throws BadParams;
}
