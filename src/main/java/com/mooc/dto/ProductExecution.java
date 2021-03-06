package com.mooc.dto;

import com.mooc.entity.Product;
import com.mooc.enums.ProductStateEnum;

import java.util.List;

public class ProductExecution {
    //结果状态
    private int state;

    //状态标识
    private String stateInfo;

    //商品数量
    private int count;

    //操作的product（增删改商品的时候用）
    private Product product;

    //查询 商品列表的时候用
    private List<Product> productList;

    public ProductExecution() {
    }

    //失败的构造器
    public ProductExecution(ProductStateEnum stateEnum){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
    }

    //成功的构造器(针对单个商品)
    public ProductExecution(ProductStateEnum stateEnum,Product product){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.product=product;
    }

    //成功的构造器(针对多个商品)
    public ProductExecution(ProductStateEnum stateEnum,List<Product> productList){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.productList=productList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
