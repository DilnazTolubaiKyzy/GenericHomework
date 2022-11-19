public class Box <T>{
    T color;

    public Box(T color) {
        this.color = color;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }
     static <T> T  box(T box){
       return box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color=" + color +
                '}';
    }
}
