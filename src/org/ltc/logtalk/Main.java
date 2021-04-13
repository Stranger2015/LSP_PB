package org.ltc.logtalk;

import com.github.os72.protocjar.Protoc;
import com.google.protobuf.compiler.PluginProtos;
import main.org.ltc.lsp_pb.LogtalkGenerator;
import org.ltc.lsp_pb.CodeGenerator;
import org.ltc.lsp_pb.CommandLineInterface;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CommandLineInterface cli =new CommandLineInterface(args);
        LogtalkGenerator gen = new LogtalkGenerator();
        cli.registerGenerator("--lgt_out",gen,"");

//        Protoc.main(args);
        PluginProtos.CodeGeneratorRequest codeGeneratorRequest = PluginProtos.CodeGeneratorRequest.parseFrom(System.in);
        codeGeneratorRequest.getProtoFileList().forEach(gen::handleFile);
        // get the response and do something with it


        PluginProtos.CodeGeneratorResponse response = PluginProtos.CodeGeneratorResponse.newBuilder().build();
        response.writeTo(System.out);
    }
}
