package p446ye;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f58034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f58035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f58034a = name;
            this.f58035b = desc;
        }

        @Override // p446ye.d
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f58034a;
        }

        public final String c() {
            return this.f58035b;
        }

        public String d() {
            return this.f58035b;
        }

        public String e() {
            return this.f58034a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f58034a, aVar.f58034a) && Intrinsics.b(this.f58035b, aVar.f58035b);
        }

        public int hashCode() {
            return (this.f58034a.hashCode() * 31) + this.f58035b.hashCode();
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f58036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f58037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f58036a = name;
            this.f58037b = desc;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f58036a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f58037b;
            }
            return bVar.b(str, str2);
        }

        @Override // p446ye.d
        public String a() {
            return e() + d();
        }

        public final b b(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new b(name, desc);
        }

        public String d() {
            return this.f58037b;
        }

        public String e() {
            return this.f58036a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f58036a, bVar.f58036a) && Intrinsics.b(this.f58037b, bVar.f58037b);
        }

        public int hashCode() {
            return (this.f58036a.hashCode() * 31) + this.f58037b.hashCode();
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }
}
