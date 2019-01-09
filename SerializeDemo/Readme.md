### Demo例子
为了方便序列化的理解

###目录解释
+ com.ganjun.thrift.api 是根据 thrift/IPair.thrift通过 thrift -gen java IPair.thrift编译出来的。
然后我自己移到了对应的java目录下，否则Test类无法访问到。
当然也可以像git主页下的那两个项目一样，自己打jar包thrift生成的java。然后将依赖导入项目，也可以访问到。

### Reference
https://www.jianshu.com/p/02ec4145675b