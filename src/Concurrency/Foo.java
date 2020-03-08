package Concurrency;


// Design a mechanism and modify the program to ensure that second() is executed after first(),
// and third() is executed after second().
class Foo {
    int counter;
    public Foo() {
        counter = 1;
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        counter++;
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.

        while (counter != 2);

        printSecond.run();
        counter++;

    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.

        while (counter != 3);

        printThird.run();
        counter++;

    }
}