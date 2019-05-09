package com.company.stock.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/sheets")
public class SpreadSheetResource {

	@PostMapping
	public void upload(@RequestParam MultipartFile file) {
		try {

			HSSFWorkbook workbook = new HSSFWorkbook(file.getInputStream());

			HSSFSheet sheet = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheet.iterator();

			int lineCounter = 0;
			// SE FOSSE EM UMA APLICACAO REAL EU REALIZARIA A TRATATIVA DE EXCECOES PARA LER
			// XLSX E TRATAR PROBLEMA REFERENTE A FORMATO DE CAMPOS
			while (rowIterator.hasNext()) {
				++lineCounter;

				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();

					if (lineCounter == 1 && cell.getColumnIndex() == 1) {
						System.out.println("Data:" + cell.getStringCellValue());
					} else if (lineCounter > 2) {
						switch (cell.getColumnIndex()) {
						case 0:
							System.out.println("Empresa: " + cell.getStringCellValue());
							break;
						case 1:
							System.out.println("Código Produto: " + cell.getNumericCellValue());
							break;
						case 2:
							System.out.println("Produto: " + cell.getStringCellValue());
							break;
						case 3:
							System.out.println("Entrada: " + cell.getNumericCellValue());
							break;
						case 4:
							System.out.println("Saída: " + cell.getNumericCellValue());
							break;
						case 5:
							System.out.println("Estoque: " + cell.getNumericCellValue());
							break;
						}

					}

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
