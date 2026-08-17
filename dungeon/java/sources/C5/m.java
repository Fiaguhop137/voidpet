package C5;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f1470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f1471b;

    public m(j frameLoader, Date insertedTime) {
        Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
        Intrinsics.checkNotNullParameter(insertedTime, "insertedTime");
        this.f1470a = frameLoader;
        this.f1471b = insertedTime;
    }

    public final j a() {
        return this.f1470a;
    }

    public final Date b() {
        return this.f1471b;
    }
}
