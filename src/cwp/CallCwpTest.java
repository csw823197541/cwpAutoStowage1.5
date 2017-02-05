package cwp;


public class CallCwpTest {

	static {
        System.loadLibrary("cwp_to_java6");
    }

    public static native String callCwp(String str1, String str2, String str3, String str4, String str5, String str6, String str7);

    public static String cwp(String craneJsonStr, String hatchJsonStr, String moveJsonStr, String craneSize, String MoZhi, String CanImproveCoEffi, String str7) {
        String cranes = craneJsonStr;
        String hatches = hatchJsonStr;
        String moves = moveJsonStr;
        String str = callCwp(cranes, hatches, moves, craneSize, MoZhi, CanImproveCoEffi, str7);
//        System.out.println(str);
        return str;
    }

}
