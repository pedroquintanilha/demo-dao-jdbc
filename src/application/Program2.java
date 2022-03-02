package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		Department dep = new Department(null, "Food");
		departmentDao.insert(dep);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 2: department update ===");
		dep.setName("Chemistry");
		dep.setId(7);
		departmentDao.update(dep);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 3: department deleteById ===");
		departmentDao.deleteById(9);
		System.out.println("Deleted!");
		
		System.out.println();
		System.out.println("=== TEST 4: department findById ===");
		dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println();
	    System.out.println("=== TEST 5: department findAll ===");
	    List<Department> list = departmentDao.findAll();
	    
	    for(Department obj : list) {
	    	System.out.println(obj);
	    }

	}

}
