package org.ltc.lsp_pb;

import org.ltc.lsp_pb.CodeGenRequest;
import org.ltc.lsp_pb.CodeGenResponse;
import org.ltc.lsp_pb.CodeGenerator;
import org.ltc.lsp_pb.GeneratorContext;

import java.io.FileDescriptor;
import java.io.IOException;

/**
 *
 */
public
class JavaGenerator extends CodeGenerator {
    /**
     * @throws IOException
     */
    public
    JavaGenerator () throws IOException {

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

    /**
     * @param request
     * @return
     */
    @Override
    public
    CodeGenResponse process ( CodeGenRequest request ) {
        return null;
    }
}
