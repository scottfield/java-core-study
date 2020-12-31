package com.jackiew.jdk.jni;

public class Hello {
    public native void sayHi(); //1

    static {
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary("hello"); } //2

    public static void main (String[] args) {
        Hello hello = new Hello();
        hello.sayHi(); //3
    }
}
