package p218m2;

import P2.u;
import R1.E;
import R1.r;
import U1.AbstractC1459a;
import U1.M;
import U1.S;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a implements p182k2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0578a f48997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f48998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f49000h;

    /* JADX INFO: renamed from: m2.a$a, reason: collision with other inner class name */
    public static class C0578a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f49001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f49002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u[] f49003c;

        public C0578a(UUID uuid, byte[] bArr, u[] uVarArr) {
            this.f49001a = uuid;
            this.f49002b = bArr;
            this.f49003c = uVarArr;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f49006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f49007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f49010g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f49011h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f49012i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final r[] f49013j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f49014k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f49015l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f49016m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f49017n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long[] f49018o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final long f49019p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, r[] rVarArr, List list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, rVarArr, list, S.b1(list, 1000000L, j10), S.a1(j11, 1000000L, j10));
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, r[] rVarArr, List list, long[] jArr, long j11) {
            this.f49015l = str;
            this.f49016m = str2;
            this.f49004a = i10;
            this.f49005b = str3;
            this.f49006c = j10;
            this.f49007d = str4;
            this.f49008e = i11;
            this.f49009f = i12;
            this.f49010g = i13;
            this.f49011h = i14;
            this.f49012i = str5;
            this.f49013j = rVarArr;
            this.f49017n = list;
            this.f49018o = jArr;
            this.f49019p = j11;
            this.f49014k = list.size();
        }

        public Uri a(int i10, int i11) {
            AbstractC1459a.g(this.f49013j != null);
            AbstractC1459a.g(this.f49017n != null);
            AbstractC1459a.g(i11 < this.f49017n.size());
            String string = Integer.toString(this.f49013j[i10].f10272j);
            String string2 = ((Long) this.f49017n.get(i11)).toString();
            return M.g(this.f49015l, this.f49016m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(r[] rVarArr) {
            return new b(this.f49015l, this.f49016m, this.f49004a, this.f49005b, this.f49006c, this.f49007d, this.f49008e, this.f49009f, this.f49010g, this.f49011h, this.f49012i, rVarArr, this.f49017n, this.f49018o, this.f49019p);
        }

        public long c(int i10) {
            if (i10 == this.f49014k - 1) {
                return this.f49019p;
            }
            long[] jArr = this.f49018o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return S.h(this.f49018o, j10, true, true);
        }

        public long e(int i10) {
            return this.f49018o[i10];
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0578a c0578a, b[] bVarArr) {
        this.f48993a = i10;
        this.f48994b = i11;
        this.f48999g = j10;
        this.f49000h = j11;
        this.f48995c = i12;
        this.f48996d = z10;
        this.f48997e = c0578a;
        this.f48998f = bVarArr;
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0578a c0578a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : S.a1(j11, 1000000L, j10), j12 != 0 ? S.a1(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0578a, bVarArr);
    }

    @Override // p182k2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            E e10 = (E) arrayList.get(i10);
            b bVar2 = this.f48998f[e10.f9911b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((r[]) arrayList3.toArray(new r[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f49013j[e10.f9912c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((r[]) arrayList3.toArray(new r[0])));
        }
        return new a(this.f48993a, this.f48994b, this.f48999g, this.f49000h, this.f48995c, this.f48996d, this.f48997e, (b[]) arrayList2.toArray(new b[0]));
    }
}
