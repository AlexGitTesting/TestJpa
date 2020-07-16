package com.sasha.testJpa.colectionsOfComponents;

import com.sasha.testJpa.colectionsOfComponents.CollectionOfEmbededClass.ManCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepo extends JpaRepository<ManCollection, Long> {
}
