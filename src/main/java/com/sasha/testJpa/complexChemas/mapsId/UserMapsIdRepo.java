package com.sasha.testJpa.complexChemas.mapsId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapsIdRepo extends JpaRepository<UserMapsId,UserId> {
}
