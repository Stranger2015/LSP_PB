package org.ltc.lsp_pb;

import com.google.protobuf.DescriptorProtos.FileDescriptorProto;

import java.io.FileDescriptor;
import java.io.IOException;

/**
 *
 */
public abstract
class CodeGenerator extends CodeGenApp {
    /**
     * @throws IOException
     */
    protected
    CodeGenerator () throws IOException {
    }

    public
    void handleFile ( FileDescriptorProto fileDescriptorProto ) {
        FileDescriptorProto i = fileDescriptorProto.getDefaultInstanceForType();
//        protoc --descriptor_set_out=desc.pb schema.proto
    }

    public abstract
    boolean generate ( FileDescriptor fileDescriptor, String string, GeneratorContext context, String error );

    public abstract
    CodeGenResponse process ( CodeGenRequest request );

}


