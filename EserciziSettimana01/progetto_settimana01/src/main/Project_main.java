package main;

import java.util.Scanner;

import entities.*;

public class Project_main {

	public static void main(String[] args) {
		
		String playerTitle = "LETTORE MULTIMEDIALE";
		Multimedia elements[] = new Multimedia[5];
		
		renderPlayerTitle(playerTitle);
		System.out.println("Inserire 5 elementi \n");
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
		while(i < elements.length) {
			
			System.out.println("Seleziona tipo elemento " + (i + 1));
			System.out.println("1 - Immagine");
			System.out.println("2 - Audio");
			System.out.println("3 - Video");
			int userInput = Integer.parseInt(scanner.nextLine());
			switch(userInput) {
				case 1:
					System.out.print("Inserire titolo dell'immagine: ");
					String imgTitle = scanner.nextLine();
					elements[i] = new Image(imgTitle);
					i++;
					break;
				case 2:
					System.out.print("Inserire titolo dell'audio: ");
					String audioTitle = scanner.nextLine();
					System.out.print("Inserire durata dell'audio: ");
					int audioTime = Integer.parseInt(scanner.nextLine());
					elements[i] = new Audio(audioTitle, audioTime);
					i++;
					break;
				case 3:
					System.out.print("Inserire titolo dell'audio: ");
					String videoTitle = scanner.nextLine();
					System.out.print("Inserire durata dell'audio: ");
					int videoTime = Integer.parseInt(scanner.nextLine());
					elements[i] = new Audio(videoTitle, videoTime);
					i++;
					break;
				default:
					System.err.println("Numero inserito non valido!");
					break;
			}
			System.out.println("");
			
		}
				
		int x = 0;
		
		do {
			System.out.println("Seleziona elemento\n");
			for(int j = 0; j < elements.length; j++) System.out.println((j + 1) + " - " + elements[j].getTitle());
			System.out.println();
			System.out.println("0 - USCIRE DAL PROGRAMMA\n");
			
			x = Integer.parseInt(scanner.nextLine());
			
			if(x < 0 || x > elements.length) { System.err.println("Numero non valido"); continue; };
			
			Multimedia obj = elements[x - 1];
			if((obj instanceof Image)) {
				Image img = (Image) obj;
				img.show();
			}else if((obj instanceof Audio)) {
				Audio audio = (Audio) obj;
				audio.play();
			}else{
				Video video = (Video) obj;
				video.play();
			}
			
			System.out.println();
			System.out.println();
			
		}while(x != 0);
		
		scanner.close();
		System.out.println("PROGRAMMA CHIUSO CON SUCCESSO");
	}
	
	public static void renderPlayerTitle(String playerTitle) {
		System.out.println(playerTitle);
		for(int i = 0; i < playerTitle.length(); i++) System.out.print("-");
		System.out.println();
	}
	
	
}
