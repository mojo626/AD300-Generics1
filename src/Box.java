public class Box<T> {
    
    T obj;
    Box(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return this.obj;
    }

    void setObj(T obj) {
        this.obj = obj;
    }

    void printBox() {
        System.out.println(obj.toString());
    }
}
