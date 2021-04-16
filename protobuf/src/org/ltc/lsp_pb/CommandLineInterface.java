package org.ltc.lsp_pb;

import com.github.os72.protocjar.Protoc;

import java.io.IOException;

/**
 *
 */
public
class CommandLineInterface {

    private final String[] args;
    private String flagName;
    private String option;
    private CodeGenerator codeGenerator;
    private String helpText;

    /**
     * @param args
     */
    public
    CommandLineInterface ( String[] args ) {
//        switch (args.length) {
//            case 1:
//                flagName = args[0];//fall thru
//            case 2:
//                helpText = args[1];
//            case 3:
//                option = args[2];
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + args.length);
//        }
        this.args = args;
    }

    /**
     * @return
     */
    public
    String getOption () {
        return option;
    }

    /**
     * @return
     */
    public
    CodeGenerator getCodeGenerator () {
        return codeGenerator;
    }

    /**
     * @return
     */
    public
    String getHelpText () {
        return helpText;
    }

    /**
     * @return
     */
    public
    String getFlagName () {
        return flagName;
    }

    /**
     * @param flagName
     * @param codeGenerator
     * @param helpText
     */
    public
    void registerGenerator ( String flagName, CodeGenerator codeGenerator, String helpText ) {
        registerGenerator(flagName, "", codeGenerator, helpText);
    }

    /**
     * @param flagName
     * @param option
     * @param codeGenerator
     * @param helpText
     */
    public
    void registerGenerator ( String flagName, String option, CodeGenerator codeGenerator, String helpText ) {
        this.flagName = flagName;
        this.option = option;
        this.codeGenerator = codeGenerator;
        this.helpText = helpText;
    }

    /**
     * @param args
     */
    public
    void run ( String[] args ) throws IOException, InterruptedException {
// protoc --plugin=protoc-gen-mylang=/path/to/mygen.sh --mylang_out=/some/dir some.proto
        Protoc.runProtoc(args);
    }

    public
    String[] getArgs () {
        return args;
    }
}
