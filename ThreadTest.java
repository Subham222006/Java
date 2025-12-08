import java.lang.Thread;
class A extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("It from ThreadA : i = "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("It feom ThreadB : i = "+i);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("It feom ThreadC : i = "+i);
        }
        System.out.println("Exit from C");
    }
}
class ThreadTest{
    public static void main(String[] args) {
        // new A().start();
        // new B().start();   This is a process of start() method
        // new C().start();
        A threadA = new A();
        threadA.start();
        B threadB = new B();
        threadB.start();
        C threadC = new C();
        threadC.start();
    }
}