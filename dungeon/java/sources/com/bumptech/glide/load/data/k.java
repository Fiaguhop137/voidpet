package com.bumptech.glide.load.data;

import java.io.InputStream;
import p436y4.y;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f28672a;

    public static final class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p328s4.b f28673a;

        public a(p328s4.b bVar) {
            this.f28673a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f28673a);
        }
    }

    public k(InputStream inputStream, p328s4.b bVar) {
        y yVar = new y(inputStream, bVar);
        this.f28672a = yVar;
        yVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f28672a.c();
    }

    public void c() {
        this.f28672a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f28672a.reset();
        return this.f28672a;
    }
}
