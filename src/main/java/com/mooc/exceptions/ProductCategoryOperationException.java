package com.mooc.exceptions;

public class ProductCategoryOperationException extends RuntimeException {
    public ProductCategoryOperationException(String msg) {
        super(msg);
    }
}
