package org.example.shops;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@XStreamAlias("product")
public class Product {

    @XStreamAlias("type")
    @XStreamAsAttribute
    @SerializedName("type")
    private String type;

    @XStreamAlias("price")
    @XStreamAsAttribute
    @SerializedName("price")
    private int price;
}
