# springboot的三种启动方式
1. 右键程序入口，启动
2. 通过命令行启动，首先进入到springboot的工程文件目录下，然后输入
mvn spring-boot:run即可启动springboot
3. 通过jar包启动，首先先编译spring-boot 项目，输入mvn install即可，编译完成之后，进入target目录，在命令行输入
java -jar 生成的jar包的名字就可以启动spring-boot项目
# 不同环境使用不同的配置文件
application.yml基本配置文件，可以在里面指定使用的是开发环境还是生产环境的配置文件，application-dev.yml开发环境，application-prod生产环境
java -jar 生成的jar包的名字 --spring.profiles.active=prod 启动生产环境
java -jar 生成的jar包的名字 --spring.profiles.active=dev 启动开发环境
以上这些都需要先编译生成jar才可进行，application-dev.yml和application-prod.yml需要自己新建
idea 默认生成的是application.properties格式的文件，application.yml格式的文件需要自己新建