package D2;

import U1.AbstractC1459a;
import p380v2.InterfaceC4254q;
import p380v2.z;

/* JADX INFO: loaded from: classes.dex */
final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f2129b;

    public d(InterfaceC4254q interfaceC4254q, long j10) {
        super(interfaceC4254q);
        AbstractC1459a.a(interfaceC4254q.getPosition() >= j10);
        this.f2129b = j10;
    }

    @Override // p380v2.z, p380v2.InterfaceC4254q
    public long getLength() {
        return super.getLength() - this.f2129b;
    }

    @Override // p380v2.z, p380v2.InterfaceC4254q
    public long getPosition() {
        return super.getPosition() - this.f2129b;
    }

    @Override // p380v2.z, p380v2.InterfaceC4254q
    public long h() {
        return super.h() - this.f2129b;
    }
}
