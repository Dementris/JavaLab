package org.lab11.labwork2;

/**
 * The type Cl 1.
 */
public class Cl1 implements If1 {
    /**
     * The Cl1 class aggregates If1 Interface by means of the fieldIf1 field
     */
    public If1 fieldIf1;
    /**
     * The Cl1 class aggregates If2 Interface by means of the fieldIf2 field
     */
    public If2 fieldIf2;
    /** Realization of meth1 method from If1 Interface in the Cl1 class
     */
    @Override
    public void meth1() {
        System.out.println("Cl1 meth1");
    }

}

