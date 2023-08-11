/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_GENERIC;

/**
 *
 * @author ADMIN
 */
public class S3_Pair<J,Q> {
    private  J key ;
    private Q value ;

    public S3_Pair() {
    }

    public S3_Pair(J key, Q value) {
        this.key = key;
        this.value = value;
    }

    public J getKey() {
        return key;
    }

    public void setKey(J key) {
        this.key = key;
    }

    public Q getValue() {
        return value;
    }

    public void setValue(Q value) {
        this.value = value;
    }
    
}
