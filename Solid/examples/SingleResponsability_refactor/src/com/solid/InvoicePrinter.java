package com.solid;

public class InvoicePrinter {
    public void printInvoice(Invoice invoice, Book book) {
        System.out.println(invoice.getQuantity() + "x " + book.name + " " + book.price + "$");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal());
    }
}
