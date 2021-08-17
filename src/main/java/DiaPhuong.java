
public class DiaPhuong {
    private String tinhThanhPho;

    private String quanHuyen;

    private String xaPhuongThiTran;

    private String matp;

    private String maqh;


    public DiaPhuong() {
    }

    public DiaPhuong(String tinhThanhPho, String quanHuyen, String xaPhuongThiTran) {
        this.tinhThanhPho = tinhThanhPho;
        this.quanHuyen = quanHuyen;
        this.xaPhuongThiTran = xaPhuongThiTran;
    }


    public String getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(String tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getXaPhuongThiTran() {
        return xaPhuongThiTran;
    }

    public void setXaPhuongThiTran(String xaPhuongThiTran) {
        this.xaPhuongThiTran = xaPhuongThiTran;
    }

    public String getMatp() {
        return matp;
    }

    public void setMatp(String matp) {
        this.matp = matp;
    }

    public String getMaqh() {
        return maqh;
    }

    public void setMaqh(String maqh) {
        this.maqh = maqh;
    }
}
