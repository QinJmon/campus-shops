# 校园商铺

#### 介绍
项目基于SSM框架实现了商家对店铺和商品的相关管理与罗列，用户可以在前端展示页浏览并搜索相关店铺和商品信息功能。

#### 开发工具
    IDEA+Mysql+Redis


#### 相关技术

       前端：前端UI库 SUI Mobile／ jQuery／ Chrome UA 

       后端：SSM／图片开源工具 Thumbnailator/验证码组件Kaptcha

       数据库：MySQL

        缓存：Redis 

#### 项目各个模块开发

  1、超级管理员模块：店铺管理、商品管理、顾客信息管理

  2、商家模块：商家入驻、商家登录/退出登录、门店管理、商品折扣信息管理

  3、前台模块：首页模板数据填充、搜索商品/店铺功能、店铺/商品详情页开发

#### 使用说明

1.  因为项目中使用了本地Redis作为缓存将不经常改变的数据存入其中，所以在项目启动时需要将Redis

2、注意项目图片的存放路径以及项目的启动路径

3、如果项目图片在路径正确的情况下还加载不出来，那么可以在tomcat启动的时候加上图片文件夹


![项目图片配置](https://images.gitee.com/uploads/images/2021/0829/160238_773b69f1_9612748.png "屏幕截图.png")

