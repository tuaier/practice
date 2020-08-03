package com.annotation;

/**
 * @author kangfw5
 * @since 2020-06-27
 */
public class Apple {
    @FruitProvider(id = 1, name = "陕西红富士集团", address = "陕西省西安市延安路")
    private String appleProvider;

    @FruitProvider(id = 2, name = "安徽富士红集团", address = "安徽省黄山市")
    private String sappleProvider;

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public String getAppleProvider() {
        return appleProvider;
    }
}
