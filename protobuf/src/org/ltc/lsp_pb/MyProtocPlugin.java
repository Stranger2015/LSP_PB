package org.ltc.lsp_pb;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

public
class MyProtocPlugin extends AbstractMojo {
    /**
     * Perform whatever build-process behavior this <code>Mojo</code> implements.
     * <br/>
     * This is the main trigger for the <code>Mojo</code> inside the <code>Maven</code> system, and allows
     * the <code>Mojo</code> to communicate errors.
     *
     * @throws MojoExecutionException if an unexpected problem occurs.
     *                                Throwing this exception causes a "BUILD ERROR" message to be displayed.
     * @throws MojoFailureException   if an expected problem (such as a compilation failure) occurs.
     *                                Throwing this exception causes a "BUILD FAILURE" message to be displayed.
     */
    @Override
    public
    void execute () throws MojoExecutionException, MojoFailureException {

    }
}
