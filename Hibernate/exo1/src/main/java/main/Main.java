package main;

import DAO.ProductDAO;
import entity.Product;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("marque", "ref1", new Date(), 105.0, 10);
        Product product2 = new Product("marque2", "ref1", new Date(), 150.0, 10);
        Product product3 = new Product("marque3", "ref1", new Date(), 20.0, 10);
        Product product4 = new Product("marque4", "ref1", new Date(), 10.0, 10);
        Product product5 = new Product("marque5", "ref1", new Date(), 10.0, 10);


        ProductDAO dao = new ProductDAO();
        dao.AddProduct(product1);
        dao.AddProduct(product2);
        dao.AddProduct(product3);
        dao.AddProduct(product4);
        dao.AddProduct(product5);


        System.out.println(dao.ShowInformation(2L));

        dao.DeleteProduct(3L);
        Product product = dao.ShowInformation(1L);
        product.setPrix(200.0);
        dao.UpdateProduct(product, 1L);

        List<Product> listProduit = dao.ShowAllProduct();
        for (Product i : listProduit) {
            System.out.println(i);
        }


        List<Product> list1 = dao.ShowProductsByCost(100.0);
        for (Product i : list1) {
            System.out.println(i);
        }

        List<Product> listProduitDate =  dao.ShowProductsByDate(new Date(2023,12,01), new Date(2023,01,10));
        for (Product i : listProduitDate) {
            System.out.println(i);
        }






    }

}
