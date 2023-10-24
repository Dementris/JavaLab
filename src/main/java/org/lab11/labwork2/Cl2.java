package org.lab11.labwork2;

/**
 * The type Cl 2.
 */
public class Cl2 implements If2{
    /**
     * The Cl2 class aggregates the Cl3 class by means of the fieldCl3 field.
     */
    public Cl3 fieldCl3;
    /** Realization of meth1 method from If1 Interface in the Cl2 class
     */
    @Override
    public void meth1() {
        System.out.println("Cl2 meth1");
    }
    /** Realization of meth2 method from If2 Interface in the Cl2 class
     */
    @Override
    public void meth2() {
        System.out.println("Cl2 meth2");
    }

}

