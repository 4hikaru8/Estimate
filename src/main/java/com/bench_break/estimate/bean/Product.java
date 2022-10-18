package com.bench_break.estimate.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* 
        商品情報
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    // 商品ID
    private Integer item_id;
    // 商品名
    private String item_name;
    // メーカーID
    private Manufacturer manufactuer;
    // 単価
    private Integer item_price;
    // 備考
    private String coment;
}
