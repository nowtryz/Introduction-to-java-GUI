package net.nowtryz.info641.td1;

public class HelloWorld {
    public String information = "information à présenter";

    public static void main(String[] args) {
        new HelloWorld().display(String.join(" ", args));
    }

    public void display(String message) {
        System.out.println(message + " " + this.information);
    }
}
