class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>(2);
        Box<String> strBox = new Box<String>("Hello, World!");
        Box<Boolean> boolBox = new Box<Boolean>(true);

        intBox.setObj(10);
        strBox.setObj("Testing");
        boolBox.setObj(false);

        System.out.println(intBox.getObj());

        intBox.printBox();
        strBox.printBox();
        boolBox.printBox();

        NumberBox<Integer> newIntBox = new NumberBox<Integer>(10);
        NumberBox<Double> doubleBox = new NumberBox<Double>(10.0);
        //NumberBox<String> errBox = new NumberBox<String>("Testing");
    }
}
