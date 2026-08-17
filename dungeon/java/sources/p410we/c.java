package p410we;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends p410we.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f56901h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f56902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f56903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f56904k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f56905g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        c cVar = new c(2, 1, 0);
        f56902i = cVar;
        f56903j = cVar.m();
        f56904k = new c(new int[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f56905g = z10;
    }

    private final boolean i(c cVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(cVar);
    }

    private final boolean l(c cVar) {
        if (a() > cVar.a()) {
            return true;
        }
        return a() >= cVar.a() && b() > cVar.b();
    }

    public final boolean h(c metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        return i(metadataVersionFromLanguageVersion.k(this.f56905g));
    }

    public final boolean j() {
        return this.f56905g;
    }

    public final c k(boolean z10) {
        c cVar = z10 ? f56902i : f56903j;
        return cVar.l(this) ? cVar : this;
    }

    public final c m() {
        return (a() == 1 && b() == 9) ? new c(2, 0, 0) : new c(a(), b() + 1, 0);
    }
}
