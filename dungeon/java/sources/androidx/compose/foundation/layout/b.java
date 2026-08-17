package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p288q0.AbstractC4054a;
import p288q0.w;
import p288q0.y;
import p324s0.D;

/* JADX INFO: loaded from: classes.dex */
final class b extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AbstractC4054a f21228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f21229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f21230q;

    private b(AbstractC4054a abstractC4054a, float f10, float f11) {
        this.f21228o = abstractC4054a;
        this.f21229p = f10;
        this.f21230q = f11;
    }

    public /* synthetic */ b(AbstractC4054a abstractC4054a, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4054a, f10, f11);
    }

    public final void W1(float f10) {
        this.f21230q = f10;
    }

    public final void X1(AbstractC4054a abstractC4054a) {
        this.f21228o = abstractC4054a;
    }

    public final void Y1(float f10) {
        this.f21229p = f10;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        return a.c(kVar, this.f21228o, this.f21229p, this.f21230q, wVar, j10);
    }
}
