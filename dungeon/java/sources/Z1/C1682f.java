package Z1;

import android.media.AudioManager;

/* JADX INFO: renamed from: Z1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1682f implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1688h f18249a;

    public /* synthetic */ C1682f(C1688h c1688h) {
        this.f18249a = c1688h;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f18249a.g(i10);
    }
}
