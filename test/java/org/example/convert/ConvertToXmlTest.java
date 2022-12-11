package org.example.convert;

import org.example.read.ReadJson;
import org.example.read.ReadXml;
import org.example.shops.Product;
import org.example.shops.Shops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class ConvertToXmlTest {
    private static ReadXml xml;
    final static String nameFile="src\\shops.xml";
    final static String newFile="src\\new_shops.xml";

    @BeforeEach
    void setUp() {
        xml = new ReadXml();
    }

    @AfterEach
    void tearDown() {
        xml = null;
    }
    @Test
    public void checkConvert() throws IOException {
        Shops shops = xml.read(nameFile);
        ConvertToXml toXml = new ConvertToXml();
        toXml.convert(shops, newFile);
    }
}