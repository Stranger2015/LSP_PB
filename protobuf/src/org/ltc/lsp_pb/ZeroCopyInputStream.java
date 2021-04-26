package org.ltc.lsp_pb;

import com.google.protobuf.CodedInputStream;

/**
 *
 */
public
class ZeroCopyInputStream {
    private final CodedInputStream stream;

    /**
     * @param stream
     */
    public
    ZeroCopyInputStream ( CodedInputStream stream ) {
        this.stream = stream;
    }

    /**
     * @return
     */
    public
    CodedInputStream getStream () {
        return stream;
    }
}
