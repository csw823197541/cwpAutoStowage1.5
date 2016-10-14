package importDataInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by leko on 2016/1/22.
 */
public class MoveInfo {
    private String gkey;                    //唯一编号
    private Integer WORKINGSTARTTIME;     //开始时间
    private Integer WORKINGENDTIME;         //结束时间
    private String batchId;                 //桥机号
    private int moveId;                     //桥机作业顺序moveId
    private String moveKind;                //装卸标志
    private String unitId;                  //箱编号
    private String unitLength;              //箱尺寸
    private String exFromPosition;      //计划提箱位置
    private String exToPosition;       //计划放箱位置

    private String vesselPosition;   //船箱位：倍.排.层
    private Date workingStartTime;    //开始时间
    private Date workingEndTime;    //结束时间

    private String moveType;    //作业工艺
    private Long voyId; //航次Id，艘次

    private String inStatus; //指令状态
    private String inIsExchange; //指令是否可以交换
    private String inIsRepeal; //指令是否可以撤销

    private Integer carryOrder; //装上AGV的顺序

    public Integer getCarryOrder() {
        return carryOrder;
    }

    public void setCarryOrder(Integer carryOrder) {
        this.carryOrder = carryOrder;
    }

    public String getInStatus() {
        return inStatus;
    }

    public void setInStatus(String inStatus) {
        this.inStatus = inStatus;
    }

    public String getInIsExchange() {
        return inIsExchange;
    }

    public void setInIsExchange(String inIsExchange) {
        this.inIsExchange = inIsExchange;
    }

    public String getInIsRepeal() {
        return inIsRepeal;
    }

    public void setInIsRepeal(String inIsRepeal) {
        this.inIsRepeal = inIsRepeal;
    }

    public Long getVoyId() {
        return voyId;
    }

    public void setVoyId(Long voyId) {
        this.voyId = voyId;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public String getVesselPosition() {
        return vesselPosition;
    }

    public void setVesselPosition(String vesselPosition) {
        this.vesselPosition = vesselPosition;
    }

    public Date getWorkingStartTime() {
        return workingStartTime;
    }

    public void setWorkingStartTime(Date workingStartTime) {
        this.workingStartTime = workingStartTime;
    }

    public Date getWorkingEndTime() {
        return workingEndTime;
    }

    public void setWorkingEndTime(Date workingEndTime) {
        this.workingEndTime = workingEndTime;
    }

    //获取属性列表
    static public List getFiledsInfo() {
        Field[] fields = MoveInfo.class.getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        List list = new ArrayList();
        for (int i = 0; i < fields.length; i++) {
            list.add(fields[i].getName());
        }
        return list;
    }

    public String getGkey() {
        return gkey;
    }

    public void setGkey(String gkey) {
        this.gkey = gkey;
    }

    public Integer getWORKINGSTARTTIME() {
        return WORKINGSTARTTIME;
    }

    public void setWORKINGSTARTTIME(Integer WORKINGSTARTTIME) {
        this.WORKINGSTARTTIME = WORKINGSTARTTIME;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getMoveId() {
        return moveId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }

    public String getMoveKind() {
        return moveKind;
    }

    public void setMoveKind(String moveKind) {
        this.moveKind = moveKind;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitLength() {
        return unitLength;
    }

    public void setUnitLength(String unitLength) {
        this.unitLength = unitLength;
    }

    public String getExFromPosition() {
        return exFromPosition;
    }

    public void setExFromPosition(String exFromPosition) {
        this.exFromPosition = exFromPosition;
    }

    public String getExToPosition() {
        return exToPosition;
    }

    public void setExToPosition(String exToPosition) {
        this.exToPosition = exToPosition;
    }

    public Integer getWORKINGENDTIME() {
        return WORKINGENDTIME;
    }

    public void setWORKINGENDTIME(Integer WORKINGENDTIME) {
        this.WORKINGENDTIME = WORKINGENDTIME;
    }
}
