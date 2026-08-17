package p015ae;

import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f19759a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f19760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f19761c;

    public static final class a extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f19762c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f19763c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f19764c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f19765c = new d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f19766c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f19767c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // p015ae.x0
        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f19768c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f19769c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f19770c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = N.c();
        mapC.put(f.f19767c, 0);
        mapC.put(e.f19766c, 0);
        mapC.put(b.f19763c, 1);
        mapC.put(g.f19768c, 1);
        h hVar = h.f19769c;
        mapC.put(hVar, 2);
        f19760b = N.b(mapC);
        f19761c = hVar;
    }

    private w0() {
    }

    public final Integer a(x0 first, x0 second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f19760b;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num == null || num2 == null || Intrinsics.b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(x0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == e.f19766c || visibility == f.f19767c;
    }
}
