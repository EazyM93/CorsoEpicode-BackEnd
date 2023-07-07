package main;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import entities.*;

public class MainApp {

	public static void main(String[] args) {
		
		// file txt
		final String localFile = "/Users/eazymini/VS Code/CorsoEpicode-BackEnd/EserciziSettimana2/progetto_settimana02/src/main/localSave.txt";
		
		// catalog creation
		Set<ReadableElement> archive = new HashSet<ReadableElement>();
		
		// books creation and adding
		addElement(archive, new Book(3640284545632L, "Lord of The Ring", 1954, 1200, "J.R.R. Tolkien", Genre.Fantasy));
		addElement(archive, new Book(6542623636432L, "Lo Hobbit", 1937, 600, "J.R.R. Tolkien", Genre.Fantasy));
		addElement(archive, new Book(3624364656656L, "Il visconte Dimezzato", 1954, 500, "Italo Calvino", Genre.Classic));
		addElement(archive, new Book(6285858885667L, "Ciclo della Fondazione", 1951, 1550, "Isaac Asimov", Genre.Scifi));
		addElement(archive, new Magazine(7255858845667L, "Rolling Stones", 2020, 50, Frequency.Mensile));
		addElement(archive, new Magazine(3253245355352L, "Vanity Fair", 2021,40, Frequency.Settimanale));
		
		System.out.println();
		
		// save file
		try {
			writeFile(archive, localFile);
			archive.clear();
			archive = loadFile(localFile);
			
			// removing some element
			removeElement(archive, 6285858885667L);
			removeElement(archive, 3253245355352L);
			
			System.out.println();
			
			// isbn search
			System.out.println(isbnSearch(archive, 3640284545632L).toString());
				
			// year search
			for(ReadableElement e: yearSearch(archive, 1954)) System.out.printf("- %s\n", e.getTitle());
			
			System.out.println();
			
			// author search
			for(ReadableElement e: authorSearch(archive, "J.R.R. Tolkien")) System.out.printf("- %s\n", e.getTitle());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

//		for(ReadableElement r: archive)System.out.println(r.toString());
		
	}
	
	// adding methods
	public static void addElement(Set<ReadableElement> set, ReadableElement e) {
		if(set.add(e)) System.out.println("Elemento aggiunto con successo.");
	}
	
	// remove method
	public static void removeElement(Set<ReadableElement> set, long isbn) {
		if(set.removeIf(e -> e.getIsbn() == isbn)) System.out.println("Elemento eliminato con successo.");
	}
	
	// isbn for search
	public static ReadableElement isbnSearch(Set<ReadableElement> set, long isbn) {
		System.out.println("RICERCA ISBN-----------------");
		return set.stream().filter(e -> e.getIsbn() == isbn).findFirst().orElse(null);
	}
	
	// year search
	public static List<ReadableElement> yearSearch(Set<ReadableElement> set, int year) {
		List<ReadableElement> listYear = set.stream().filter(e -> e.getYear() == year).toList();
		System.out.printf("Libri pubblicati nel %s\n", year);
		return listYear;
	}
	
	// author search
	public static List<ReadableElement> authorSearch(Set<ReadableElement> set, String author) {
		List<ReadableElement> listAuthor = set.stream()
				.filter(e -> (e instanceof Book) && ((Book)e).getAuthor().equals(author)).toList();
		System.out.printf("Libri pubblicati da %s\n", author);
		return listAuthor;
	}
	
	// save
	public static void writeFile(Set<ReadableElement> set, String filePath) throws IOException {

		String localString = "";
		
		// loop to check if every element is book or magazine
		// then add his attributes to localString
		for (ReadableElement e: set) {
			if (e instanceof Book) localString += ((Book) e).toStringSave() + "#";
			else if (e instanceof Magazine) localString += ((Magazine) e).toStringSave() + "#";
		}

		// write localString to file .txt
		File file = new File(filePath);
		FileUtils.writeStringToFile(file,localString, "UTF-8");
	}
	
	// load
	public static Set<ReadableElement> loadFile(String filePath) throws IOException {
		
		// new temporary set
		Set<ReadableElement> set = new HashSet<ReadableElement>();
		
		File file = new File(filePath);
		
		// reading data String from file .txt
		String readFile = FileUtils.readFileToString(file, "UTF-8");
		
		// new list of string. Every string has all the attributes of a book/magazine
		List<String> splitFile = Arrays.asList(readFile.split("#"));
		
		for(String str: splitFile) {
			
			// array of attributes
			String[] e = str.split("!");
			
			//check for book or magazine
			if(e[0].equals("Book")) {
				// adding new book with attributes convert
				set.add(new Book(
					Long.parseLong(e[1]),
					e[2],
					Integer.parseInt(e[3]),
					Integer.parseInt(e[4]),
					e[5],
					Genre.valueOf(e[6])
				));
			}else {
				// adding new magazine with attributes convert
				set.add(new Magazine(
						Long.parseLong(e[1]),
						e[2],
						Integer.parseInt(e[3]),
						Integer.parseInt(e[4]),
						Frequency.valueOf(e[5])
					));
			}
		}
		System.out.println("Load effettuato!");
		System.out.println();
		
		return set;
	}
}
