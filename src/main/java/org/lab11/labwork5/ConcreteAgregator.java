package org.lab11.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ConcreteAgregator
 * implements interface Aggregate
 * has field encapsulatedString
 * and has nested class ConcreteIterator.
 */
public class ConcreteAgregator implements Aggregate{
    /**
     * Field encapsulatedString which contain list of character strings.
     */
    List<String> encapsulatedString = new ArrayList<>();

    /**
     * Method setEncapsulatedString() which encapsulated string.
     *
     * @param string the string
     */
    public void setEncapsulatedString(String string) {
        encapsulatedString = List.of(string.split("\\W+"));
    }

    /**
     * Method filtreAgregateByLenght() which filters list by lenght.
     *
     * @param lenght the lenght
     */
    public void filtreAgregateByLenght(int lenght){
        List<String> list = new ArrayList<>();
        for (String el: encapsulatedString) {
            if (el.length()==lenght){
                list.add(el);
            }
        }
        encapsulatedString = list;
    }

    /**
     * Method filtreAgregateByFirstChar() filters list by first symbol.
     *
     * @param firstsymbol the firstsymbol
     */
    public void filtreAgregateByFirstChar(char firstsymbol){
        List<String> list = new ArrayList<>();
        for (String el: encapsulatedString) {
            if (el.charAt(0)==firstsymbol){
                list.add(el);
            }
        }
        encapsulatedString = list;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    /**
     * Class ConcreteIterator implements Iterator
     * and has field index.
     */
    public class ConcreteIterator implements Iterator {
        /**
         * The Index.
         */
        int index;

        @Override
        public boolean hasNext() {
            return index < encapsulatedString.size();
        }

        @Override
        public Object next() {
            return encapsulatedString.get(index++);
        }
    }
}
