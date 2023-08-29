package com.rjcon.hibernateFirst;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

import com.rjcon.hibernateFirst.entity.BankAccount;
import com.rjcon.hibernateFirst.entity.Customer;
import com.rjcon.hibernateFirst.entity.OrderData;
import com.rjcon.hibernateFirst.entity.Person;
import com.rjcon.hibernateFirst.repository.CustmoerRepository;
import com.rjcon.hibernateFirst.repository.OrderDataRepository;
import com.rjcon.hibernateFirst.repository.PersonRepository;

public class App 
{
    public static void main( String[] args )
    {
//    	Person person = new Person(3, "Rahul", "Male", 20, "9610590209");
//    	PersonRepository pr = new PersonRepository();
//    	
//    	OrderData data = new OrderData("Campus", 1, "Shoes");
//    	
////    	data.setId(1);
//    	
//    	person.setOrderData(data);
//    	data.setPerson(person);
//    	System.out.println(pr.savePerson(person));
    	
    	BankAccount account = new BankAccount("Canara", "82267864646464");
    	BankAccount account1 = new BankAccount("SBI", "548784654646464");
    	BankAccount account2 = new BankAccount("Axis", "858845156654846");
    	BankAccount account3 = new BankAccount("HDFC", "8227125485202145");
    	BankAccount account4 = new BankAccount("ICICI", "878746524846344");
    	BankAccount account5 = new BankAccount("BOB", "445454547874125");
    	BankAccount account6 = new BankAccount("Citi", "15454547878545");
    	BankAccount account7 = new BankAccount("PNB", "113254135454545");

//    	List<BankAccount> list = new ArrayList<>();
//    	list.add(account);
//    	list.add(account1);
//    	list.add(account2);
//    	list.add(account3);
//    	list.add(account4);
//    	list.add(account5);
//    	list.add(account6);
//    	list.add(account7);

    	
//    	
//    	Customer customer = new Customer("Rahul", "Bharatpur", list);
    	CustmoerRepository repository = new CustmoerRepository();
//    	repository.saveCustomer(customer);
    	Customer customer2 = repository.getCustomerById(1);
//    	System.out.println(customer2);
    	
    	List<BankAccount> accounts = customer2.getAccount();
    
    	accounts.forEach(System.out::println);
    	
    }
}
