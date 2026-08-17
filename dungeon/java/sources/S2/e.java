package S2;

import C9.AbstractC0876t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0876t f11501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11504d;

    public e(List list, long j10, long j11) {
        this.f11501a = AbstractC0876t.p(list);
        this.f11502b = j10;
        this.f11503c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f11504d = j12;
    }
}
