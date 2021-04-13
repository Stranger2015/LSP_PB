package org.ltc.lsp_pb;

import com.google.protobuf.DescriptorProtos;
import main.org.ltc.lsp_pb.GeneratorContext;

import java.io.FileDescriptor;
import java.io.IOException;

/**
 *
 */
public abstract
class CodeGenerator {
    /**
     * @throws IOException
     */
    protected
    CodeGenerator () throws IOException {
    }

    public
    void handleFile ( DescriptorProtos.FileDescriptorProto fileDescriptorProto ) {
        DescriptorProtos.FileDescriptorProto i = fileDescriptorProto.getDefaultInstanceForType();
//        protoc --descriptor_set_out=desc.pb schema.proto
    }

    public abstract
    boolean generate ( FileDescriptor fileDescriptor, String string, GeneratorContext context, String error );
}


