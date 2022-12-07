package org.example.convert;

import org.example.Product;
import org.example.read.ReadJson;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class convertToJsonTest {
    private static ReadJson json;
    final static String nameFile="src\\shops.json";
    final static String newFile="src\\new_shops.json";

    @BeforeEach
    void setUp() {
        json = new ReadJson();
    }

    @AfterEach
    void tearDown() {
        json=null;
    }
    @Test
    public void checkConvert() throws IOException {
        Product product = json.read(nameFile);
        ConvertToJson toJson = new ConvertToJson();
        toJson.convert(product, newFile);
    }
}