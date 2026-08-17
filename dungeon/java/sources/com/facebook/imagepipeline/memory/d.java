package com.facebook.imagepipeline.memory;

import V4.k;
import p079e6.E;
import p079e6.F;
import p079e6.z;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z4.h f28939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f28940b;

    class a implements Z4.h {
        a() {
        }

        @Override // Z4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr) {
            d.this.b(bArr);
        }
    }

    static class b extends e {
        public b(Y4.d dVar, E e10, F f10) {
            super(dVar, e10, f10);
        }

        @Override // com.facebook.imagepipeline.memory.a
        com.facebook.imagepipeline.memory.b y(int i10) {
            return new h(q(i10), this.f28924c.f40485g, 0);
        }
    }

    public d(Y4.d dVar, E e10) {
        k.b(Boolean.valueOf(e10.f40485g > 0));
        this.f28940b = new b(dVar, e10, z.h());
        this.f28939a = new a();
    }

    public Z4.a a(int i10) {
        return Z4.a.x((byte[]) this.f28940b.get(i10), this.f28939a);
    }

    public void b(byte[] bArr) {
        this.f28940b.a(bArr);
    }
}
