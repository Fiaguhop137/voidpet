package p290q2;

import R1.G;
import java.util.List;
import p254o2.n;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC4065c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f51403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f51404j;

    public z(G g10, int i10, int i11) {
        this(g10, i10, i11, 0, null);
    }

    public z(G g10, int i10, int i11, int i12, Object obj) {
        super(g10, new int[]{i10}, i11);
        this.f51403i = i12;
        this.f51404j = obj;
    }

    @Override // p290q2.y
    public int b() {
        return 0;
    }

    @Override // p290q2.y
    public Object h() {
        return this.f51404j;
    }

    @Override // p290q2.y
    public void l(long j10, long j11, long j12, List list, n[] nVarArr) {
    }

    @Override // p290q2.y
    public int q() {
        return this.f51403i;
    }
}
