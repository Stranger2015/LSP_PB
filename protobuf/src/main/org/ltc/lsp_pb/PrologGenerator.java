package main.org.ltc.lsp_pb;

import com.google.protobuf.DescriptorProtos;
import org.ltc.lsp_pb.CodeGenerator;

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
    public
    void handleFile ( DescriptorProtos.FileDescriptorProto fileDescriptorProto ) {

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
    boolean generate ( FileDescriptor fileDescriptor, String string, GeneratorContext context, String error ) {
        return false;
    }
}
