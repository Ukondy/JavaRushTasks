package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        if(Files.notExists(zipFile.getParent())) {
            Files.createDirectory(zipFile.getParent());
        }
        try(ZipOutputStream outputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
            ) {
            if(Files.isRegularFile(source)) {
                addNewZipEntry(outputStream, source.getParent(), source.getFileName());
            } else if(Files.isDirectory(source)) {
                FileManager fileManager = new FileManager(source);
                List<Path> fileList = fileManager.getFileList();
                for (Path path : fileList) {
                    addNewZipEntry(outputStream, source, path);
                }
            } else {
                throw new PathIsNotFoundException();
            }
        }
    }

    private void addNewZipEntry(ZipOutputStream zipOutputStream, Path filePath, Path fileName) throws Exception {
        try (InputStream inputStream = Files.newInputStream(filePath.resolve(fileName))) {
            ZipEntry zipEntry = new ZipEntry(fileName.toString());
            zipOutputStream.putNextEntry(zipEntry);

            copyData(inputStream, zipOutputStream);
            zipOutputStream.closeEntry();
        }
    }

    private void copyData(InputStream in, OutputStream out) throws Exception {
        byte[] buffer = new byte[8*1024];
        while(in.available() > 0) {
            int size = in.read(buffer);
            out.write(buffer, 0, size);
        }
    }


}
