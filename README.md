first commit:
在模板上实现了登陆界面和主页内容的调整
目前待做任务：向数据库中加元素，增加管理员和已登录用户的功能。管理员可以管理线路；
已登录用户可以将线路加进自己的“心愿”中并且进行查看。
second commit:
实现内容：通过命令更改数据库，使其可以输入中文字符。增添部分数据库内容。
待做：实现从数据库中取数据并展示在网页上。
问题：对代码修改后，无论是重启Tomcat还是idea，对网页界面的设置总是没有及时更改。
Third commit：
解决以上问题：没有及时修改的原因：浏览器有缓存的功能。可以尝试换一个浏览器。
Fourth commit：Ajax
更改：添加从数据库获取数据并展示到网页上的功能，具体见Gallery.html(或者是Scenery模块)
问题：
1、添加地点的Servlet总是提醒404，找不到/MyNewApp/admin/addPlace，查看了web.xml和前端代码也没有问题，待修改
2、刚添加的从数据库获取数据并展示到网页上的功能有错误，获取到的字符串好像为空。反正在Scenery中的展示部分内容还是为空，待修改。
five：
更改：解决：添加地点的servlet可以成功添加，原因见文档。
问题：
1、添加的时候，从前端接收到的中文字符总是乱码
2、从数据库获取数据并展示到网页上的功能没有成功修改。
six:
为了让别人知道传的
seven：
json数据可以传送到前端，但（1）控制台可以看到但html显示不出来（2）显示出来的一页只有一组数据在重复
eight：
可以成功显示数据库数据！用了javascript和ajax的相关知识
待做待完善：数据库的删除和修改？界面的美化
nine：
添加数据库的修改这一功能；界面待完善
edit：
修改、删除功能
druid;
数据库连接池 get√
edit success：
修改、删除功能成功，但由于连接数据池所以有些操作要修改
last:
不知道为啥修改的sql语句报错啊啊
success！！！
更新数据库数据时，列表名称要用``即键盘左上角，值要用''即单引号。where前面不用加“，”。实在不确定就在可视化里做出对应的修改，然后看看人家sql语句咋写的！
成功！
（如果还有时间加个购物车就更好了！）
