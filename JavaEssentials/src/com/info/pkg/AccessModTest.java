package com.info.pkg;

public class AccessModTest  extends ProtectedDemo {
    public static void main(String[] args) {
        ProtectedDemo prd = new ProtectedDemo();
        DefaultDemo dtd = new DefaultDemo();
        System.out.println(prd.protectedInt+" "+dtd.defaultInt);
    }
}
