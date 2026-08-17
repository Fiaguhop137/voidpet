package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f28651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f28652c;

    public b(AssetManager assetManager, String str) {
        this.f28651b = assetManager;
        this.f28650a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f28652c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
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
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object objF = f(this.f28651b, this.f28650a);
            this.f28652c = objF;
            aVar.f(objF);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract Object f(AssetManager assetManager, String str);
}
