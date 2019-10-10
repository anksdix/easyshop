package com.shopeasy.core.dal;

import com.shopeasy.core.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDALImpl implements  ItemDAL{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public Item getItemById(String itemId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(itemId));
        return mongoTemplate.findOne(query, Item.class);
    }

    @Override
    public Item addNewItem(Item Item) {
        return null;
    }

    @Override
    public Object getAllItemSettings(String ItemId) {
        return null;
    }

    @Override
    public String getItemSetting(String ItemId, String key) {
        return null;
    }

    @Override
    public String addItemSetting(String ItemId, String key, String value) {
        return null;
    }
}
