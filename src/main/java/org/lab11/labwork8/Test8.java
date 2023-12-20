package org.lab11.labwork8;

public class Test8 {
    public static void main(String[] args) {
        Catalog catalog = new Catalog("user");
        catalog.createFile(new File("text",".txt"));
        Catalog catalog1 = catalog.createCatalog(new Catalog("Images"));
        catalog1.createFile(new File("image",".png"));
        Catalog dpcatalog = catalog1.createCatalog(new Catalog("Programs"));
        dpcatalog.createFile(new File("VSC",".exe"));
        Catalog catalog2 = catalog.createCatalog(new Catalog("Movie"));
        catalog2.createFile(new File("Movie",".mov"));
        catalog.print();

        System.out.println("\nCopy with depth 0:");
        CatalogFactory catalogFactory = new CatalogFactory(catalog);
        Catalog clonecatalog = catalogFactory.cloneCatalog(0);
        clonecatalog.print();

        System.out.println("\nCopy with depth 1:");
        CatalogFactory catalogFactory1 = new CatalogFactory(catalog);
        Catalog clonecatalog1 = catalogFactory1.cloneCatalog(1);
        clonecatalog1.print();

        System.out.println("\nCopy with depth 2:");
        CatalogFactory catalogFactory2 = new CatalogFactory(catalog);
        Catalog clonecatalog2 = catalogFactory2.cloneCatalog(2);
        clonecatalog2.print();

        System.out.println("\nOriginal:");
        catalog.print();
    }
}
