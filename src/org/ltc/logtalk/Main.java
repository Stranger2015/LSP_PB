package org.ltc.logtalk;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;
import org.ltc.lsp_pb.CommandLineInterface;
import org.ltc.lsp_pb.LogtalkGenerator;

import java.io.IOException;

import static com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.parseFrom;

/**
 *
 */
public
class Main {

    public static
    void main ( String[] args ) throws IOException {
        CommandLineInterface cli = new CommandLineInterface(args);
        LogtalkGenerator gen = new LogtalkGenerator();
        cli.registerGenerator("--lgt_out", gen, "Logtalk code generator.");

//        Protoc.main(args);
        CodeGeneratorRequest codeGeneratorRequest = parseFrom(System.in);
        codeGeneratorRequest.getProtoFileList().forEach(gen::handleFile);
        // get the response and do something with it


        CodeGeneratorResponse response = CodeGeneratorResponse.newBuilder().build();
        response.writeTo(System.out);
    }
}
