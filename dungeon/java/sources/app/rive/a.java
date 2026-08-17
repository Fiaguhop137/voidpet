package app.rive;

import I.d2;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2 f25786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextureView f25787b;

    public /* synthetic */ a(d2 d2Var, TextureView textureView) {
        this.f25786a = d2Var;
        this.f25787b = textureView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RiveKt$Rive$8$1$1$1.onSurfaceTextureUpdated$lambda$0(this.f25786a, this.f25787b);
    }
}
