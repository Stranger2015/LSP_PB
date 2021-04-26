package org.ltc.lsp_pb;

import com.google.protobuf.compiler.PluginProtos;

import java.io.IOException;

import static com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.parseFrom;

/**
 *
 */
public
class Main {
    public
    Main () throws IOException {
    }

    /**
     * @param args
     * @param generator
     */
    private static
    void protocMain ( String[] args, CodeGenerator generator ) {
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
    PluginProtos.CodeGeneratorRequest codeGeneratorRequest = parseFrom(System.in);
            codeGeneratorRequest.getProtoFileList().

//    forEach ( generator::handleFile );

    //             get the response and do something with it
    PluginProtos.CodeGeneratorResponse response = PluginProtos.CodeGeneratorResponse.newBuilder().build();
            response.writeTo(System.out);

        public static
        void main (String[]args ) throws IOException {
        protocMain(args, new LogtalkGenerator());
        }
    }
