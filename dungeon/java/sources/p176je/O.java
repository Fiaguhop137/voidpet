package p176je;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum O {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47293a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f47292g = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47287b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    O(String str) {
        this.f47293a = str;
    }

    public final String g() {
        return this.f47293a;
    }

    public final boolean h() {
        return this == IGNORE;
    }

    public final boolean i() {
        return this == WARN;
    }
}
