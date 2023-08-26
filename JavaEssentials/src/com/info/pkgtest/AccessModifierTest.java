package com.info.pkgtest;

import com.info.CustommException.MyRuntimeException;
import com.info.pkg.DefaultDemo;
import com.info.pkg.PrivateDemo;
import com.info.pkg.ProtectedDemo;
import com.info.pkg.PublicDemo;

public class AccessModifierTest  extends ProtectedDemo{
    public static void main(String[] args) throws MyRuntimeException{
        PublicDemo pd = new PublicDemo();
        PrivateDemo prd = new PrivateDemo();
        DefaultDemo dfd = new DefaultDemo();
        ProtectedDemo ptd = new ProtectedDemo();
       // System.out.println("Print public var from other pkg "+pd.publicInt);
       // System.out.println("Print private var from other pkg"+prd.privateInt);
       // System.out.println("Print default var from other pkg "+dfd.defaultInt);
        System.out.println("Print protected var from other okg ");
        throw new MyRuntimeException();
    }
}
