package com.solid;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Clen Code", "Bob", 1995, 49, "SD-456-ASD");
        Invoice invoice = new Invoice(book, 1, 0, 0.14);
        invoice.calculateTotal();

        InvoicePrinter invoicePrinter = new InvoicePrinter();
        InvoicePersistence invoicePersistence = new InvoicePersistence();

        invoicePersistence.saveToFile("c:/invoice001");
        invoicePrinter.printInvoice(invoice, book);
    }
}
