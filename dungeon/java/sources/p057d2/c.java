package p057d2;

import R1.E;
import U1.S;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p182k2.a;

/* JADX INFO: loaded from: classes.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f39647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f39648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f39649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f39650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f39651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f39652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f39653m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f39641a = j10;
        this.f39642b = j11;
        this.f39643c = j12;
        this.f39644d = z10;
        this.f39645e = j13;
        this.f39646f = j14;
        this.f39647g = j15;
        this.f39648h = j16;
        this.f39652l = hVar;
        this.f39649i = oVar;
        this.f39651k = uri;
        this.f39650j = lVar;
        this.f39653m = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList c(List list, LinkedList linkedList) {
        E e10 = (E) linkedList.poll();
        int i10 = e10.f9910a;
        ArrayList arrayList = new ArrayList();
        do {
            int i11 = e10.f9911b;
            a aVar = (a) list.get(i11);
            List list2 = aVar.f39633c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(e10.f9912c));
                e10 = (E) linkedList.poll();
                if (e10.f9910a != i10) {
                    break;
                }
            } while (e10.f9911b == i11);
            arrayList.add(new a(aVar.f39631a, aVar.f39632b, arrayList2, aVar.f39634d, aVar.f39635e, aVar.f39636f));
        } while (e10.f9910a == i10);
        linkedList.addFirst(e10);
        return arrayList;
    }

    @Override // p182k2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new E(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((E) linkedList.peek()).f9910a != i10) {
                long jF = f(i10);
                if (jF != -9223372036854775807L) {
                    j10 += jF;
                }
            } else {
                g gVarD = d(i10);
                arrayList.add(new g(gVarD.f39677a, gVarD.f39678b - j10, c(gVarD.f39679c, linkedList), gVarD.f39680d));
            }
            i10++;
        }
        long j11 = this.f39642b;
        return new c(this.f39641a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f39643c, this.f39644d, this.f39645e, this.f39646f, this.f39647g, this.f39648h, this.f39652l, this.f39649i, this.f39650j, this.f39651k, arrayList);
    }

    public final g d(int i10) {
        return (g) this.f39653m.get(i10);
    }

    public final int e() {
        return this.f39653m.size();
    }

    public final long f(int i10) {
        long j10;
        long j11;
        if (i10 == this.f39653m.size() - 1) {
            j10 = this.f39642b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((g) this.f39653m.get(i10)).f39678b;
        } else {
            j10 = ((g) this.f39653m.get(i10 + 1)).f39678b;
            j11 = ((g) this.f39653m.get(i10)).f39678b;
        }
        return j10 - j11;
    }

    public final long g(int i10) {
        return S.M0(f(i10));
    }
}
