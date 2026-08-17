package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum X {
    Ok("ok"),
    NotFound("not-found"),
    NoOffersAvailable("no-offers-available"),
    Unknown("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15916a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15915h = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15909b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    X(String str) {
        this.f15916a = str;
    }

    public final String g() {
        return this.f15916a;
    }
}
