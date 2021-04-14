package org.ltc.lsp_pb;

import com.google.protobuf.DescriptorProtos;
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
    boolean generate ( FileDescriptor fileDescriptor, String string, GeneratorContext context, String error ) {
        return false;
    }
}
