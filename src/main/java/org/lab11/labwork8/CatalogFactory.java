package org.lab11.labwork8;


/**
 * The type Catalog factory.
 */
public class CatalogFactory {
    /**
     * The Catalog.
     */
    Catalog catalog;

    /**
     * Instantiates a new Catalog factory.
     *
     * @param catalog the catalog
     */
    public CatalogFactory(Catalog catalog) {
        this.catalog = catalog;
    }


    /**
     * Method cloneCatalog() copy files and catalogs with depth.
     *
     * @param depth the depth
     * @return the catalog
     */
    Catalog cloneCatalog(int depth){
        return catalog.copy(depth);
    }
}
