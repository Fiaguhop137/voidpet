package R1;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f10480a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f10481b = "media3.common";

    public static synchronized void a(String str) {
        if (f10480a.add(str)) {
            f10481b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f10481b;
    }
}
