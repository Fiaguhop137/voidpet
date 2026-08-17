package G3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3858a = a.f3860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3859b = new H3.a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3860a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: G3.b$b, reason: collision with other inner class name */
    public static final class C0084b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f3861a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f3862b;

        public C0084b(q qVar) {
            this.f3862b = qVar;
        }

        public final o a() {
            return this.f3861a;
        }

        public final q b() {
            return this.f3862b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0084b)) {
                return false;
            }
            C0084b c0084b = (C0084b) obj;
            return Intrinsics.b(this.f3861a, c0084b.f3861a) && Intrinsics.b(this.f3862b, c0084b.f3862b);
        }

        public int hashCode() {
            o oVar = this.f3861a;
            int iHashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            q qVar = this.f3862b;
            return iHashCode + (qVar != null ? qVar.hashCode() : 0);
        }

        public String toString() {
            return "ReadResult(request=" + this.f3861a + ", response=" + this.f3862b + ')';
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f3863b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f3864c = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f3865a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private c() {
            this.f3865a = null;
        }

        public c(q qVar) {
            this.f3865a = qVar;
        }

        public final q a() {
            return this.f3865a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.b(this.f3865a, ((c) obj).f3865a);
        }

        public int hashCode() {
            q qVar = this.f3865a;
            if (qVar != null) {
                return qVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WriteResult(response=" + this.f3865a + ')';
        }
    }

    Object a(q qVar, o oVar, q qVar2, K3.o oVar2, Ed.b bVar);

    Object b(q qVar, o oVar, K3.o oVar2, Ed.b bVar);
}
