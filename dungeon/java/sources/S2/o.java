package S2;

import R1.z;
import U1.AbstractC1459a;
import U1.F;
import U1.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p380v2.E;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public class o implements InterfaceC4253p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f11511a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R1.r f11513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f11514d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O f11517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f11520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f11521k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f11512b = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f11516f = S.f12881f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f11515e = new F();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f11522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f11523b;

        private b(long j10, byte[] bArr) {
            this.f11522a = j10;
            this.f11523b = bArr;
        }

        /* synthetic */ b(long j10, byte[] bArr, a aVar) {
            this(j10, bArr);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f11522a, bVar.f11522a);
        }
    }

    public o(s sVar, R1.r rVar) {
        this.f11511a = sVar;
        this.f11513c = rVar != null ? rVar.b().y0("application/x-media3-cues").U(rVar.f10277o).Y(sVar.c()).P() : null;
        this.f11514d = new ArrayList();
        this.f11519i = 0;
        this.f11520j = S.f12882g;
        this.f11521k = -9223372036854775807L;
    }

    public static /* synthetic */ void c(o oVar, e eVar) {
        oVar.getClass();
        b bVar = new b(eVar.f11502b, oVar.f11512b.a(eVar.f11501a, eVar.f11503c), null);
        oVar.f11514d.add(bVar);
        long j10 = oVar.f11521k;
        if (j10 == -9223372036854775807L || eVar.f11504d >= j10) {
            oVar.l(bVar);
        }
    }

    private void d() throws z {
        try {
            long j10 = this.f11521k;
            this.f11511a.b(this.f11516f, 0, this.f11518h, j10 != -9223372036854775807L ? s.b.c(j10) : s.b.b(), new n(this));
            Collections.sort(this.f11514d);
            this.f11520j = new long[this.f11514d.size()];
            for (int i10 = 0; i10 < this.f11514d.size(); i10++) {
                this.f11520j[i10] = ((b) this.f11514d.get(i10)).f11522a;
            }
            this.f11516f = S.f12881f;
        } catch (RuntimeException e10) {
            throw z.a("SubtitleParser failed.", e10);
        }
    }

    private boolean e(InterfaceC4254q interfaceC4254q) {
        byte[] bArr = this.f11516f;
        if (bArr.length == this.f11518h) {
            this.f11516f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f11516f;
        int i10 = this.f11518h;
        int i11 = interfaceC4254q.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f11518h += i11;
        }
        long length = interfaceC4254q.getLength();
        return (length != -1 && ((long) this.f11518h) == length) || i11 == -1;
    }

    private boolean h(InterfaceC4254q interfaceC4254q) {
        return interfaceC4254q.a((interfaceC4254q.getLength() > (-1L) ? 1 : (interfaceC4254q.getLength() == (-1L) ? 0 : -1)) != 0 ? F9.f.e(interfaceC4254q.getLength()) : 1024) == -1;
    }

    private void i() {
        long j10 = this.f11521k;
        for (int iH = j10 == -9223372036854775807L ? 0 : S.h(this.f11520j, j10, true, true); iH < this.f11514d.size(); iH++) {
            l((b) this.f11514d.get(iH));
        }
    }

    private void l(b bVar) {
        AbstractC1459a.i(this.f11517g);
        int length = bVar.f11523b.length;
        this.f11515e.X(bVar.f11523b);
        this.f11517g.f(this.f11515e, length);
        this.f11517g.c(bVar.f11522a, 1, length, 0, null);
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        int i10 = this.f11519i;
        AbstractC1459a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f11521k = j11;
        if (this.f11519i == 2) {
            this.f11519i = 1;
        }
        if (this.f11519i == 4) {
            this.f11519i = 3;
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void b(p380v2.r rVar) {
        AbstractC1459a.g(this.f11519i == 0);
        O oF = rVar.f(0, 3);
        this.f11517g = oF;
        R1.r rVar2 = this.f11513c;
        if (rVar2 != null) {
            oF.b(rVar2);
            rVar.t();
            rVar.p(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f11519i = 1;
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        return true;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        int i11 = this.f11519i;
        AbstractC1459a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f11519i == 1) {
            int iE = interfaceC4254q.getLength() != -1 ? F9.f.e(interfaceC4254q.getLength()) : 1024;
            if (iE > this.f11516f.length) {
                this.f11516f = new byte[iE];
            }
            this.f11518h = 0;
            this.f11519i = 2;
        }
        if (this.f11519i == 2 && e(interfaceC4254q)) {
            d();
            this.f11519i = 4;
        }
        if (this.f11519i == 3 && h(interfaceC4254q)) {
            i();
            this.f11519i = 4;
        }
        return this.f11519i == 4 ? -1 : 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
        if (this.f11519i == 5) {
            return;
        }
        this.f11511a.reset();
        this.f11519i = 5;
    }
}
