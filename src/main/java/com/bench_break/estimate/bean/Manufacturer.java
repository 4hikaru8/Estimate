package com.bench_break.estimate.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* 
    メーカー情報
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
    
    // メーカーID
    private String manufactuer_id;
    // メーカー
    private String manufactuerName;

}
