package Wd;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.Intrinsics;
import p015ae.h0;
import p176je.H;
import p176je.I;
import p338se.x;
import p464ze.b;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15073a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f15074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f15075c;

    /* JADX INFO: renamed from: Wd.a$a, reason: collision with other inner class name */
    public static final class C0204a implements x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f15076a;

        C0204a(A a10) {
            this.f15076a = a10;
        }

        @Override // se.x.c
        public void a() {
        }

        @Override // se.x.c
        public x.a b(b classId, h0 source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            if (!Intrinsics.b(classId, H.f47227a.a())) {
                return null;
            }
            this.f15076a.f48334a = true;
            return null;
        }
    }

    static {
        List listO = CollectionsKt.o(I.f47232a, I.f47243l, I.f47244m, I.f47235d, I.f47237f, I.f47240i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f58558d;
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f15074b = linkedHashSet;
        b.a aVar2 = b.f58558d;
        c REPEATABLE_ANNOTATION = I.f47241j;
        Intrinsics.checkNotNullExpressionValue(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f15075c = aVar2.c(REPEATABLE_ANNOTATION);
    }

    private a() {
    }

    public final b a() {
        return f15075c;
    }

    public final Set b() {
        return f15074b;
    }

    public final boolean c(x klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        A a10 = new A();
        klass.a(new C0204a(a10), null);
        return a10.f48334a;
    }
}
