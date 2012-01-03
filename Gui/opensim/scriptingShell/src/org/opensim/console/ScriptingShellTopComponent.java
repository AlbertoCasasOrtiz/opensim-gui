/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.console;

import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.opensim.utils.FileUtils;
import org.python.core.Py;
import org.python.util.PythonInterpreter; 
import org.opensim.modeling.*;
import org.opensim.plotter.*;
/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//org.opensim.console//ScriptingShell//EN",
autostore = false)
@TopComponent.Description(preferredID = "ScriptingShellTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "org.opensim.console.ScriptingShellTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_ScriptingShellAction",
preferredID = "ScriptingShellTopComponent")
public final class ScriptingShellTopComponent extends TopComponent {
private PythonInterpreter interp;

    public ScriptingShellTopComponent() {
        //fileTextFieldAndChooser1.setFileFilter(FileUtils.getFileFilter(".py", "Python script file to load"));
        initComponents();
        interp = new PythonInterpreter();
        Py.getSystemState().setClassLoader(
                this.getClass().getClassLoader());
        interp.exec("import sys");
        /*interp.exec("import org.opensim.modeling as modeling");
        interp.exec("import org.opensim.view.pub as pub");
        interp.exec("import javax.swing as swing");
        interp.exec("win = swing.JFrame(\"Welcome\")");
        interp.exec("win.size = (200, 200)");
        interp.exec("win.show()");*/
        setName(NbBundle.getMessage(ScriptingShellTopComponent.class, "CTL_ScriptingShellTopComponent"));
        setToolTipText(NbBundle.getMessage(ScriptingShellTopComponent.class, "HINT_ScriptingShellTopComponent"));
        putClientProperty(TopComponent.PROP_MAXIMIZATION_DISABLED, Boolean.TRUE);
        putClientProperty(TopComponent.PROP_SLIDING_DISABLED, Boolean.TRUE);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fileTextFieldAndChooser1 = new org.opensim.swingui.FileTextFieldAndChooser();
        jExcutePyScriptButton = new javax.swing.JButton();

        setToolTipText(org.openide.util.NbBundle.getMessage(ScriptingShellTopComponent.class, "ScriptingShellTopComponent.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ScriptingShellTopComponent.class, "ScriptingShellTopComponent.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jExcutePyScriptButton, org.openide.util.NbBundle.getMessage(ScriptingShellTopComponent.class, "ScriptingShellTopComponent.jExcutePyScriptButton.text")); // NOI18N
        jExcutePyScriptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcutePyScriptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fileTextFieldAndChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jExcutePyScriptButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jExcutePyScriptButton)
                    .addComponent(fileTextFieldAndChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jExcutePyScriptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcutePyScriptButtonActionPerformed
        // TODO add your handling code here:
        interp.execfile(fileTextFieldAndChooser1.getFileName());
    }//GEN-LAST:event_jExcutePyScriptButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.opensim.swingui.FileTextFieldAndChooser fileTextFieldAndChooser1;
    private javax.swing.JButton jExcutePyScriptButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}