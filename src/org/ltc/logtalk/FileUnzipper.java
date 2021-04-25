package org.ltc.logtalk;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public
class FileUnzipper {
    private final Logger LOGGER = Logger.getLogger(getClass().getSimpleName());

    private final String zipFileDir;
    private final String zipFileName;
    private final String unzipDir;

    public
    FileUnzipper ( String zipFileDir, String zipFileName, String unzipDir ) {
        this.zipFileDir = zipFileDir;
        this.zipFileName = zipFileName;
        this.unzipDir = unzipDir;
    }

    public
    List <Path> unzip ( String fileExt ) throws IOException {
        String zipFilePath = this.zipFileDir + "/" + this.zipFileName;
        ZipEntry entry;
        final List <Path> l = new ArrayList <>();
        String destPath = this.unzipDir;
        try {
            System.out.println("zipFilePath = " + zipFilePath);
            ZipFile zipFile = new ZipFile(zipFilePath);
            Enumeration <? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                entry = entries.nextElement();
                if (entry.isDirectory()) {
                    System.out.print("dir  : " + entry.getName());
                    destPath += "/" + entry.getName();
                    System.out.println(" => " + destPath);
                    if (!isValidDestPath(zipFileDir, destPath)) {
                        throw new IOException("Final directory output path is invalid: " + destPath);
                    }
                    File file = new File(destPath);
                    file.mkdirs();
                }
                else {
//                    destPath += "/" + entry.getName();
                    Path path = Paths.get(destPath);

                    if (!isValidDestPath(zipFileDir, destPath)) {
                        throw new IOException("Final file output path is invalid: " + destPath);
                    }
                    if (entry.getName().endsWith(fileExt)) {
                        try (InputStream inputStream = zipFile.getInputStream(entry)) {
                            System.out.println("file : " + entry);
                            Files.copy(inputStream, path);
                            l.add(path);
                        } catch (IOException e) {
                            throw new RuntimeException("Error unzipping file " + zipFilePath, e);
                        }
                    }
                }
            }
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }

        return l;
    }

    private
    boolean isValidDestPath ( String targetDir, String destPathStr ) {
        // validate the destination path of a ZipFile entry,
        // and return true or false telling if it's valid or not.

//        Path destPath = Paths.get(destPathStr);
//        Path destPathNormalized = destPath.normalize(); //remove ../../ etc.

        return true;// destPathNormalized.toString().startsWith(targetDir + "/");
    }

//        public static void unzip1(final String fileExt ,final Path zipFile/*, final Path decryptTo*/) {
//            try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
//                ZipEntry entry;
//                while ((entry = zipInputStream.getNextEntry()) != null) {
////                    LOGGER.log(Level.INFO, "entry name = {0}", entry.getName());
//                    final Path toPath = null;//decryptTo.resolve(entry.getName());
//                    if (entry.isDirectory()) {
//                        Files.createDirectory(toPath);
//                    } else if (toPath.endsWith(fileExt)){
//                        Files.copy(zipInputStream, toPath);
//                    }
//                }
//            } catch (IOException e) {
////                LOGGER.log(Level.SEVERE, e.getMessage(), e);
//            }
//        }
    }
