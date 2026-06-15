package project.finalproject.factory;

import project.finalproject.entity.Invoice;

public class InvoiceFactory {
	public static Invoice createInvoice() {
		return new Invoice();
	}
}
