package J2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f5696g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f5691b = str;
        this.f5692c = i10;
        this.f5693d = i11;
        this.f5694e = j10;
        this.f5695f = j11;
        this.f5696g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5692c == cVar.f5692c && this.f5693d == cVar.f5693d && this.f5694e == cVar.f5694e && this.f5695f == cVar.f5695f && Objects.equals(this.f5691b, cVar.f5691b) && Arrays.equals(this.f5696g, cVar.f5696g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f5692c) * 31) + this.f5693d) * 31) + ((int) this.f5694e)) * 31) + ((int) this.f5695f)) * 31;
        String str = this.f5691b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
