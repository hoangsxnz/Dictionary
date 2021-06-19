
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

/**
 *
 * @author hoangson
 */
public class Node {

    public String word;
    public String meaning;
    public Node next;

    public Node(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", word, meaning);
    }
}
