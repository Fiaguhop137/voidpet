package p410we;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0729a f56850f = new C0729a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f56851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f56855e;

    /* JADX INFO: renamed from: we.a$a, reason: collision with other inner class name */
    public static final class C0729a {
        private C0729a() {
        }

        public /* synthetic */ C0729a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(int... numbers) {
        List listL;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f56851a = numbers;
        Integer numZ = AbstractC3952n.Z(numbers, 0);
        this.f56852b = numZ != null ? numZ.intValue() : -1;
        Integer numZ2 = AbstractC3952n.Z(numbers, 1);
        this.f56853c = numZ2 != null ? numZ2.intValue() : -1;
        Integer numZ3 = AbstractC3952n.Z(numbers, 2);
        this.f56854d = numZ3 != null ? numZ3.intValue() : -1;
        if (numbers.length <= 3) {
            listL = CollectionsKt.l();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listL = CollectionsKt.U0(AbstractC3952n.d(numbers).subList(3, numbers.length));
        }
        this.f56855e = listL;
    }

    public final int a() {
        return this.f56852b;
    }

    public final int b() {
        return this.f56853c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f56852b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f56853c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f56854d >= i12;
    }

    public final boolean d(a version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return c(version.f56852b, version.f56853c, version.f56854d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f56852b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f56853c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f56854d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || !Intrinsics.b(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f56852b == aVar.f56852b && this.f56853c == aVar.f56853c && this.f56854d == aVar.f56854d && Intrinsics.b(this.f56855e, aVar.f56855e);
    }

    protected final boolean f(a ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i10 = this.f56852b;
        if (i10 == 0) {
            return ourVersion.f56852b == 0 && this.f56853c == ourVersion.f56853c;
        }
        return i10 == ourVersion.f56852b && this.f56853c <= ourVersion.f56853c;
    }

    public final int[] g() {
        return this.f56851a;
    }

    public int hashCode() {
        int i10 = this.f56852b;
        int i11 = i10 + (i10 * 31) + this.f56853c;
        int i12 = i11 + (i11 * 31) + this.f56854d;
        return i12 + (i12 * 31) + this.f56855e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.s0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
