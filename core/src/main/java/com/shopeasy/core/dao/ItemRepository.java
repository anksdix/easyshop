package com.shopeasy.core.dao;

import com.shopeasy.core.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
