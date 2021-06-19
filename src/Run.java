/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.util.Scanner;

/**
 *
 * @author hoangson
 */
public class Run {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        Scanner sc = new Scanner(System.in);

        dict.loadDictionaryFromFile("C:\\Users\\ADMIN\\Desktop\\Code\\Java\\src\\Dictionary\\dictionary.txt");
        String[] words = new String[10000];
        for (int i = 0; i < words.length; ++i) {
            System.out.print("Enter the word: ");
            words[i] = sc.nextLine();
            if (!"".equals(words[i])) {
                System.out.print("Meaning: ");
                dict.lookup(words[i]);
            } else {
                System.exit(0);
            }
        }
    }
}
