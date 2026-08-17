package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.c f23717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.i f23718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f23719c;

    public /* synthetic */ g(EmojiCompatInitializer.c cVar, f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f23717a = cVar;
        this.f23718b = iVar;
        this.f23719c = threadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23717a.c(this.f23718b, this.f23719c);
    }
}
