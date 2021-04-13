package main.org.ltc.lsp_pb;

public abstract
class GeneratorContext {
    abstract
    ZeroCopyOutputStream open(String file);

    ZeroCopyOutputStream openAppend(String file){

        return null;
    }
 ZeroCopyOutputStream openInsert(String file, String insertionPoint){

     return null;
 }
}
