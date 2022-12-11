package org.example.shops;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@XStreamAlias("shops")
public class Shops {

    @SerializedName("shop")
    @XStreamImplicit(itemFieldName = "shop")
    private List<Shop> shops;
}

