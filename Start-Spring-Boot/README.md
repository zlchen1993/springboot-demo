1.开启Spring Boot
Spring Boot是在Spring框架上创建的一个全新的框架，其设计目的是简化Spring应用的搭建和开发过程。开启Spring Boot有许多种方法可供选择，这里仅介绍使用http://start.spring.io/来构建一个简单的Spring Boot项目。

1.1生成项目文件
访问http://start.spring.io/，页面显示如下：

![image-20210727215005731](C:\Users\czl\AppData\Roaming\Typora\typora-user-images\image-20210727215005731.png)

生成后，会下载一个压缩包。

1.2文件目录

将压缩包解压，用idea导入项目，如下为项目的结构：

![image-20210727215406030](C:\Users\czl\AppData\Roaming\Typora\typora-user-images\image-20210727215406030.png)



2.简单演示

项目根目录下生成了一个artifactId+Application命名规则的入口类，为了演示简单，不再新建控制器，直接在入口类中编写代码：

![image-20210727215540508](C:\Users\czl\AppData\Roaming\Typora\typora-user-images\image-20210727215540508.png)

运行该程序，在浏览器输入[http://localhost:8080](http://localhost:8080/)，页面显示如下：

![image-20210727215720200](C:\Users\czl\AppData\Roaming\Typora\typora-user-images\image-20210727215720200.png)

3.打包发布

![image-20210727215945353](C:\Users\czl\AppData\Roaming\Typora\typora-user-images\image-20210727215945353.png)

![image-20210727220220990](C:\Users\czl\AppData\Roaming\Typora\typora-user-images\image-20210727220220990.png)