package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Verifier {
    private BufferedReader reader;
    private String line;
    private int fileIndex, maxFiles, characters;

    public Verifier(int maxFiles) throws Exception {
        fileIndex = 1;
        this.maxFiles = maxFiles;
        reader = new BufferedReader(
                new FileReader("C:\\Java\\JavaProjects\\minecraft-function-divider\\output\\2085logo1.txt"));
        line = "";
        characters = 0;
    }

    public void verify() throws Exception {
        while (fileIndex <= maxFiles) {
            reader = new BufferedReader(new FileReader(
                    "C:\\Java\\JavaProjects\\minecraft-function-divider\\output\\2085logo" + fileIndex + ".txt"));
            line = reader.readLine();

            while (line != null) {
                characters += line.length();
                line = reader.readLine();
            }
            System.out.println("File" + fileIndex +": " + characters);
            characters = 0;
            fileIndex++;
        }

    }
}