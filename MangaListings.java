package comm;

import Manga.Manga;

import java.util.ArrayList;
import java.util.Scanner;

public final class MangaListings {
    private static final ArrayList<Manga> library = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("MangaListings - Input choice :");
            System.out.println("1. Add Manga");
            System.out.println("2. Show Manga List");
            System.out.println("3. Update Manga");
            System.out.println("4. Delete Manga");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addManga();
                    break;
                case 2:
                    viewMangas();
                    break;
                case 3:
                    updateManga();
                    break;
                case 4:
                    deleteManga();
                    break;
                case 5:
                    System.out.println("Program over.");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 5);
    }

    private static void addManga() {
        System.out.println("Add Manga");
        System.out.print("Title : ");
        String title = scanner.next();
        System.out.print("Author: ");
        String author = scanner.next();
        System.out.print("Release Date : ");
        int year = scanner.nextInt();

        Manga newManga = new Manga(library.size() + 1, title, author, year);
        library.add(newManga);

        System.out.println("Manga Successfully Added.");
    }

    private static void viewMangas() {
        System.out.println("Manga List :");
        for (Manga Manga : library) {
            System.out.println("ID: " + Manga.getId());
            System.out.println("Title : " + Manga.getTitle());
            System.out.println("Author: " + Manga.getAuthor());
            System.out.println("Release Date : " + Manga.getYear());
            System.out.println();
        }
    }

    private static void updateManga() {
        System.out.print("Enter Manga ID  that requires update : ");
        int idToUpdate = scanner.nextInt();
        Manga MangaToUpdate = findMangaById(idToUpdate);
        if (MangaToUpdate != null) {
            System.out.print("New Title: ");
            String newTitle = scanner.next();
            System.out.print("New Author: ");
            String newAuthor = scanner.next();
            System.out.print("New Release Date : ");
            int newYear = scanner.nextInt();

            MangaToUpdate.setTitle(newTitle);
            MangaToUpdate.setAuthor(newAuthor);
            MangaToUpdate.setYear(newYear);

            System.out.println("Manga Successfully diupdate!");
        } else {
            System.out.println("Manga with an ID of " + idToUpdate + " tidak ditemukan.");
        }
    }
    
    private static void deleteManga() {
        System.out.print("Enter Manga ID that will be removed : ");
        int idToDelete = scanner.nextInt();
        Manga MangaToDelete = findMangaById(idToDelete);
        if (MangaToDelete != null) {
            library.remove(MangaToDelete);
            System.out.println("Manga Successfully removed.");
        } else {
            System.out.println("Manga with an ID of " + idToDelete + " was not found.");
        }
    }

    private static Manga findMangaById(int id) {
        for (Manga Manga : library) {
            if (Manga.getId() == id) {
                return Manga;
            }
        }
        return null;
    }
}
