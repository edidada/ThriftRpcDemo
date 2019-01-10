# ThriftRpcDemo

## Thrift server Helloworld demo
a hello world demo: Thrift to Java in maven project

主要是为了观察thrift中service的用法，以及服务端和客户端之间的交互

**todo: **之后可以尝试改成scala的版本

### enviroment
thrift: 0.9.3

maven: 3.5.0

jdk: 1.8

Intellij

### steps
```bash
# bash
git clone ${this respository}
cd ThriftRpcDemo
cd HelloService
mvn clean install  # package jar at local
```

intellij open project HelloServer

excute Server.main

excute Client.main


### Reference
https://blog.csdn.net/u010900754/article/details/80172671

还额外解释了绑定不同Socket的方法 https://blog.csdn.net/houjixin/article/details/42778335

## SerializeDemo

主要目的是为了观察thrift中数据结构的定义的用法, 比如 enum struct

里面保存好了thrift编译好之后的java代码，直接ide打开就可以运行Test类了。java和scala是可以直接交互的，所以Java的Test和scala的test我都写了一个小样例

### Reference
https://www.jianshu.com/p/02ec4145675b

