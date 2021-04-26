package org.ltc.lsp_pb;

import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.compiler.PluginProtos;

/**
 *
 */
public abstract
class GeneratorContext {
    /**
     * @param file
     * @return
     */
    abstract public
    ZeroCopyOutputStream open ( String file );

    /**
     * @param file
     * @return
     */
    public
    ZeroCopyOutputStream openAppend ( String file ) {

        return null;
    }

    /**
     * @param file
     * @param insertionPoint
     * @return
     */
    public
    ZeroCopyOutputStream openInsert ( String file, String insertionPoint ) {

        return null;
    }

   public void ListParsedFiles( FileDescriptor output){

    }
    /**
     * Returns a vector of FileDescriptors for all the files being compiled in this run. more...
     */
   public void
    GetCompilerVersion( PluginProtos.Version version){

   }
}
