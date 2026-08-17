package p464ze;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58562c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f58563d = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f58564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f58565b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            return new c(d.f58566e.a(shortName));
        }
    }

    public c(String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f58564a = new d(fqName, this);
    }

    public c(d fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f58564a = fqName;
    }

    private c(d dVar, c cVar) {
        this.f58564a = dVar;
        this.f58565b = cVar;
    }

    public final String a() {
        return this.f58564a.a();
    }

    public final c b(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new c(this.f58564a.b(name), this);
    }

    public final boolean c() {
        return this.f58564a.e();
    }

    public final c d() {
        c cVar = this.f58565b;
        if (cVar != null) {
            return cVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(this.f58564a.g());
        this.f58565b = cVar2;
        return cVar2;
    }

    public final List e() {
        return this.f58564a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.b(this.f58564a, ((c) obj).f58564a);
    }

    public final f f() {
        return this.f58564a.j();
    }

    public final f g() {
        return this.f58564a.k();
    }

    public final boolean h(f segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        return this.f58564a.l(segment);
    }

    public int hashCode() {
        return this.f58564a.hashCode();
    }

    public final d i() {
        return this.f58564a;
    }

    public String toString() {
        return this.f58564a.toString();
    }
}
