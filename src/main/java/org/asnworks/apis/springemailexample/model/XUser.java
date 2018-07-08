/**
 * 
 */
package org.asnworks.apis.springemailexample.model;

/**
 * @author sudarsan
 */
public class XUser implements java.io.Serializable {

    private static final long serialVersionUID = -5997879731677309480L;

    private String email;

    public XUser() {
    }

    public XUser(String email) {
        super();
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
