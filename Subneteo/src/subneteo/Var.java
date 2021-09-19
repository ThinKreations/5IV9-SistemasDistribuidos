package subneteo;
/**
 * @author jnapo
 **/
public class Var {
    
    private int ip1, ip2, ip3, ip4, mask1, mask2, mask3, mask4, sub;
    private char type;
    private String ip0, mask0,mask;
    
    public Var() {
    }

    public Var(String ip0, int ip1, int ip2, int ip3, int ip4, String mask0,String mask, int mask1, int mask2, int mask3, int mask4, int sub, char type) {
        this.ip0 = ip0;
        this.ip1 = ip1;
        this.ip2 = ip2;
        this.ip3 = ip3;
        this.ip4 = ip4;
        this.mask = mask;
        this.mask0 = mask0;
        this.mask1 = mask1;
        this.mask2 = mask2;
        this.mask3 = mask3;
        this.mask4 = mask4;
        this.sub = sub;
        this.type = type;
    }

    public String getIp0() {
        return ip0;
    }

    public void setIp0(String ip0) {
        this.ip0 = ip0;
    }

    public int getIp1() {
        return ip1;
    }

    public void setIp1(int ip1) {
        this.ip1 = ip1;
    }

    public int getIp2() {
        return ip2;
    }

    public void setIp2(int ip2) {
        this.ip2 = ip2;
    }

    public int getIp3() {
        return ip3;
    }

    public void setIp3(int ip3) {
        this.ip3 = ip3;
    }

    public int getIp4() {
        return ip4;
    }

    public void setIp4(int ip4) {
        this.ip4 = ip4;
    }
    
    public String getMask0() {
        return mask0;
    }

    public void setMask0(String mask0) {
        this.mask0 = mask0;
    }
    
    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }


    public int getMask1() {
        return mask1;
    }

    public void setMask1(int mask1) {
        this.mask1 = mask1;
    }

    public int getMask2() {
        return mask2;
    }

    public void setMask2(int mask2) {
        this.mask2 = mask2;
    }

    public int getMask3() {
        return mask3;
    }

    public void setMask3(int mask3) {
        this.mask3 = mask3;
    }

    public int getMask4() {
        return mask4;
    }

    public void setMask4(int mask4) {
        this.mask4 = mask4;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }
    
    public int getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    
    
}
