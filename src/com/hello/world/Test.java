package com.hello.world;

 class Test {
     static ThreadLocal<Integer> bb = new ThreadLocal<Integer>();
     static
     {
         bb.set(33);
     }

     public static void main(String[] args) {
         for(int i=0; i<20; i++){
             new ThreadTest().start();
         }

     }

     public Boolean getA() {
         return a;
     }

     /// 工
     //public void setA(Boolean a) {
     //    this.a = a;
     //}

     Boolean a;

     public boolean isB() {
         return b;
     }

     public void setB(boolean b) {
         this.b = b;
     }

     static class ThreadTest extends Thread {
         @Override
         public void run(){
             System.out.println(bb.get());
             int c = bb.get() + 3;
             bb.set(c);

         }
     }
}
