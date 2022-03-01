package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		
	}
}
