package importDataInfo;

/**
 * Created by csw on 2016/10/20 9:33.
 * Explain:
 */
public class AreaToCraneInfo {

    private String vpcCntrId; //ָ��Ψһ���
    private String areaNo; //������
    private String craneNo; //�ŵ���
    private Double areaToCraneTime; //�������ŵ��ĺĶ೤ʱ��

    public String getVpcCntrId() {
        return vpcCntrId;
    }

    public void setVpcCntrId(String vpcCntrId) {
        this.vpcCntrId = vpcCntrId;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Double getAreaToCraneTime() {
        return areaToCraneTime;
    }

    public void setAreaToCraneTime(Double areaToCraneTime) {
        this.areaToCraneTime = areaToCraneTime;
    }
}
