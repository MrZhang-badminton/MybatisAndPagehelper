# BluePageHelper
## 介绍
+ 目前实现的是一个Mybatis分页插件
+ BluePageHelper集成在MybatisAndpageHelper项目下，主要是方便学习`com.github.PageHelper`同时，能够在Mybatis中写注释，方便学习
+ 后序该分页插件成熟之后，会将该分页插件移出，变成一个独立的项目
## 功能
+ 像使用`com.github.PageHelper`一样,在需要分页代码前添加`BluePageHelper.startPage(int pageNum, int size)` 下一次查询即可分页
## 问题
+ 不能返回count字段
+ 本项目中的Page不像`com.github.PageHelper`中的Page,只是存储数据,执行完查询之后,并不能返回一个信息丰富的Page(包含startRow、rows(List)等)。