package org.example.shops;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@RequiredArgsConstructor
@XStreamAlias("shop")
public class Shop {

    @XStreamAlias("name")
    @XStreamAsAttribute
    @SerializedName("name")
    private String name;

    @XStreamImplicit(itemFieldName = "department")
    @SerializedName("department")
    private ArrayList<Department> departments;
}
