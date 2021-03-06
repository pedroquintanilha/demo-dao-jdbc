package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== TEST 2: seller findAll === ");
		
		List<Seller> list = new ArrayList<Seller>();
		list = sellerDao.findAll();
		
		for(Seller x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("=== TEST 3: seller findByDeparment === ");
		
		Department dep = new Department(2 ,null);
		list = sellerDao.findByDepartment(dep);
		for(Seller x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("=== TEST 4: seller insert=== ");
		
		Seller newSeller = new Seller(null, "Logan", "logan@gmail.com", new Date(), 2000.00, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id: " + newSeller.getId());
		
		System.out.println();
		System.out.println(newSeller);
		
		System.out.println();
		System.out.println("=== TEST 5: seller update=== ");
		seller = sellerDao.findById(5);
		seller.setName("Donald Rainbow");
		sellerDao.update(seller);
		System.out.println("Updated!");
		
		System.out.println();
		System.out.println("=== TEST 6: seller deleteById=== ");
		sellerDao.deleteById(17);
		System.out.println("Deleted!");
		
		
		
		
		
		
		
		
		
	}
}
