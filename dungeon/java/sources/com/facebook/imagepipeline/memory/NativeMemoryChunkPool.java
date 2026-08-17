package com.facebook.imagepipeline.memory;

import p079e6.E;
import p079e6.F;

/* JADX INFO: loaded from: classes2.dex */
@V4.d
public class NativeMemoryChunkPool extends f {
    @V4.d
    public NativeMemoryChunkPool(Y4.d dVar, E e10, F f10) {
        super(dVar, e10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk h(int i10) {
        return new NativeMemoryChunk(i10);
    }
}
