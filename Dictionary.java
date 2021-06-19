/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hoangson
 *     
 */
public class Dictionary {

    private Node head;

    public Dictionary() {
        head = null;
    }

    public void loadDictionaryFromFile(String fileName) {
        BufferedReader bufferedReader = null;
        try {
            String word;
            String meaning;
            String currentLine = null;
            bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((currentLine = bufferedReader.readLine()) != null) {
                int index = currentLine.indexOf(":");
                word = currentLine.substring(0, index);
                meaning = currentLine.substring(index + 2, currentLine.length());
                Node node = new Node(word, meaning);
                if (head == null) {
                    head = node;
                } else {
                    Node currentNode = head;
                    while (currentNode.next != null) {
                        currentNode = currentNode.next;
                    }
                    currentNode.next = node;
                }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return;
    }

    public void lookup(String word) {
        if (head == null) {
            System.out.println("Dictionary is empty!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.word.equals(word)) {
                System.out.println(currentNode.meaning);
                return;
            }
            currentNode = currentNode.next;
        }
    }
}
