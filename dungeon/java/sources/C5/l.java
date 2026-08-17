package C5;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z4.a f1463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f1464b;

    public enum a {
        SUCCESS,
        NEAREST,
        MISSING;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f1469e = Gd.a.a(e());
    }

    public l(Z4.a aVar, a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f1463a = aVar;
        this.f1464b = type;
    }

    public final Z4.a a() {
        return this.f1463a;
    }

    public final a b() {
        return this.f1464b;
    }
}
