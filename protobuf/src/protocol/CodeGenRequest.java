package protocol;

import com.google.protobuf.compiler.PluginProtos.Version;

import java.io.FileDescriptor;
import java.util.List;

import static com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;

/**
 *
 */
public
class CodeGenRequest {
    private final String parameter;
    private final List <FileDescriptor> filesToGenerate;
    private final List <FileDescriptor> allProtos;
    private final Version compilerVersion;
    private final CodeGeneratorRequest asProto;

    public
    CodeGenRequest ( String parameter,
                     List <FileDescriptor> filesToGenerate,
                     List <FileDescriptor> allProtos,
                     Version compilerVersion,
                     CodeGeneratorRequest asProto ) {
        this.parameter = parameter;
        this.filesToGenerate = filesToGenerate;
        this.allProtos = allProtos;
        this.compilerVersion = compilerVersion;
        this.asProto = asProto;
    }

    /**
     * @return
     */
    public
    String getParameter () {
        return parameter;
    }


    /**
     * @return
     */
    public
    List <FileDescriptor> getFilesToGenerate () {
        return filesToGenerate;
    }

    /**
     * @return
     */
    public
    List <FileDescriptor> getAllProtos () {
        return allProtos;
    }

    /**
     * @return
     */
    public
    Version getCompilerVersion () {
        return compilerVersion;
    }

    /**
     * @return
     */
    public
    CodeGeneratorRequest getAsProto () {
        return asProto;
    }
}
