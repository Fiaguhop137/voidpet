package p176je;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p302qe.g;
import p302qe.u;
import p464ze.b;
import p464ze.c;

/* JADX INFO: renamed from: je.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3889u {

    /* JADX INFO: renamed from: je.u$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f47363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f47364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f47365c;

        public a(b classId, byte[] bArr, g gVar) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f47363a = classId;
            this.f47364b = bArr;
            this.f47365c = gVar;
        }

        public /* synthetic */ a(b bVar, byte[] bArr, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }

        public final b a() {
            return this.f47363a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f47363a, aVar.f47363a) && Intrinsics.b(this.f47364b, aVar.f47364b) && Intrinsics.b(this.f47365c, aVar.f47365c);
        }

        public int hashCode() {
            int iHashCode = this.f47363a.hashCode() * 31;
            byte[] bArr = this.f47364b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            g gVar = this.f47365c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f47363a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f47364b) + ", outerClass=" + this.f47365c + ')';
        }
    }

    g a(a aVar);

    u b(c cVar, boolean z10);

    Set c(c cVar);
}
