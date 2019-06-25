package app;

import java.io.File;

public class Converter {
    private File file;
    private int maxFiles, fileIndex;

    public Converter(int maxFiles) {
        this.maxFiles = maxFiles;
        fileIndex = 1;
        file = new File("C:\\Java\\JavaProjects\\minecraft-function-separator\\output\\2085logo" + fileIndex + ".txt");

    }
    public void convert() {
        System.out.println("max: " + maxFiles);
        while(fileIndex <= maxFiles) {
            File file2 = new File("C:\\Java\\JavaProjects\\minecraft-function-separator\\output\\2085logo" + fileIndex + ".mcfunction");
            file.renameTo(file2);
            fileIndex++;
            file = new File("C:\\Java\\JavaProjects\\minecraft-function-separator\\output\\2085logo" + fileIndex + ".txt");
        }
        file = new File("C:\\Java\\JavaProjects\\minecraft-function-separator\\output\\2085logo" + 24 + ".txt");
        File file2 = new File("C:\\Java\\JavaProjects\\minecraft-function-separator\\output\\2085logo" + 24 + ".mcfunction");
        file.renameTo(file2);


    }
}