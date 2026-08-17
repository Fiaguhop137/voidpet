package X3;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15290c;

    public h(String str, float f10, float f11) {
        this.f15288a = str;
        this.f15290c = f11;
        this.f15289b = f10;
    }

    public boolean a(String str) {
        if (this.f15288a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f15288a.endsWith("\r")) {
            String str2 = this.f15288a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
