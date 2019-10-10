package com.shopeasy.core.controller;

import java.util.List;

import com.shopeasy.core.dal.ItemDAL;
import com.shopeasy.core.dao.ItemRepository;
import com.shopeasy.core.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class ItemController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final ItemDAL itemRepository;

    public ItemController(ItemDAL itemRepository) {
        this.itemRepository = itemRepository;
    }

    @RequestMapping(value = "/{itemId}", method = RequestMethod.GET)
    public Item getItemById(@PathVariable String itemId) {
        LOG.info("Getting item with ID: {}.", itemId);

        return itemRepository.getItemById(itemId);
    }
}