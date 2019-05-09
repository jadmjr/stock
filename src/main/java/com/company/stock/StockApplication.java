package com.company.stock;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.stock.domain.Address;
import com.company.stock.domain.Company;
import com.company.stock.domain.Product;
import com.company.stock.domain.Stock;

@SpringBootApplication
public class StockApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Set<Stock> stocks = new HashSet<>(); Stock s1 = new Stock(14234.0, 0.0, 0.0);
		 * stocks.add(s1);
		 * 
		 * Address a1 = new Address("RUA PASCHOAL BRUNO", "UBERLANDIA", "38408714",
		 * "MINAS GERIAS");
		 * 
		 * Company c1 = new Company("COMPANIA A", stocks, a1);
		 * 
		 * Product p1 = new
		 */
	}

}
