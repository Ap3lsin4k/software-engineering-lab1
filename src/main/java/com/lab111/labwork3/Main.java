package com.lab111.labwork3;

/**
 * Class to test how our proxy works
 * @author Andy
 * @version 3.04
 */
public class Main {
    public static void main(String[] args) {
        FileLeaf file = new FileLeaf(8);
        FileLeaf file2 = new FileLeaf(16);
        FileLeaf file3 = new FileLeaf(32);
        FileLeaf file4 = new FileLeaf(40);
        CatalogueComposite simpleCatalogue = new CatalogueComposite();
        CatalogueComposite complexCatalogue = new CatalogueComposite();


        Main.client_code(file4);
        Main.client_code2(file3, file2);

        
        Main.client_code2(simpleCatalogue, file);
        simpleCatalogue.remove(file);
        Main.client_code(simpleCatalogue);

        simpleCatalogue.add(file2);
        simpleCatalogue.add(file3);
        complexCatalogue.add(simpleCatalogue);
        complexCatalogue.add(file4);
        Main.client_code(complexCatalogue);

        
    }

    static void client_code(SizedComponent asset) {
        System.out.println("Size of asset: "+Integer.toString(asset.getSize()));
    }

    static void client_code2(SizedComponent asset, SizedComponent asset2) {
        asset.add(asset2);
        System.out.println("Size of asset: "+Integer.toString(asset.getSize()));
        System.out.println("Size of asset2: "+Integer.toString(asset2.getSize()));
    }
}
