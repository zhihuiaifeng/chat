
#更多资源qq891377154

# Python3实战Spark大数据分析及调度


大家好，欢迎大家来到我在[慕课网](https://imooc.com)上的实战课程[《Python3实战Spark大数据分析及调度》](https://coding.imooc.com/class/chapter/249.html)的官方代码仓。在本仓库中将提供课程学习过程中的代码以及笔记，如有错误信息，也欢迎大家以pull request的方式更新上来。

***

## 代码说明

* code：该课程的所有代码
* note：该课程的所有笔记
* OOTB环境：请关注课程页面`下载`的`大型资料下载`

***
## 课程说明
本门课程将按照如下模块进行讲解

* 实战环境搭建
* Spark Core核心RDD：RDD是什么、RDD五大特性、RDD特性在源码中的体现、图解RDD、SparkContext&SparkConf详解、RDD的2种创建方式、使用IDE开发pyspark应用程序、提交pyspark作业到服务器上运行
* Spark Core RDD编程：map & filter & flatMap & groupByKey & reduceByKey & sortByKey & union & distinct & join & action算子详解、词频统计 & TopN & 平均数统计案例编程实现
* Spark运行模式：local、standalone、yarn模式详解
* Spark Core进阶：Spark中的核心术语、运行架构、并对比Spark和MapReduce的概念区分、存储策略及选择方式、宽窄依赖及Shuffle
* Spark Core调优：从Spark作业性能指标、序列化、内存管理、广播变量及数据本地化这几个方面来介绍Spark作业的调优
* Spark SQL：Spark SQL的架构、DataFrame&Dataset、以及如何使用Python API来对DataFrame进行编程
* Spark Streaming：Spark Streaming的核心概念、执行原理、以及如何Python API来对Spark Streaming进行编程
* Azkaban基础篇：Azkaban的特性、架构、运行模式、源码编译及部署、快速入门
* Azkaban实战篇：使用Azkaban来完成HDFS、MapReduce、Hive作业的调度、定时作业调度以及邮件告警
* Azkaban进阶篇：Azkaban在生产上的部署、权限管理、Ajax API、Plugin、以及短信和调度框架的二次开发
* 项目实战：构建大数据平台的技术选型、集群升级资源评估，并使用Spark对气象数据进行分析，讲分析结果写入ES，并通过Kibana进行统计结果的可视化展示

***

## 思考题
Q1: 假设一个日志文件如下所示，字段之间分隔符是`,`

```
1,zhangsan,30
2,lisi,32
3,wangwu,abc
```

第一列id(int)，第二列name(name)，第三列age(int)，但是第三行的第三列值为abc，这是一条不符合要求的数据。

请使用Spark解析日志，使用计数器完成该日志的总行数以及符合条件的记录数统计。

***
欢迎关注个人公众号，不定期会推送一些大数据相关的文章
<br>
![个人公众号](https://git.imooc.com/Project/coding-249/raw/master/qrcode.jpg)
