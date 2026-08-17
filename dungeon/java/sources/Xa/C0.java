package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum C0 {
    Day("day"),
    Week("week"),
    Month("month"),
    Year("year"),
    Unknown("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15404a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15403i = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15396b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    C0(String str) {
        this.f15404a = str;
    }

    public final String g() {
        return this.f15404a;
    }
}
