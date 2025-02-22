package com.alexisgeoffrey.pictovate;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Long> {

  List<Image> findByFiletype(Filetype filetype);

  Image findById(long id);
}