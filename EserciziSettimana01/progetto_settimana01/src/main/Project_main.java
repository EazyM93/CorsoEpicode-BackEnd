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
		
		for(int i = 0; i < elements.length; i++) {
			
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
					break;
				case 2:
					System.out.print("Inserire titolo dell'audio: ");
					String audioTitle = scanner.nextLine();
					System.out.print("Inserire durata dell'audio: ");
					int audioTime = Integer.parseInt(scanner.nextLine());
					elements[i] = new Audio(audioTitle, audioTime);
					break;
				case 3:
					System.out.print("Inserire titolo dell'audio: ");
					String videoTitle = scanner.nextLine();
					System.out.print("Inserire durata dell'audio: ");
					int videoTime = Integer.parseInt(scanner.nextLine());
					elements[i] = new Audio(videoTitle, videoTime);
					break;
				default:
					System.out.println("Numero inserito non valido");
					break;
			}
			System.out.println("");
		}
		
		int x = 0;
		
		do {
			System.out.println("Seleziona elemento\n");
			for(int i = 0; i < elements.length; i++) System.out.println(i + " - " + elements[i].getTitle());
			System.out.println("0 - USCIRE DAL PROGRAMMA");
			x = Integer.parseInt(scanner.nextLine());
			Multimedia obj = elements[x -1];
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
			
		}while(x != 0);
		
		scanner.close();
	}
	
	public static void renderPlayerTitle(String playerTitle) {
		System.out.println(playerTitle);
		for(int i = 0; i < playerTitle.length(); i++) System.out.print("-");
		System.out.println();
	}
	
	
}
