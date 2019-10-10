package com.shopeasy.core.dal;

import com.shopeasy.core.model.Item;

import java.util.List;

public interface ItemDAL {

    List<Item> getAllItems();

    Item getItemById(String ItemId);

    Item addNewItem(Item Item);

    Object getAllItemSettings(String ItemId);

    String getItemSetting(String ItemId, String key);

    String addItemSetting(String ItemId, String key, String value);
}
