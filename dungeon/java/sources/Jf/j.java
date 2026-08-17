package Jf;

import Ad.AbstractC0793c;
import Ad.v;
import If.AbstractC1111m;
import If.AbstractC1113o;
import If.InterfaceC1108j;
import If.K;
import If.Q;
import If.d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cd.a.d(((i) obj).b(), ((i) obj2).b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5844a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    static final class c extends o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f5845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f5846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f5847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1108j f5848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ D f5849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ D f5850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ E f5851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ E f5852h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ E f5853i;

        static final class a extends o implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f5854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1108j f5855b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ E f5856c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ E f5857d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E e10, InterfaceC1108j interfaceC1108j, E e11, E e12) {
                super(2);
                this.f5854a = e10;
                this.f5855b = interfaceC1108j;
                this.f5856c = e11;
                this.f5857d = e12;
            }

            public final void a(int i10, long j10) throws IOException {
                if (i10 == 1) {
                    E e10 = this.f5854a;
                    if (e10.f48338a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j10 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    e10.f48338a = Long.valueOf(this.f5855b.M1());
                    this.f5856c.f48338a = Long.valueOf(this.f5855b.M1());
                    this.f5857d.f48338a = Long.valueOf(this.f5855b.M1());
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                a(((Number) obj).intValue(), ((Number) obj2).longValue());
                return Unit.f48228a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(A a10, long j10, D d10, InterfaceC1108j interfaceC1108j, D d11, D d12, E e10, E e11, E e12) {
            super(2);
            this.f5845a = a10;
            this.f5846b = j10;
            this.f5847c = d10;
            this.f5848d = interfaceC1108j;
            this.f5849e = d11;
            this.f5850f = d12;
            this.f5851g = e10;
            this.f5852h = e11;
            this.f5853i = e12;
        }

        public final void a(int i10, long j10) throws IOException {
            if (i10 != 1) {
                if (i10 != 10) {
                    return;
                }
                if (j10 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                this.f5848d.skip(4L);
                InterfaceC1108j interfaceC1108j = this.f5848d;
                j.j(interfaceC1108j, (int) (j10 - 4), new a(this.f5851g, interfaceC1108j, this.f5852h, this.f5853i));
                return;
            }
            A a10 = this.f5845a;
            if (a10.f48334a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            a10.f48334a = true;
            if (j10 < this.f5846b) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            D d10 = this.f5847c;
            long jM1 = d10.f48337a;
            if (jM1 == 4294967295L) {
                jM1 = this.f5848d.M1();
            }
            d10.f48337a = jM1;
            D d11 = this.f5849e;
            d11.f48337a = d11.f48337a == 4294967295L ? this.f5848d.M1() : 0L;
            D d12 = this.f5850f;
            d12.f48337a = d12.f48337a == 4294967295L ? this.f5848d.M1() : 0L;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f48228a;
        }
    }

    static final class d extends o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1108j f5858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f5859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ E f5860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ E f5861d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1108j interfaceC1108j, E e10, E e11, E e12) {
            super(2);
            this.f5858a = interfaceC1108j;
            this.f5859b = e10;
            this.f5860c = e11;
            this.f5861d = e12;
        }

        public final void a(int i10, long j10) throws IOException {
            if (i10 == 21589) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b10 = this.f5858a.readByte();
                boolean z10 = (b10 & 1) == 1;
                boolean z11 = (b10 & 2) == 2;
                boolean z12 = (b10 & 4) == 4;
                InterfaceC1108j interfaceC1108j = this.f5858a;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f5859b.f48338a = Integer.valueOf(interfaceC1108j.r3());
                }
                if (z11) {
                    this.f5860c.f48338a = Integer.valueOf(this.f5858a.r3());
                }
                if (z12) {
                    this.f5861d.f48338a = Integer.valueOf(this.f5858a.r3());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f48228a;
        }
    }

    private static final Map b(List list) {
        Q qE = Q.a.e(Q.f5447b, "/", false, 1, null);
        Map mapM = N.m(v.a(qE, new i(qE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (i iVar : CollectionsKt.K0(list, new a())) {
            if (((i) mapM.put(iVar.b(), iVar)) == null) {
                while (true) {
                    Q qR = iVar.b().r();
                    if (qR == null) {
                        break;
                    }
                    i iVar2 = (i) mapM.get(qR);
                    if (iVar2 != null) {
                        iVar2.c().add(iVar.b());
                        break;
                    }
                    i iVar3 = new i(qR, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapM.put(qR, iVar3);
                    iVar3.c().add(iVar.b());
                    iVar = iVar3;
                }
            }
        }
        return mapM;
    }

    public static final Long c(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(k.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long d(long j10) {
        return (j10 / ((long) 10000)) - 11644473600000L;
    }

    private static final String e(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public static final d0 f(Q zipPath, AbstractC1113o fileSystem, Function1 predicate) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        AbstractC1111m abstractC1111mN = fileSystem.n(zipPath);
        try {
            long size = abstractC1111mN.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + abstractC1111mN.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                InterfaceC1108j interfaceC1108jD = K.d(abstractC1111mN.k(size));
                try {
                    if (interfaceC1108jD.r3() == 101010256) {
                        f fVarI = i(interfaceC1108jD);
                        String strH2 = interfaceC1108jD.h2(fVarI.b());
                        interfaceC1108jD.close();
                        long j10 = size - ((long) 20);
                        Throwable th4 = null;
                        if (j10 > 0) {
                            InterfaceC1108j interfaceC1108jD2 = K.d(abstractC1111mN.k(j10));
                            try {
                                if (interfaceC1108jD2.r3() == 117853008) {
                                    int iR3 = interfaceC1108jD2.r3();
                                    long jM1 = interfaceC1108jD2.M1();
                                    if (interfaceC1108jD2.r3() != 1 || iR3 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    InterfaceC1108j interfaceC1108jD3 = K.d(abstractC1111mN.k(jM1));
                                    try {
                                        int iR4 = interfaceC1108jD3.r3();
                                        if (iR4 != 101075792) {
                                            throw new IOException("bad zip: expected " + e(101075792) + " but was " + e(iR4));
                                        }
                                        fVarI = m(interfaceC1108jD3, fVarI);
                                        Unit unit = Unit.f48228a;
                                        if (interfaceC1108jD3 != null) {
                                            try {
                                                interfaceC1108jD3.close();
                                            } catch (Throwable th5) {
                                                th3 = th5;
                                            }
                                        }
                                        th3 = null;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th6) {
                                        if (interfaceC1108jD3 != null) {
                                            try {
                                                interfaceC1108jD3.close();
                                            } catch (Throwable th7) {
                                                try {
                                                    AbstractC0793c.a(th6, th7);
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    fVarI = fVarI;
                                                    if (interfaceC1108jD2 != null) {
                                                        try {
                                                            interfaceC1108jD2.close();
                                                        } catch (Throwable th9) {
                                                            AbstractC0793c.a(th, th9);
                                                        }
                                                    }
                                                    th2 = th;
                                                }
                                            }
                                        }
                                        th3 = th6;
                                        fVarI = fVarI;
                                    }
                                }
                                Unit unit2 = Unit.f48228a;
                                if (interfaceC1108jD2 != null) {
                                    try {
                                        interfaceC1108jD2.close();
                                    } catch (Throwable th10) {
                                        th2 = th10;
                                    }
                                }
                                th2 = null;
                            } catch (Throwable th11) {
                                th = th11;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        InterfaceC1108j interfaceC1108jD4 = K.d(abstractC1111mN.k(fVarI.a()));
                        try {
                            long jC = fVarI.c();
                            for (long j11 = 0; j11 < jC; j11++) {
                                i iVarH = h(interfaceC1108jD4);
                                if (iVarH.i() >= fVarI.a()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(iVarH)).booleanValue()) {
                                    arrayList.add(iVarH);
                                }
                            }
                            Unit unit3 = Unit.f48228a;
                            if (interfaceC1108jD4 != null) {
                                try {
                                    interfaceC1108jD4.close();
                                } catch (Throwable th12) {
                                    th4 = th12;
                                }
                            }
                        } catch (Throwable th13) {
                            if (interfaceC1108jD4 != null) {
                                try {
                                    interfaceC1108jD4.close();
                                } catch (Throwable th14) {
                                    AbstractC0793c.a(th13, th14);
                                }
                            }
                            th4 = th13;
                        }
                        if (th4 != null) {
                            throw th4;
                        }
                        d0 d0Var = new d0(zipPath, fileSystem, b(arrayList), strH2);
                        if (abstractC1111mN != null) {
                            try {
                                abstractC1111mN.close();
                            } catch (Throwable unused) {
                            }
                        }
                        return d0Var;
                    }
                    interfaceC1108jD.close();
                    size--;
                } catch (Throwable th15) {
                    interfaceC1108jD.close();
                    throw th15;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th16) {
            if (abstractC1111mN == null) {
                throw th16;
            }
            try {
                abstractC1111mN.close();
                throw th16;
            } catch (Throwable th17) {
                AbstractC0793c.a(th16, th17);
                throw th16;
            }
        }
    }

    public static /* synthetic */ d0 g(Q q10, AbstractC1113o abstractC1113o, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = b.f5844a;
        }
        return f(q10, abstractC1113o, function1);
    }

    public static final i h(InterfaceC1108j interfaceC1108j) throws IOException {
        Intrinsics.checkNotNullParameter(interfaceC1108j, "<this>");
        int iR3 = interfaceC1108j.r3();
        if (iR3 != 33639248) {
            throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(iR3));
        }
        interfaceC1108j.skip(4L);
        short sI1 = interfaceC1108j.I1();
        int i10 = sI1 & 65535;
        if ((sI1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        int iI1 = interfaceC1108j.I1() & 65535;
        int iI2 = interfaceC1108j.I1() & 65535;
        int iI3 = interfaceC1108j.I1() & 65535;
        long jR3 = ((long) interfaceC1108j.r3()) & 4294967295L;
        D d10 = new D();
        d10.f48337a = ((long) interfaceC1108j.r3()) & 4294967295L;
        D d11 = new D();
        d11.f48337a = ((long) interfaceC1108j.r3()) & 4294967295L;
        int iI4 = interfaceC1108j.I1() & 65535;
        int iI5 = interfaceC1108j.I1() & 65535;
        int iI6 = interfaceC1108j.I1() & 65535;
        interfaceC1108j.skip(8L);
        D d12 = new D();
        d12.f48337a = ((long) interfaceC1108j.r3()) & 4294967295L;
        String strH2 = interfaceC1108j.h2(iI4);
        if (StringsKt.T(strH2, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = d11.f48337a == 4294967295L ? 8 : 0L;
        if (d10.f48337a == 4294967295L) {
            j10 += (long) 8;
        }
        if (d12.f48337a == 4294967295L) {
            j10 += (long) 8;
        }
        long j11 = j10;
        E e10 = new E();
        E e11 = new E();
        E e12 = new E();
        A a10 = new A();
        j(interfaceC1108j, iI5, new c(a10, j11, d11, interfaceC1108j, d10, d12, e10, e11, e12));
        if (j11 <= 0 || a10.f48334a) {
            return new i(Q.a.e(Q.f5447b, "/", false, 1, null).u(strH2), StringsKt.y(strH2, "/", false, 2, null), interfaceC1108j.h2(iI6), jR3, d10.f48337a, d11.f48337a, iI1, d12.f48337a, iI3, iI2, (Long) e10.f48338a, (Long) e11.f48338a, (Long) e12.f48338a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final f i(InterfaceC1108j interfaceC1108j) throws IOException {
        int iI1 = interfaceC1108j.I1() & 65535;
        int iI2 = interfaceC1108j.I1() & 65535;
        long jI1 = interfaceC1108j.I1() & 65535;
        if (jI1 != (interfaceC1108j.I1() & 65535) || iI1 != 0 || iI2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC1108j.skip(4L);
        return new f(jI1, 4294967295L & ((long) interfaceC1108j.r3()), interfaceC1108j.I1() & 65535);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC1108j interfaceC1108j, int i10, Function2 function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iI1 = interfaceC1108j.I1() & 65535;
            long jI1 = ((long) interfaceC1108j.I1()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jI1) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC1108j.U1(jI1);
            long size = interfaceC1108j.B().size();
            function2.invoke(Integer.valueOf(iI1), Long.valueOf(jI1));
            long size2 = (interfaceC1108j.B().size() + jI1) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iI1);
            }
            if (size2 > 0) {
                interfaceC1108j.B().skip(size2);
            }
            j10 = j11 - jI1;
        }
    }

    public static final i k(InterfaceC1108j interfaceC1108j, i centralDirectoryZipEntry) throws IOException {
        Intrinsics.checkNotNullParameter(interfaceC1108j, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        i iVarL = l(interfaceC1108j, centralDirectoryZipEntry);
        Intrinsics.c(iVarL);
        return iVarL;
    }

    private static final i l(InterfaceC1108j interfaceC1108j, i iVar) throws IOException {
        int iR3 = interfaceC1108j.r3();
        if (iR3 != 67324752) {
            throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(iR3));
        }
        interfaceC1108j.skip(2L);
        short sI1 = interfaceC1108j.I1();
        int i10 = sI1 & 65535;
        if ((sI1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        interfaceC1108j.skip(18L);
        long jI1 = ((long) interfaceC1108j.I1()) & 65535;
        int iI1 = interfaceC1108j.I1() & 65535;
        interfaceC1108j.skip(jI1);
        if (iVar == null) {
            interfaceC1108j.skip(iI1);
            return null;
        }
        E e10 = new E();
        E e11 = new E();
        E e12 = new E();
        j(interfaceC1108j, iI1, new d(interfaceC1108j, e10, e11, e12));
        return iVar.a((Integer) e10.f48338a, (Integer) e11.f48338a, (Integer) e12.f48338a);
    }

    private static final f m(InterfaceC1108j interfaceC1108j, f fVar) throws IOException {
        interfaceC1108j.skip(12L);
        int iR3 = interfaceC1108j.r3();
        int iR4 = interfaceC1108j.r3();
        long jM1 = interfaceC1108j.M1();
        if (jM1 != interfaceC1108j.M1() || iR3 != 0 || iR4 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC1108j.skip(8L);
        return new f(jM1, interfaceC1108j.M1(), fVar.b());
    }

    public static final void n(InterfaceC1108j interfaceC1108j) throws IOException {
        Intrinsics.checkNotNullParameter(interfaceC1108j, "<this>");
        l(interfaceC1108j, null);
    }
}
