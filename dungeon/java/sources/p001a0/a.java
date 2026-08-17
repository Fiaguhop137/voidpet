package p001a0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19036b;

    private a(int i10) {
        this.f19035a = i10;
    }

    public /* synthetic */ a(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @Override // p001a0.c
    public void a() {
        this.f19036b = true;
    }

    @Override // p001a0.c
    public int b() {
        return this.f19035a;
    }

    public final boolean c() {
        return this.f19036b;
    }
}
