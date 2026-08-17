package C0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0829i implements C0819d.a {

    /* JADX INFO: renamed from: C0.i$a */
    public static final class a extends AbstractC0829i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M0 f1160b;

        public a(String str, M0 m10, InterfaceC0831j interfaceC0831j) {
            super(null);
            this.f1159a = str;
            this.f1160b = m10;
        }

        @Override // C0.AbstractC0829i
        public InterfaceC0831j a() {
            return null;
        }

        public M0 b() {
            return this.f1160b;
        }

        public final String c() {
            return this.f1159a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.b(this.f1159a, aVar.f1159a) || !Intrinsics.b(b(), aVar.b())) {
                return false;
            }
            a();
            aVar.a();
            return Intrinsics.b(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f1159a.hashCode() * 31;
            M0 m0B = b();
            int iHashCode2 = (iHashCode + (m0B != null ? m0B.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f1159a + ')';
        }
    }

    /* JADX INFO: renamed from: C0.i$b */
    public static final class b extends AbstractC0829i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M0 f1162b;

        public b(String str, M0 m10, InterfaceC0831j interfaceC0831j) {
            super(null);
            this.f1161a = str;
            this.f1162b = m10;
        }

        public /* synthetic */ b(String str, M0 m10, InterfaceC0831j interfaceC0831j, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : m10, (i10 & 4) != 0 ? null : interfaceC0831j);
        }

        @Override // C0.AbstractC0829i
        public InterfaceC0831j a() {
            return null;
        }

        public M0 b() {
            return this.f1162b;
        }

        public final String c() {
            return this.f1161a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!Intrinsics.b(this.f1161a, bVar.f1161a) || !Intrinsics.b(b(), bVar.b())) {
                return false;
            }
            a();
            bVar.a();
            return Intrinsics.b(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f1161a.hashCode() * 31;
            M0 m0B = b();
            int iHashCode2 = (iHashCode + (m0B != null ? m0B.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f1161a + ')';
        }
    }

    private AbstractC0829i() {
    }

    public /* synthetic */ AbstractC0829i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InterfaceC0831j a();
}
