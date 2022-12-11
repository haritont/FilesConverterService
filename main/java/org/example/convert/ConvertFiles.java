package org.example.convert;

import lombok.Data;
import org.example.read.ReadJson;
import org.example.read.ReadXml;
import org.example.shops.Shops;

import java.io.IOException;

@Data
public class ConvertFiles {
    public void convert(String[] files) throws IOException {
        if (files.length==2) {
            if (files[0].endsWith("xml") && files[1].endsWith("json")) {
                ReadXml xml = new ReadXml();
                Shops shops = xml.read(files[0]);
               ConvertToJson toJson = new ConvertToJson();
                toJson.convert(shops, files[1]);
                System.out.println("Success");
            } else if (files[1].endsWith("xml") && files[0].endsWith("json")) {
                ReadJson json = new ReadJson();
                Shops shops = json.read(files[0]);
                ConvertToXml toXml = new ConvertToXml();
                toXml.convert(shops, files[1]);
                System.out.println("Success");
            }
        }
    }
}
