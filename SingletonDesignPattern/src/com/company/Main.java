package com.company;

public class Main {

    public void learnNormalSingleton() {
        for (int i =1; i < 5; i ++) {

            Normal obj = Normal.getInstance();
            if (obj == null) {
                System.out.println("Object is already created.");
            }
            else {
                System.out.println("Object is created.");
            }
        }
    }

    public void learnSingletonThreadSafeWithSyncKeyword() {
        Thread a = new Thread(() -> {
            SyncKeyword obj1 = SyncKeyword.getInstance();
            System.out.println(obj1);
        });
        Thread b = new Thread(() -> {
            SyncKeyword obj2 = SyncKeyword.getInstance();
            System.out.println(obj2);
        });
        a.start();
        b.start();
    }

    public void learnSingletonThreadSafeWithSyncCodeBlock () {
        Thread a = new Thread(() -> {
            SyncCodeBlock obj1 = SyncCodeBlock.getInstance();
            System.out.println(obj1);
        });
        Thread b = new Thread(() -> {
            SyncCodeBlock obj2 = SyncCodeBlock.getInstance();
            System.out.println(obj2);
        });
        a.start();
        b.start();
    }

    public void learnSingletonThreadSafeWitheEnum () {

    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.learnNormalSingleton();
//        main.learnSingletonThreadSafeWithSyncKeyword();
        main.learnSingletonThreadSafeWithSyncCodeBlock();
//        main.learnSingletonThreadSafeWitheEnum();
    }
}
