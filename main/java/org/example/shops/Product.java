package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Product {
    @SerializedName("type")
    private String type;
    @SerializedName("price")
    private String price;
}
