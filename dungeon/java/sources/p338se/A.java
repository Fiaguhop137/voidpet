package p338se;

import Ad.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p446ye.d;

/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f53535b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53536a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new A(name + '#' + desc, null);
        }

        public final A b(d signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            if (signature instanceof d.b) {
                d.b bVar = (d.b) signature;
                return d(bVar.e(), bVar.d());
            }
            if (!(signature instanceof d.a)) {
                throw new n();
            }
            d.a aVar = (d.a) signature;
            return a(aVar.e(), aVar.d());
        }

        public final A c(p410we.d nameResolver, xe.a.c signature) {
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(signature, "signature");
            return d(nameResolver.getString(signature.r()), nameResolver.getString(signature.q()));
        }

        public final A d(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new A(name + desc, null);
        }

        public final A e(A signature, int i10) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new A(signature.a() + '@' + i10, null);
        }
    }

    private A(String str) {
        this.f53536a = str;
    }

    public /* synthetic */ A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f53536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Intrinsics.b(this.f53536a, ((A) obj).f53536a);
    }

    public int hashCode() {
        return this.f53536a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f53536a + ')';
    }
}
