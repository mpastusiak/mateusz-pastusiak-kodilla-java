package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apple = new Product("Apple");
        Product banana = new Product("Banana");
        Product cucumber = new Product("Cucumber");
        Product date = new Product("Date");
        Product elderberry = new Product("Elderberry");

        Item item1 = new Item(new BigDecimal(3.00), 2, new BigDecimal(6.00));
        Item item2 = new Item(new BigDecimal(5.50), 1, new BigDecimal(5.50));
        Item item3 = new Item(new BigDecimal(6.99), 4, new BigDecimal(27.96));
        Item item4 = new Item(new BigDecimal(2.50), 1, new BigDecimal(2.50));
        Item item5 = new Item(new BigDecimal(15.00), 2, new BigDecimal(30.00));
        Item item6 = new Item(new BigDecimal(2.50), 10, new BigDecimal(25.00));
        Item item7 = new Item(new BigDecimal(4.50), 10, new BigDecimal(45.00));

        item1.setProduct(apple);
        item2.setProduct(banana);
        item3.setProduct(cucumber);
        item4.setProduct(date);
        item5.setProduct(elderberry);
        item6.setProduct(apple);
        item7.setProduct(banana);

        apple.getItems().add(item1);
        apple.getItems().add(item6);
        banana.getItems().add(item2);
        banana.getItems().add(item7);
        cucumber.getItems().add(item3);
        date.getItems().add(item4);
        elderberry.getItems().add(item5);

        Invoice invoice1 = new Invoice("FV/2019/03/21/00001");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);
        invoice1.getItems().add(item5);

        Invoice invoice2 = new Invoice("FV/2019/03/21/00002");
        invoice2.getItems().add(item6);
        invoice2.getItems().add(item7);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);
        item5.setInvoice(invoice1);
        item6.setInvoice(invoice2);
        item7.setInvoice(invoice2);

        //When
        invoiceDao.save(invoice1);
        int invoiceId1 = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoiceId2 = invoice2.getId();

        //Then
        Assert.assertEquals(5, itemDao.findByInvoice(invoice1).size());
        Assert.assertEquals(2, itemDao.findByInvoice(invoice2).size());
        Assert.assertEquals(1, productDao.findByItemsContains(item1).size());
        Assert.assertEquals(1, productDao.findByItemsContains(item7).size());

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId1);
            invoiceDao.deleteById(invoiceId2);
        } catch (Exception e) {
            //do nothing
        }

    }
}
