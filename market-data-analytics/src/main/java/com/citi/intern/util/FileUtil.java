package com.citi.intern.util;

import com.citi.intern.web.RouteController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);
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
            logger.error(e.getMessage());
        }
        return result;
    }
}
