package org.example.convert;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ConvertFilesTest {
    private ConvertFiles convert;

    final static String nameFileJson="src\\shops.json";
    final static String newFileJson="src\\new_shops.json";

    final static String nameFileXml="src\\shops.xml";
    final static String newFileXml="src\\new_shops.xml";

    @BeforeEach
    void setUp() {
        convert = new ConvertFiles();
    }

    @AfterEach
    void tearDown() {
        convert = null;
    }

    @Test
    public void checkConvertToJson() throws IOException {
        String [] files={nameFileXml, newFileJson};
        convert.convert(files);
    }

    @Test
    public void checkConvertToXml() throws IOException {
        String [] files={nameFileJson, newFileXml};
        convert.convert(files);
    }
}