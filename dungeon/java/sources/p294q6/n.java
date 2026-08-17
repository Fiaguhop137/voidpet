package p294q6;

import com.facebook.react.animated.NativeAnimatedModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAnimatedModule f51537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51538b;

    public /* synthetic */ n(NativeAnimatedModule nativeAnimatedModule, int i10) {
        this.f51537a = nativeAnimatedModule;
        this.f51538b = i10;
    }

    @Override // p294q6.c
    public final void a(double d10, double d11) {
        NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$6(this.f51537a, this.f51538b, d10, d11);
    }
}
