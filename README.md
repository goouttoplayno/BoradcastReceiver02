# 发送自定广播，使用隐性启动。在Android O版本以后google对隐式广播限制的更加严格
logcat中system_process里会出现 Background execution not allowed: receiving Intent。。。。
引用https://blog.csdn.net/little_monkey_92/article/details/82758674
========================================================================================
所有能够接收次action的广播接收器都会同时收到消息，这是一条标准广播，即无序广播
