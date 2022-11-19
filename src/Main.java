public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Black");
        Box<String> box = new Box<>("Blue");
        System.out.println(Box.box(stringBox));
        System.out.println(Box.box(box));



    }

}