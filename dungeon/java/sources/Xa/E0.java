package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum E0 {
    UnknownReplacementMode("unknown-replacement-mode"),
    WithTimeProration("with-time-proration"),
    ChargeProratedPrice("charge-prorated-price"),
    ChargeFullPrice("charge-full-price"),
    WithoutProration("without-proration"),
    Deferred("deferred"),
    KeepExisting("keep-existing");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15570a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15569k = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15560b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    E0(String str) {
        this.f15570a = str;
    }
}
