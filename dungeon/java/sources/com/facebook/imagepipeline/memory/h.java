package com.facebook.imagepipeline.memory;

import V4.k;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
class h extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinkedList f28947f;

    public h(int i10, int i11, int i12) {
        super(i10, i11, i12, false);
        this.f28947f = new LinkedList();
    }

    @Override // com.facebook.imagepipeline.memory.b
    void a(Object obj) {
        Z4.f fVar = (Z4.f) this.f28947f.poll();
        if (fVar == null) {
            fVar = new Z4.f();
        }
        fVar.c(obj);
        this.f28936c.add(fVar);
    }

    @Override // com.facebook.imagepipeline.memory.b
    public Object g() {
        Z4.f fVar = (Z4.f) this.f28936c.poll();
        k.g(fVar);
        Object objB = fVar.b();
        fVar.a();
        this.f28947f.add(fVar);
        return objB;
    }
}
