# MybatisAndHelper
### 项目描述
+ 主要是整合了Mybatis源码、PageHelper(`com.github.Pagehelper`)源码、自己准备开发的分页插件、用来测试的demo模块
+ 本项目主要用来学习Mybatis源码，然后也集成了com.github.PageHelper源码用来学习Mybatis插件部门
### 项目结构
+ Mybatis源码
+ Mybatis_PageHelper源码
+ BluePageHelper
    + 自己正在开发的分页插件
+ FreedomDemo
    + 用来做各种demo，与功能模块分离
  
### 使用说明
+ Demo写在FreedomDemo里，直接将该子模块下的`mybatis-config.xml`文件配置下就好了
  + 测试代码写在test目录下
  
    
### 注意
+ 本项目将Mybatis源码、PageHelper源码整合，依赖比较多，怕搞乱了，就没用在父目录的pom.xml里用dependencyManagement管理
+ 有Jar包冲突，为了将精力放在学习代码上，只是将相关Jar包在字模块注释掉，在父目录的pom.xml里定义了一下
    + 有点不规范，但是太忙了，有时间整理吧