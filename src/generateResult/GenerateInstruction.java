package generateResult;

import importDataInfo.MoveInfo;

import java.util.*;

/**
 * Created by csw on 2016/9/28 10:32.
 * Explain:
 */
public class GenerateInstruction {

    public static List<MoveInfo> getWorkInstruction(List<MoveInfo> moveInfoList,
                                                    Date curInstructionTime,
                                                    Integer timeInterval) {
        List<MoveInfo> resultList = new ArrayList<>();

        sortByStartTime(moveInfoList);

        MoveInfo firstMove = findFirstMove(curInstructionTime, moveInfoList);
        long firstST = firstMove.getWorkingStartTime().getTime();

        for (MoveInfo moveInfo : moveInfoList) {
            String status = moveInfo.getInStatus();
            if ("done".equals(status)) {
                continue;
            } else {
                long startTime = moveInfo.getWorkingStartTime().getTime();
                if (startTime <= firstST + timeInterval * 60 * 1000) {
                    if (!isUnderEmpty(moveInfo, moveInfoList) && isWorkFlowOk(moveInfo, moveInfoList)) {
                        resultList.add(moveInfo);
                    }
                } else {
                    break;
                }
            }
        }

        return resultList;
    }

    private static boolean isUnderEmpty(MoveInfo moveInfo, List<MoveInfo> moveInfoList) {
        boolean isUnderEmpty = false;
        String craneId = moveInfo.getBatchId();
        Integer moveId = moveInfo.getMoveId();
        for (MoveInfo moveInfo1 : moveInfoList) {
            if (craneId.equals(moveInfo1.getBatchId())) {
                if (moveInfo1.getMoveId() < moveId) {
                    if ("?".equals(moveInfo1.getUnitId())) {
                        isUnderEmpty = true;
                    }
                }
            }
        }
        return isUnderEmpty;
    }

    private static boolean isWorkFlowOk(MoveInfo moveInfo, List<MoveInfo> moveInfoList) {
        boolean isWorkFlowOk = true;
        String craneId = moveInfo.getBatchId();
        Integer moveId = moveInfo.getMoveId();
        String workFlow = moveInfo.getMoveType();
        String LD = moveInfo.getMoveKind();
        if ("L".equals(LD)) {
            if ("2".equals(workFlow) || "3".equals(workFlow)) {
                int containerNum = 0;
                for (MoveInfo moveInfo1 : moveInfoList) {
                    if (craneId.equals(moveInfo1.getBatchId()) && moveId == moveInfo1.getMoveId()) {
                        if (!"?".equals(moveInfo1.getUnitId())) {
                            containerNum++;
                        }
                    }
                }
                if (containerNum != 2) {
                    isWorkFlowOk = false;
                }
            }
        }
        return isWorkFlowOk;
    }

    private static MoveInfo findFirstMove(Date curInstructionTime, List<MoveInfo> moveInfoList) {
        MoveInfo firstMove = new MoveInfo();
        for (MoveInfo moveInfo : moveInfoList) {
            if (curInstructionTime.compareTo(moveInfo.getWorkingStartTime()) == -1) {
                firstMove = moveInfo;
                break;
            }
        }
        return firstMove;
    }

    private static List<MoveInfo> sortByStartTime(List<MoveInfo> moveInfoList) {
        Collections.sort(moveInfoList, new Comparator<MoveInfo>() {
            @Override
            public int compare(MoveInfo o1, MoveInfo o2) {
                return o1.getWorkingStartTime().compareTo(o2.getWorkingStartTime());
            }
        });
        return moveInfoList;
    }


}
