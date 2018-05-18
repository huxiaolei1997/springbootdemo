# springboot的三种启动方式
 1. 右键程序入口，启动
 2. 通过命令行启动，首先进入到springboot的工程文件目录下，然后输入 **mvn spring-boot:run** 即可启动springboot
 3. 通过jar包启动，首先先编译spring-boot项目，输入 **mvn install** 即可，编译完成之后，进入 **target** 目录，在命令行输入
  **java -jar 生成的jar包的名字** 就可以启动spring-boot项目
# 不同环境使用不同的配置文件
  application.yml基本配置文件，可以在里面指定使用的是**开发环境**还是生产环境的配置文件，application-dev.yml代表开发环境，application-prod代表生产环境<br/>
  **java -jar 生成的jar包的名字 --spring.profiles.active=prod** 启动生产环境  
 **java -jar 生成的jar包的名字 --spring.profiles.active=dev** 启动开发环境  
 以上这些步骤都需要先**编译生成jar**才可进行，application-dev.yml和application-prod.yml需要自己**新建**
 idea 默认生成的是**application.properties**格式的文件，**.yml**格式的文件需要自己新建  
 # Controller的使用
 @Controller 处理http请求  
 @RestController Spring4之后新加的注解，原来返回json需要@ResponseBody加@Controller  
 @RequestMapping 配置url映射    
 @PathVariable 获取url中的数据  
 @RequestParam 获取请求参数中的值  
 @GetMapping 组合注解  
 # 数据库操作
 使用了Spring-Data-Jpa
 JPA(Java Persistence API)定义了一系列对象持久化的标准，目前实现这一规范的产品有Hiberna、TopLink等  
 # RESTful API设计
 | 请求类型 | 请求路径 | 功能 |  
 | :-: | :-: | :-: |  
 | GET | /man | 获取man列表 |  
 | POST | /man | 创建一个man |  
 | GET | /man/id | 通过id查询一个man |  
 | PUT | /man/id | 通过id更新一个man |  
 | DELETE | /man/id | 通过id删除一个man |
 # 事务管理
 