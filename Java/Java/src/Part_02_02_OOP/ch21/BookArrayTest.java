package Part_02_02_OOP.ch21;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        for (int i=0; i<library.length; i++) {
            library[i] = new Book("태백산맥"+(i+1), "조정래");
        }

    }
}
