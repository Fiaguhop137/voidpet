package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1845b implements InterfaceC1855g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f21987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f21988b = new int[2];

    protected final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f21988b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    protected final String d() {
        String str = this.f21987a;
        if (str != null) {
            return str;
        }
        Intrinsics.r("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    protected final void f(String str) {
        this.f21987a = str;
    }
}
