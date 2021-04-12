package com.patterns;

public class Main {

    public static void main(String[] args) {

        //Concrete implementations
        CarProductSecurity centralLocking = new CentralLocking("Central Locking System");
        CarProductSecurity gearLocking = new GearLocking("Gear Locking System");
        CarProductSecurity gearLockingTest = new GearLockingTest("Gear Locking System");


        Company company = new CompanyA(centralLocking, "CompanyA_model");
        company.produceProduct();
        company.assemble();
        company.printDetails();

        System.out.println();

        company = new CompanyA(gearLocking, "CompanyA_model");
        company.produceProduct();
        company.assemble();
        company.printDetails();

        System.out.println("-----------------------------------------------------");

        company = new CompanyB(centralLocking, "CompanyB_model");
        company.produceProduct();
        company.assemble();
        company.printDetails();

        System.out.println();

        company = new CompanyB(gearLocking, "CompanyB_model");
        company.produceProduct();
        company.assemble();
        company.printDetails();

        Company companyC = new CompanyC(gearLocking, "CompanyB_model");
    }

}
