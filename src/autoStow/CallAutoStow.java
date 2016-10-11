package autoStow;

/**
 * Created by leko on 2016/1/22.
 */
public class CallAutoStow {

    static {
        System.loadLibrary("AutoStowToJava7");
    }

    public static native String callAutoStow(String str1, String str2, String str3, String str4);

    public static String autoStow(String str1, String str2, String str3, String str4) {
        String str = callAutoStow(str1, str2, str3, str4);
        return str;
    }
}
