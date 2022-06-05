package ru.learnup.homework24.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.homework24.entity.Book_Warehouse;

@Repository
public interface Book_WarehouseRepository extends CrudRepository <Book_Warehouse, Integer> {
}
