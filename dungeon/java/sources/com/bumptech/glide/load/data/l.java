package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f28674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f28675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f28676c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f28675b = contentResolver;
        this.f28674a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f28676c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public p274p4.a d() {
        return p274p4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object objF = f(this.f28674a, this.f28675b);
            this.f28676c = objF;
            aVar.f(objF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);
}
