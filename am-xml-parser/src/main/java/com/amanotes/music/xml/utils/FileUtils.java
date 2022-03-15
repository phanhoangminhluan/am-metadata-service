package com.amanotes.music.xml.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.13 23:31
 */
public class FileUtils {

    public static GZIPInputStream getGzipInputStream(String path) throws IOException {
        return new GZIPInputStream(new FileInputStream(path));
    }

}
