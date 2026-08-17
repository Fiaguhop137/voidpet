package p176je;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f47220a;

    public E(EnumMap defaultQualifiers) {
        Intrinsics.checkNotNullParameter(defaultQualifiers, "defaultQualifiers");
        this.f47220a = defaultQualifiers;
    }

    public final w a(EnumC3872c enumC3872c) {
        return (w) this.f47220a.get(enumC3872c);
    }

    public final EnumMap b() {
        return this.f47220a;
    }
}
