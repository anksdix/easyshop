package com.shopeasy.core.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

    @Id
    private String itemId;
    private String itemName;
    private String itemDesc;
    private float price;
    private float discountPercentage;
    private long qty;

    public Item(String itemId, String itemName, String itemDesc, float price, float discountPercentage, long qty) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.qty = qty;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public float getPrice() {
        return price;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public long getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemDesc='" + itemDesc + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                ", qty=" + qty +
                '}';
    }
}
