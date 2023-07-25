package Part_02_03_OOP_Core.ch09;

public class ComputerTest {

    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();

        Notebook myNote = new MyNoteBook();
}}
