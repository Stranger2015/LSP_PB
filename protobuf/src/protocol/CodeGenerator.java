package protocol;

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

    /**
     * @param fileDescriptorProto
     */
    public
    void handleFile ( FileDescriptorProto fileDescriptorProto ) {
        FileDescriptorProto i = fileDescriptorProto.getDefaultInstanceForType();
//        protoc --descriptor_set_out=desc.pb schema.proto
    }

    /**
     * @param fileDescriptor
     * @param string
     * @param context
     * @param error
     * @return
     */
    public abstract
    boolean generate ( FileDescriptor fileDescriptor,
                       String string,
                       GeneratorContext context,
                       String error );

    /**
     * @param request
     * @return
     */
    public abstract
    CodeGenResponse process ( CodeGenRequest request );
}


