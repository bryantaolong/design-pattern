package behavioral.Memento;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1");
        caretaker.addMemento(originator.createMemento());
        originator.setState("状态2");
        caretaker.addMemento(originator.createMemento());
        originator.setState("状态3");

        System.out.println("当前状态: " + originator.getState());
        originator.restoreMemento(caretaker.getMemento(0));
        System.out.println("回退到状态: " + originator.getState());
    }
}
