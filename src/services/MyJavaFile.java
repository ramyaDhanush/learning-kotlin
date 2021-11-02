package services;

public class MyJavaFile {
    public static void main(String[] args) {
        MyCustomKotlin.main();
        int sum = MyCustomKotlin.add(3);
        /* DEFAULT REFERENCE WILL BE KOTLIN FILE NAME WITH KT AT THE END (MyFirstKt)
        MyFirstKt.main();
        int sum = MyFirstKt.add(3, 4);
        */
        System.out.println("Printing sum from java file : " +sum);

    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}
