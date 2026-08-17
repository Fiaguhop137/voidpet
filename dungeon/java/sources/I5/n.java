package I5;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum n {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5044a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5043h = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5037b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n[] f5038c = values();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    n(int i10) {
        this.f5044a = i10;
    }
}
