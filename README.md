# JavaDesignPatterns
Java常用的设计模式高清下载:
http://www.linuxidc.com/Linux/2014-08/105152.htm
http://www.java1234.com/a/javabook/javabase/2016/1106/7052.html


### 设计模式的定义
* 简单工厂模式:只是解决了对象的创建问题
* 策略模式:它定义了算法家族,分别封装起来,让它们之间可以相互替换,此模式让算法的变化,不会影响到使用算法的客户
* 装饰模式:动态地给一个对象添加一些额外的职责,就增加功能来说,装饰模式比生成子类更为灵活
* 代理模式:为其他对象提供一种代理以控制对这个对象的访问
   * 题外篇:[说说Java代理模式 - rj_bian - 博客园](https://www.cnblogs.com/chinajava/p/5880870.html) 
   * 远程代理:也就是为一个对象在不同的地址空间提供局部代理.这样就可以隐藏一个对象存在于不同地址空间的事实
   * 虚拟代理:是根据需要创建开销很大的对象.通过它来存放实例化需要很长时间的真实对象
   * 安全代理:用来控制真实对象访问时的权限
   * 智能指引:是指当调用真实的对象时,代理处理另外一些事
* 工厂方法模式:定义一个用于创建对象的接口,让子类决定实例化那一个类.工厂方法使一个类的实例化延迟到其子类
   * 工厂方法模式跟简单工厂模式的区别:简单工厂模式的最大优点在于工厂类中包括了必要的逻辑判断,根据客户端的选择动态条件动态实例化相关的类.
     对于客户端来说,去除了与具体产品的依赖
* 原型模式:用原型实例制定创建对象的种类,并且通过拷贝这些原型创建新的对象
   * 题外篇:[Java提高篇——对象克隆（复制） - 萌小Q - 博客园](https://www.cnblogs.com/Qian123/p/5710533.html)
   * 原型模式其实就是从一个对象再创建另外一个可定制的对象,而且不需要任何创建的细节 
* 模板方法模式:定义一个操作中的算法的骨架,而将一些步骤延迟到子类中.模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
   * 模板方法模式是通过把不变行为搬移到超类,去除子类中的重复代码来体现它的优势
   * 模板方法模式就是提供一个很好的代码复用平台
* 外观模式:为子系统中的一组接口提供一个一致的界面,此模式定义了一个高层接口,这个接口使得这一子系统更加容易使用
* 建造者模式:将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示
   * 如果我们使用了建造者模式,那么用户就只需要指定需要建造的类型就可以得到它们,而具体构造的过程与系统就不需知道了
   * 建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时适用的模式
* 观察者模式:又叫发布-订阅模式,定义了一种一对一的依赖关系,让多个观察者对象同时监听某一个主题对象.这主题对象在状态发生变化时,会通知所有观
  察者对象,使得它们能够自动更新自己
   * Subject类  它把所有对象观察者对象的引用保存在一个聚焦里,每个主题对象在状态发生改变时,会通知所有观察者对象,使它们能够自动更新自己
   * Observer类 抽象观察者,为所有的具体观察者定义一个接口,在得到主题通知时更新自己
   * ConcreteSubject 具体主题,将有关状态存入具体观察者对象;在具体主题的内部状态改变时,给所有登记过的观察者发生通知
   * ConcreteObserver 具体观察者,实现抽象观察者角色所要求的更新接口,以便使本身的状态与主题的状态相协调
   * [班主任来啦之观察者模式，事件委托等Java实现---如果你还不懂，看完此文，就一定会懂 - CSDN博客](http://blog.csdn.net/XIAXIA__/article/details/41803473) 
 * 抽象工厂模式:提供一个创建一系列相关或者相互依赖对象的接口,而无须提供它们具体的类
 * 状态模式:当一个对象的内在状态改变时允许改变其行为,这对象看起来像是了改变了其类
   * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况.把状态的判断逻辑转移到表示不同状态的一系列类中,可以把简单的事情复杂化
   * 状态模式的好处是将与特定状态相关的行为局部化,并且将不同状态的行为分割开来
 * 适配器模式:将一个类的接口转换成客户希望的另外一个接口.Adapter模式使得原本接口不兼容而不能一起工作的那些类可以一起工作
   * 系统的数据和行为都正确,在接口不符合时,我们应该考虑用适配器,目的是使控制范围之外的一个原有对象跟某个接口匹配.适配器模式主要应用于希
     望复用一些现存的类,但是接口又与复用环境要求不一致的情况
   * [Java设计模式之适配器模式 - CSDN博客](http://blog.csdn.net/simplebam/article/details/78437774)
   * 适配器模式有两种类型,类适配器模式和对象适配器模式,由于类适配器模式通过多重继承对一个接口与另外一个接口进行匹配.而C#,java等语言都不
     支持多重继承(C++支持),也就是一个类只有一个父类
   * 在想使用一个已经存在的类,但如果他的接口,也就是它的方法和你的要求不相同时,就应该考虑适配器模式(两个类所做的事情相同或者相似,但是具有
     不同的接口时要使用它)
 * 备忘录模式:在不破坏封装的前提下,捕获一个对象的内部状态,并在该对象之外保存这个状态.这样以后就可将该对象恢复到原先保存的状态
 * 组合模式:将对象组合成树形机构以表示"部分-整体"的层次结构.组合模式使得用户对单个对象和组合对象的使用具有一致性
   * 当你发现需求中是体现部分与整体层次的结构时,以及你希望用户可以忽略组合对象与单个对象的不同,统一地使用组合结构中的所有对象时,就应该
     考虑用组合模式
   * 组合模式让客户可以一致地使用组合结构和单个对象
 * 迭代器模式:提供一种方法顺序访问一个聚合对象中各个元素,而又不暴露该对象的内部表
   * 当你需要访问一个聚集对象,而且不管这些对象是什么都需要遍历的时候,你需要对聚集有多种方式遍历时,你就该考虑使用迭代器模式
   * [Java设计模式系列之迭代器模式 - 菜鸟奋斗史 - 博客园]( https://www.cnblogs.com/ysw-go/p/5384516.html) 
   * 迭代器模式就是分离了集合对象的遍历行为,抽象出一个迭代器类来负责,这样既可以做到不暴露集合的内部结构,又可让外部代码透明地访问集合内部
     的数据
 * 单例模式:保证一个类仅有一个实例,并提供一个访问它的全局访问点
   * 通常我们可以让一个全局变量使得一个对象被访问,但它不能防止你实例化多个对象.一个最好的办法就是,让类自身负责保存它的唯一实例.这个类可
     以保证没有其他实例可以被创建,并且它可以提供一个访问该实例的方法
   * 单例模式因为Singleton类封装它的唯一实例,这样它可以严格地控制客户怎样访问它以及何时访问它.简单地说就是对唯一实例的受控访问
   * [JAVA设计模式之单例模式 - CSDN博客 ](http://blog.csdn.net/jason0539/article/details/23297037/)
 * 桥接模式:将抽象部分与它的实现部分分离,使它们都可以独立地变化
   * 抽象和它的实现分离,实现是指抽象类和它的派生类用来实现自己的对象
  
   


### 设计模式的原则
* 单一职责原则:就一个类而言,应该仅有一个引起它变化的原因
* 开放-封闭原则:是说软件实体(类,模块,函数等等)应该可以扩展,但是不可以修改
* 依赖倒转原则
  * 高层模块不应该依赖底层模块,两个都应该依赖抽象
  * 抽象不应该依赖细节,细节应该依赖抽象
* 里氏替换原则:子类型必须能够替换掉它们的父类型
* 迪米特法则:如果两个类不必彼此直接通信,那么这两个类就不应该发生直接的相互作用.如果其中一个类需要调用另一个类的某一个方法的话,可以通过
  第三者转发这个调用
   * 迪米特法则根本思想就是强调了类之间的松耦合.类之间耦合越弱,就越有利于复用,一个处于弱耦合的类被修改,不会对有关系的类造成波及.也就是
      说信息的隐藏促进了软件的复用
* 合成/聚合复用原则:尽量使用合成/聚合,尽量不要使用类继承
   * 优先使用对象的合成/聚合将有助于你保持每个类被封装,并被集中在单个任务上.这样类和类继承层次会保持较小规模,并且不太可能为不可控制的庞
     然大物
