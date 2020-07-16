package com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingColumn;

import com.sasha.testJpa.entityBinding.OneToMany.oneWay.bindingTable.Line;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumnLineRepo extends JpaRepository<LineColumn, Long> {
}
