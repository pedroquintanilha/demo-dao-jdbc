package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
	}
}
