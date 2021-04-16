package org.ltc.logtalk;

import com.github.os72.protocjar.Protoc;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;
import org.ltc.lsp_pb.CodeGenerator;
import org.ltc.lsp_pb.CommandLineInterface;
import org.ltc.lsp_pb.LogtalkGenerator;

import java.io.IOException;

import static com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.parseFrom;

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
    private static void protocMain( String[] args, CodeGenerator generator ) throws IOException {
        CommandLineInterface cli = new CommandLineInterface(args);
        cli.registerGenerator("--lgt_out", generator, "Logtalk code generator.");

        Protoc.main(args);
        CodeGeneratorRequest codeGeneratorRequest = parseFrom(System.in);
        codeGeneratorRequest.getProtoFileList().forEach(generator::handleFile);
        // get the response and do something with it
        CodeGeneratorResponse response = CodeGeneratorResponse.newBuilder().build();
        response.writeTo(System.out);
    }

    /**
     * @param args
     * @throws IOException
     */
    public static
    void main ( String[] args ) throws IOException {
        protocMain(args, new LogtalkGenerator());
    }
}
