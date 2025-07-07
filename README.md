# 设计模式示例结构

本项目将以 Java 实现 GoF 的 23 种设计模式，结构如下：

- src/
  - creational/      # 创建型模式
    - Singleton      # 单例模式
    - FactoryMethod  # 工厂方法模式
    - AbstractFactory# 抽象工厂模式
    - Builder        # 建造者模式
    - Prototype      # 原型模式
  - structural/      # 结构型模式
    - Adapter        # 适配器模式
    - Bridge         # 桥接模式
    - Composite      # 组合模式
    - Decorator      # 装饰器模式
    - Facade         # 外观模式
    - Flyweight      # 享元模式
    - Proxy          # 代理模式
  - behavioral/      # 行为型模式
    - ChainOfResponsibility # 责任链模式
    - Command        # 命令模式
    - Interpreter    # 解释器模式
    - Iterator       # 迭代器模式
    - Mediator       # 中介者模式
    - Memento        # 备忘录模式
    - Observer       # 观察者模式
    - State          # 状态模式
    - Strategy       # 策略模式
    - TemplateMethod # 模板方法模式
    - Visitor        # 访问者模式

每个模式文件夹下包含：
- 模式的主要实现类
- 客户端示例（Client.java）
- 必要的接口和抽象类

