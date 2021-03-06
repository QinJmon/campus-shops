package com.mooc.interceptor.shopadmin;

import com.mooc.entity.Shop;
import com.mysql.cj.PreparedQuery;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*
* 店家管理系统操作验证拦截器
* (继承spring的拦截器抽象类)
* */
public class ShopPermissionInterceptor extends HandlerInterceptorAdapter {
    /*主要做事前拦截，即用户操作发生前，设置拦截,(在controller方法执行之前)*/

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从session中获取当前选择的店铺
        Shop currentShop = (Shop) request.getSession().getAttribute("currentShop");
        @SuppressWarnings("unchecked")
         //从session中获取当前用户可操作的店铺列表
                List<Shop> shopList=(List<Shop>)request.getSession().getAttribute("shopList");
        //非空判断
        if(currentShop!=null && shopList !=null){
            //遍历可操作的店铺列表
            for (Shop shop : shopList) {
                //如果当前店铺在可操作的列表里则返回true，进行接下来的用户操作
                if(shop.getShopId()==currentShop.getShopId()){
                    return true;
                }
            }
        }
        //若不满足拦截器的验证则返回false，终止用户的执行
        return false;
    }
}
