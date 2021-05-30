package com.example.tuan5;

public class Item {
    private String itemName;
    private String shopName;
    private int imgItem;

    public Item(String itemName, String shopName, int imgItem) {
        this.itemName = itemName;
        this.shopName = shopName;
        this.imgItem = imgItem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }
}
