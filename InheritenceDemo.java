package com1;
 
public class A
{
    private int i;
    int j;
    protected int k;
    public int m;
}
 
class B extends A
{
    void methodOfClassB()
    {
        //System.out.println(i);        Private member can not be inherited
        System.out.println(j);           //Default member can be inherited within package
        System.out.println(k);         //protected member can be inherited to any subclass
        System.out.println(m);       //public member can be inherited to all sub classes
    }
}
 
class C extends B
{
    void methodOfClassC()
    {
        System.out.println(j);     //Default member can be inherited within package
        System.out.println(k);    //protected member can be inherited to any subclass
        System.out.println(m);    //public member can be inherited to any subclass
 
        B b = new B();
        System.out.println(b.j);   //Default member can be used within package
        System.out.println(b.k);   //Protected member can be used anywhere in the package
        System.out.println(b.m);  //Public member can be used anywhere
    }
}
 
package com2;
import com1.A;
 
public class D extends A
{
    void methodOfClassD()
    {
        //System.out.println(j);   Default members can not be inherited outside package
        System.out.println(k);  //Protected member can be inherited to any subclass
        System.out.println(m);  //public member is always inherited to any subclass
 
        A a = new A();
        //System.out.println(a.i);   private member not visible outside the class
        //System.out.println(a.j);   Default members are not visible outside package
        //System.out.println(a.k);   Protected member can not be used outside the package.
        System.out.println(a.m);     //public member can be used anywhere
    }
}
 
class E extends D
{
    void methodOfClassE()
    {
        System.out.println(k);     //Protected member can be inherited to any subclass
        System.out.println(m);     //public member is always inherited
 
        D d = new D();
        //System.out.println(d.k);     Protected member can not be used outside the package.
        System.out.println(d.m);    //public member can be used anywhere
    }
}