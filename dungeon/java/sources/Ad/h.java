package Ad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f314e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f315f = i.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f319d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public h(int i10, int i11) {
        this(i10, i11, 0);
    }

    public h(int i10, int i11, int i12) {
        this.f316a = i10;
        this.f317b = i11;
        this.f318c = i12;
        this.f319d = g(i10, i11, i12);
    }

    private final int g(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f319d - other.f319d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h hVar = obj instanceof h ? (h) obj : null;
        return hVar != null && this.f319d == hVar.f319d;
    }

    public int hashCode() {
        return this.f319d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f316a);
        sb2.append('.');
        sb2.append(this.f317b);
        sb2.append('.');
        sb2.append(this.f318c);
        return sb2.toString();
    }
}
