package org.lab11.labwork5;

/**
 * The Main class.
 */
public class Test52 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String strings = "Elephant, Sunshine, Blueprint, Galaxy, Pancake, Orchestra, Kangaroo, Bubble, Thunderstorm, Paradox";
        ConcreteAgregator agregator = new ConcreteAgregator();
        agregator.setEncapsulatedString(strings);
        ConcreteAgregator agregator1 = new ConcreteAgregator();
        agregator1.setEncapsulatedString(strings);;
        ConcreteAgregator agregator2 = new ConcreteAgregator();
        agregator2.setEncapsulatedString(strings);;
        Iterator iterator = agregator.createIterator();
        Iterator iterator1 = agregator1.createIterator();
        Iterator iterator2 = agregator2.createIterator();
        System.out.println("list of character strings:");
        while (iterator.hasNext()){
            System.out.println("Object:"+iterator.next().toString());
        }
        agregator1.filtreAgregateByLenght(6);
        System.out.println("\nlist of character strings with filter by lenght:");
        while (iterator1.hasNext()){
            System.out.println("Object:"+iterator1.next().toString());
        }
        agregator2.filtreAgregateByFirstChar('P');
        System.out.println("\nlist of character strings with filter by first character:");
        while (iterator2.hasNext()){
            System.out.println("Object:"+iterator2.next().toString());
        }
        }
}
