package p135h8;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Status f42649a;

    public b(Status status) {
        int iC4 = status.c4();
        String strD4 = status.d4() != null ? status.d4() : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(iC4).length() + 2 + String.valueOf(strD4).length());
        sb2.append(iC4);
        sb2.append(": ");
        sb2.append(strD4);
        super(sb2.toString());
        this.f42649a = status;
    }

    public Status a() {
        return this.f42649a;
    }

    public int b() {
        return this.f42649a.c4();
    }
}
