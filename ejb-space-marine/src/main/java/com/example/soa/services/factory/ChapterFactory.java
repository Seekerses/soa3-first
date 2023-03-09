package com.example.soa.services.factory;

import com.example.soa.services.exceptions.BadParams;
import com.example.soa.model.Chapter;

import javax.ejb.Remote;

@Remote
public interface ChapterFactory {
    Chapter create(String name, String world) throws BadParams;
}
