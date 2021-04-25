package protocol;

import java.io.IOException;

/**
 *
 */
public
class Main {
    /**
     * @param args
     * @param generator
     * @throws IOException
     */
    private static
    void protocMain ( String[] args, CodeGenerator generator ) throws IOException {
        CommandLineInterface cli = new CommandLineInterface(args);
        cli.registerGenerator("--prolog_out", generator, "Prolog code generator.");
    }
        //        Protoc.main(new String[]{"--help"});
//
//        List <Path> protoFiles = handleProtos();
//        protoFiles.addAll(handleProtoArchives());
//        List <String> largs = new ArrayList <>(Arrays.asList(args));
//        largs.add("");
//        System.out.println(".proto files found: " + protoFiles.size());
//        for (Path protoFile : protoFiles) {
//            largs.set(largs.size() - 1, protoFile.toString());
//            Protoc.main(largs.toArray(new String[largs.size()]));
//            CodeGeneratorRequest codeGeneratorRequest = parseFrom(System.in);
//            codeGeneratorRequest.getProtoFileList().forEach(generator::handleFile);
//             get the response and do something with it
//            CodeGeneratorResponse response = CodeGeneratorResponse.newBuilder().build();
//            response.writeTo(System.out);
//        }
//    }
//
//    private static
//    List <Path> handleProtos () {
//        List <Path> l = new ArrayList <>();
//        Path protofn = Paths.get("C:/Users/Anthony_2/IdeaProjects/LgtPbLS/protobuf/src/org/ltc/lsp_pb/protocol/rpc/rpc.proto");
//        return new ArrayList <>(Collections.singletonList(protofn));
//    }
//
//    private static
//    List <Path> handleProtoArchives () {
//        final List <Path> l = new ArrayList <>();
//        try (ZipFile file = new ZipFile("C:/Users/Anthony_2/IdeaProjects/LgtPbLS/lib/proto-google-common-protos-1.18.1-sources.zip")) {
//            FileSystem fileSystem = FileSystems.getDefault();
//            Get file entries
//            Enumeration <? extends ZipEntry> entries = file.entries();
//            We will unzip files in this folder
//            String uncompressedDirectory = "uncompressed/";
//            String uncompressedDirectory = "C:/Users/Anthony_2/IdeaProjects/LgtPbLS/protobuf/target/generated-sources/";
//            Path up = fileSystem.getPath(uncompressedDirectory);
//            if (!up.toFile().exists()) {
//                Files.createDirectory(up);
//            }
//            Iterate over entries
//            while (entries.hasMoreElements()) {
//                ZipEntry entry = entries.nextElement();
//                String entryName = slashify(entry.getName());
//                If directory then create a new directory in uncompressed folder
//                if (entry.isDirectory()) {
//                    String dir = uncompressedDirectory + slashify(entryName);
//                    System.out.println("Creating Directory:" + dir);
//                    Files.createDirectories(fileSystem.getPath(dir));
//                }
//                Else create the file
//                else {
//                    if (!entry.getName().endsWith(".proto")) {
//                        continue;
//                    }
//                    InputStream is = file.getInputStream(entry);
//                    BufferedInputStream bis = new BufferedInputStream(is);
//                    String uncompressedFileName = uncompressedDirectory + "/" + slashify(entryName);
//                    Path fn = fileSystem.getPath(uncompressedFileName);
//                    Files.createFile(fn);
//                    FileOutputStream fileOutput = new FileOutputStream(uncompressedFileName);
//                    while (bis.available() > 0) {
//                        fileOutput.write(bis.read());
//                    }
//                    fileOutput.close();
//                    System.out.println("Written :" + entry.getName());
//
//                    l.add(fn);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return l;
//    }

//    private static
//    String slashify ( String s ) {
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '\\') {
//                c = '/';
//            }
//            sb.append(c);
//        }
//
//        return sb.toString();
//    }

        /**
         * @param args
         * @throws java.io.IOException
         */
        public static
        void main (String[]args ) throws IOException {
        protocMain(args, new LogtalkGenerator());
        }
    }
