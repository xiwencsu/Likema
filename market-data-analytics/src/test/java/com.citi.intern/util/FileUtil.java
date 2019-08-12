package com.citi.intern.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static List<String> readFile(String sourceFilePath) {
        List<String> result = new ArrayList<>();
        try {
            FileReader fr = new FileReader(sourceFilePath);
            BufferedReader br = new BufferedReader(fr);
            String content = br.readLine();
            while (content != null) {
                result.add(content);
                content = br.readLine();
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
