package A;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: A.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0785u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0785u f92b = a.f95e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0785u f93c = e.f98e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC0785u f94d = c.f96e;

    /* JADX INFO: renamed from: A.u$a */
    private static final class a extends AbstractC0785u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f95e = new a();

        private a() {
            super(null);
        }

        @Override // A.AbstractC0785u
        public int a(int i10, O0.t tVar, androidx.compose.ui.layout.p pVar, int i11) {
            return i10 / 2;
        }
    }

    /* JADX INFO: renamed from: A.u$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0785u a(V.d.b bVar) {
            return new d(bVar);
        }
    }

    /* JADX INFO: renamed from: A.u$c */
    private static final class c extends AbstractC0785u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f96e = new c();

        private c() {
            super(null);
        }

        @Override // A.AbstractC0785u
        public int a(int i10, O0.t tVar, androidx.compose.ui.layout.p pVar, int i11) {
            if (tVar == O0.t.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: A.u$d */
    private static final class d extends AbstractC0785u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final V.d.b f97e;

        public d(V.d.b bVar) {
            super(null);
            this.f97e = bVar;
        }

        @Override // A.AbstractC0785u
        public int a(int i10, O0.t tVar, androidx.compose.ui.layout.p pVar, int i11) {
            return this.f97e.a(0, i10, tVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.b(this.f97e, ((d) obj).f97e);
        }

        public int hashCode() {
            return this.f97e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f97e + ')';
        }
    }

    /* JADX INFO: renamed from: A.u$e */
    private static final class e extends AbstractC0785u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f98e = new e();

        private e() {
            super(null);
        }

        @Override // A.AbstractC0785u
        public int a(int i10, O0.t tVar, androidx.compose.ui.layout.p pVar, int i11) {
            if (tVar == O0.t.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    private AbstractC0785u() {
    }

    public /* synthetic */ AbstractC0785u(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i10, O0.t tVar, androidx.compose.ui.layout.p pVar, int i11);

    public Integer b(androidx.compose.ui.layout.p pVar) {
        return null;
    }

    public boolean c() {
        return false;
    }
}
