package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum L {
    FreeTrial("free-trial"),
    PayAsYouGo("pay-as-you-go"),
    PayUpFront("pay-up-front"),
    Unknown("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15837a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15836h = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15830b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    L(String str) {
        this.f15837a = str;
    }

    public final String g() {
        return this.f15837a;
    }
}
