package com.PureIntegration.PureIntegration.Model;

import lombok.Data;

@Data
public class Breeds {
    private  Object message;
    private String status;

    public Breeds(Object message) {
        this.message = message;
    }
}
