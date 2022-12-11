package org.example.convert;

import com.thoughtworks.xstream.XStream;
import org.example.shops.Department;
import org.example.shops.Product;
import org.example.shops.Shop;
import org.example.shops.Shops;

import java.io.FileWriter;
import java.io.IOException;

public class ConvertToXml {
    public void convert(Shops shops, String newFile) throws IOException {
        XStream xstream = new XStream();
        xstream.alias("shops", Shops.class);
        xstream.alias("shop", Shop.class);
        xstream.alias("department", Department.class);
        xstream.alias("product", Product.class);
        String xmlString = xstream.toXML(shops);
        FileWriter writer = new FileWriter(newFile);
        writer.write(xmlString);
        writer.close();
    }
}
