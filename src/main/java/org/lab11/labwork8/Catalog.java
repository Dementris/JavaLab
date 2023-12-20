package org.lab11.labwork8;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Catalog.
 */
public class Catalog implements Copy {
    private final String name;
    private List<File> files = new ArrayList<>();
    private List<Catalog> catalogs = new ArrayList<>();

    /**
     * Instantiates a new Catalog.
     *
     * @param name the name
     */
    public Catalog(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets catalogs.
     *
     * @param catalogs the catalogs
     */
    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    /**
     * Create file in Catalog
     *
     * @param file the file
     */
    public void createFile(File file){
        files.add(file);
    }

    /**
     * Create catalog in Catalog.
     *
     * @param catalog the catalog
     * @return the catalog
     */
    public Catalog createCatalog(Catalog catalog){
        catalogs.add(catalog);
        return catalog;
    }

    /**
     * Print files in Catalog.
     */
    public void printFiles(){
        for (File file:files) {
            System.out.println(" |"+file.getName()+file.getExtension());
        }
    }

    /**
     * Method print() print all catalogs and files in Catalog.
     */
    public void print(){
        System.out.println("*\\"+name);
        printFiles();
        for(Catalog catalog: catalogs){
            System.out.println("\\"+catalog.name);
            if (!catalog.files.isEmpty()){
                for (int i = 0; i < catalog.name.length(); i++) {
                    System.out.print(" ");
                }
            }
            catalog.printFiles();
            for (Catalog deepcatalog:catalog.catalogs){
                for (int i = 0; i < catalog.name.length()+1; i++) {
                    System.out.print(" ");
                }
                System.out.println("\\"+deepcatalog.name);
                if (!deepcatalog.files.isEmpty()){
                    for (int i = 0; i < catalog.name.length()+deepcatalog.name.length(); i++) {
                        System.out.print(" ");
                    }
                }
                deepcatalog.printFiles();
            }
        }
    }


    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", files=" + files +
                ", catalogs=" + catalogs +
                '}';
    }


    @Override
    public Catalog copy(int depth) {
        Catalog copy = new Catalog(name);
        copy.files = files;
        List<Catalog> copyCatalogs = new ArrayList<>();
        switch (depth) {
            case 0 -> {
                for (Catalog catalogcopy : catalogs) {
                    Catalog temp = new Catalog(catalogcopy.name);
                    copyCatalogs.add(temp);
                }
            }
            case 1 -> {
                for (Catalog catalogcopy : catalogs) {
                    Catalog temp = new Catalog(catalogcopy.name);
                    temp.files = catalogcopy.files;
                    for (Catalog deepcatalog: catalogcopy.catalogs){
                        Catalog deeptemp = new Catalog(deepcatalog.name);
                        temp.catalogs.add(deeptemp);
                    }
                    copyCatalogs.add(temp);
                }
            }

            case 2 -> {
                copyCatalogs = catalogs;
            }
        }
        copy.catalogs = copyCatalogs;
        return copy;
    }

}
