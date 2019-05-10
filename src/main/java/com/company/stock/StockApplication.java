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

	}

}
