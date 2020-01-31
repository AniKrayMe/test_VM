package com.company;

import com.company.Products.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class VendingMachine {
    private HashMap<String, ArrayList<Product>> vendingMachineProducts;

    public VendingMachine(HashMap<String, ArrayList<Product>> vendingMachineProducts) {
        this.vendingMachineProducts = new HashMap<>();
        addProducts();
    }



    public HashMap<String, ArrayList<Product>> getVendingMachineProducts() {
        return vendingMachineProducts;
    }

    public void setVendingMachineProducts(HashMap<String, ArrayList<Product>> vendingMachineProducts) {
        this.vendingMachineProducts = vendingMachineProducts;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "vendingMachineProducts=" + vendingMachineProducts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendingMachine that = (VendingMachine) o;
        return Objects.equals(vendingMachineProducts, that.vendingMachineProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendingMachineProducts);
    }

    private void addProducts() {
        Bounty bounty1 = new Bounty();
        Bounty bounty2 = new Bounty();
        Bounty bounty3 = new Bounty();
        Bounty bounty4 = new Bounty();
        CocaCola cocaCola1 = new CocaCola();
        CocaCola cocaCola2 = new CocaCola();
        CocaCola cocaCola3 = new CocaCola();
        Doritos doritos1 = new Doritos();
        Doritos doritos2 = new Doritos();
        Fanta fanta1 = new Fanta();
        Fanta fanta2 = new Fanta();
        Fanta fanta3 = new Fanta();
        Fanta fanta4 = new Fanta();
        HzorChipser hzorChipser1 = new HzorChipser();
        HzorChipser hzorChipser2 = new HzorChipser();
        HzorChipser hzorChipser3 = new HzorChipser();
        Lays lays1 = new Lays();
        Lays lays2 = new Lays();
        Lays lays3 = new Lays();
        Lays lays4 = new Lays();
        Lays lays5 = new Lays();
        Mars mars1 = new Mars();
        Mars mars2 = new Mars();
        Mars mars3 = new Mars();
        Pepsi pepsi1 = new Pepsi();
        Pepsi pepsi2 = new Pepsi();
        Pepsi pepsi3 = new Pepsi();
        Pepsi pepsi4 = new Pepsi();
        Snikers snikers1 = new Snikers();
        Snikers snikers2 = new Snikers();
        Snikers snikers3 = new Snikers();
        ArrayList<Product> products = new ArrayList<>();
        products.add(bounty1);
        products.add(bounty2);
        products.add(bounty3);
        products.add(bounty4);
        products.add(cocaCola1);
        products.add(cocaCola2);
        products.add(cocaCola3);
        products.add(doritos1);
        products.add(doritos2);
        products.add(fanta1);
        products.add(fanta2);
        products.add(fanta3);
        products.add(fanta4);
        products.add(lays1);
        products.add(lays2);
        products.add(lays3);
        products.add(lays4);
        products.add(lays5);
        products.add(mars1);
        products.add(mars2);
        products.add(mars3);
        products.add(pepsi1);
        products.add(pepsi2);
        products.add(pepsi3);
        products.add(pepsi4);
        products.add(snikers1);
        products.add(snikers2);
        products.add(snikers3);
        products.add(hzorChipser1);
        products.add(hzorChipser2);
        products.add(hzorChipser3);



    }
}
