package com.example.thriftbox.model;

/**
 * Created by Patrick Ian Co on 9/20/2017.
 */

public class Records {
    private String recordsDate;
    private String recordsCategory;
    private String recordsValue;

    public Records(String recordsDate, String recordsCategory, String recordsValue) {
        this.recordsDate = recordsDate;
        this.recordsCategory = recordsCategory;
        this.recordsValue = recordsValue;
    }

    public String getRecordsDate() {
        return recordsDate;
    }

    public void setRecordsDate(String recordsDate) {
        this.recordsDate = recordsDate;
    }

    public String getRecordsCategory() {
        return recordsCategory;
    }

    public void setRecordsCategory(String recordsCategory) {
        this.recordsCategory = recordsCategory;
    }

    public String getRecordsValue() {
        return recordsValue;
    }

    public void setRecordsValue(String recordsValue) {
        this.recordsValue = recordsValue;
    }
}
