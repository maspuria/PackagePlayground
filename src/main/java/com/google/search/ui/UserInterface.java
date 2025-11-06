package com.google.search.ui;

import com.google.search.data.SearchData;
import com.google.search.model.Result;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    public void display() {
        displayWelcomeScreen();
    }

    public void displayWelcomeScreen() {
        System.out.println("welcome");
    }

    public void promptForSearchTerm() {
        System.out.println("What do you want to search for?");
        String searchTerm = scanner.nextLine();

        SearchData searchData = new SearchData();
        List<Result> result = searchData.search();
    }


}
