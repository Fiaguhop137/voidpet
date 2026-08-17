package R1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class z extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10592b;

    protected z(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f10591a = z10;
        this.f10592b = i10;
    }

    public static z a(String str, Throwable th) {
        return new z(str, th, true, 1);
    }

    public static z b(String str, Throwable th) {
        return new z(str, th, true, 0);
    }

    public static z c(String str, Throwable th) {
        return new z(str, th, true, 4);
    }

    public static z d(String str) {
        return new z(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f10591a);
        sb2.append(", dataType=");
        sb2.append(this.f10592b);
        sb2.append("}");
        return sb2.toString();
    }
}
