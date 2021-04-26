package org.ltc.lsp_pb;

import com.google.protobuf.ExtensionRegistry;

import static com.googlecode.protobuf.pro.duplex.wire.DuplexProtocol.registerAllExtensions;

/**
 *
 */
public
class CodeGenApp extends App {
    /**
     * @param registry
     */
   public void registerExtensions(ExtensionRegistry registry){
       registerAllExtensions(registry);
    }
}
