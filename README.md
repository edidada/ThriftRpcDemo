# ThriftRpcDemo

thrift 0.9.3
0.13.0不兼容
c++ java 的thrift文件不一样

0.13.0
Failed to execute goal org.apache.thrift.tools:maven-thrift-plugin:0.1.11:compile (default-cli) on project HelloService: thrift did not exit cleanly. Review output for more information.



重新构建了下，知道了具体原因，才想起还需要配置thrift.exe windows环境
去官网http://thrift.apache.org/download 下载thrift.exe,然后设置环境变量的 path 变量，把thrift.exe 所在目录加上就行
最后打开cmd 验证是否成功：thrift -version
输出版本号信息代表设置成功
Thrift version 0.9.3
然后重启IDEA开发工具，重新构建就成功了　
thrift-0.14.0.exe  2021最新版

```shell script
thrift -version
Thrift version 0.13.0
```


## Thrift server Helloworld demo
a hello world demo: Thrift to Java in maven project

主要是为了观察thrift中service的用法，以及服务端和客户端之间的交互

**todo: **之后可以尝试改成scala的版本

### enviroment
thrift: 0.9.3

maven: 3.6.0

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
thrift

