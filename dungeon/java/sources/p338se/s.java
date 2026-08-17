package p338se;

import Ie.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f53634a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f53635b = new d(e.BOOLEAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f53636c = new d(e.CHAR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f53637d = new d(e.BYTE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f53638e = new d(e.SHORT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f53639f = new d(e.INT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f53640g = new d(e.FLOAT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f53641h = new d(e.LONG);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f53642i = new d(e.DOUBLE);

    public static final class a extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final s f53643j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s elementType) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.f53643j = elementType;
        }

        public final s i() {
            return this.f53643j;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return s.f53635b;
        }

        public final d b() {
            return s.f53637d;
        }

        public final d c() {
            return s.f53636c;
        }

        public final d d() {
            return s.f53642i;
        }

        public final d e() {
            return s.f53640g;
        }

        public final d f() {
            return s.f53639f;
        }

        public final d g() {
            return s.f53641h;
        }

        public final d h() {
            return s.f53638e;
        }
    }

    public static final class c extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f53644j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            this.f53644j = internalName;
        }

        public final String i() {
            return this.f53644j;
        }
    }

    public static final class d extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final e f53645j;

        public d(e eVar) {
            super(null);
            this.f53645j = eVar;
        }

        public final e i() {
            return this.f53645j;
        }
    }

    private s() {
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return u.f53646a.d(this);
    }
}
