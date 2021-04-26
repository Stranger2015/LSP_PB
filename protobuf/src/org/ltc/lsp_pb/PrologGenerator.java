package org.ltc.lsp_pb;

import com.google.protobuf.DescriptorProtos.FileDescriptorProto;

import java.io.FileDescriptor;
import java.io.IOException;

/**
 *
 */
public
class PrologGenerator extends CodeGenerator {
    public
    PrologGenerator () throws IOException {

    }

    /**
     * @param fileDescriptorProto
     */
    @Override
    public
    void handleFile ( FileDescriptorProto fileDescriptorProto ) {

    }

    /**
     * @param fileDescriptor
     * @param string
     * @param context
     * @param error
     * @return
     */
    @Override
    public
    boolean generate ( FileDescriptor fileDescriptor,
                       String string,
                       GeneratorContext context,
                       String error ) {
        return false;
    }

    @Override
    public
    CodeGenResponse process ( CodeGenRequest request ) {
        // This is called by CodeGenApp after the request is parsed.
//                ProtobufGenerator.parseParameters(request.parameter);
//        switch(){
//            case Right(params)
        // Implicits gives you extension methods that provide ScalaPB
        // names and types for protobuf entities.
//                implicits =
//                        DescriptorImplicits.fromCodeGenRequest(params, request);

        // Process each top-level message in each file.
        // This can be customized if you want to traverse
        // the input in a different way.
//                CodeGenResponse.succeed(
//                for {
//                file <- request.filesToGenerate
//                message <- file.getMessageTypes().asScala
//            } yield new MessagePrinter(message, implicits).result
//            case Left(error):
//                CodeGenResponse.fail(error);
//        }
//    }
        return null;
    }
}
