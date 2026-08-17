package io.invertase.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44171c;

    public /* synthetic */ s(v vVar, String str, String str2) {
        this.f44169a = vVar;
        this.f44170b = str;
        this.f44171c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44169a.v(this.f44170b, this.f44171c);
    }
}
