package com.hellost.model.five;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jaysunxiao
 * @version 3.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FiveRangeResult {

    private FiveRange items;

    public FiveRange getItems() {
        return items;
    }

    public void setItems(FiveRange items) {
        this.items = items;
    }
}
