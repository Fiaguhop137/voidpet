package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class S3 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ContentResolver f32721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Uri f32722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Runnable f32723c;

    /* synthetic */ S3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        this.f32721a = contentResolver;
        this.f32722b = uri;
        this.f32723c = runnable;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return T3.g(this.f32721a, this.f32722b, this.f32723c, (Uri) obj);
    }
}
