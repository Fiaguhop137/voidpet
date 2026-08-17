package p069de;

import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1808w;
import p015ae.Z;
import p033be.b;
import p033be.h;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends b implements InterfaceC1808w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f40115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h annotations, Z correspondingProperty) {
        super(annotations);
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(correspondingProperty, "correspondingProperty");
        this.f40115b = correspondingProperty;
    }
}
