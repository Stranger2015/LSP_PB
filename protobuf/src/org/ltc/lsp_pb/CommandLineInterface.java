package org.ltc.lsp_pb;

import org.ltc.lsp_pb.CodeGenerator;

/**
 *
 */
public
class CommandLineInterface {

    private String flagName;
    private String option;
    private CodeGenerator codeGenerator;
    private String helpText;

    /**
     * @param args
     */
    public
    CommandLineInterface ( String[] args ) {
        switch (args.length) {
            case 2:
                flagName = args[0];//fall thru
                helpText = args[1];
            case 3:
                option = args[2];
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + args.length);
        }
    }

    public
    String getOption () {
        return option;
    }

    public
    CodeGenerator getCodeGenerator () {
        return codeGenerator;
    }

    public
    String getHelpText () {
        return helpText;
    }

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

  public  void run ( String[] args ) {
// protoc --plugin=protoc-gen-mylang=/path/to/mygen.sh --mylang_out=/some/dir some.proto
    }
}
