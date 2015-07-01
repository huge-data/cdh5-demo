
## CDH5运行MapReduce示例

#### 1、拷贝jar文件

将cdh5-demo-0.0.1-SNAPSHOT.jar拷贝到CDH5集群主机的/opt/cloudera/parcels/CDH/jars/目录下。

> 注意：maven打的jar文件，不能含有以来包。

#### 2、运行命令

sudo -u hdfs hadoop jar /opt/cloudera/parcels/CDH/jars/cdh5-demo-0.0.1-SNAPSHOT.jar zx.soft.wordcount.WordCountMain /user/hdfs/input /user/hdfs/output1

或者

sudo -u hdfs hadoop jar /opt/cloudera/parcels/CDH/jars/cdh5-demo-0.0.1-SNAPSHOT.jar zx.soft.wordcount.WordCountMain input output2

> 注意：因为是在hdfs用户下执行命令的，所以目录input就是/user/hdfs/input。