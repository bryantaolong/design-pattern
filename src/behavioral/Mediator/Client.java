package behavioral.Mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);

        a.send("你好，B！");
        b.send("你好，A！");
    }
}
