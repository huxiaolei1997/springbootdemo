# springboot的三种启动方式
1. 右键程序入口，启动
2. 通过命令行启动，首先进入到springboot的工程文件目录下，然后输入
<font color="red">mvn spring-boot:run</font>即可启动springboot
3. 通过jar包启动，首先先编译spring-boot 项目，输入<font color="red">mvn install</font>即可，编译完成之后，进入<font color="red">target</font>目录，在命令行输入
<font color="red">java -jar 生成的jar包的名字</font>就可以启动spring-boot项目
# 不同环境使用不同的配置文件
application.yml基本配置文件，可以在里面指定使用的是<font color="red">开发环境</font>还是生产环境的配置文件，application-dev.yml代表开发环境，application-prod代表生产环境<br/>
<font color="red">java -jar 生成的jar包的名字 --spring.profiles.active=prod</font> 启动生产环境  
<font color="red">java -jar 生成的jar包的名字 --spring.profiles.active=dev</font>启动开发环境  
以上这些步骤都需要先<font color="red">编译生成jar</font>才可进行，application-dev.yml和application-prod.yml需要自己<font color="red">新建</font>
idea 默认生成的是<font color="red">application.properties</font>格式的文件，<font color="red">.yml</font>格式的文件需要自己新建
